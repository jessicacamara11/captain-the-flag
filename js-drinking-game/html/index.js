$(document).ready(function () {

    $('#add-new-customer').click(displayForm);
    $('#play').click(startGame);

    showHomePage();
    //getList();
});

/*function getList() {
    $.ajax({
        url: 'http://localhost:8080/captaindrink/list',
        async: true,
        success: renderList,
        error: errorCallback
    });
}

function renderList(playersList) {
    var table = $('#customers-table');
    $('#customers-table tbody').empty();

    playersList.forEach(function (player) {
        table.append('<tr><td style=color:white>' + player.name + '</td></tr>');
    })
}*/

function startGame() {
    window.location.href = "game.html"

}



function showHomePage() {

    var homePage = $('#container');
    $('#div-table').hide();
} 




function displayForm() {

    $('#form').addClass('visible').removeClass('invisible');
    $('#new-customer').click(createCustomer);
}



function errorCallback(request, status, error) {
    return;
   // console.log(request + '\n' + status + '\n' + error);
}
function createCustomer(event) {
    event.preventDefault();

    $('#form').addClass('invisible').removeClass('visible');
    $.ajax({
        url: 'http://localhost:8080/captaindrink/new',
        method: 'POST',
        data: JSON.stringify({
            name: $('#name').val()
        }),
        async: true,
        contentType: 'application/json',
        success: displayForm,
        error: errorCallback
    });

    //location.reload();
}


const buttons = document.querySelectorAll('.button');
buttons.forEach((button) => {
    let target = button.querySelector('.target');
    function handleMove(e) {
        const x = -50 + (e.pageX - button.offsetLeft - 300 / 2) / 3;
        const y = -10 + (e.pageY - button.offsetTop - 100 / 2) / 3;

        target.style.setProperty('--x', `${ x }px`)
        target.style.setProperty('--y', `${ y }px`)
    }
    button.addEventListener('mousemove', (e) => {
        handleMove(e);
    });
    button.addEventListener('touchmove', (e) => {
        handleMove(e.changedTouches[0]);
    });
});















