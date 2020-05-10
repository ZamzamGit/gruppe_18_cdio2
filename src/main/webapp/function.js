$(document).ready(function(){
    loadUsers();
});

function createUser() {
    event.preventDefault();
    var data =$("#create-user").serializeJSON();
    $.ajax({
        url: "rest/endusers",
        data: data,
        contentType: "application/json",
        method: "POST",
        success: function (data) {
            if(data === "true") {
                loadUsers();

            } else {
                alert("Bruger eksisterer allerede");
            }
        },
        error: function () {
            alert("Fejl ved opretning");
        }
    });
}

function loadUsers() {
    $("#userdata").html("");
    $.ajax({
        method: "GET",
        url: "rest/endusers",
        dataType: "JSON",
        success: function (data) {
            $.each(data, function (i, user) {
                $("#userdata").append(insertUserData(user));
            });
        },
        error: function () {
            alert("Fejl ved læsning")
        }
    });
}

function deleteUsers(deleteId) {
    var user = {id: deleteId};
    var json = JSON.stringify(user);

    $.ajax({
        url: "rest/endusers",
        data: json,
        contentType: "application/json",
        method: "DELETE",
        success: function (data) {
            if (data === "true") {
                loadUsers();
            } else {
                alert("Kan ikke slette bruger")
            }
        }
    });
}

function insertUserData(user) {
    return '<tr><td>' + user.id + '</td>' +
        '<td>' + user.userName + '</td>' +
        '<td>' + user.ini + '</td>' +
        '<td>' + user.cpr + '</td>' +
        '<td>' + user.password+ '</td>' +
        '<td>' + user.role + '</td>' +
        '</tr>';
}

function switchPage(page) {
    $("body").load(page);
}