var Country = {};

Country.validation = function(){
	$.validator.setDefaults({
		/*submitHandler: function() { 
        	//http://javahonk.com/spring-mvc-post-form-submit-ajax-jquery/
        	//https://code.tutsplus.com/tutorials/24-best-practices-for-ajax-implementations--net-9180
        	 var producer = $('#producer').val();
            var model = $('#model').val();
            var price = $('#price').val();
            var json = { "producer" : producer, "model" : model, "price": price};
             
         $.ajax({
              url: $("#newSmartphoneForm").attr( "action"),
              data: JSON.stringify(json),
              type: "POST",
               
              beforeSend: function(xhr) {
                  xhr.setRequestHeader("Accept", "application/json");
                  xhr.setRequestHeader("Content-Type", "application/json");
              },
              success: function(smartphone) {
                  var respContent = "";
                   
                  respContent += "<span class='success'>Smartphone was created: [";
                  respContent += smartphone.producer + " : ";
                  respContent += smartphone.model + " : " ;
                  respContent += smartphone.price + "]</span>";
                   
                  $("#sPhoneFromResponse").html(respContent);         
              }
          });
        	
        	alert("submitted!"); }*/
    });

    $().ready(function() {
        // validate the comment form when it is submitted
    	
    	$("#commentForm").validate();
    	//$("#active").val($('input[name="active"]').val());

        // validate signup form on keyup and submit
        $("#countryForm").validate({
            rules: {
                countryName: {
                    required: true,
                    minlength: 2
                },
                countryCode: {
                    required: true,
                    minlength: 2
                },
                port: "required",
                telephone: {
                    required: true,
                    minlength: 7
                },
                email: {
                    required: true,
                    email: true
                }
               // active: "required"
            },
            messages: {
            	countryName: "Please enter your countryName",
            	countryCode: "Please enter your countryCode",
            	port: {
                    required: "Please enter a port",
                    minlength: "Your port must consist of at least 2 characters"
                },
                telephone: {
                    required: "Please provide a telephone",
                    minlength: "Your telephone must be at least 7 characters long"
                },
                email: "Please enter a valid email address",
                active: "Please make it active to use it further"
            }
        });
        toastr.options = {
                "closeButton": true,
                "debug": false,
                "progressBar": false,
                "positionClass": "toast-top-right",
                "onclick": null,
                "showDuration": "300",
                "hideDuration": "1000",
                "timeOut": "5000",
                "extendedTimeOut": "1000",
                "showEasing": "swing",
                "hideEasing": "linear",
                "showMethod": "fadeIn",
                "hideMethod": "fadeOut"
              }
        if($("#message").val() != ""){
        	var $toast = toastr.success($("#message").val(), "Success");
        }

       
        /*// propose username by combining first- and lastname
        $("#username").focus(function() {
            var firstname = $("#firstname").val();
            var lastname = $("#lastname").val();
            if(firstname && lastname && !this.value) {
                this.value = firstname + "." + lastname;
            }
        });

        //code to hide topic selection, disable for demo
        var newsletter = $("#newsletter");
        // newsletter topics are optional, hide at first
        var inital = newsletter.is(":checked");
        var topics = $("#newsletter_topics")[inital ? "removeClass" : "addClass"]("gray");
        var topicInputs = topics.find("input").attr("disabled", !inital);
        // show when newsletter is checked
        newsletter.click(function() {
            topics[this.checked ? "removeClass" : "addClass"]("gray");
            topicInputs.attr("disabled", !this.checked);
        });*/
    });
}();