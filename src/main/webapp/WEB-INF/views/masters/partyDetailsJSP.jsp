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
    <meta name="_csrf" content="${_csrf.token}"/>
	<meta name="_csrf_header" content="${_csrf.headerName}"/>
	<link rel="shortcut icon" href="img/favicon.png">

    <title>Party Details</title>

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

	<link rel="stylesheet" type="text/css" href="<c:url value='/static/css/easy-autocomplete.css'/>" />
	
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
                              Party/Account Master
                          </header>
                          
                          <div class="panel-body">
                              <div id="div1" style="display:none"></div>
                              <form:form class="form-horizontal" method="POST" modelAttribute="party" cssClass="cmxform form-horizontal " id="partyDetailsForm">
                                  <!-- Select Basic -->
								<div class="form-group">
								  <label class="col-md-1 " for="accountPartyName">Account/Party Name (*)</label>  
								  <div class="col-md-3">
								  	<form:input id="accountPartyName" name="accountPartyName" type="text" placeholder="Account/Party Name" class="form-control input-md" path="accountPartyName"/>
								  </div>
								  <label class="col-md-1 " for="shortName">Short Name </label>  
								  <div class="col-md-3">
								  	<form:input id="shortName" name="shortName" type="text" placeholder="Short Name" class="form-control input-md" path="shortName"/>
								  </div>
								  <label class="col-md-1 " for="underGroup">Under Group (*)</label>  
								  <div class="col-md-3">
								  	<form:input id="underGroup" name="underGroup" type="text" placeholder="Under Group" class="form-control input-md" path="underGroup"/>
								  </div>
								</div>
								
								
								<!-- Text input-->
								<div class="form-group">
								  <label class="col-md-1 " for="opBalance">Op. Balance</label>  
								  <div class="col-md-3">
								  	<form:input id="opBalance" name="opBalance" type="text" placeholder="Op. Balance" class="form-control input-md" path="opBalance"/>
								  </div>
								
								
								<!-- Multiple Radios (inline) -->
								
								  <label class="col-md-1 " for="radios">Debit / Credit</label>
								  <div class="col-md-3"> 
								    <label class="radio-inline" for="radios-0">
								      <form:radiobutton name="debitCredit" id="debit" value="debit" checked="checked" path="debitCredit"/>
								      Debit
								    </label> 
								    <label class="radio-inline" for="radios-1">
								      <form:radiobutton name="debitCredit" id="credit" value="credit"  path="debitCredit"/>
								      Credit
								    </label> 
								  </div>
								     <label class="col-md-1 label_check" for="strDirectory">STR Directory</label>
								     <div class="col-md-3"> 
								         <div class="checkboxes">
								            <form:checkbox name="strDirectory" id="strDirectory" value="1"  path="strDirectory"/> STR Directory ?
								        </div>
								    </div>
								</div>
								 
								  <!-- Textarea -->
								<div class="form-group">
								  <label class="col-md-1" for="textarea">Bank Cheque Report</label>
								  <div class="col-md-7">                     
								    <form:textarea class="form-control" id="bankChequeReport" name="bankChequeReport" path="bankChequeReport"></form:textarea>
								  </div>
								   <label class="col-md-1 label_check" for="rewardDirectory">Reward Directory (MEIS)</label>
								     <div class="col-md-3"> 
								         <div class="checkboxes">
								            <form:checkbox name="rewardDirectory" id="rewardDirectory" value="1" path="rewardDirectory"/> Reward Directory (MEIS) ?
								        </div>
								    </div>
								</div>
								<div class="form-group">
								  <label class="col-md-1 " for="textinput">Manifest Report Name</label>  
								  <div class="col-md-3">
								  	<form:input id="textinput" name="manifestReportName" type="text" placeholder="Manifest Report Name" class="form-control input-md" path="manifestReportName"/>
								  </div>
								  <label class="col-md-1 label_check" for="deactivate">Deactivate</label>
								     <div class="col-md-3"> 
								         <div class="checkboxes">
								            <form:checkbox name="deactivate" id="deactivate" value="1"  path="deactivate"/> Deactivate From The Previous Year
								        </div>
								    </div>
								  <label class="col-md-1 " for="textinput">Text Input</label>  
								  <div class="col-md-3">
								  	<form:input id="textinput" name="textinput" type="text" placeholder="placeholder" class="form-control input-md" path="textinput"/>
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
                                      <li id="default-title-2" class="">
                                          <div>Step 3</div>
                                      </li>
                                      <li id="default-title-3" class="">
                                          <div>Step 4</div>
                                      </li>
                                      <li id="default-title-4" class="">
                                          <div>Step 5</div>
                                      </li>
                                      <li id="default-title-5" class="">
                                          <div>Step 6</div>
                                      </li>
                                      <li id="default-title-6" class="">
                                          <div>Step 7</div>
                                      </li>
                                  </ul>
                              </div>

                                  <fieldset title="Import/Export Details" class="step" id="default-step-2">
                                      <legend> </legend>
                                      

                                <!-- Select Basic -->
                                <div class="form-group">
                                    <label class="col-md-1 " for="iecCodeNo">IEC Code No</label>  
                                    <div class="col-md-3">
                                        <form:input id="iecCodeNo" name="iecCodeNo" type="text" placeholder="IEC Code No" class="form-control input-md" path="iecCodeNo"/>
                                    </div>
                                    <label class="col-md-1 " for="panNo">PAN No</label>  
                                    <div class="col-md-3">
                                        <form:input id="panNo" name="panNo" type="text" placeholder="PAN No" class="form-control input-md" path="panNo"/>
                                    </div>
                                    <label class="col-md-1 " for="binNo">BIN No</label>  
                                    <div class="col-md-3">
                                        <form:input id="binNo" name="binNo" type="text" placeholder="BIN No" class="form-control input-md" path="binNo"/>
                                    </div>
                                </div>


                                <!-- Text input-->
                                <div class="form-group">
                                    <label class="col-md-1 " for="textinput">Sales Person</label>  
                                    <div class="col-md-3">
                                        <form:input id="salesPerson" name="salesPerson" type="text" placeholder="Sales Person" class="form-control input-md" path="salesPerson"/>
                                    </div>


                                  
                                    <label class="col-md-1 " for="exporterClass">Exporter Class</label>  
                                    <div class="col-md-3">
                                        <form:input id="exporterClass" name="exporterClass" type="text" placeholder="Exporter Class" class="form-control input-md" path="exporterClass"/>
                                    </div>
                                    <label class="col-md-1 " for="exporterHouse">Exporter House</label>  
                                    <div class="col-md-3">
                                        <form:input id="exporterHouse" name="exporterHouse" type="text" placeholder="Exporter House" class="form-control input-md" path="exporterHouse"/>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-1 " for="certificateNo">Certificate No</label>  
                                    <div class="col-md-3">
                                        <form:input id="certificateNo" name="certificateNo" type="text" placeholder="Certificate No" class="form-control input-md" path="certificateNo"/>
                                    </div>
                                    <label class="col-md-1 " for="certificateDate">Certificate Date</label>  
                                    <div class="col-md-3">
                                        <form:input id="textinput" name="certificateDate" type="certificateDate" placeholder="Certificate Date" class="form-control input-md certificateDate" path="certificateDate"/>
                                      <span class="help-block">Select date</span>
                                         
			                         </div>
                                    <label class="col-md-1 " for="textinput">Valid Upto Date</label>  
                                    <div class="col-md-3">
                                         <form:input id="textinput" name="validUptoDate" type="validUptoDate" placeholder="Valid Upto Date" class="form-control input-md validUptoDate" path="validUptoDate"/> 
                                      <span class="help-block">Select date</span>
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label class="col-md-1 " for="ifsCode">IFS Code</label>  
                                    <div class="col-md-3">
                                        <form:input id="ifsCode" name="ifsCode" type="text" placeholder="placeholder" class="form-control input-md" path="ifsCode"/>
                                    </div>
                                    <label class="col-md-1 " for="stExciseReg">ST Excise Regn.</label>  
                                    <div class="col-md-3">
                                        <form:input id="stExciseReg" name="stExciseReg" type="text" placeholder="ST Excise Regn" class="form-control input-md" path="stExciseReg"/>
                                    </div>
                                    <label class="col-md-1 " for="gstNo">GST No</label>  
                                    <div class="col-md-3">
                                        <form:input id="gstNo" name="gstNo" type="text" placeholder="GST No" class="form-control input-md" path="gstNo"/>
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
                                  <fieldset title="Party Address" class="step" id="default-step-1" >
                                      <legend> </legend>
                                       <!-- Select Basic -->
                                <div class="form-group">
                                    <label class="col-md-1 " for="branchSrNo">Branch Sr No</label>  
                                    <div class="col-md-1">
                                        <form:input id="branchSrNo" name="branchSrNo" type="text" placeholder="Branch Sr No" class="form-control input-md" path="branchSrNo"/>
                                    </div>
                                    <label class="col-md-1 " for="totalBranch">Total Branch</label>  
                                    <div class="col-md-1">
                                        <form:input id="totalBranch" name="totalBranch" type="text" placeholder="Total Branch" class="form-control input-md" path="totalBranch"/>
                                    </div>
                                    <label class="col-md-1" for="textarea">Address</label>
                                    <div class="col-md-7">                     
                                        <form:textarea class="form-control" id="address" name="address" path="address"></form:textarea>
                                    </div>
                                 </div>


                                <!-- Text input-->
                                <div class="form-group">
                                    <label class="col-md-1 " for="city">City</label>  
                                    <div class="col-md-3">
                                        <form:input id="city" name="city" type="text" placeholder="City" class="form-control input-md" path="city"/>
                                    </div>
                                    <label class="col-md-1 " for="panNo">State</label>  
                                    <div class="col-md-3">
                                        <form:input id="state" name="state" type="text" placeholder="State" class="form-control input-md" path="state"/>
                                    </div>
                                    <label class="col-md-1 " for="panNo">Pin Code</label>  
                                    <div class="col-md-3">
                                        <form:input id="pinCode" name="pinCode" type="text" placeholder="Pin Code" class="form-control input-md" path="pinCode"/>
                                    </div>
                                    
                                   
                                   
                                </div>
                                <div class="form-group">
                                    <label class="col-md-1 " for="certificateNo">Contact Person</label>  
                                    <div class="col-md-3">
                                        <form:input id="contactPerson" name="contactPerson" type="text" placeholder="Contact Person" class="form-control input-md" path="contactPerson"/>
                                    </div>
                                    <label class="col-md-1 " for="phone">Phone</label>  
                                    <div class="col-md-3">
                                        <form:input id="phone" name="phone" type="text" placeholder="Phone" class="form-control input-md" path="phone"/>
                                    </div>
                                    <label class="col-md-1 " for="mobile">Mobile</label>  
                                    <div class="col-md-3">
                                        <form:input id="mobile" name="mobile" type="text" placeholder="Mobile" class="form-control input-md" path="mobile"/>
                                    </div>
                                </div>
                                
                                <div class="form-group">
                                    <label class="col-md-1 " for="email">Email</label>  
                                    <div class="col-md-3">
                                        <form:input id="email" name="email" type="text" placeholder="Email" class="form-control input-md" path="email"/>
                                    </div>
                                    <label class="col-md-1 " for="commercialTaxRegState">Commercial Tax Regn. State</label>  
                                    <div class="col-md-3">
                                        <form:input id="commercialTaxRegState" name="commercialTaxRegState" type="text" placeholder="Commercial Tax Regn. State" class="form-control input-md" path="commercialTaxRegState"/>
                                    </div>
                                    <label class="col-md-1 " for="gstNo">Commercial Tax Type</label>  
                                    <div class="col-md-3">
                                        <form:input id="commercialTaxType" name="commercialTaxType" type="text" placeholder="Commercial Tax Type" class="form-control input-md" path="commercialTaxType"/>
                                    </div>
                                    
                                </div>
                                 <div class="form-group">
                                    
                                    <label class="col-md-1 " for="commercialTaxRegNo">Commercial Tax Regn. No</label>  
                                    <div class="col-md-3">
                                        <form:input id="commercialTaxRegNo" name="commercialTaxRegNo" type="text" placeholder="Commercial Tax Regn. No" class="form-control input-md" path="commercialTaxRegNo"/>
                                    </div>
                                                                       
                                </div>
                                  </fieldset>
                                  <fieldset title="Party Bill Details" class="step" id="default-step-0">
                                      <legend> </legend>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="iecCode">IEC Code</label>  
                                        <div class="col-md-3">
                                            <form:input id="iecCode" name="iecCode" type="text" placeholder="IEC Code" class="form-control input-md" path="iecCode"/>
                                        </div>
                                        <label class="col-md-1 " for="branchSerialNo">Branch Serial No</label>  
                                        <div class="col-md-3">
                                            <form:input id="branchSerialNo" name="branchSerialNo" type="text" placeholder="Branch Serial No" class="form-control input-md" path="branchSerialNo"/>
                                        </div>
                                        <label class="col-md-1 " for="commissionRate">Commission Rate</label>  
                                        <div class="col-md-3">
                                            <form:input id="commissionRate" name="commissionRate" type="text" placeholder="Commission Rate" class="form-control input-md" path="commissionRate"/>
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-md-1 " for="division">Division</label>  
                                        <div class="col-md-3">
                                            <form:input id="division" name="division" type="text" placeholder="Division" class="form-control input-md" path="division"/>
                                        </div>
                                        <label class="col-md-1 " for="range">Range</label>  
                                        <div class="col-md-3">
                                            <form:input id="range" name="range" type="text" placeholder="Range" class="form-control input-md" path="range"/>
                                        </div>
                                        <label class="col-md-1 " for="name">Name</label>  
                                        <div class="col-md-3">
                                            <form:input id="name" name="name" type="text" placeholder="Name" class="form-control input-md" path="name"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                       <label class="col-md-1" for="textarea">Address</label>
                                        <div class="col-md-7">                     
                                            <form:textarea class="form-control" id="address" name="address" path="address"></form:textarea>
                                        </div>
                                    </div>
                                  </fieldset>
                                  <fieldset title="License Details" class="step" id="default-step-3" >
                                      <legend> </legend>
                                      <div class="form-group">
                                        <label class="col-md-1 " for="deecLicence">DEEC Licence Details</label>  
                                        <div class="col-md-11">
                                            <a href="#myModal" data-toggle="modal" class="btn btn-xs btn-success">
                                               ADD DEEC Licence Details
                                            </a>
                                            
                                        </div>
                                      </div>
                                      <div class="form-group">
                                        <label class="col-md-1" for="phone">EPCG Details</label>  
                                        <div class="col-md-11">
                                            <a href="#myModal-1" data-toggle="modal" class="btn btn-xs btn-warning">
                                               ADD EPCG Details
                                            </a>
                                        </div>
                                      </div>
                                      <div class="form-group">
                                        <label class="col-md-1" for="mobile">DFIA Details</label>  
                                        <div class="col-md-11">
                                           <a href="#myModal-2" data-toggle="modal" class="btn btn-xs btn-danger">
                                               ADD DFIA Details
                                          </a>
                                        </div>
                                      </div>
                                    
                                  </fieldset>
                                  <fieldset title="Drawback Bank Details" class="step" id="default-step-4" >
                                      <legend> </legend>
                                      <div class="form-group">
                                           <label class="col-md-1 " for="adCode">Branch</label>  
                                        <div class="col-md-3">
                                            <form:input id="branch" name="branch" type="text" placeholder="Branch" class="form-control input-md" path="branch"/>
                                        </div>
                                        <label class="col-md-1 " for="drawBankAccountNo">Acount No.</label>  
                                        <div class="col-md-3">
                                            <form:input id="drawBankAccountNo" name="drawBankAccountNo" type="text" placeholder="Account No." class="form-control input-md" path="drawBankAccountNo"/>
                                        </div>
                                        <label class="col-md-1 " for="bankName">Bank Name</label>  
                                        <div class="col-md-3">
                                            <form:input id="bankName" name="bankName" type="text" placeholder="Bank Name" class="form-control input-md" path="bankName"/>
                                        </div>
                                      </div>
                                      <div class="form-group">
                                           <label class="col-md-1 " for="drawBankAddress">Bank Address</label>  
                                        <div class="col-md-7">
                                            <form:textarea class="form-control" id="drawBankAddress" name="drawBankAddress" path="drawBankAddress"></form:textarea>
                                        </div>
                                      </div>
                                  </fieldset>
                                  <fieldset title="GR Bank Detail" class="step" id="default-step-5" >
                                      <legend> </legend>
                                       <div class="form-group">
                                        <label class="col-md-1 " for="accountNo">Acount No.</label>  
                                        <div class="col-md-3">
                                            <form:input id="accountNo" name="accountNo" type="text" placeholder="Account No." class="form-control input-md" path="accountNo"/>
                                        </div>
                                        <label class="col-md-1 " for="grBankAdCode">A D Code</label>  
                                        <div class="col-md-3">
                                            <form:input id="grBankAdCode" name="grBankAdCode" type="text" placeholder="A D Code" class="form-control input-md" path="grBankAdCode"/>
                                        </div>
                                        <label class="col-md-1 " for="grBankName">Bank Name</label>  
                                        <div class="col-md-3">
                                            <form:input id="grBankName" name="grBankName" type="text" placeholder="Bank Name" class="form-control input-md" path="grBankName"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1" for="grBankaddress">Address</label>
                                        <div class="col-md-7">                     
                                            <form:textarea class="form-control" id="grBankaddress" name="grBankaddress" path="grBankaddress"></form:textarea>
                                        </div>
                                        <label class="col-md-1 " for="grBankTotalBranch">Total Branch</label>  
                                        <div class="col-md-3">
                                            <form:input id="grBankTotalBranch" name="grBankTotalBranch" type="text" placeholder="Total Branch" class="form-control input-md" path="grBankTotalBranch"/>
                                        </div>
                                    </div>
                                  </fieldset>
                                   <fieldset title="Third Party Details / *EOU" class="step" id="default-step-6" >
                                      <legend> </legend>
                                       <div class="form-group">
                                        <label class="col-md-1 " for="iecCodeThirdParty">IEC Code</label>  
                                        <div class="col-md-3">
                                            <form:input id="iecCodeThirdParty" name="iecCodeThirdParty" type="text" placeholder="IEC Code" class="form-control input-md" path="iecCodeThirdParty"/>
                                        </div>
                                        <label class="col-md-1 " for="branchSrNoThirdParty">Branch Serial No</label>  
                                        <div class="col-md-3">
                                            <form:input id="branchSrNoThirdParty" name="branchSrNoThirdParty" type="text" placeholder="Branch Serial No" class="form-control input-md" path="branchSrNoThirdParty"/>
                                        </div>
                                        <label class="col-md-1 " for="commissionRateThirdParty">Commission Rate</label>  
                                        <div class="col-md-3">
                                            <form:input id="commissionRateThirdParty" name="commissionRateThirdParty" type="text" placeholder="Commission Rate" class="form-control input-md" path="commissionRateThirdParty"/>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="divisionThirdParty">Division</label>  
                                        <div class="col-md-3">
                                            <form:input id="divisionThirdParty" name="divisionThirdParty" type="text" placeholder="Division" class="form-control input-md" path="divisionThirdParty"/>
                                        </div>
                                        <label class="col-md-1 " for="rangeThirdParty">Range</label>  
                                        <div class="col-md-3">
                                            <form:input id="rangeThirdParty" name="rangeThirdParty" type="text" placeholder="Range" class="form-control input-md" path="rangeThirdParty"/>
                                        </div>
                                        <label class="col-md-1 " for="nameAddress">Name & Address</label>  
                                        <div class="col-md-3">
                                            <form:input id="nameAddress" name="nameAddress" type="text" placeholder="Name & Address" class="form-control input-md" path="nameAddress"/>
                                        </div>
                                    </div>
                                  </fieldset>
                                  <input type="submit" class="finish btn btn-danger" value="Finish"/>
                            
                                              </form:form>

