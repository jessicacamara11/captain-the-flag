$(document).ready(function () {

    $("#cardRule").delay(8000);

    showHomePage();
});

function showHomePage() {

    $.ajax({
        url: 'http://localhost:8080/captaindrink/player',
        method: 'GET',
        async: true,
        success: deal,
        error: errorCallback
    });
}

function getCard() {


    $.ajax({
        url: 'http://localhost:8080/captaindrink/card',
        method: 'GET',
        async: true,

        success: showCard,
        error: errorCallback
    });
}


function errorCallback() {
    console.log("error")
    return;


}

// Card Js by James Pickering
delay = 500; //delay the effect
fadetime = 500; // fade in time
// var clicked = false; // set flag for clicked state
//lastClicked = ""; // last card clicked
suit = ["clubs", "hearts", "diamonds", "spades"];
deck = ["ace", 2, 3, 4, 5, 6, 7, 8, 9, 10, "jack", "queen", "king"];

// Modified Shuffle by Chris Coyier
// https://css-tricks.com/snippets/javascript/shuffle-array/
/*function shuffle(o) {
    for(var j, x, i = o.length; i; j = parseInt(Math.random() * i), x = o[--i], o[i] = o[j], o[j] = x);
    return o;
};*/

// Random suit
/*function getSuit() {
    var x = parseInt(Math.random() * 4);
    return suit[x];
}*/

/*// Deal new card from deck
function getCards() {
    for(var i=0; i<=deck.length; i++) {
        var str = ".card" + i;
        var str2 = " .front";
        var el = str.concat(str2);
        var output = deck[i] + " of " +getSuit();
        $(el).text(output);
    }
}*/
/*function getCards() {
    console.log(player.name);

    //$(".deal").append(player.name);

    $.ajax({
        url: 'http://localhost:8080/captaindrink/card',
        method: 'GET',
        async: true,
    
        success: showCard,
        error: errorCallback
    });
}*/
function showCard(image) {
    console.log("Im here" + image);
    console.log(image.imgPath);

    $("#cardRule").empty();
    $(".card .front").css("background-image", "url(cards/" + image.imgPath + ".jpg");

    $("#cardRule").append(image.action);
    //$("#cardRule").delay(8000);
    
    //showHomePage();


}
function errorCallback() {
    console.log("error")
    return;


}

// Deal cards in sequence
function deal(player) {

    $('#player').empty();

    $("#player").append(player.name);
    $('.card').hide();
    clicked = false; // set flag for clicked state
    //shuffle(deck);
    getCard();
    $('.card3').delay(delay * 3).fadeIn(fadetime);
    
}
//deal();

$('.deal').click(function () {
    showHomePage();
});

$('.card').click(function () {
    $(this).toggleClass('flip');
});

