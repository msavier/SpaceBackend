(function($){
  $(function(){

    $('.button-collapse').sideNav();
    $('.parallax').parallax();

  }); // end of document ready
})(jQuery); // end of jQuery name space

$(document).ready(function() {
  $(".trigger").click(function() {
    $(".menu").toggleClass("active"); 
  });
});
// end of menu toggle function

// Start of popout function
$(".popout1 .btn1").click(function() {
	$(this).toggleClass("active");
	$(this).closest(".popout1").find(".panel1").toggleClass("active");
});
$(document).click(function() {
	$(".popout1 .panel1").removeClass("active");
	$(".popout1 .btn1").removeClass("active");
});
$(".popout1 .panel1").click(function(event) {
	event.stopPropagation();
});
$(".popout1 .btn1").click(function(event) {
	event.stopPropagation();
});

// end of popout function

// Date Picker
 $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15 // Creates a dropdown of 15 years to control year
  });

// Modal Info
$(document).ready(function(){
    // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
    $('.modal-trigger').leanModal();
  });

// Tabs on Create Page
  $(document).ready(function(){
    $('ul.tabs').tabs();
  });
// Select for Create Page Forms
    $(document).ready(function() {
    $('select').material_select();
  });