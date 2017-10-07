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
	content="Smacventure, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
<link rel="shortcut icon" href="img/favicon.png">

<title>Teacher</title>

<!-- Bootstrap core CSS -->
<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet" />
<link href="<c:url value='/static/css/bootstrap-reset.css' />"
	rel="stylesheet" />
<!--external css-->
<link
	href="<c:url value='/static/assets/font-awesome/css/font-awesome.css' />"
	rel="stylesheet" />

<link rel="stylesheet" type="text/css"
	href="<c:url value='/static/assets/bootstrap-datepicker/css/datepicker.css' />" />

<link rel="stylesheet" type="text/css"
	href="<c:url value='/static/assets/bootstrap-daterangepicker/daterangepicker-bs3.css' />" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/static/assets/bootstrap-datetimepicker/css/datetimepicker.css' />" />

<!--bootstrap switcher-->
<link rel="stylesheet" type="text/css"
	href="<c:url value='/static/assets/bootstrap-switch/static/stylesheets/bootstrap-switch.css'/>" />

<!-- switchery-->
<link rel="stylesheet" type="text/css"
	href="<c:url value='/static/assets/switchery/switchery.css'/>" />

<!--select 2-->
<link rel="stylesheet" type="text/css"
	href="<c:url value='/static/assets/select2/css/select2.min.css'/>" />


<!--right slidebar-->
<link href="<c:url value='/static/css/slidebars.css' />"
	rel="stylesheet" />



<!-- Custom styles for this template -->

<link href="<c:url value='/static/css/style.css' />" rel="stylesheet">
<link href="<c:url value='/static/css/style-responsive.css' />"
	rel="stylesheet" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<section id="container">
		<!--header start-->
		<%@include file="../pagetemplate/topPanelJSP.jsp"%>
		<!--header end-->
		<!--sidebar start-->
		<%@include file="../pagetemplate/sidePanelJSP.jsp"%>
		<section id="main-content">

			<section class="wrapper">
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
											<div class="col-lg-6">
												<input class=" form-control" id="firstname" name="firstname"
													type="text" />
											</div>
										</div>
										<div class="form-group ">
											<label for="lastname" class="control-label col-lg-2">Lastname</label>
											<div class="col-lg-6">
												<input class=" form-control" id="lastname" name="lastname"
													type="text" />
											</div>
										</div>
										<div class="form-group ">
											<label for="username" class="control-label col-lg-2">Username</label>
											<div class="col-lg-6">
												<input class="form-control " id="username" name="username"
													type="text" />
											</div>
										</div>
										<div class="form-group ">
											<label for="password" class="control-label col-lg-2">Password</label>
											<div class="col-lg-6">
												<input class="form-control " id="password" name="password"
													type="password" />
											</div>
										</div>
										<div class="form-group ">
											<label for="confirm_password" class="control-label col-lg-2">Confirm
												Password</label>
											<div class="col-lg-6">
												<input class="form-control " id="confirm_password"
													name="confirm_password" type="password" />
											</div>
										</div>
										<div class="form-group ">
											<label for="email" class="control-label col-lg-2">Email</label>
											<div class="col-lg-6">
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
			</section>

		</section>
		<!--main content end-->

		<!-- Right Slidebar start -->
		<%@include file="../pagetemplate/rightSidePanelJSP.jsp"%>
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
	<script
		src="<c:url value='/static/js/jquery.nicescroll.js" type="text/javascript' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/js/jquery.validate.min.js'/>"></script>
	<script src="<c:url value='/static/js/respond.min.js' />"></script>


	<!--right slidebar-->
	<script src="<c:url value='/static/js/slidebars.min.js'/>"></script>


	<!--common script for all pages-->
	<script src="<c:url value='/static/js/common-scripts.js' />"></script>

	<!--script for this page-->
	<script src="<c:url value='/static/js/form-validation-script.js'/>"></script>










</body>
</html>