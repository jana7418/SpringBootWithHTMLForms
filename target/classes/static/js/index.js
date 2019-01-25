$(function () {
  $("#feedback").hide();
  $( "#SignInform" ).submit(function(e) {
	  e.preventDefault();
	  var account = {};
      account["username"] = $("#username").val();
      account["password"] = $("#password").val();

      $.ajax({
          type: 'POST',
          url: '/api/submit',
          data: JSON.stringify(account),
          contentType: 'application/json ; charset=utf-8',
          dataType: 'json',
          success: function (output) {
              $("#feedback").text("Response: " + JSON.stringify(output)).show()
          },
          error: function (err) {
              console.log(err);
              $("#feedback").text(err.responseJSON).show()
          }
      });	  
});
  
});