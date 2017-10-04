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
                                Agent Master Form
                                <span style="float: right"><a href="${pageContext.request.contextPath}/agentlist">Go To Agent List</a></span>
                            </header>

                            <div class="panel-body">

                                 <form:form method="POST" modelAttribute="airagent" cssClass="form-horizontal" id="agentForm">
                                 <form:input type="hidden" path="agentId" id="id"/>
                                    <div class="form-group">
                                       <label for="agentName" class="col-md-1">Agent Name</label>
                                        <div class="col-md-3">
                                             <form:input class="form-control" id="agentName" name="agentName" type="text" path="agentName" />
                                            <div class="has-error">
												<form:errors path="agentName" class="help-inline"/>
											</div>
                                        </div>
                                        <label for="agentCode" class="col-md-1">Agent Code</label>
                                        <div class="col-md-3">
                                          <form:input class="form-control" id="agentCode" name="agentCode" type="text" path="agentCode" />
                                           <div class="has-error">
												<form:errors path="agentCode" class="help-inline"/>
											</div>
                                        </div>
                                       <label for="port" class="col-md-1">Port</label>
                                        <div class="col-md-3">
                                            <form:select path="port"  id ="port"
																multiple="false"  class="form-control select2" >
															<option value="">Select Port</option>			
															<form:options items="${portList}" itemValue="portId" itemLabel="portName"/>	
													</form:select>
										<form:input class="form-control" id="selectedPortId" name="selectedPortId" type="hidden" path="selectedPortId" />
										<div class="has-error">
																<form:errors path="port" class="help-inline" />
															</div>				
									 	</div>
                                    </div>
									 <form:input class="form-control" id="message" name="message" type="hidden" path="message" />


                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label for="password" class="col-md-1">Address</label>
                                        <div class="col-md-3">
                                            <form:input class="form-control" id="address" name="address" type="textarea" path="address"  />
                                            <div class="has-error">
												<form:errors path="address" class="help-inline"/>
											</div>
                                           
                                        </div>

                                     
                                        <label for="email" class="col-md-1">Email</label>
                                        <div class="col-md-3">
                                            <form:input class="form-control" id="email" name="email" type="text" path="email" />
                                             <div class="has-error">
												<form:errors path="email" class="help-inline"/>
											</div>
                                        </div>
   										<label for="telephone" class="col-md-1">Telephone</label>
                                        <div class="col-md-3">
                                            <form:input  class="form-control" id="telephone" name="telephone" type="text" path="telephone" />
                                             <div class="has-error">
												<form:errors path="telephone" class="help-inline"/>
											</div>
                                        </div>
                                    </div>
 									<form:input class="form-control" id="message" name="message" type="hidden" path="message" />
                                    <!-- Textarea -->
                                    <div class="form-group">
                                          <label for="fax" class="col-md-1">Fax</label>
                                        <div class="col-md-3">
                                             <form:input  class="form-control" id="fax" name="fax" type="text" path="fax"  />
			                                <div class="has-error">
												<form:errors path="fax" class="help-inline"/>
										</div>
                                        </div>
                                        <label for="contactPerson" class="col-md-1">Contact Person</label>
                                        <div class="col-md-3">
                                           <form:input  class="form-control" id="contactPerson" name="contactPerson" type="text" path="contactPerson"  />
											<div class="has-error">
												<form:errors path="contactPerson" class="help-inline"/>
											</div>		
                                        </div>
                                       <label for="contactNumber" class="col-md-1">Contact Number</label>
                                        <div class="col-md-3">
                                           
										 <form:input  class="form-control" id="contactNumber" name="contactNumber" type="contactNumber" path="contactNumber" />			
											<div class="has-error">
												<form:errors path="contactNumber" class="help-inline"/>
											</div>	
                                        </div>
                                        
                                    </div>
                                   <div class="form-group">
                                          <label for="fax" class="col-md-1">Is Active</label>
                                        <div class="col-md-3">
                                            <form:checkbox  style="width: 20px" class="checkbox form-control" id="active" name="active" path="active" value="0" />
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
    <script src="<c:url value='/static/js/masters/agent.js'/>" ></script>
    
    
    
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