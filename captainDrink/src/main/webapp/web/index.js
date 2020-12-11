$(document).ready(function () {

    $('#add-new-customer').click(displayForm);
    //getList();
});
function getList() {
    $.ajax({
        url: 'http://localhost:8080/captaindrink',
        async: true,
        success: renderList,
        error: errorCallback
    });
}
function renderList(customerList) {
    var table = $('#customers-table');
    table.empty();
    var counter = 0;
    customerList.forEach(function (customer) {
        counter++;
        table.append('<tr><td>' + customer.id + '</td><td>'
            + "Player" + counter + ":" + customer.name +'</td><td>'
            + '</td></tr>');
    })

}
function getCustomer(id) {

    $.ajax({
        url:'http://localhost:8080/javabank/api/customer/' + id,
        type: 'GET',
        success: displayEditForm,
        error: errorCallback
    });
}
function displayForm() {
    $('#form').addClass('visible').removeClass('invisible');
    $('#edit-customer').addClass('visible').addClass('invisible');
    $('#new-customer').click(createCustomer);
}
function displayEditForm(customer) {
    $('#form').addClass('visible').removeClass('invisible');
    $('#new-customer').addClass('visible').addClass('invisible');
    //console.log(customer);


    $('#edit-customer').click(submitCustomer(customer.id));

    $('#name').val(customer.name);
    $('#email').val(customer.email);
    $('#phone').val(customer.telephoneNumber);

}
function submitCustomer(id) {
    console.log(id);

    return function(event) {
        event.preventDefault();
        $('#form').addClass('invisible').removeClass('visible');

        $.ajax({
            url:'http://localhost:8080/javabank/api/customer/' + id,
            type: 'PUT',
            data : JSON.stringify({
                name: $('#name').val(),
                email: $('#email').val(),
                telephoneNumber: $('#phone').val()
            }),
            contentType: 'application/json',
            success: getList,
            error: errorCallback
        });
    }
}
function deleteCustomer(id) {
    $.ajax({
        url:'http://localhost:8080/javabank/api/customer/' + id,
        type: 'DELETE',
        success: getList,
        error: errorCallback
    });
}
function errorCallback(request, status, error) {
    console.log(request + '\n' + status + '\n' + error);
}
function createCustomer(event) {
    event.preventDefault();
    $('#form').addClass('invisible').removeClass('visible');
    $.ajax({
        url: 'http://localhost:8080/captaindrink',
        method: 'POST',
        data: JSON.stringify({
            name: $('#name').val()

        }),
        async: true,
        contentType: 'application/json',
        success: getList,
        error: errorCallback
    });
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















