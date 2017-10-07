<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

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
<%@include file="../pagetemplate/commonCSSJSP.jsp"%>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
      <script src="<c:url value='/static/js/html5shiv.js' />"></script>
      <script src="<c:url value='/static/js/respond.min.js' />"></script>
    <![endif]-->
</head>

<body>

	<section id="container">
		<!--header start-->
		<%@include file="../pagetemplate/topPanelJSP.jsp"%>
		<!--header end-->
		<!--sidebar start-->
		<%@include file="../pagetemplate/sidePanelJSP.jsp"%>
		<!--sidebar end-->

		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">
				<!-- page start-->

				<div class="row">
					<div class="col-lg-12">
						<section class="panel">
							<header class="panel-heading"> Advanced Table </header>
							<div class="btn-group">
								<!-- <button id="editable-sample_new" class="btn green">
                                      Add New <i class="fa fa-plus"></i>
                                  </button>  -->
								<a href="${pageContext.request.contextPath}/newclass"
									class="btn green">Add New Class</a>
							</div>
							<table class="table table-striped table-advance table-hover">
								<thead>
									<tr>

										<th>Class</th>
										<th>Class Numberic</th>
										<th>Teacher Name</th>
										<th>Note</th>
										<th><i class=" fa fa-edit"></i> Status</th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>


									<c:forEach items="${classes}" var="classes">
										<tr>
											<td><a href="#">${classes.classes}</a></td>
											<td>${classes.classesNumeric}</td>
											<td>${classes.teacher.firstName}</td>
											<td>${classes.note}</td>
											<td><span class="label label-info label-mini">Due</span></td>
											<sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
												<td><button class="btn btn-success btn-xs">
														<i class="fa fa-check"></i>
													</button>
													<button class="btn btn-primary btn-xs">
														<i class="fa fa-pencil"></i>
													</button>
													<button class="btn btn-danger btn-xs">
														<i class="fa fa-trash-o "></i>
													</button></td>
											</sec:authorize>

										</tr>
									</c:forEach>

									<td></td>

								</tbody>
							</table>
						</section>
					</div>
				</div>
				<!-- page end-->
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
	<script src="<c:url value='/static/js/jquery.js'/>"></script>
	<script src="<c:url value='/static/js/bootstrap.min.js'/>"></script>
	<script class="include" type="text/javascript"
		src="<c:url value='/static/js/jquery.dcjqaccordion.2.7.js'/>"></script>
	<script src="<c:url value='/static/js/jquery.scrollTo.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/static/js/jquery.nicescroll.js'/>"></script>
	<script src="<c:url value='/static/js/respond.min.js'/>"></script>

	<!--right slidebar-->
	<script src="<c:url value='/static/js/slidebars.min.js'/>"></script>

	<!--common script for all pages-->
	<script src="<c:url value='/static/js/common-scripts.js'/>"></script>


</body>
</html>
