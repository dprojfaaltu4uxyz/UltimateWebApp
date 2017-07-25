<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Mosaddek">
    <meta name="keyword" content="Smacventure, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	<link rel="shortcut icon" href="img/favicon.png">

    <title>Teacher</title>

     <!-- Bootstrap core CSS -->
    <link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet"/>
    <link href="<c:url value='/static/css/bootstrap-reset.css' />" rel="stylesheet"/>
    <!--external css-->
    <link href="<c:url value='/static/assets/font-awesome/css/font-awesome.css' />" rel="stylesheet" />
	
	<link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/bootstrap-datepicker/css/datepicker.css' />" />
    
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/bootstrap-daterangepicker/daterangepicker-bs3.css' />" />
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/bootstrap-datetimepicker/css/datetimepicker.css' />" />

    <!--bootstrap switcher-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/bootstrap-switch/static/stylesheets/bootstrap-switch.css" />

    <!-- switchery-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/switchery/switchery.css" />

    <!--select 2-->
    <link rel="stylesheet" type="text/css" href="assets/select2/css/select2.min.css"/>

	
      <!--right slidebar-->
    <link href="<c:url value='/static/css/slidebars.css' />" rel="stylesheet">

	
	
    <!-- Custom styles for this template -->

    <link href="<c:url value='/static/css/style.css' />" rel="stylesheet">
    <link href="<c:url value='/static/css/style-responsive.css' />" rel="stylesheet" />

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
  
  
   <!-- js placed at the end of the document so the pages load faster -->
    <script src="<c:url value='/static/js/jquery.js' />"></script>
    <script src="<c:url value='/static/js/bootstrap.min.js' />"></script>
    <script class="include" type="text/javascript" src="<c:url value='/static/js/jquery.dcjqaccordion.2.7.js' />"></script>
    <script src="<c:url value='/static/js/jquery.scrollTo.min.js' />"></script>
    <script src="<c:url value='/static/js/jquery.nicescroll.js" type="text/javascript' />"></script>
    <script src="<c:url value='/static/js/respond.min.js' />" ></script>
  
    <!--this page plugins-->

  <script type="text/javascript" src="<c:url value='/static/assets/bootstrap-datepicker/js/bootstrap-datepicker.js' />"></script>
  <script type="text/javascript" src="assets/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js' />"></script>

  <script type="text/javascript" src="<c:url value='/static/assets/bootstrap-daterangepicker/daterangepicker.js' />"></script>
 
  <script type="text/javascript" src="<c:url value='/static/assets/bootstrap-timepicker/js/bootstrap-timepicker.js' />"></script>
  <script type="text/javascript" src="<c:url value='/static/assets/jquery-multi-select/js/jquery.multi-select.js' />"></script>


  <!--select2-->
  <script type="text/javascript" src="<c:url value='/static/assets/select2/js/select2.min.js' />"></script>



  <!--this page  script only-->
  <script src="<c:url value='/static/js/advanced-form-components.js' />"></script>

  <!--bootstrap-switch-->
  <script src="<c:url value='/static/assets/bootstrap-switch/static/js/bootstrap-switch.js' />"></script>

  <!--bootstrap-switch-->
  <script src="<c:url value='/static/assets/switchery/switchery.js' />"></script>

  <!--common script for all pages-->
  <script src="<c:url value='/static/js/common-scripts.js' />"></script>



    <!--select2-->
  <script type="text/javascript">

      $(document).ready(function () {
          $(".js-example-basic-single").select2();

          $(".js-example-basic-multiple").select2();
      });
  </script>

  <!--bootstrap swither-->
  <script type="text/javascript">
      $(document).ready(function () {
          // Resets to the regular style
          $('#dimension-switch').bootstrapSwitch('setSizeClass', '');
          // Sets a mini switch
          $('#dimension-switch').bootstrapSwitch('setSizeClass', 'switch-mini');
          // Sets a small switch
          $('#dimension-switch').bootstrapSwitch('setSizeClass', 'switch-small');
          // Sets a large switch
          $('#dimension-switch').bootstrapSwitch('setSizeClass', 'switch-large');


          $('#change-color-switch').bootstrapSwitch('setOnClass', 'success');
          $('#change-color-switch').bootstrapSwitch('setOffClass', 'danger');
      });
  </script>

  <!-- swithery-->
  <script type="text/javascript">
      $(document).ready(function () {
          //default
          var elem = document.querySelector('.js-switch');
          var init = new Switchery(elem);


          //small
          var elem = document.querySelector('.js-switch-small');
          var switchery = new Switchery(elem, { size: 'small' });

          //large
          var elem = document.querySelector('.js-switch-large');
          var switchery = new Switchery(elem, { size: 'large' });


          //blue color
          var elem = document.querySelector('.js-switch-blue');
          var switchery = new Switchery(elem, { color: '#7c8bc7', jackColor: '#9decff' });

          //green color
          var elem = document.querySelector('.js-switch-yellow');
          var switchery = new Switchery(elem, { color: '#FFA400', jackColor: '#ffffff' });

          //red color
          var elem = document.querySelector('.js-switch-red');
          var switchery = new Switchery(elem, { color: '#ff6c60', jackColor: '#ffffff' });


      });
  </script>


  </body>
</html>