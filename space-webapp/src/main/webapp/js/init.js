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
	System.out.print("Works!");
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


var ItemSet = {

  create: function() {

    var inst = Object.create(this);

    inst.events = {};
    inst.items = [];
    
    return inst;

  },

  add: function( item ) {

    this.items.push( item );

    this.emit('add' );
    this.emit('change' );
  },

  remove: function( item ) {

    this.items.splice( this.items.indexOf( item ), 1 );

    this.emit( 'remove' );
    this.emit( 'change' );
  },

  contains: function( item ) {

    return ( this.items.indexOf( item ) > -1 );

  },
  
  sort: function( func ) {
    this.items.sort( func );
    
    this.emit( 'sort' );
    this.emit( 'change' );
  },
  
  modify: function( func ) {
    func.call( this );
    this.emit( 'change' );
  },

  on: function( evt, func ) {

    if ( !this.events[ evt ] ) this.events[ evt ] = [];
    this.events[ evt ].push( func );

  },

  emit: function( evt ) {

    var evts = this.events[ evt ];
    if ( evts ) {

      for ( var i = 0, l = evts.length; i < l; i++ ) {
        evts[ i ]( this );
      }

    }

  }
};




var emailList = ItemSet.create();



$('#email_adder').on( 'submit', function( e ) {
  var $email = $('#add_email');
  
  if( $email.val().trim() ) {
    emailList.add( $email.val()  );
    $email.val('');
    $email.focus();
  }
  
  e.preventDefault();
});


$('#email_list').on( 'click', '.email', function( e ) {
  emailList.remove( $(this).html() );
});

$('#sort').on( 'click', function( e ) {
   emailList.sort();
});

$('#pop').on( 'click', function( e ) {
   emailList.modify(function(){
     this.items.pop();
   });
});

emailList.on('change', function() {
  var $nodes = [];

  for (var i = 0, l = emailList.items.length; i < l; i++) {
    $nodes.push('<div class="email">' + emailList.items[i] + '</div>');
  }

  $('#email_list').html($nodes);

});



$(function() {
        $('.material-card > .mc-btn-action').click(function () {
            var card = $(this).parent('.material-card');
            var icon = $(this).children('i');
            icon.addClass('fa-spin-fast');

            if (card.hasClass('mc-active')) {
                card.removeClass('mc-active');

                window.setTimeout(function() {
                    icon
                        .removeClass('fa-arrow-left')
                        .removeClass('fa-spin-fast')
                        .addClass('fa-bars');

                }, 800);
            } else {
                card.addClass('mc-active');

                window.setTimeout(function() {
                    icon
                        .removeClass('fa-bars')
                        .removeClass('fa-spin-fast')
                        .addClass('fa-arrow-left');

                }, 800);
            }
        });
    });



    $(document).ready(function(){
      $('.carousel').carousel();
    });
        
        
  $(document).ready(function(){
    $('.tooltipped').tooltip({delay: 50});
  });
        
