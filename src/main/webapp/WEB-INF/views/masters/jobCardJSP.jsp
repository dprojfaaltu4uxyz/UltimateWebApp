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
                                Job Details
                            </header>

                            <div class="panel-body">

                                 <form:form method="POST" modelAttribute="jobcard" cssClass="form-horizontal" id="default">
                                    <!-- Select Basic -->
                                    <div class="form-group">
                                        <label class="col-md-1 " for="activityName">Activity Name (*)</label>
                                        <div class="col-md-3">
                                            <form:input id="activityName" name="activityName" type="text" placeholder="Activity Name" class="form-control input-md" path="mode"/>
                                            <div class="has-error">
												<form:errors path="activityName" class="help-inline"/>
											</div>
                                        </div>
                                        <label class="col-md-1 " for="bookingId">Booking Id (*)</label>
                                        <div class="col-md-3">
                                           <form:input class="form-control" id="bookingId" name="bookingId" type="text" path="bookingId" />
                                           <div class="has-error">
												<form:errors path="bookingId" class="help-inline"/>
											</div>
                                        </div>
                                        <label class="col-md-1 " for="jobNo">Job No (*)</label>
                                        <div class="col-md-3">
                                            <form:input id="jobNo" name="jobNo" type="text" placeholder="Job No" class="form-control input-md" path="jobNo"/>
                                             <div class="has-error">
												<form:errors path="jobNo" class="help-inline"/>
											</div>
                                        </div>
                                        
                                    </div>


                                    <!-- Text input-->
                                    <div class="form-group">
                                        <label class="col-md-1 " for="expectedShipmentDate">Expected Shipment Date</label>
                                        <div class="col-md-3">
                                            <div data-date-viewmode="years" data-date-format="dd-mm-yyyy" data-date=""  class="input-append date dpYears expectedShipmentDate">
		                                          <form:input class="form-control" id="expectedShipmentDate" name="expectedShipmentDate" type="text" path="expectedShipmentDate" readonly="" />
			                                              <span class="input-group-btn add-on">
			                                                <button class="btn btn-danger" type="button"><i class="fa fa-calendar"></i></button>
			                                              </span>
			                                      </div>
			                                      <span class="help-block">Select Expected Shipment Date</span>
			                                      
			                                  <div class="has-error">
														<form:errors path="expectedShipmentDate" class="help-inline"/>
													</div>
                                        </div>

                                     
                                        <label class="col-md-1" style="padding-left:20px" for="category">Category (*)</label>
                                        <div class="col-md-7">
                                            <form:input id="category" name="category" type="text" placeholder="Category" class="form-control input-md" path="category"/>
                                        </div>

                                    </div>
 									<form:input class="form-control" id="message" name="message" type="hidden" path="message" />
                                    <!-- Textarea -->
                                    <div class="form-group">
                                        <label class="col-md-1" for="bookingDate">Booking Date</label>
                                        <div class="col-md-3">
                                            <div data-date-viewmode="years" data-date-format="dd-mm-yyyy" data-date=""  class="input-append date dpYears bookingDate">
		                                          <form:input class="form-control" id="bookingDate" size="16" name="bookingDate" type="text" path="bookingDate" readonly="" />
			                                              <span class="input-group-btn add-on">
			                                                <button class="btn btn-danger" type="button"><i class="fa fa-calendar"></i></button>
			                                              </span>
			                                      </div>
			                                      <span class="help-block">Select date</span>
			                                      
			                                  <div class="has-error">
														<form:errors path="bookingDate" class="help-inline"/>
													</div>
                                        </div>
                                        <label class="col-md-1" style="padding-left:20px" for="portmasterByPortLoadingId">Port of Loading (*)</label>
                                        <div class="col-md-3">
                                            <form:select path="portmasterByPortLoadingId"  id ="portmasterByPortLoadingId"
																multiple="false"  class="form-control select2" >
															<option value="">Select Port of Loading</option>			
															<form:options items="${portLoadingList}" itemValue="portId" itemLabel="portName"/>	
													</form:select>
											<form:input class="form-control" id="selectedPortLoadingId" name="selectedPortLoadingId" type="hidden" path="selectedPortLoadingId" />			
											<div class="has-error">
																<form:errors path="portmasterByPortLoadingId" class="help-inline" />
															</div>		
                                        </div>
                                        <label class="col-md-1 " for="portmasterByPortDischargeId">Port of Discharge (*)</label>
                                        <div class="col-md-3">
                                           <form:select path="portmasterByPortDischargeId"  id ="portmasterByPortDischargeId"
																multiple="false"  class="form-control select2" >
															<option value="">Select Port of Discharge</option>			
															<form:options items="${portDischargeList}" itemValue="portId" itemLabel="portName"/>	
													</form:select>
										<form:input class="form-control" id="selectedPortDischargeId" name="selectedPortDischargeId" type="hidden" path="selectedPortDischargeId" />			
											<div class="has-error">
																<form:errors path="portmasterByPortDischargeId" class="help-inline" />
															</div>		
                                        </div>
                                        
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="portOfOriginId">Port of Origin</label>
                                        <div class="col-md-3">
                                            <form:select path="portOfOriginId"  id ="portOfOriginId"
																multiple="false"  class="form-control select2" >
															<option value="">Select Port of Origin</option>			
															<form:options items="${portOriginList}" itemValue="portId" itemLabel="portName"/>	
													</form:select>
										<form:input class="form-control" id="selectedPortOriginId" name="selectedPortOriginId" type="hidden" path="selectedPortOriginId" />			
											<div class="has-error">
																<form:errors path="portOfOriginId" class="help-inline" />
															</div>		
                                        </div>
                                        <label class="col-md-1 " for="customer">Customer</label>
                                        <div class="col-md-3">
                                            <form:select path="customer"  id ="customer"
																multiple="false"  class="form-control select2" >
															<option value="">Select Customer</option>			
															<form:options items="${customerList}" itemValue="customerId" itemLabel="customerName"/>	
													</form:select>
										<form:input class="form-control" id="selectedCustomerId" name="selectedCustomerId" type="hidden" path="selectedCustomerId" />			
											<div class="has-error">
																<form:errors path="customer" class="help-inline" />
															</div>		
                                        </div>
                                        <label class="col-md-1 " for="consignee">Consignee</label>
                                        <div class="col-md-3">
                                            <form:select path="consignee"  id ="consignee"
																multiple="false"  class="form-control select2" >
															<option value="">Select Consignee</option>			
															<form:options items="${consigneeList}" itemValue="consigneeId" itemLabel="name"/>	
													</form:select>
										<form:input class="form-control" id="selectedConsigneeId" name="selectedConsigneeId" type="hidden" path="selectedConsigneeId" />			
											<div class="has-error">
																<form:errors path="consignee" class="help-inline" />
															</div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="currency">Currency</label>
                                        <div class="col-md-3">
                                           <form:select path="currency"  id ="currency"
																multiple="false"  class="form-control currency">
															<option value="">Select Currency</option>			
															
													</form:select>
										<form:input class="form-control" id="selectedCurrencyId" name="selectedCurrencyId" type="hidden" path="selectedCurrencyId" />			
											<div class="has-error">
																<form:errors path="currency" class="help-inline" />
															</div>	
                                        </div>
                                        <label class="col-md-1 " for="containerType">ContainerType</label>
                                        <div class="col-md-3">
                                            <form:select path="containerType"  id ="containerType"
																multiple="false"  class="form-control select2" >
															<option value="">Select ContainerType</option>			
															<form:options items="${containerTypeList}" itemValue="containerTypeId" itemLabel="containerTypeName"/>	
													</form:select>
										<form:input class="form-control" id="selectedContainerTypeId" name="selectedContainerTypeId" type="hidden" path="selectedContainerTypeId" />			
											<div class="has-error">
																<form:errors path="containerType" class="help-inline" />
															</div>	
                                        </div>
                                        <label class="col-md-1 " for="cargoType">CargoType</label>
                                        <div class="col-md-3">
                                            <form:select path="cargoType"  id ="cargoType"
																multiple="false"  class="form-control select2" >
															<option value="">Select CargoType</option>			
															<form:options items="${cargoTypeList}" itemValue="cargoTypeId" itemLabel="cargoTypeName"/>	
													</form:select>
										<form:input class="form-control" id="selectedCargoTypeId" name="selectedCargoTypeId" type="hidden" path="selectedCargoTypeId" />			
									 </div>
											<div class="has-error">
																<form:errors path="cargoType" class="help-inline" />
															</div>	
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="salesPerson">Sales Person</label>
                                        <div class="col-md-3">
                                            <form:input class="form-control" id="salesPerson" name="salesPerson" type="text" path="salesPerson" data-provide="typeahead" autocomplete="off" />
                                            <div class="has-error">
												<form:errors path="salesPerson" class="help-inline"/>
											</div>
                                        </div>
                                        <label class="col-md-1 " for="broker">Broker</label>
                                        <div class="col-md-3">
                                            <form:input class="form-control" id="shipper" name="shipper" type="text" path="shipper"  />
                                            <div class="has-error">
												<form:errors path="broker" class="help-inline"/>
											</div>
                                        </div>
                                        <label class="col-md-1 " for="shipper">Shipper</label>
                                        <div class="col-md-3">
                                            <form:input class="form-control" id="shipper" name="shipper" type="text" path="shipper"  />
                                            <div class="has-error">
												<form:errors path="broker" class="help-inline"/>
											</div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="shippingLineBookingNo">Shipping Line Booking No</label>
                                        <div class="col-md-3">
                                            <form:input class="form-control" id="shippingLineBookingNo" name="shippingLineBookingNo" type="text" path="shippingLineBookingNo"  />
                                             <div class="has-error">
												<form:errors path="shippingLineBookingNo" class="help-inline"/>
											</div>
                                        </div>
                                        <label class="col-md-1 " for="freightTerms">Freight Terms</label>
                                        <div class="col-md-7">
                                            <form:input class="form-control" id="freightTerms" name="freightTerms" type="textarea" path="freightTerms" />
                                            <div class="has-error">
												<form:errors path="freightTerms" class="help-inline"/>
											</div>
                                        </div>
                                       
                                    </div>
                                    <div class="form-group">
                                         <label class="col-md-1 " for="finalPlaceOfDelivery">Final Place Of Delivery</label>
                                        <div class="col-md-3">
                                             <form:input  class="form-control" id="finalPlaceOfDelivery" name="finalPlaceOfDelivery" type="text" path="finalPlaceOfDelivery" />
                                              <div class="has-error">
												<form:errors path="finalPlaceOfDelivery" class="help-inline"/>
											</div>
                                        </div>
                                    </div>
                                    <div class="stepy-tab">
                                        <ul id="default-titles" class="stepy-titles clearfix">
                                            <li id="default-title-0" class="current-step">
                                                <div>Step 1</div>
                                            </li>
                                            <li id="default-title-1" class="">
                                                <div>Step 2</div>
                                            </li>
                                            
                                        </ul>
                                    </div>

                                    <fieldset title="Consignee Details" class="step" id="default-step-2">
                                        <legend> </legend>





                                        <!-- Select Basic -->
                                        <div class="form-group">
                                            <label class="col-md-1 " for="consignee">Consignee (*)</label>
                                            <div class="col-md-3">
                                                <form:input id="consignee" name="consignee" type="text" placeholder="Consignee" class="form-control input-md" path="consignee"/>
                                            </div>
                                            <label class="col-md-1 " for="consigneeAddress">Address (*)</label>
                                            <div class="col-md-7">
                                                <form:input id="consigneeAddress" name="consigneeAddress" type="text" placeholder="Address" class="form-control input-md" path="consigneeAddress"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-1 " for="country">Country (*)</label>
                                            <div class="col-md-7">
                                                <form:input id="country" name="country" type="text" placeholder="Country" class="form-control input-md" path="country"/>
                                            </div>
                                            <label class="col-md-1 label_check" for="consigneeBuyerSame">(*) Is Consignee & Buyer Same?</label>
                                            <div class="col-md-3">
                                                <div class="checkboxes">
                                                    <form:checkbox name="consigneeBuyerSame" id="consigneeBuyerSame" value="1"  path="consigneeBuyerSame"/> Is Consignee & Buyer Same?
                                                </div>
                                            </div>
                                        </div>


                                        <!-- Select Basic -->
                                        <div class="form-group">
                                            <label class="col-md-1 " for="buyer">Buyer (*)</label>
                                            <div class="col-md-3">
                                                <form:input id="buyer" name="buyer" type="text" placeholder="Buyer" class="form-control input-md" path="buyer"/>
                                            </div>
                                            <label class="col-md-1 " for="buyerAddress">Address (*)</label>
                                            <div class="col-md-7">
                                                <form:input id="buyerAddress" name="buyerAddress" type="text" placeholder="Address" class="form-control input-md" path="buyerAddress"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-1 " for="country">Country (*)</label>
                                            <div class="col-md-7">
                                                <form:input id="country" name="country" type="text" placeholder="Country" class="form-control input-md" path="country"/>
                                            </div>
                                            <label class="col-md-1 label_check" for="pmvRequired">(*) Shall itemwise PMV required?</label>
                                            <div class="col-md-3">
                                                <div class="checkboxes">
                                                    <form:checkbox name="pmvRequired" id="pmvRequired" value="1" path="pmvRequired"/>                                                    Shall itemwise PMV required?
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-1 " for="productHead">Product Head</label>
                                            <div class="col-md-7">
                                                <form:input id="productHead" name="productHead" type="text" placeholder="Product Head" class="form-control input-md" path="productHead"/>
                                            </div>

                                        </div>
                                        <!-- Textarea -->


                                        <!-- Button (Double)
                                <div class="form-group">
                                <label class="col-md-3 " for="button1id"></label>
                                <div class="col-md-8">
                                    <button id="button1id" name="button1id" class="btn btn-success">Ok</button>
                                    <button id="button2id" name="button2id" class="btn btn-danger">Cancel</button>
                                </div>
                                </div> -->


                                    </fieldset>
                                    <fieldset title="Party Details" class="step" id="default-step-1">
                                        <legend> </legend>

                                        <div class="form-group">
                                            <label class="col-md-1 " for="accountPartyName">Account/Party Name (*)</label>
                                            <div class="col-md-3">
                                                <form:input id="accountPartyName" name="accountPartyName" type="text" placeholder="Account/Party Name" class="form-control input-md" path="accountPartyName"/>
                                            </div>
                                            <label class="col-md-1 " for="service">Service </label>
                                            <div class="col-md-3">
                                                <form:input id="service" name="service" type="text" placeholder="Service" class="form-control input-md" path="service"/>
                                            </div>
                                            <label class="col-md-1 " for="organization">Organization (*)</label>
                                            <div class="col-md-3">
                                                <form:input id="organization" name="organization" type="text" placeholder="Organization" class="form-control input-md" path="organization"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-1 " for="partyAddress">Address (*)</label>
                                            <div class="col-md-7">
                                                <form:input id="partyAddress" name="partyAddress" type="text" placeholder="Address" class="form-control input-md" path="partyAddress"/>
                                            </div>
                                            <label class="col-md-1 " for="grBank">GR Bank </label>
                                            <div class="col-md-3">
                                                <form:input id="grBank" name="grBank" type="text" placeholder="GR Bank" class="form-control input-md" path="grBank"/>
                                            </div>
                                        </div>

                                        <!-- Select Basic -->
                                        <div class="form-group">
                                            <label class="col-md-1" for="stateOfOriginOfGoods">State of Origin of Goods</label>
                                            <div class="col-md-7">
                                                <form:input id="stateOfOriginOfGoods" name="stateOfOriginOfGoods" type="text" placeholder="State of Origin of Goods" class="form-control input-md" path="stateOfOriginOfGoods"/>
                                            </div>
                                            <label class="col-md-1 " for="branchNo">Branch No</label>
                                            <div class="col-md-1">
                                                <form:input id="branchNo" name="branchNo" type="text" placeholder="Branch No" class="form-control input-md" path="branchNo"/>
                                            </div>
                                            <label class="col-md-1 " for="itemCode">Item code as per Reward Directory (MEIS)</label>
                                            <div class="col-md-1">
                                                <form:input id="itemCode" name="itemCode" type="text" placeholder="Item Code" class="form-control input-md" path="itemCode"/>
                                            </div>
                                        </div>


                                        <!-- Text input-->
                                        <div class="form-group">
                                            <label class="col-md-1 " for="iecCodeNo">IEC Code No</label>
                                            <div class="col-md-3">
                                                <form:input id="iecCodeNo" name="iecCodeNo" type="text" placeholder="IEC Code No" class="form-control input-md" path=""/>
                                            </div>
                                            <label class="col-md-1 " for="panNo">PAN No</label>
                                            <div class="col-md-3">
                                                <form:input id="panNo" name="panNo" type="text" placeholder="PAN No" class="form-control input-md" path="panNo"/>
                                            </div>
                                            <label class="col-md-1 " for="category">Category</label>
                                            <div class="col-md-3">
                                                <form:input id="category" name="category" type="text" placeholder="Category" class="form-control input-md" path="category"/>
                                            </div>

                                        

                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-1 " for="exporterClass">Exporter Class</label>
                                            <div class="col-md-3">
                                                <form:input id="exporterClass" name="exporterClass" type="text" placeholder="Exporter Class" class="form-control input-md" path="exporterClass"/>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-md-1 " for="natureOfPayment">Nature Of Payment</label>
                                            <div class="col-md-3">
                                                <form:input id="natureOfPayment" name="natureOfPayment" type="text" placeholder="Nature Of Payment" class="form-control input-md" path="natureOfPayment"/>
                                            </div>
                                            <label class="col-md-1 " for="bankName">Bank Name</label>
                                            <div class="col-md-3">
                                                <form:input id="bankName" name="bankName" type="text" placeholder="Bank Name" class="form-control input-md" path="bankName"/>
                                            </div>
                                            <label class="col-md-1 " for="periodPfPaymentInDays">Period Of Payment In Days</label>
                                            <div class="col-md-3">
                                                <form:input id="periodPfPaymentInDays" name="periodPfPaymentInDays" type="text" placeholder="Period Of Payment In Days" class="form-control input-md" path="periodPfPaymentInDays"/>
                                            </div>

                                        </div>
                                        <div class="form-group">

                                            <label class="col-md-1 " for="exportContactNo">Export Contact No.</label>
                                            <div class="col-md-3">
                                                <form:input id="exportContactNo" name="exportContactNo" type="text" placeholder="Export Contact No" class="form-control input-md" path="exportContactNo"/>
                                            </div>

                                            <label class="col-md-1 " for="drawbackBankAccount">Drawback Bank Account</label>
                                            <div class="col-md-3">
                                                <form:input id="drawbackBankAccount" name="drawbackBankAccount" type="text" placeholder="Drawback Bank Account" class="form-control input-md" path="drawbackBankAccount"/>
                                            </div>

                                        </div>
                                    </fieldset>
                                     <input type="submit" class="finish btn btn-danger" value="Finish" />
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
    <script src="<c:url value='/static/js/respond.min.js' />"></script>

    <script type="text/javascript" src="<c:url value='/static/assets/bootstrap-datepicker/js/bootstrap-datepicker.js' />"></script>

    <!--right slidebar-->
    <script src="<c:url value='/static/js/slidebars.min.js' />"></script>

    <!--script for this page-->
    <script src="<c:url value='/static/js/jquery.stepy.js' />"></script>

    <!--common script for all pages-->
    <script src="<c:url value='/static/js/common-scripts.js' />"></script>
    
    <!--toastr-->
    <script src="<c:url value='/static/assets/toastr-master/toastr.js'/>" ></script>
    
    <!--script for this page-->
    <script src="<c:url value='/static/js/masters/jobcard.js'/>" ></script>
    
    
      <!--select2-->
  <script type="text/javascript" src="<c:url value='/static/assets/select2/js/select2.min.js'/>" ></script>
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