<div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
                                  <div class="modal-dialog">
                                      <div class="modal-content">
                                          <div class="modal-header">
                                              <button aria-hidden="true" data-dismiss="modal" class="close" type="button">×</button>
                                              <h4 class="modal-title">Form Tittle</h4>
                                          </div>
                                          <div class="modal-body">

                                              <form class="form-horizontal" role="form" id="myForm"> 
                                                  <div class="form-group">
                                                      <label for="iec" class="col-lg-2 col-sm-2 control-label">IEC</label>
                                                      <div class="col-lg-4">
                                                          <input type="text" class="form-control" id="iec" placeholder="IEC">
                                                      </div>
                                                      <label for="name" class="col-lg-2 col-sm-2 control-label" >Name</label>
                                                      <div class="col-lg-4">
                                                          <input type="text" class="form-control" id="names" placeholder="IEC">
                                                      </div>
                                                     <!-- <label for="deecLicDate" class="col-lg-2 col-sm-2 control-label">DEEC Lic Date</label>
                                                      <div class="col-lg-4">
                                                          <input type="deecLicDate" class="form-control deecLicDate" id="deecLicDate" placeholder="DEEC Lic Date">
                                                      </div>-->
                                                  </div>
                                                 <!--  <div class="form-group">
                                                    <label for="deecRegNo" class="col-lg-2 col-sm-2 control-label">DEEC Reg No</label>
                                                      <div class="col-lg-4">
                                                          <input type="deecRegNo" class="form-control" id="deecRegNo" placeholder="DEEC Reg No">
                                                      </div>
                                                      <label for="deecRegDate" class="col-lg-2 col-sm-2 control-label">DEEC Reg Date</label>
                                                      <div class="col-lg-4">
                                                          <input type="deecRegDate" class="form-control deecRegDate" id="deecRegDate" placeholder="DEEC Reg Date">
                                                      </div>
                                                  </div>
                                                  
                                                 <div class="form-group">
                                                      <div class="col-lg-offset-2 col-lg-10">
                                                          <div class="checkbox">
                                                              <label>
                                                                  <input type="checkbox"> Remember me
                                                              </label>
                                                          </div>
                                                      </div>
                                                  </div>-->
                                                  <div class="form-group">
                                                      <div class="col-lg-offset-2 col-lg-10">
                                                          <button type="submit" id="modalSubmit" class="btn btn-default">Sign in</button>
                                                      </div>
                                                  </div>
                                              </form>

                                          </div>

                                      </div>
                                  </div>
                              </div>
                                          </div>
										</section>
                                      </div>
                                  </div>
                      </section>
                
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
    
    
   <!--toastr-->
    <script src="<c:url value='/static/assets/toastr-master/toastr.js'/>" ></script>
    
    <script src="<c:url value='/static/js/bootstrap3-typeahead.min.js'/>" ></script>
    <script src="<c:url value='/static/js/jquery.easy-autocomplete.js'/>" ></script>
    
    <script src="<c:url value='/static/js/masters/party.js'/>" ></script>
    
      <!--select2-->
  <script type="text/javascript" src="<c:url value='/static/assets/select2/js/select2.min.js'/>" ></script>
    
    <script>
    $('.certificateDate').datepicker({
        autoclose: true
    });
    $('.validUptoDate').datepicker({
        autoclose: true
    });
     $('.deecRegDate').datepicker({
        autoclose: true
    });
   $('.epcgRegDate').datepicker({
        autoclose: true
    }); 
      $('.dfiaRegDate').datepicker({
        autoclose: true
    }); 
    $('.deecLicDate').datepicker({
        autoclose: true
    });
   $('.epcgLicDate').datepicker({
        autoclose: true
    }); 
      $('.dfiaLicDate').datepicker({
        autoclose: true
    }); 
  //step wizard
        $(function () {
            $('#partyDetailsForm').stepy({
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