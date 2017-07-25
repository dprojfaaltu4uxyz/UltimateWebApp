<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en-us">
	<head>
		<meta charset="utf-8">
		<!--<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">-->

		<title> SmartAdmin </title>
		<meta name="description" content="">
		<meta name="author" content="">
			
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<%@include file="../pagetemplate/commonCSSJSP.jsp" %>
		<link rel="stylesheet" href="<c:url value='/static/css/bootstrap-datepicker3.css'/>"> 
	</head>
	
	<!--

	TABLE OF CONTENTS.
	
	Use search to find needed section.
	
	===================================================================
	
	|  01. #CSS Links                |  all CSS links and file paths  |
	|  02. #FAVICONS                 |  Favicon links and file paths  |
	|  03. #GOOGLE FONT              |  Google font link              |
	|  04. #APP SCREEN / ICONS       |  app icons, screen backdrops   |
	|  05. #BODY                     |  body tag                      |
	|  06. #HEADER                   |  header tag                    |
	|  07. #PROJECTS                 |  project lists                 |
	|  08. #TOGGLE LAYOUT BUTTONS    |  layout buttons and actions    |
	|  09. #MOBILE                   |  mobile view dropdown          |
	|  10. #SEARCH                   |  search field                  |
	|  11. #NAVIGATION               |  left panel & navigation       |
	|  12. #RIGHT PANEL              |  right panel userlist          |
	|  13. #MAIN PANEL               |  main panel                    |
	|  14. #MAIN CONTENT             |  content holder                |
	|  15. #PAGE FOOTER              |  page footer                   |
	|  16. #SHORTCUT AREA            |  dropdown shortcuts area       |
	|  17. #PLUGINS                  |  all scripts and plugins       |
	
	===================================================================
	
	-->
	
	<!-- #BODY -->
	<!-- Possible Classes

		* 'smart-style-{SKIN#}'
		* 'smart-rtl'         - Switch theme mode to RTL
		* 'menu-on-top'       - Switch to top navigation (no DOM change required)
		* 'no-menu'			  - Hides the menu completely
		* 'hidden-menu'       - Hides the main menu but still accessable by hovering over left edge
		* 'fixed-header'      - Fixes the header
		* 'fixed-navigation'  - Fixes the main menu
		* 'fixed-ribbon'      - Fixes breadcrumb
		* 'fixed-page-footer' - Fixes footer
		* 'container'         - boxed layout mode (non-responsive: will not work with fixed-navigation & fixed-ribbon)
		
		// for material put this in body : desktop-detected pace-done smart-style-6
	-->
	<body class="">

		<!-- HEADER -->
		<%@include file="../pagetemplate/topPanelJSP.jsp" %>
		<!-- END HEADER -->

		<!-- Left panel : Navigation area -->
		<!-- Note: This width of the aside area can be adjusted through LESS variables -->
		<%@include file="../pagetemplate/sidePanelJSP.jsp" %>

		<!-- MAIN PANEL -->
		<div id="main" role="main">

			<!-- RIBBON -->
			<div id="ribbon">

				<span class="ribbon-button-alignment"> 
					<span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> Warning! This will reset all your widget settings." data-html="true">
						<i class="fa fa-refresh"></i>
					</span> 
				</span>

				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li>Home</li><li>Tables</li><li>Data Tables</li>
				</ol>
				<!-- end breadcrumb -->

				<!-- You can also add more buttons to the
				ribbon for further usability

				Example below:

				<span class="ribbon-button-alignment pull-right">
				<span id="search" class="btn btn-ribbon hidden-xs" data-title="search"><i class="fa-grid"></i> Change Grid</span>
				<span id="add" class="btn btn-ribbon hidden-xs" data-title="add"><i class="fa-plus"></i> Add</span>
				<span id="search" class="btn btn-ribbon" data-title="search"><i class="fa-search"></i> <span class="hidden-mobile">Search</span></span>
				</span> -->

			</div>
			<!-- END RIBBON -->

			<!-- MAIN CONTENT -->
			<div id="content">

				<div class="row">
					<div class="col-xs-12 col-sm-7 col-md-7 col-lg-4">
						<h1 class="page-title txt-color-blueDark">
							<i class="fa fa-table fa-fw "></i> 
								Table 
							<span>> 
								Data Tables
							</span>
						</h1>
					</div>
					<div class="col-xs-12 col-sm-5 col-md-5 col-lg-8">
						<ul id="sparks" class="">
							<li class="sparks-info">
								<h5> My Income <span class="txt-color-blue">$47,171</span></h5>
								<div class="sparkline txt-color-blue hidden-mobile hidden-md hidden-sm">
									1300, 1877, 2500, 2577, 2000, 2100, 3000, 2700, 3631, 2471, 2700, 3631, 2471
								</div>
							</li>
							<li class="sparks-info">
								<h5> Site Traffic <span class="txt-color-purple"><i class="fa fa-arrow-circle-up" data-rel="bootstrap-tooltip" title="Increased"></i>&nbsp;45%</span></h5>
								<div class="sparkline txt-color-purple hidden-mobile hidden-md hidden-sm">
									110,150,300,130,400,240,220,310,220,300, 270, 210
								</div>
							</li>
							<li class="sparks-info">
								<h5> Site Orders <span class="txt-color-greenDark"><i class="fa fa-shopping-cart"></i>&nbsp;2447</span></h5>
								<div class="sparkline txt-color-greenDark hidden-mobile hidden-md hidden-sm">
									110,150,300,130,400,240,220,310,220,300, 270, 210
								</div>
							</li>
						</ul>
					</div>
				</div>
				
				
				<!-- widget grid -->
				<section id="widget-grid" class="">
				
				
				
					<!-- row -->
					<div class="row">
				
						<!-- NEW WIDGET START -->
						<article class="col-sm-12 col-md-10 col-lg-8">
				
							<!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false">
								<!-- widget options:
								usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">
				
								data-widget-colorbutton="false"
								data-widget-editbutton="false"
								data-widget-togglebutton="false"
								data-widget-deletebutton="false"
								data-widget-fullscreenbutton="false"
								data-widget-custombutton="false"
								data-widget-collapsed="true"
								data-widget-sortable="false"
				
								-->
								<header>
									<span class="widget-icon"> <i class="fa fa-eye"></i> </span>
									<h2>Default Elements</h2>
				
								</header>
				
								<!-- widget div-->
								<div>
				
									<!-- widget edit box -->
									<div class="jarviswidget-editbox">
										<!-- This area used as dropdown edit box -->
				
									</div>
									<!-- end widget edit box -->
				
									<!-- widget content -->
									<div class="widget-body">
				
										<form:form method="POST" modelAttribute="teacher" class="form-horizontal">
											<form:input type="hidden" path="id" id="id"/>
											<fieldset>
												<legend>Add Teacher Form</legend>
												<div class="form-group">
													<label class="col-md-2 control-label">Name</label>
													<div class="col-md-10">
														<form:input type="text" path="name" id="name" class="form-control"/>
														<div class="has-error">
															<form:errors path="name" class="help-inline"/>
														</div>
													</div>
												</div>
											
												
												<div class="form-group">
													<label class="col-md-2 control-label">Email</label>
													<div class="col-md-10">
															<form:input type="text" path="email" id="email" class="form-control " />
															<div class="has-error">
																<form:errors path="email" class="help-inline"/>
															</div>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-2 control-label">Gender</label>
													<div class="col-md-10">
													<!-- itemValue="id" itemLabel="type" attributes are unnecessary if we use map -->
															<form:select path="gender" items="${genderList}" multiple="false"  class="form-control" />
															<div class="has-error">
																<form:errors path="gender" class="help-inline"/>
															</div>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-2 control-label">Religion</label>
													<div class="col-md-10">
															<form:input type="text" path="religion" id="religion" class="form-control " />
															<div class="has-error">
																<form:errors path="religion" class="help-inline"/>
															</div>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-2 control-label">Phone</label>
													<div class="col-md-10">
															<form:input type="text" path="phone" id="phone" class="form-control " />
															<div class="has-error">
																<form:errors path="email" class="help-inline"/>
															</div>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-2 control-label">Address</label>
													<div class="col-md-10">
															<form:input type="text" path="address" id="address" class="form-control " />
															<div class="has-error">
																<form:errors path="address" class="help-inline"/>
															</div>
													</div>
												</div>
												<div class="form-group">
													<label class="col-md-2 control-label" for="date">DOB</label>
													<div class="col-md-10">
															<form:input name="dob" path="dob" id="dob" class="form-control" placeholder="MM/DD/YYY" type="text"/>
															<div class="has-error">
																<form:errors path="dob" class="help-inline"/>
															</div>
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-md-2 control-label">JOD</label>
													<div class="col-md-10">
															<form:input type="text" placeholder="MM/DD/YYY"  path="jod" id="jod" class="form-control " />
															<div class="has-error">
																<form:errors path="jod" class="help-inline"/>
															</div>
													</div>
												</div>
												<!--<div class="form-group">
													<label class="col-md-2 control-label">Auto Complete</label>
													<div class="col-md-10">
														<input class="form-control" placeholder="Type somethine..." type="text"  list="list">
														<datalist id="list">
															<option value="Alexandra">Alexandra</option>
															<option value="Alice">Alice</option>
															<option value="Anastasia">Anastasia</option>
															<option value="Avelina">Avelina</option>
															<option value="Basilia">Basilia</option>
															<option value="Beatrice">Beatrice</option>
															<option value="Cassandra">Cassandra</option>
															<option value="Cecil">Cecil</option>
															<option value="Clemencia">Clemencia</option>
															<option value="Desiderata">Desiderata</option>
															<option value="Dionisia">Dionisia</option>
															<option value="Edith">Edith</option>
															<option value="Eleanora">Eleanora</option>
															<option value="Elizabeth">Elizabeth</option>
															<option value="Emma">Emma</option>
															<option value="Felicia">Felicia</option>
															<option value="Florence">Florence</option>
															<option value="Galiana">Galiana</option>
															<option value="Grecia">Grecia</option>
															<option value="Helen">Helen</option>
															<option value="Helewisa">Helewisa</option>
															<option value="Idonea">Idonea</option>
															<option value="Isabel">Isabel</option>
															<option value="Joan">Joan</option>
															<option value="Juliana">Juliana</option>
															<option value="Karla">Karla</option>
															<option value="Karyn">Karyn</option>
															<option value="Kate">Kate</option>
															<option value="Lakisha">Lakisha</option>
															<option value="Lana">Lana</option>
															<option value="Laura">Laura</option>
															<option value="Leona">Leona</option>
															<option value="Mandy">Mandy</option>
															<option value="Margaret">Margaret</option>
															<option value="Maria">Maria</option>
															<option value="Nanacy">Nanacy</option>
															<option value="Nicole">Nicole</option>
															<option value="Olga">Olga</option>
															<option value="Pamela">Pamela</option>
															<option value="Patricia">Patricia</option>
															<option value="Qiana">Qiana</option>
															<option value="Rachel">Rachel</option>
															<option value="Ramona">Ramona</option>
															<option value="Samantha">Samantha</option>
															<option value="Sandra">Sandra</option>
															<option value="Tanya">Tanya</option>
															<option value="Teresa">Teresa</option>
															<option value="Ursula">Ursula</option>
															<option value="Valerie">Valerie</option>
															<option value="Veronica">Veronica</option>
															<option value="Wilma">Wilma</option>
															<option value="Yasmin">Yasmin</option>
															<option value="Zelma">Zelma</option>
														</datalist>
														<p class="note"><strong>Note:</strong> works in Chrome, Firefox, Opera and IE10.</p>
													</div>
													
												</div>
					
												 <div class="form-group">
													<label class="col-md-2 control-label">Password field</label>
													<div class="col-md-10">
														<input class="form-control" placeholder="Password field" type="password" value="mypassword">
													</div>
												</div>
												
												<div class="form-group">
													<label class="col-md-2 control-label">Textarea</label>
													<div class="col-md-10">
														<textarea class="form-control" placeholder="Textarea" rows="4"></textarea>
													</div>
												</div>
											 -->
											
											</fieldset>
											
											
											
											<div class="form-actions">
												<div class="row">
													<div class="col-md-12">
														<!-- <button class="btn btn-default" type="submit">
															Cancel
														</button>
														<button class="btn btn-primary" type="submit">
															<i class="fa fa-save"></i>
															Submit
														</button> -->
														<c:choose>
														<c:when test="${edit}">
															<input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
														</c:when>
														<c:otherwise>
															<input type="submit" value="Submit" class="btn btn-primary btn-sm"/> or <a href="<c:url value='/list' />">Cancel</a>
														</c:otherwise>
													</c:choose>
													</div>
												</div>
											</div>
				
										</form:form>
				
									</div>
									<!-- end widget content -->
				
								</div>
								<!-- end widget div -->
				
							</div>
							<!-- end widget -->
				
							<!-- Widget ID (each widget will need unique ID)-->
							
				
							<!-- Widget ID (each widget will need unique ID)-->
							
				
						</article>
						<!-- WIDGET END -->
				
						<!-- NEW WIDGET START -->
						
						<!-- WIDGET END -->
				
					</div>
				
					<!-- end row -->
				
					<!-- row -->
					
					<!-- end row -->
				
					<!-- row -->
					
					<!-- end row -->		
				
				
				</section>
				<!-- end widget grid -->

			</div>
			<!-- END MAIN CONTENT -->

		</div>
		<!-- END MAIN PANEL -->

		<!-- PAGE FOOTER -->
		<div class="page-footer">
		<%@include file="../pagetemplate/footerJSP.jsp" %>
		</div>
		<!-- END PAGE FOOTER -->

		<!-- SHORTCUT AREA : With large tiles (activated via clicking user name tag)
		Note: These tiles are completely responsive,
		you can add as many as you like
		-->
		<div id="shortcut">
			<ul>
				<li>
					<a href="inbox.html" class="jarvismetro-tile big-cubes bg-color-blue"> <span class="iconbox"> <i class="fa fa-envelope fa-4x"></i> <span>Mail <span class="label pull-right bg-color-darken">14</span></span> </span> </a>
				</li>
				<li>
					<a href="calendar.html" class="jarvismetro-tile big-cubes bg-color-orangeDark"> <span class="iconbox"> <i class="fa fa-calendar fa-4x"></i> <span>Calendar</span> </span> </a>
				</li>
				<li>
					<a href="gmap-xml.html" class="jarvismetro-tile big-cubes bg-color-purple"> <span class="iconbox"> <i class="fa fa-map-marker fa-4x"></i> <span>Maps</span> </span> </a>
				</li>
				<li>
					<a href="invoice.html" class="jarvismetro-tile big-cubes bg-color-blueDark"> <span class="iconbox"> <i class="fa fa-book fa-4x"></i> <span>Invoice <span class="label pull-right bg-color-darken">99</span></span> </span> </a>
				</li>
				<li>
					<a href="gallery.html" class="jarvismetro-tile big-cubes bg-color-greenLight"> <span class="iconbox"> <i class="fa fa-picture-o fa-4x"></i> <span>Gallery </span> </span> </a>
				</li>
				<li>
					<a href="profile.html" class="jarvismetro-tile big-cubes selected bg-color-pinkDark"> <span class="iconbox"> <i class="fa fa-user fa-4x"></i> <span>My Profile </span> </span> </a>
				</li>
			</ul>
		</div>
		<!-- END SHORTCUT AREA -->

		<!--================================================== -->

		<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
		<script data-pace-options='{ "restartOnRequestAfter": true }' src="js/plugin/pace/pace.min.js"></script>

		<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
		<script src="<c:url value='/static/js/jquery.min.js' />" ></script>
		<script>
			if (!window.jQuery) {
				document.write('<script src="js/libs/jquery-2.1.1.min.js"><\/script>');
			}
		</script>

		<!-- <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js></script> -->
		<script   src="<c:url value='/static/js/jquery-ui.min.js' />"   integrity="sha256-lnH4vnCtlKU2LmD0ZW1dU7ohTTKrcKP50WA9fa350cE="   crossorigin="anonymous"></script>
		<script>
			if (!window.jQuery.ui) {
				document.write('<script src="js/libs/jquery-ui-1.10.3.min.js"><\/script>');
			}
		</script>

		<!-- IMPORTANT: APP CONFIG -->
		<script src="<c:url value='/static/js/app.config.js' />"></script>

		<!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->
		<script src="<c:url value='/static/js/plugin/jquery-touch/jquery.ui.touch-punch.min.js' />"></script> 

		<!-- BOOTSTRAP JS -->
		<script src="<c:url value='/static/js/bootstrap/bootstrap.min.js' />"></script>

		<!-- CUSTOM NOTIFICATION -->
		<script src="<c:url value='/static/js/notification/SmartNotification.min.js' />"></script>

		<!-- JARVIS WIDGETS -->
		<script src="<c:url value='/static/js/smartwidgets/jarvis.widget.min.js' />" ></script>

		<!-- EASY PIE CHARTS -->
		<script src="<c:url value='/static/js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js' />" ></script>

		<!-- SPARKLINES -->
		<script src="<c:url value='/static/js/plugin/sparkline/jquery.sparkline.min.js' />" ></script>

		<!-- JQUERY VALIDATE -->
		<script src="<c:url value='/static/js/plugin/jquery-validate/jquery.validate.min.js' />" ></script>

		<!-- JQUERY MASKED INPUT -->
		<script src="<c:url value='/static/js/plugin/masked-input/jquery.maskedinput.min.js' />" ></script>

		<!-- JQUERY SELECT2 INPUT -->
		<script src="<c:url value='/static/js/plugin/select2/select2.min.js' />" ></script>

		<!-- JQUERY UI + Bootstrap Slider -->
		<script src="<c:url value='/static/js/plugin/bootstrap-slider/bootstrap-slider.min.js' />" ></script>

		<!-- browser msie issue fix -->
		<script src="<c:url value='/static/js/plugin/msie-fix/jquery.mb.browser.min.js' />" ></script>

		<!-- FastClick: For mobile devices -->
		<script src="<c:url value='/static/js/plugin/fastclick/fastclick.min.js' />" ></script>

		<!--[if IE 8]>

		<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

		<![endif]-->

		<!-- Demo purpose only -->
		<script src="<c:url value='/static/js/demo.min.js' />" ></script>

		<!-- MAIN APP JS FILE -->
		<script src="<c:url value='/static/js/app.min.js' />" ></script>

		<!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->
		<!-- Voice command : plugin -->
		<script src="<c:url value='/static/js/speech/voicecommand.min.js' />" ></script>

		<!-- SmartChat UI : plugin -->
		<script src="<c:url value='/static/js/smart-chat-ui/smart.chat.ui.min.js' />" ></script>
		<script src="<c:url value='/static/js/smart-chat-ui/smart.chat.manager.min.js' />" ></script>

		<!-- PAGE RELATED PLUGIN(S)
		<script src="..."></script> -->
		
		<script src="<c:url value='static/js/plugin/bootstrap-tags/bootstrap-tagsinput.min.js' />" ></script>
		<script type="text/javascript" src="<c:url value='static/js/bootstrap-datepicker.min.js' />" ></script>
		
		
		<script type="text/javascript">
		
		// DO NOT REMOVE : GLOBAL FUNCTIONS!
		
		$(document).ready(function() {
			
			pageSetUp();

			// PAGE RELATED SCRIPTS
		
			// class switcher for radio and checkbox
			$('input[name="demo-switcher-1"]').change( function() {
				  //alert($(this).val())
				  $this = $(this);
				  
				  myNewClass = $this.attr('id');
				  
				  $('.demo-switcher-1 input[type="checkbox"]').removeClass();
				  $('.demo-switcher-1 input[type="checkbox"]').addClass("checkbox "+ myNewClass);
				  
				  $('.demo-switcher-1 input[type="radio"]').removeClass();
				  $('.demo-switcher-1 input[type="radio"]').addClass("radiobox "+ myNewClass);
			  
			})
			
			var date_input=$('input[name="dob"]'); //our date input has the name "date"
	        var container=$('.widget-body form').length>0 ? $('.widget-body form').parent() : "body";
           	date_input.datepicker({
            		format: 'mm/dd/yyyy',
            		container: container,
            		todayHighlight: true,
           	 		autoclose: true,
        	})
        	var date_input=$('input[name="jod"]'); //our date input has the name "date"
	        var container=$('.widget-body form').length>0 ? $('.widget-body form').parent() : "body";
           	date_input.datepicker({
            		format: 'mm/dd/yyyy',
            		container: container,
            		todayHighlight: true,
           	 		autoclose: true,
        	})
		
		})

		</script>

		<!-- Your GOOGLE ANALYTICS CODE Below -->
		<script type="text/javascript">
			var _gaq = _gaq || [];
				_gaq.push(['_setAccount', 'UA-XXXXXXXX-X']);
				_gaq.push(['_trackPageview']);
			
			(function() {
				var ga = document.createElement('script');
				ga.type = 'text/javascript';
				ga.async = true;
				ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
				var s = document.getElementsByTagName('script')[0];
				s.parentNode.insertBefore(ga, s);
			})();

		</script>

	</body>

</html>
<html>

