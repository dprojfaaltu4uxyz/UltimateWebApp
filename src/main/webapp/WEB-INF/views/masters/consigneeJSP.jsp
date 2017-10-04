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

    <title>JobCard</title>
     <!-- Bootstrap core CSS -->
    <link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet"/>
    <link href="<c:url value='/static/css/bootstrap-reset.css' />" rel="stylesheet"/>
    <!--external css-->
    <link href="<c:url value='/static/assets/font-awesome/css/font-awesome.css' />" rel="stylesheet" />
	
	<link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/bootstrap-datepicker/css/datepicker.css' />" />
    
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/bootstrap-daterangepicker/daterangepicker-bs3.css' />" />
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/bootstrap-datetimepicker/css/datetimepicker.css' />" />

    <!--bootstrap switcher-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/bootstrap-switch/static/stylesheets/bootstrap-switch.css'/>"/>

    <!-- switchery-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/switchery/switchery.css'/>" />

    <!--select 2-->
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/assets/select2/css/select2.min.css'/>"/>
    
    <!--toastr-->
    <link href="<c:url value='/static/assets/toastr-master/toastr.css" rel="stylesheet" type="text/css'/>"/>

	
      <!--right slidebar-->
    <link href="<c:url value='/static/css/slidebars.css' />" rel="stylesheet"/>
    
    <link rel="stylesheet" type="text/css" href="<c:url value='/static/css/tautocomplete.css'/>" />

	<!-- Yamm styles-->
    <link href="<c:url value='/static/css/yamm.css'/>" rel="stylesheet">
	
	
	
    <!-- Custom styles for this template -->

    <link href="<c:url value='/static/css/style.css' />" rel="stylesheet">
    <link href="<c:url value='/static/css/style-responsive.css' />" rel="stylesheet" />

	<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
  </head>

