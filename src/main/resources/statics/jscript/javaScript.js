document.addEventListener("DOMContentLoaded", function() {

    $(window).on('load', function() {

        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/home',
            dataType: 'json',
            success: function (plantList) {


            }
        });
    });
});