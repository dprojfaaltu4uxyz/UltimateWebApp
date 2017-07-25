<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Mosaddek">
    <meta name="keyword" content="FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	<link rel="shortcut icon" href="img/favicon.png">
		<%@include file="../pagetemplate/commonCSSJSP.jsp" %>
		
	<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
    <!--[if lt IE 9]>
      <script src="<c:url value='/static/js/html5shiv.js' />"></script>
      <script src="<c:url value='/static/js/respond.min.js' />"></script>
    <![endif]-->	
    
    <!--toastr-->
    <link href="<c:url value='/static/assets/toastr-master/toastr.css" rel="stylesheet" type="text/css'/>"/>
    
	</head>
	
	 <body>

  <section id="container">
      <!--header start-->
      <%@include file="../pagetemplate/topPanelJSP.jsp" %>
      <!--header end-->
      <!--sidebar start-->
      <%@include file="../pagetemplate/sidePanelJSP.jsp" %>
      <!--sidebar end-->
       <!--main content start-->
      <section id="main-content">
          <section class="wrapper site-min-height">
              <!-- page start-->
              <section class="panel">
                  <header class="panel-heading">
                      Agent Master
                  </header>
                  <div class="panel-body">
                      <div class="adv-table editable-table ">
                          <div class="clearfix">
                              <div class="btn-group">
                                  <!-- <button id="editable-sample_new" class="btn green">
                                      Add New <i class="fa fa-plus"></i>
                                  </button>  -->
                                  <a href="${pageContext.request.contextPath}/newagent" class="btn green">Add New Agent</a> 
                              </div>
                              <div class="btn-group pull-right">
                                  <button class="btn dropdown-toggle" data-toggle="dropdown">Tools <i class="fa fa-angle-down"></i>
                                  </button>
                                  <ul class="dropdown-menu pull-right">
                                      <li><a href="#">Print</a></li>
                                      <li><a href="#">Save as PDF</a></li>
                                      <li><a href="#">Export to Excel</a></li>
                                  </ul>
                              </div>
                          </div>
                          <div class="space15"></div>

                          <div class="table-responsive">

                          <table class="table table-striped table-hover table-bordered" id="editable-sample">
                              <thead>
                              <tr>
                                   
													 
													<th>Agent Name</th>
													<th >Agent Code</th>
													<th >Port</th>
											        <th >Email</th>
											        <th >Telephone</th>
											        <th >Fax</th>
											        <th >Contact Person</th>
											        <th >Contact Number</th>
											        <sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
											        	<th >Edit</th>
											        </sec:authorize>
											        <sec:authorize access="hasRole('ADMIN')">
											        	<th >Delete</th>
											        </sec:authorize>
                              </tr>
                              </thead>
                              <tbody>
                             <c:forEach items="${agents}" var="agent">
											<tr>
												<td>${agent.agentName}</td>
												<td>${agent.agentCode}</td>
												<td>${agent.port.portName}</td>
												<td>${agent.email}</td>
												<td>${agent.telephone}</td>
												<td>${agent.fax}</td>
												<td>${agent.contactPerson}</td>
												<td>${agent.contactNumber}</td>
											    <sec:authorize access="hasRole('ADMIN') or hasRole('DBA')">
													<td><a href="<c:url value='/edit-agent-${agent.agentId}' />" class="edit">Edit</a></td>
										        </sec:authorize>
										        <sec:authorize access="hasRole('ADMIN')">
													<td><a href="<c:url value='/delete-agent-${agent.agentId}' />" class="delete">Delete</a></td>
						        				</sec:authorize>
											</tr>
										</c:forEach>
                              </tbody>
                          </table>

                          </div>
                      </div>
                  </div>
              </section>
              <!-- page end-->
          </section>
      </section>
      <!--main content end-->
      <!-- Right Slidebar start -->
      <%@include file="../pagetemplate/rightSidePanelJSP.jsp" %>
      <!-- Right Slidebar end -->

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
    <script src="<c:url value='/static/js/jquery.js'/>"></script>
    <script src="<c:url value='/static/js/jquery-ui-1.9.2.custom.min.js'/>"></script>
    <script src="<c:url value='/static/js/jquery-migrate-1.2.1.min.js'/>"></script>
    <script src="<c:url value='/static/js/bootstrap.min.js'/>"></script>
    <script class="include" type="text/javascript" src="<c:url value='/static/js/jquery.dcjqaccordion.2.7.js'/>"></script>
    <script src="<c:url value='/static/js/jquery.scrollTo.min.js'/>"></script>
    <script src="<c:url value='/static/js/jquery.nicescroll.js" type="text/javascript'/>"></script>
    <script type="text/javascript" src="<c:url value='/static/assets/data-tables/jquery.dataTables.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/static/assets/data-tables/DT_bootstrap.js'/>"></script>
    <script src="<c:url value='/static/js/respond.min.js'/>"></script>

  <!--right slidebar-->
  <script src="<c:url value='/static/js/slidebars.min.js'/>"></script>

    <!--common script for all pages-->
    <script src="<c:url value='/static/js/common-scripts.js'/>"></script>
    
    <!--toastr-->
    <script src="<c:url value='/static/assets/toastr-master/toastr.js'/>" ></script>

      <!--script for this page only-->
      <script src="<c:url value='/static/js/editable-table.js'/>"></script>
      
      

      <!-- END JAVASCRIPTS -->
      <script>
          jQuery(document).ready(function() {
              EditableTable.init();
          });
      </script>


  </body>
</html>
  