<body class="mega-nav">

    <section id="container" class="">
        <!--header start-->
         <%@include file="../pagetemplate/topPanelMegaMenuJSP.jsp" %>
        <!--header end-->
        <!--sidebar start-->

        <!--sidebar end-->
        <!--main content start-->
        <section id="main-content">
            <section class="wrapper site-min-height">
                <!-- page start-->

                <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                Consignee Master Form
                                <span style="float: right"><a href="${pageContext.request.contextPath}/citylist">Go To City List</a></span>
                            </header>

                            <div class="panel-body">

                                 <form:form method="POST" modelAttribute="consignee" cssClass="form-horizontal" id="consigneeForm">
                                 <form:input type="hidden" path="consigneeId" id="id"/>
                                    <div class="form-group">
                                       <label for="consigneeName" class="col-md-1">Consignee Name</label>
                                        <div class="col-md-3">
                                             <form:input class="form-control" id="consigneeName" name="consigneeName" type="text" path="consigneeName" />
                                            <div class="has-error">
												<form:errors path="consigneeName" class="help-inline"/>
											</div>
                                        </div>
                                        <label for="consigneeCode" class="col-md-1">Consignee Code</label>
                                        <div class="col-md-3">
                                          <form:input class="form-control" id="consigneeCode" name="consigneeCode" type="text" path="consigneeCode" />
                                           <div class="has-error">
												<form:errors path="consigneeCode" class="help-inline"/>
											</div>
                                        </div>
                                       <label for="exporter" class="col-md-1">Exporter</label>
                                        <div class="col-md-3">
                                          <form:input class="form-control" id="exporter" name="exporter" type="text" path="exporter" />
                                           <div class="has-error">
												<form:errors path="exporter" class="help-inline"/>
											</div>		
									 	</div>
                                    </div>
                                     <div class="form-group">
                                       <label for="addressOne" class="col-md-1">Address Line 1</label>
                                        <div class="col-md-3">
                                             <form:input class="form-control" id="addressOne" name="addressOne" type="text" path="addressOne" />
                                            <div class="has-error">
												<form:errors path="addressOne" class="help-inline"/>
											</div>
                                        </div>
                                        <label for="addressTwo" class="col-md-1">Address Line 2</label>
                                        <div class="col-md-3">
                                          <form:input class="form-control" id="addressTwo" name="consigneeCode" type="text" path="addressTwo" />
                                           <div class="has-error">
												<form:errors path="addressTwo" class="help-inline"/>
											</div>
                                        </div>
                                       <label for="addressThree" class="col-md-1">Address Line 3</label>
                                        <div class="col-md-3">
                                          <form:input class="form-control" id="addressThree" name="addressThree" type="text" path="addressThree" />
                                           <div class="has-error">
												<form:errors path="addressThree" class="help-inline"/>
											</div>		
									 	</div>
                                    </div>
                                     <div class="form-group">
                                       <label for="phone" class="col-md-1">Phone</label>
                                        <div class="col-md-3">
                                             <form:input class="form-control" id="phone" name="phone" type="text" path="phone" />
                                            <div class="has-error">
												<form:errors path="phone" class="help-inline"/>
											</div>
                                        </div>
                                        <label for="state" class="col-md-1">Country</label>
                                        <div class="col-md-3">
                                            <form:select path="country"  id ="country"
																multiple="false"  class="form-control select2" >
															<option value="">Select Country</option>			
															<form:options items="${countryList}" itemValue="countryId" itemLabel="countryName"/>	
													</form:select>
										<form:input class="form-control" id="selectedCountryId" name="selectedCountryId" type="hidden" path="selectedCountryId" />
										<div class="has-error">
																<form:errors path="country" class="help-inline" />
															</div>					
									 	</div>
                                       <label for="addressThree" class="col-md-1">City</label>
                                        <div class="col-md-3">
                                          <form:select path="city"  id ="city"
																multiple="false"  class="form-control select2" >
															<option value="">Select City</option>			
															<form:options items="${cityList}" itemValue="cityId" itemLabel="cityName"/>	
													</form:select>
										<form:input class="form-control" id="selectedCityId" name="selectedCityId" type="hidden" path="selectedCityId" />
										<div class="has-error">
																<form:errors path="city" class="help-inline" />
															</div>			
									 	</div>
                                    </div>
									 <form:input class="form-control" id="message" name="message" type="hidden" path="message" />


                                   
                                   <div class="form-group">
                                          <label for="active" class="col-md-1">Is Active</label>
                                        <div class="col-md-3">
                                            <form:checkbox  style="width: 20px" class="checkbox form-control" id="active" name="active" path="active" value="0" />
			                                <div class="has-error">
												<form:errors path="active" class="help-inline"/>
											</div>
                                        </div>
                                          <label for="buyer" class="col-md-1">Is Buyer</label>
                                        <div class="col-md-3">
                                            <form:checkbox  style="width: 20px" class="checkbox form-control" id="buyer" name="buyer" path="buyer" value="0" />
			                                <div class="has-error">
												<form:errors path="active" class="help-inline"/>
											</div>
                                        </div>
                                        
                                    </div>
                                    
                                      <div class="form-group">
                                          <div class="col-lg-offset-2 col-lg-10">
                                              <button class="btn btn-danger" type="submit">Save</button>
                                              <button class="btn btn-default" type="button">Cancel</button>
                                          </div>
                                      </div>
                                </form:form>
                            </div>
                        </section>
                    </div>
                </div>

                <!-- page end-->
            </section>
        </section>
        <!--main content end-->
        <!--footer start-->
        <footer class="site-footer">
            <div class="text-center">
                2013 &copy; FlatLab by VectorLab.
                <a href="#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
            </div>
        </footer>
        <!--footer end-->
    </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="<c:url value='/static/js/jquery.js' />"></script>
    <script src="<c:url value='/static/js/bootstrap.min.js' />"></script>
    <script class="include" type="text/javascript" src="<c:url value='/static/js/jquery.dcjqaccordion.2.7.js' />"></script>
    <script type="text/javascript" src="<c:url value='/static/js/hover-dropdown.js' />"></script>
    <script src="<c:url value='/static/js/jquery.scrollTo.min.js' />"></script>
    <script src="<c:url value='/static/js/jquery.nicescroll.js" type="text/javascript' />"></script>
    <script type="text/javascript" src="<c:url value='/static/js/jquery.validate.min.js'/>"></script>
    <script src="<c:url value='/static/js/respond.min.js' />"></script>

    <script type="text/javascript" src="<c:url value='/static/assets/bootstrap-datepicker/js/bootstrap-datepicker.js' />"></script>

    <!--right slidebar-->
    <script src="<c:url value='/static/js/slidebars.min.js' />"></script>

    <!--script for this page-->
    <script src="<c:url value='/static/js/jquery.stepy.js' />"></script>

    <!--common script for all pages-->
    <script src="<c:url value='/static/js/common-scripts.js' />"></script>
    
      <!--select2-->
  <script type="text/javascript" src="<c:url value='/static/assets/select2/js/select2.js'/>" ></script>
    
    <!--toastr-->
    <script src="<c:url value='/static/assets/toastr-master/toastr.js'/>" ></script>
<!--script for this page-->
    <script src="<c:url value='/static/js/masters/city.js'/>" ></script>
    
    
    
    <script>
        $('.date').datepicker({
            autoclose: true
        });
        $('.rbiWaiverDate').datepicker({
            autoclose: true
        });
        //step wizard

        $(function () {
            $('#default').stepy({
                backLabel: 'Previous',
                block: true,
                nextLabel: 'Next',
                titleClick: true,
                titleTarget: '.stepy-tab'
            });
        });
    </script>

</body>

</html>