<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
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

<title>FlatLab - Flat & Responsive Bootstrap Admin Template</title>

<!-- Bootstrap core CSS -->
<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/bootstrap-reset.css' />"
	rel="stylesheet"></link>
<!--external css-->
<link
	href="<c:url value='/static/assets/font-awesome/css/font-awesome.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/style.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/style-responsive.css' />"
	rel="stylesheet"></link>
<!-- Custom styles for this template -->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="login-body">

	<div class="container">
		<c:url var="loginUrl" value="/login" />
		<form class="form-signin" action="${loginUrl}" method="post">
			<c:if test="${param.error != null}">
				<div class="alert alert-danger">
					<p>Invalid username and password.</p>
				</div>
			</c:if>
			<c:if test="${param.logout != null}">
				<div class="alert alert-success">
					<p>You have been logged out successfully.</p>
				</div>
			</c:if>
			<h2 class="form-signin-heading">sign in now</h2>
			<div class="login-wrap">
				<input type="text" class="form-control" id="username" name="ssoId"
					placeholder="User ID" autofocus> <input type="password"
					id="password" name="password" class="form-control"
					placeholder="Password"> <input type="hidden"
					name="${_csrf.parameterName}" value="${_csrf.token}" /> <label
					class="checkbox"> <input type="checkbox"
					value="remember-me"> Remember me <span class="pull-right">
						<a data-toggle="modal" href="#myModal"> Forgot Password?</a>

				</span>
				</label>
				<button class="btn btn-lg btn-login btn-block" type="submit">Sign
					in</button>
				<p>or you can sign in via social network</p>
				<div class="login-social-link">
					<a href="index.html" class="facebook"> <i
						class="fa fa-facebook"></i> Facebook
					</a> <a href="index.html" class="twitter"> <i class="fa fa-twitter"></i>
						Twitter
					</a>
				</div>
				<div class="registration">
					Don't have an account yet? <a class="" href="registration.html">
						Create an account </a>
				</div>

			</div>

			<!-- Modal -->
			<div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog"
				tabindex="-1" id="myModal" class="modal fade">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title">Forgot Password ?</h4>
						</div>
						<div class="modal-body">
							<p>Enter your e-mail address below to reset your password.</p>
							<input type="text" name="email" placeholder="Email"
								autocomplete="off" class="form-control placeholder-no-fix">

						</div>
						<div class="modal-footer">
							<button data-dismiss="modal" class="btn btn-default"
								type="button">Cancel</button>
							<button class="btn btn-success" type="button">Submit</button>
						</div>
					</div>
				</div>
			</div>
			<!-- modal -->

		</form>

	</div>



	<!-- js placed at the end of the document so the pages load faster -->
	<script src="<c:url value='/static/js/jquery.js'/>"></script>
	<script src="<c:url value='/static/js/bootstrap.min.js'/>"></script>


</body>
</html>
