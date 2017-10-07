<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Mosaddek">
<meta name="keyword"
	content="FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
<link rel="shortcut icon" href="img/favicon.png">
<%@include file="pagetemplate/commonCSSJSP.jsp"%>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
      <script src="<c:url value='/static/js/html5shiv.js' />"></script>
      <script src="<c:url value='/static/js/respond.min.js' />"></script>
    <![endif]-->
</head>

<body>

	<section id="container">
		<!--header start-->
		<%@include file="pagetemplate/topPanelJSP.jsp"%>
		<!--header end-->
		<!--sidebar start-->
		<%@include file="pagetemplate/sidePanelJSP.jsp"%>
		<!--sidebar end-->
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">

				<!--datetime picker start-->
				<div class="row">
					<div class="col-md-12">
						<section class="panel">
							<header class="panel-heading">
								Datetime Pickers <span class="tools pull-right"> <a
									href="javascript:;" class="fa fa-chevron-down"></a> <a
									href="javascript:;" class="fa fa-times"></a>
								</span>
							</header>
							<div class="panel-body">
								<form class="form-horizontal  tasi-form" action="#">
									<div class="form-group">
										<label class="control-label col-md-3">Default input
											Datetimepicker</label>
										<div class="col-md-4">
											<input size="16" type="text" value="2012-06-15 14:45"
												readonly class="form_datetime form-control">
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-3"> Component
											Datetimepicker</label>
										<div class="col-md-4">
											<div class="input-group date form_datetime-component">
												<input type="text" class="form-control" readonly=""
													size="16"> <span class="input-group-btn">
													<button type="button" class="btn btn-danger date-set">
														<i class="fa fa-calendar"></i>
													</button>
												</span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-md-3">Advance
											Datetimepicker</label>
										<div class="col-md-4">
											<div data-date="2012-12-21T15:25:00Z"
												class="input-group date form_datetime-adv">
												<input type="text" class="form-control" readonly=""
													size="16">
												<div class="input-group-btn">
													<button type="button" class="btn btn-danger date-reset">
														<i class="fa fa-times"></i>
													</button>
													<button type="button" class="btn btn-warning date-set">
														<i class="fa fa-calendar"></i>
													</button>
												</div>
											</div>
										</div>
									</div>

									<div class="form-group">
										<label class="control-label col-md-3">Meridian Format</label>
										<div class="col-md-4">
											<div data-date="2012-12-21T15:25:00Z"
												class="input-group date form_datetime-meridian">
												<input type="text" class="form-control" readonly=""
													size="16">
												<div class="input-group-btn">
													<button type="button" class="btn btn-danger date-reset">
														<i class="fa fa-times"></i>
													</button>
													<button type="button" class="btn btn-info date-set">
														<i class="fa fa-calendar"></i>
													</button>
												</div>
											</div>
										</div>
									</div>



								</form>
							</div>
						</section>
					</div>
				</div>
				<!--datetime picker end-->

				<div class="row">
					<div class="col-lg-12">
						<section class="panel">
							<header class="panel-heading"> Advanced Form validations
							</header>
							<div class="panel-body">
								<div class="form">
									<form class="cmxform form-horizontal tasi-form" id="signupForm"
										method="get" action="">
										<div class="form-group ">
											<label for="firstname" class="control-label col-lg-2">Firstname</label>
											<div class="col-md-4"">
												<input class=" form-control" id="firstname" name="firstname"
													type="text" />
											</div>
										</div>
										<div class="form-group ">
											<label for="lastname" class="control-label col-lg-2">Lastname</label>
											<div class="col-md-4"">
												<input class=" form-control" id="lastname" name="lastname"
													type="text" />
											</div>
										</div>
										<div class="form-group ">
											<label for="username" class="control-label col-lg-2">Username</label>
											<div class="col-md-4"">
												<input class="form-control " id="username" name="username"
													type="text" />
											</div>
										</div>
										<div class="form-group ">
											<label for="password" class="control-label col-lg-2">Password</label>
											<div class="col-md-4"">
												<input class="form-control " id="password" name="password"
													type="password" />
											</div>
										</div>
										<div class="form-group ">
											<label for="confirm_password" class="control-label col-lg-2">Confirm
												Password</label>
											<div class="col-md-4"">
												<input class="form-control " id="confirm_password"
													name="confirm_password" type="password" />
											</div>
										</div>
										<div class="form-group ">
											<label for="email" class="control-label col-lg-2">Email</label>
											<div class="col-md-4"">
												<input class="form-control " id="email" name="email"
													type="email" />
											</div>
										</div>
										<div class="form-group ">
											<label for="agree" class="control-label col-lg-2 col-sm-3">Agree
												to Our Policy</label>
											<div class="col-lg-10 col-sm-9">
												<input type="checkbox" style="width: 20px"
													class="checkbox form-control" id="agree" name="agree" />
											</div>
										</div>
										<div class="form-group ">
											<label for="newsletter"
												class="control-label col-lg-2 col-sm-3">Receive the
												Newsletter</label>
											<div class="col-lg-10 col-sm-9">
												<input type="checkbox" style="width: 20px"
													class="checkbox form-control" id="newsletter"
													name="newsletter" />
											</div>
										</div>

										<div class="form-group">
											<div class="col-lg-offset-2 col-lg-10">
												<button class="btn btn-danger" type="submit">Save</button>
												<button class="btn btn-default" type="button">Cancel</button>
											</div>
										</div>
									</form>
								</div>
							</div>
						</section>
					</div>
				</div>
				<!-- page end-->



			</section>
		</section>
		<!--main content end-->

		<!-- Right Slidebar start -->
		<%@include file="pagetemplate/rightSidePanelJSP.jsp"%>
		<!-- Right Slidebar end -->

		<!--footer start-->
		<footer class="site-footer">
			<div class="text-center">
				2013 &copy; FlatLab by VectorLab. <a href="#" class="go-top"> <i
					class="fa fa-angle-up"></i>
				</a>
			</div>
		</footer>
		<!--footer end-->
	</section>


	<!-- js placed at the end of the document so the pages load faster -->
	<script src="<c:url value='/static/js/jquery.js' />"></script>
	<script src="<c:url value='/static/js/bootstrap.min.js' />"></script>
	<script class="include" type="text/javascript"
		src="<c:url value='/static/js/jquery.dcjqaccordion.2.7.js' />"></script>
	<script src="<c:url value='/static/js/jquery.scrollTo.min.js' />"></script>
	<script src="<c:url value='/static/js/jquery.nicescroll.js' />"
		type="text/javascript"></script>
	<script type="text/javascript"
		src="<c:url value='/static/js/jquery.validate.min.js' />"></script>
	<script src="<c:url value='/static/js/respond.min.js' />"></script>

	<!--right slidebar-->
	<script src="<c:url value='/static/js/slidebars.min.js' />"></script>

	<!--common script for all pages-->
	<script src="<c:url value='/static/js/common-scripts.js' />"></script>

	<!--script for this page-->
	<script src="<c:url value='/static/js/form-validation-script.js' />"></script>

	<script>

      //owl carousel

      $(document).ready(function() {
          $("#owl-demo").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true,
			  autoPlay:true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

      $(window).on("resize",function(){
          var owl = $("#owl-demo").data("owlCarousel");
          owl.reinit();
      });

  </script>



	<!--this page plugins-->

	<script type="text/javascript"
		src="<c:url value='/static/assets/fuelux/js/spinner.min.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-fileupload/bootstrap-fileupload.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-wysihtml5/wysihtml5-0.3.0.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-wysihtml5/bootstrap-wysihtml5.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-datepicker/js/bootstrap-datepicker.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-daterangepicker/moment.min.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-daterangepicker/daterangepicker.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-colorpicker/js/bootstrap-colorpicker.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-timepicker/js/bootstrap-timepicker.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/jquery-multi-select/js/jquery.multi-select.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/assets/jquery-multi-select/js/jquery.quicksearch.js' />"></script>

	<!--select2-->
	<script type="text/javascript"
		src="<c:url value='/static/assets/select2/js/select2.min.js' />"></script>

	<!--summernote-->
	<script
		src="<c:url value='/static/assets/summernote/dist/summernote.min.js' />"></script>

	<!--right slidebar-->
	<script src="<c:url value='/static/js/slidebars.min.js' />"></script>


	<!--this page  script only-->
	<script src="<c:url value='/static/js/advanced-form-components.js' />"></script>

	<!--bootstrap-switch-->
	<script
		src="<c:url value='/static/assets/bootstrap-switch/static/js/bootstrap-switch.js' />"></script>

	<!--bootstrap-switch-->
	<script src="<c:url value='/static/assets/switchery/switchery.js' />"></script>

	<!--common script for all pages-->
	<script src="<c:url value='/static/js/common-scripts.js' />"></script>

	<script>

      jQuery(document).ready(function(){

          $('.summernote').summernote({
              height: 200,                 // set editor height

              minHeight: null,             // set minimum height of editor
              maxHeight: null,             // set maximum height of editor

              focus: true                 // set focus to editable area after initializing summernote
          });
      });

  </script>

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
