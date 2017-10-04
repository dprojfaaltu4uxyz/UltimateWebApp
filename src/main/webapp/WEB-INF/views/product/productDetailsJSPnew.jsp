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
	<link rel="shortcut icon" href="img/favicon.png">

    <title>Invoice</title>

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

	
      <!--right slidebar-->
    <link href="<c:url value='/static/css/slidebars.css' />" rel="stylesheet"/>

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
    <style type="text/css">
  .side{
  position:fixed;
}

.scroll-area{
  width:100%;
  height:calc(100% - 200px);
  margin-top:100px;
  float:left;
  overflow-y:scroll;
}
    </style>
    
  </head>

  <body class="mega-nav">

    <section id="container" class="">
        <!--header start-->
         <%@include file="../pagetemplate/topPanelMegaMenuJSP.jsp" %>
      <!--header end-->
      <!--sidebar start-->
		  <section id="main-content">
		  
		  	<section class="wrapper">
		  	  <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                            Add Invoice Details Below
                          </header>
                          <div class="panel-body" style="padding: 60px;  padding-top: 0px;  padding-left: 10px; padding-bottom: 0px; padding-right: 10px;">
                          <div class="table-responsive">
                          <table id="productDetailTable" class="table table-striped">
											<thead>
												<tr data-row='data-row'>
													<th>Product Name</th>
													<th>Description</th>
													<th>Accessories</th>
													<th>Package Details</th>
													<th>RITC No</th>
													<th>Scheme code</th>
													<th>Category</th>
													<th>Invoice No</th>
													<th>Date</th>
													<th>Quantity</th>
													<th>Unit</th>
													<th>Item Rate</th>
													<th>Per</th>
													<th>Goods Value</th>
													<th>PMV</th>
													<th>Unit</th>
													<th>Gross Weight</th>
													<th>Net Weight</th>
													<th>Unit</th>
													<th>No. Of Packages</th>
													<th>Unit</th>
													<th></th>
													<th>DBK Sr.No</th>
													<th>DBK on WT</th>
													<th>Unit</th>
													<th>DBK on FOB</th>
													<th>DBK on Quantity</th>
													<th>Unit</th>
													<th>State FOB %</th>
													<th>State FOB Quantity</th>
													<th>State FOB On WT</th>
													<th>State Amount</th>
													<th>Item Code (STR)</th>
													<th>Item Code (MEIS)</th>
													<th>End Use</th>
													<th>Accessory status</th>
													<th>HAWB No</th>
													<th>Total Package</th>
													<th>IGST Payment Status</th>
													<th>Taxable Value</th>
													<th>IGST Amount</th>
												</tr>
											</thead>
											<tbody>
											</tbody>
										</table>
										</div>
                          </div>
		  	   </section>
                  </div>
                  </div>
                  <div class="row">
                  <div class="col-lg-offset-2 col-lg-10">
                                              <button id="delBttn" class="btn btn-danger" style="float: right" onclick="delRows();" type="button">Delete</button>                                              
                                          </div> 
                                          </div>
               <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                Product Details
                            </header>

                            <div class="panel-body">

                                <form class="form-horizontal" id="default">
                                     <!-- Select Basic -->
                                    <div class="form-group">
                                        <label class="col-md-1 " for="productName">Product Name </label>
                                        <div class="col-md-7">
                                            <input id="productName" path="productName" type="text" placeholder="Product Name" class="form-control input-md" >
                                        </div>    
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="desc">Description </label>
                                        <div class="col-md-7">
                                            <input id="desc" path="desc" type="text" placeholder="Description" class="form-control input-md" >
                                        </div>  
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="accessories">Accessories </label>
                                        <div class="col-md-5">
                                            <input id="accessories" path="accessories" type="text" placeholder="Accessories" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="pkgDetails">Pkg. Details</label>
                                        <div class="col-md-3">
                                            <input id="pkgDetails" path="pkgDetails" type="text" placeholder="Pkg. Details" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                     <label class="col-md-1 " for="ritcNo">RITC No</label>
                                        <div class="col-md-3">
                                            <input id="ritcNo" path="ritcNo" type="text" placeholder="RITC No" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="schemeCode">Scheme Code </label>
                                        <div class="col-md-3">
                                            <input id="schemeCode" path="schemeCode" type="text" placeholder="Scheme Code" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="category">Category, If NFEI</label>
                                        <div class="col-md-3">
                                            <input id="category" path="category" type="text" placeholder="Category" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                    <label class="col-md-1 " for="amount">Invoice No </label>
                                        <div class="col-md-3">
                                            <input id="invoiceNo" path="invoiceNo" type="text" placeholder="Invoice No" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="invDate">Date </label>
                                        <div class="col-md-3">
                                            <input id="invDate" path="invDate" type="text" placeholder="Date" class="form-control input-md date" >
                                        </div>
                                        <label class="col-md-1 " for="qty">Quantity </label>
                                        <div class="col-md-3">
                                            <input id="qty" path="qty" type="text" placeholder="Quantity" class="form-control input-md" >
                                        </div>
                                    </div>    
                                    <div class="form-group">
                                        <label class="col-md-1 " for="unit">Unit</label>
                                        <div class="col-md-3">
                                            <input id="unit" path="unit" type="text" placeholder="Unit" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="itemRate">Item Rate</label>
                                        <div class="col-md-3">
                                            <input id="itemRate" path="itemRate" type="text" placeholder="Item Rate" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="per">Per </label>
                                        <div class="col-md-3">
                                            <input id="per" path="per" type="text" placeholder="Per" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="goodsValue">Goods Value </label>
                                        <div class="col-md-3">
                                            <input id="goodsValue" path="goodsValue" type="text" placeholder="Goods Value" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="pmvValue">PMV </label>
                                        <div class="col-md-3">
                                            <input id="pmvValue" path="pmvValue" type="text" placeholder="PMV" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="pmvUnit">Unit </label>
                                        <div class="col-md-3">
                                            <input id="pmvUnit" path="pmvUnit" type="text" placeholder="Unit" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                         <label class="col-md-1 " for="grossWeight">Gross Weight </label>
                                        <div class="col-md-3">
                                            <input id="grossWeight" path="grossWeight" type="text" placeholder="Gross Weight" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="netWeight">Net Weight </label>
                                        <div class="col-md-3">
                                            <input id="netWeight" path="netWeight" type="text" placeholder="Net Weight" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="perUnit">/Unit </label>
                                        <div class="col-md-3">
                                            <input id="perUnit" path="perUnit" type="text" placeholder="/ Unit" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="noOfPackages">No. Of Packages </label>
                                        <div class="col-md-5">
                                            <input id="noOfPackages" path="noOfPackages" type="text" placeholder="No. of Packages" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="noOfPackPerUnit">/Unit </label>
                                        <div class="col-md-3">
                                            <input id="noOfPackPerUnit" path="noOfPackPerUnit" type="text" placeholder="/Unit" class="form-control input-md" >
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-md-1 " for="epcg">EPCG </label>
                                        <div class="col-md-5">
                                             <a href="#myModal" data-toggle="modal" class="btn btn-xs btn-success">
	                                               EPCG Licence Details
	                                            </a>
                                        </div>
                                         <label class="col-md-1 " for="epcg">DEEC </label>
                                        <div class="col-md-5">
	                                            <a href="#myModal" data-toggle="modal" class="btn btn-xs btn-success">
	                                               DEEC Licence Details
	                                            </a>
                                        </div>
                                        <label class="col-md-1 " for="fobValue">FOB Value</label>
                                        <div class="col-md-3">
                                              <input id="fobValue" path="fobValue" type="text" placeholder="FOB Value" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="dbkSrNo">Drawback Sr.No</label>
                                        <div class="col-md-3">
                                            <input id="dbkSrNo" path="dbkSrNo" type="text" placeholder="Drawback Sr.No" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="onWt">On WT </label>
                                        <div class="col-md-3">
                                            <input id="onWt" path="onWt" type="text" placeholder="On WT" class="form-control input-md" >
                                        </div>
                                       <label class="col-md-1 " for="dbkPerUnit">/Unit </label>
                                        <div class="col-md-3">
                                            <input id="dbkPerUnit" path="dbkPerUnit" type="text" placeholder="/Unit" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="onFOB">On FOB</label>
                                        <div class="col-md-3">
                                            <input id="onFOB" path="onFOB" type="text" placeholder="On FOB" class="form-control input-md" >
                                        </div>
                                       <label class="col-md-1 " for="dbkQuantity">Drawback Quantity </label>
                                        <div class="col-md-3">
                                            <input id="dbkQuantity" path="dbkQuantity" type="text" placeholder="Drawback Quantity" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="dbkQtyPerUnit">/Unit </label>
                                        <div class="col-md-3">
                                            <input id="dbkQtyPerUnit" path="dbkQtyPerUnit" type="text" placeholder="/Unit" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="stateFOB">State FOB %</label>
                                        <div class="col-md-3">
                                            <input id="stateFOB" path="stateFOB" type="text" placeholder="State FOB %" class="form-control input-md" >
                                        </div>
                                       <label class="col-md-1 " for="statePerQty">/ Quantity</label>
                                        <div class="col-md-3">
                                            <input id="statePerQty" path="statePerQty" type="text" placeholder="/ Quantity" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="stateWt">State FOB % on WT </label>
                                        <div class="col-md-3">
                                            <input id="stateWt" path="stateWt" type="text" placeholder="State FOB % on WT " class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="stateAmt">State Amount</label>
                                        <div class="col-md-5">
                                            <input id="stateAmt" path="stateAmt" type="text" placeholder="State Amount" class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="epcg">DFIA </label>
                                        <div class="col-md-3">
                                             <a href="#myModal" data-toggle="modal" class="btn btn-xs btn-success">
	                                               DFIA Details
	                                            </a>
                                        </div>
                                         <label class="col-md-1 " for="epcg">Job Work Details </label>
                                        <div class="col-md-3">
	                                            <a href="#myModal" data-toggle="modal" class="btn btn-xs btn-success">
	                                               Job Work Details
	                                            </a>
                                        </div>
                                        <label class="col-md-1 " for="jobNotificationNo">Job Notification No.</label>
                                        <div class="col-md-3">
                                              <input id="jobNotificationNo" path="jobNotificationNo" type="text" placeholder="Job Notification No." class="form-control input-md" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="itemCodeStr">Item Code as Per Str Directory</label>
                                        <div class="col-md-3">
                                            <input id="itemCodeStr" path="itemCodeStr" type="text" placeholder="Item Code as Per Str Directory" class="form-control input-md" >
                                        </div>
                                       <label class="col-md-1 " for="itemCodeReward">Item Code as Per Reward Directory (MEIS)</label>
                                        <div class="col-md-3">
                                            <input id="itemCodeReward" path="itemCodeReward" type="text" placeholder="Item Code as Per Reward Directory (MEIS)" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="stateFOBWt">State FOB % on WT </label>
                                        <div class="col-md-3">
                                            <input id="stateFOBWt" path="stateFOBWt" type="text" placeholder="State FOB % on WT " class="form-control input-md" >
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-md-1 " for="endUse">End Use</label>
                                        <div class="col-md-3">
                                            <input id="endUse" path="endUse" type="text" placeholder="End Use" class="form-control input-md" >
                                        </div>
                                       <label class="col-md-1 " for="accessoryState">Accessory Status</label>
                                        <div class="col-md-3">
                                            <input id="accessoryState" path="accessoryState" type="text" placeholder="Accessory Status" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="hawbNo">HAWB No </label>
                                        <div class="col-md-3">
                                            <input id="hawbNo" path="hawbNo" type="text" placeholder="HAWB No" class="form-control input-md" >
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-md-1 " for="totalPackage">Total Package</label>
                                        <div class="col-md-3">
                                            <input id="totalPackage" path="totalPackage" type="text" placeholder="Total Package" class="form-control input-md" >
                                        </div>
                                       <label class="col-md-1 " for="igstPaymentStatus">IGST Payment Status</label>
                                        <div class="col-md-3">
                                            <input id="igstPaymentStatus" path="igstPaymentStatus" type="text" placeholder="IGST Payment Status" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="taxableValue">Taxable Value </label>
                                        <div class="col-md-3">
                                            <input id="taxableValue" path="taxableValue" type="text" placeholder="Taxable Value" class="form-control input-md" >
                                        </div>
                                        <label class="col-md-1 " for="igstAmount">IGST Amount</label>
                                        <div class="col-md-3">
                                            <input id="igstAmount" path="igstAmount" type="text" placeholder="IGST Amount" class="form-control input-md">
                                        </div>
                                    </div> 
                                    <input type="hidden" id="rowId" value=""></input>
                                    <div class="form-group">
                                    	<div class="col-lg-offset-2 col-md-6">
                                    	 <button id="addBttn" class="btn btn-danger" onclick="addRows();" type="button">Save</button>
                                    	 <button id="editBttn" class="btn btn-danger" onclick="editRows();" type="button">Update</button>
                                      </div>
                                    </div>
                                </form>
                            </div>
                        </section>
                    </div>
                </div>   
                  
		  	 <!--   <div class="row">
                  <div class="col-lg-12">
                      <section class="panel">
                          <div class="panel-body" style="padding: 60px;  padding-top: 0px;  padding-left: 10px; padding-bottom: 0px; padding-right: 10px;">
                               <div class="row">                               
                                   <div class="col-sm-12"><label for="firstname" class="control-label ">Description</label></div>
                                   </div>
                                   <div class="row">
                                          <div class="col-sm-12">
                                               <textarea class="form-control custom-control" rows="1" name="desc"  id = "desc" style="resize:none"></textarea>                                              
                                          </div>
                                          </div>
                                   
                                   
                                   <div class="row">
                                   <div class="col-sm-2"><label   class="control-label ">Rate</label></div>
                                   <div class="col-sm-2"><label   class="control-label ">QTY</label></div>                                        
                                   <div class="col-sm-2"><label   class="control-label ">CURRENCY</label></div>                                      
                                   <div class="col-sm-2"><label   class="control-label ">Ex Rate</label></div>                                                                                                                     
                                   <div class="col-sm-2"><label   class="control-label ">Rate X Qty</label></div>
                                   <div class="col-sm-2"><label   class="control-label ">Amount</label></div>
                                    </div>      
                                          
                                          <div class="row">
                                          <div class="col-sm-2">
                                              <input class=" form-control" style=" height: 20px!important;" id="rate" name="rate" type="text" />
                                          </div>
                                          <div class="col-sm-2">
                                              <input class="form-control " style=" height: 20px!important;" id="qty" name="qty" type="text" />
                                          </div>
                                          <div class="col-sm-2">
                                              <input class="form-control " style=" height: 20px!important;" id="currency" name="currency" type="text" />
                                          </div>
                                          <div class="col-sm-2">
                                              <input class="form-control " style=" height: 20px!important;" id="exRate" name="exRate" type="text" />
                                          </div>
                                          <div class="col-sm-2">
                                              <input class="form-control " style=" height: 20px!important;" id="rateXqty" name="rateXqty" type="text" />
                                          </div>
                                          <div class="col-sm-2">
                                              <input class="form-control " style=" height: 20px!important;" id="amount" name="amount" type="text" />
                                          </div>
                                          </div>
                                          <input type="hidden" id="rowId" value=""></input>
                                      </div>                                      
                                          <div class="col-lg-offset-2 col-lg-10">
                                          
                                              <button id="addBttn" class="btn btn-danger" style="float: right" onclick="addRows();" type="button">Save</button>
                                              <button id="editBttn" class="btn btn-danger" style="float: right" onclick="editRows();" type="button">Update</button>
                                          </div>                                      
                          
                      </section>
                  </div>
                  </div> -->
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
    <script src="<c:url value='/static/js/jquery.js' />"></script>
    <script src="<c:url value='/static/js/bootstrap.min.js' />"></script>
    <script class="include" type="text/javascript" src="<c:url value='/static/js/jquery.dcjqaccordion.2.7.js' />"></script>
    <script src="<c:url value='/static/js/jquery.scrollTo.min.js' />"></script>
    <script src="<c:url value='/static/js/jquery.nicescroll.js" type="text/javascript' />"></script>
      <script type="text/javascript" src="<c:url value='/static/js/jquery.validate.min.js'/>"></script>
    <script src="<c:url value='/static/js/respond.min.js' />" ></script>
  
   
<!--right slidebar-->
  <script src="<c:url value='/static/js/slidebars.min.js'/>"></script>

    
  <!--common script for all pages-->
  <script src="<c:url value='/static/js/common-scripts.js' />"></script>
  
<!--script for this page-->
    <script src="<c:url value='/static/js/form-validation-script.js'/>" ></script>
    
    <script type="text/javascript" src="<c:url value='/static/assets/bootstrap-datepicker/js/bootstrap-datepicker.js'/>" ></script>
  
   <!--select2-->
  <script type="text/javascript" src="assets/select2/js/select2.min.js"></script>
  <script>
	$(".form-control").css({'height': '21px!important' });
	$(".form-control").css({'width': '23%!important' });

$('.invDate').datepicker({
    autoclose: true
});
var token = $("meta[name='_csrf']").attr("content");
var rowNo = 0;
$(document).ready(function(){
	$.ajax({	
		type: 'GET',
		dataType: 'json',
		contentType:'application/json',
		url: "${pageContext.request.contextPath}/productlist",
		data:{},
		headers: {
	        'X-CSRF-Token': token
	    },
		success :function(rows){
			var i;
			for (i in rows) {
				createRows(rows[i],i);
	            }
		},
		error : function(e) {
			console.log("ERROR: ", e);				
		},
		done : function(e) {
			console.log("DONE");
		}
	}); 
});

function createRows(itemBean,rowNo){
	var text = {'id':rowNo,'pdtId': itemBean.pdtId,'productName':itemBean.productName,'desc':itemBean.desc,'accessories': itemBean.accessories,'pkgDetails': itemBean.pkgDetails,'ritcNo': itemBean.ritcNo,'schemeCode': itemBean.schemeCode,'category': itemBean.category,'invoiceNo': itemBean.invoiceNo,'invDate': itemBean.invDate,'qty': itemBean.qty,'unit': itemBean.unit,'itemRate': itemBean.itemRate,'per': itemBean.per,'goodsValue': itemBean.goodsValue,'pmvUnit': itemBean.pmvUnit,'pmvValue':itemBean.pmvValue,'grossWeight': itemBean.grossWeight,'netWeight': itemBean.netWeight,'perUnit':itemBean.perUnit,'noOfPackages': itemBean.noOfPackages,'noOfPackPerUnit': itemBean.noOfPackPerUnit,'fobValue':itemBean.fobValue,'dbkSrNo': itemBean.dbkSrNo,'onWt': itemBean.onWt,'dbkPerUnit': itemBean.dbkPerUnit,'onFOB': itemBean.onFOB,'dbkQuantity': itemBean.dbkQuantity,'dbkQtyPerUnit': itemBean.dbkQtyPerUnit,'stateFOB': itemBean.stateFOB,'statePerQty': itemBean.statePerQty,'stateWt': itemBean.stateWt,'stateAmt': itemBean.stateAmt,'jobNotificationNo': itemBean.jobNotificationNo,'itemCodeStr': itemBean.itemCodeStr,'itemCodeReward': itemBean.itemCodeReward,'stateFOBWt': itemBean.stateFOBWt,'endUse': itemBean.endUse,'accessoryState': itemBean.accessoryState,'hawbNo': itemBean.hawbNo,'totalPackage': itemBean.totalPackage,'igstPaymentStatus': itemBean.igstPaymentStatus,'taxableValue': itemBean.taxableValue,'igstAmount': itemBean.igstAmount};
	
	var checkbox = "<td><input type='checkbox' id='"+rowNo+"_check' value='"+rowNo+"'/></td>";
	var cell02 = "<td id='"+rowNo+"_productName' column ='productName'>"+ itemBean.productName +"</td>";
	var cell01 = "<td id='"+rowNo+"_desc' column='description'><a href='#' onclick='editData("+rowNo+");'>"+itemBean.desc+"</td> ";
  	var cell02 = "<td id='"+rowNo+"_productName' column ='productName'>"+ itemBean.productName +"</td>";
  	var cell03 = "<td id='"+rowNo+"_accessories'   column ='accessories'>"+ itemBean.accessories +"</td>";
  	var cell04 = "<td id='"+rowNo+"_pkgDetails'  column ='pkgDetails'>"+ itemBean.pkgDetails +"</td>";
  	var cell05 = "<td id='"+rowNo+"_ritcNo'   column ='ritcNo'>"+ itemBean.ritcNo +"</td>";
  	var cell06 = "<td id='"+rowNo+"_schemeCode'   column ='schemeCode'>"+ itemBean.schemeCode +"</td>";
  	var cell07 = "<td id='"+rowNo+"_category'  column ='category'>"+ itemBean.category +"</td>";
  	var cell08 = "<td id='"+rowNo+"_invoiceNo'  column ='invoiceNo'>"+ itemBean.invoiceNo +"</td>";
  	var cell09 = "<td id='"+rowNo+"_invDate'  column ='invDate'>"+ itemBean.invDate +"</td>";
  	var cell10 = "<td id='"+rowNo+"_qty'  column ='qty'>"+ itemBean.qty +"</td>";
  	var cell11 = "<td id='"+rowNo+"_unit'  column ='unit'>"+ itemBean.unit +"</td>";
  	var cell12 = "<td id='"+rowNo+"_itemRate'  column ='itemRate'>"+ itemBean.itemRate +"</td>";
  	var cell13 = "<td id='"+rowNo+"_per'  column ='per'>"+ itemBean.per +"</td>";
  	var cell14 = "<td id='"+rowNo+"_goodsValue'  column ='goodsValue'>"+ itemBean.goodsValue +"</td>";
  	var cell15 = "<td id='"+rowNo+"_pmvUnit'  column ='pmvUnit'>"+ itemBean.pmvUnit +"</td>";
  	var cell16 = "<td id='"+rowNo+"_pmvValue'  column ='pmvValue'>"+ itemBean.pmvValue +"</td>";
  	var cell17 = "<td id='"+rowNo+"_grossWeight'  column ='grossWeight'>"+ itemBean.grossWeight +"</td>";
  	var cell18 = "<td id='"+rowNo+"_netWeight'  column ='netWeight'>"+ itemBean.netWeight +"</td>";
  	var cell19 = "<td id='"+rowNo+"_perUnit'  column ='perUnit'>"+ itemBean.perUnit +"</td>";
  	var cell20 = "<td id='"+rowNo+"_pmUnit'  column ='pmUnit'>"+ itemBean.pmUnit +"</td>";
  	var cell21 = "<td id='"+rowNo+"_noOfPackages'  column ='noOfPackages'>"+itemBean.noOfPackages +"</td>";
  	var cell22 = "<td id='"+rowNo+"_noOfPackPerUnit'  column ='noOfPackPerUnit'>"+ itemBean.noOfPackPerUnit +"</td>";
  	var cell23 = "<td id='"+rowNo+"_fobValue'  column ='fobValue'>"+ itemBean.fobValue +"</td>";
  	var cell24 = "<td id='"+rowNo+"_dbkSrNo'  column ='dbkSrNo'>"+ itemBean.dbkSrNo +"</td>";
  	var cell25 = "<td id='"+rowNo+"_onWt'  column ='onWt'>"+ itemBean.onWt +"</td>";
  	var cell26 = "<td id='"+rowNo+"_dbkPerUnit'  column ='dbkPerUnit'>"+ itemBean.dbkPerUnit +"</td>";
  	var cell27 = "<td id='"+rowNo+"_onFOB'  column ='onFOB'>"+ itemBean.onFOB +"</td>";
  	var cell28 = "<td id='"+rowNo+"_dbkQuantity'  column ='dbkQuantity'>"+ itemBean.dbkQuantity +"</td>";
  	var cell29 = "<td id='"+rowNo+"_dbkQtyPerUnit'  column ='dbkQtyPerUnit'>"+ itemBean.dbkQtyPerUnit +"</td>";
  	var cell30 = "<td id='"+rowNo+"_stateFOB'  column ='stateFOB'>"+ itemBean.stateFOB +"</td>";
  	var cell31 = "<td id='"+rowNo+"_statePerQty'  column ='statePerQty'>"+ itemBean.statePerQty +"</td>";
  	var cell32 = "<td id='"+rowNo+"_statePerQty'  column ='statePerQty'>"+ itemBean.statePerQty +"</td>";
  	var cell33 = "<td id='"+rowNo+"_stateWt'  column ='stateWt'>"+ itemBean.stateWt +"</td>";
  	var cell34 = "<td id='"+rowNo+"_stateAmt'  column ='stateAmt'>"+ itemBean.stateAmt +"</td>";
  	var cell35 = "<td id='"+rowNo+"_jobNotificationNo'  column ='jobNotificationNo'>"+ itemBean.jobNotificationNo +"</td>";
  	var cell36 = "<td id='"+rowNo+"_itemCodeStr'  column ='itemCodeStr'>"+ itemBean.itemCodeStr +"</td>";
	var cell37 = "<td id='"+rowNo+"_itemCodeReward'  column ='itemCodeReward'>"+ itemBean.itemCodeReward +"</td>";
	var cell38 = "<td id='"+rowNo+"_stateFOBWt'  column ='stateFOBWt'>"+ itemBean.stateFOBWt +"</td>";
	var cell39 = "<td id='"+rowNo+"_endUse'  column ='endUse'>"+ itemBean.endUse +"</td>";
	var cell40 = "<td id='"+rowNo+"_accessoryState'  column ='accessoryState'>"+ itemBean.accessoryState +"</td>";
	var cell41 = "<td id='"+rowNo+"_hawbNo'  column ='hawbNo'>"+ itemBean.hawbNo +"</td>";
	var cell42 = "<td id='"+rowNo+"_totalPackage'  column ='totalPackage'>"+ itemBean.totalPackage +"</td>";
	var cell43 = "<td id='"+rowNo+"_igstPaymentStatus'  column ='igstPaymentStatus'>"+ itemBean.igstPaymentStatus +"</td>";
	var cell44 = "<td id='"+rowNo+"_taxableValue'  column ='taxableValue'>"+ itemBean.taxableValue +"</td>";
	var cell45 = "<td id='"+rowNo+"_igstAmount'  column ='igstAmount'>"+ itemBean.igstAmount +"</td>";
	var deleteRow = "<button id='delButton' class='btn default' onclick='deleteRow($(this));'>delete</button>"
	  	var row = "<tr  data-row='data-bean' item-bean ="+JSON.stringify(text)+" id='"+rowNo+"'>"+checkbox+cell01+cell02+cell03+cell04+cell05+cell06+cell07+cell08+cell09+cell10+cell11+cell12+cell13+cell14+cell15+cell16+cell17+cell18+cell19+cell20+cell21+cell22+cell23+cell24+cell25+cell26+cell27+cell28+cell29+cell30+cell31+cell32+cell33+cell34+cell35+cell36+cell37+cell38+cell39+cell40+cell41+cell42+cell43+cell44+cell45+"</tr>";
	      $("#productDetailTable tbody").after(row);
		 
}
function addRows() {
	//$('#editBttn').hide();
	  rowNo++;
	  var text = {'id':rowNo,'pdtId': null,'productName':$('#productName').val(),'desc':$('#desc').val().trim(),'accessories': $("#accessories").val(),'pkgDetails': $("#pkgDetails").val(),'ritcNo': $("#ritcNo").val(),'schemeCode': $("#schemeCode").val(),'category': $("#category").val(),'invoiceNo': $("#invoiceNo").val(),'invDate': $("#invDate").val(),'qty': $("#qty").val(),'unit': $("#unit").val(),'itemRate': $("#itemRate").val(),'per': $("#per").val(),'goodsValue': $("#goodsValue").val(),'pmvUnit': $("#pmvUnit").val(),'pmvValue':$("#pmvValue").val(),'grossWeight': $("#grossWeight").val(),'netWeight': $("#netWeight").val(),'perUnit':$("#perUnit").val(),'noOfPackages': $("#noOfPackages").val(),'noOfPackPerUnit': $("#noOfPackPerUnit").val(),'fobValue':$("#fobValue").val(),'dbkSrNo': $("#dbkSrNo").val(),'onWt': $("#onWt").val(),'dbkPerUnit': $("#dbkPerUnit").val(),'onFOB': $("#onFOB").val(),'dbkQuantity': $("#dbkQuantity").val(),'dbkQtyPerUnit': $("#dbkQtyPerUnit").val(),'stateFOB': $("#stateFOB").val(),'statePerQty': $("#statePerQty").val(),'stateWt': $("#stateWt").val(),'stateAmt': $("#stateAmt").val(),'jobNotificationNo': $("#jobNotificationNo").val(),'itemCodeStr': $("#itemCodeStr").val(),'itemCodeReward': $("#itemCodeReward").val(),'stateFOBWt': $("#stateFOBWt").val(),'endUse': $("#endUse").val(),'accessoryState': $("#accessoryState").val(),'hawbNo': $("#hawbNo").val(),'totalPackage': $("#totalPackage").val(),'igstPaymentStatus': $("#igstPaymentStatus").val(),'taxableValue': $("#taxableValue").val(),'igstAmount': $("#igstAmount").val()};
	 
	  var itemBean = JSON.stringify(text);
	  
	  $.ajax({	
			type: 'POST',
			dataType: 'json',
			contentType:'application/json',
			url: "${pageContext.request.contextPath}/saveProductDetails",
			data:itemBean,
			headers: {
		        'X-CSRF-Token': token
		    },
			success :function(pdtId){
				text.pdtId = pdtId;
				var checkbox = "<td><input type='checkbox' id='"+rowNo+"_check' value='"+rowNo+"'/></td>";
				var cell01 = "<td id='"+rowNo+"_desc' column='description'><a href='#' onclick='editData("+rowNo+");'>"+$('#desc').val() +"</td> ";
			  	var cell02 = "<td id='"+rowNo+"_productName' column ='productName'>"+ $("#productName").val(); +"</td>";
			  	var cell03 = "<td id='"+rowNo+"_accessories'   column ='accessories'>"+ $("#accessories").val(); +"</td>";
			  	var cell04 = "<td id='"+rowNo+"_pkgDetails'  column ='pkgDetails'>"+ $("#pkgDetails").val(); +"</td>";
			  	var cell05 = "<td id='"+rowNo+"_ritcNo'   column ='ritcNo'>"+ $("#ritcNo").val(); +"</td>";
			  	var cell06 = "<td id='"+rowNo+"_schemeCode'   column ='schemeCode'>"+ $("#schemeCode").val(); +"</td>";
			  	var cell07 = "<td id='"+rowNo+"_category'  column ='category'>"+ $("#category").val(); +"</td>";
			  	var cell08 = "<td id='"+rowNo+"_invoiceNo'  column ='invoiceNo'>"+ $("#invoiceNo").val(); +"</td>";
			  	var cell09 = "<td id='"+rowNo+"_invDate'  column ='invDate'>"+ $("#invDate").val(); +"</td>";
			  	var cell10 = "<td id='"+rowNo+"_qty'  column ='qty'>"+ $("#qty").val(); +"</td>";
			  	var cell11 = "<td id='"+rowNo+"_unit'  column ='unit'>"+ $("#unit").val(); +"</td>";
			  	var cell12 = "<td id='"+rowNo+"_itemRate'  column ='itemRate'>"+ $("#itemRate").val(); +"</td>";
			  	var cell13 = "<td id='"+rowNo+"_per'  column ='per'>"+ $("#per").val(); +"</td>";
			  	var cell14 = "<td id='"+rowNo+"_goodsValue'  column ='goodsValue'>"+ $("#goodsValue").val(); +"</td>";
			  	var cell15 = "<td id='"+rowNo+"_pmvUnit'  column ='pmvUnit'>"+ $("#pmvUnit").val(); +"</td>";
			  	var cell16 = "<td id='"+rowNo+"_pmvValue'  column ='pmvValue'>"+ $("#pmvValue").val(); +"</td>";
			  	var cell17 = "<td id='"+rowNo+"_grossWeight'  column ='grossWeight'>"+ $("#grossWeight").val(); +"</td>";
			  	var cell18 = "<td id='"+rowNo+"_netWeight'  column ='netWeight'>"+ $("#netWeight").val(); +"</td>";
			  	var cell19 = "<td id='"+rowNo+"_perUnit'  column ='perUnit'>"+ $("#perUnit").val(); +"</td>";
			  	var cell20 = "<td id='"+rowNo+"_pmUnit'  column ='pmUnit'>"+ $("#pmUnit").val(); +"</td>";
			  	var cell21 = "<td id='"+rowNo+"_noOfPackages'  column ='noOfPackages'>"+$("#noOfPackages").val(); +"</td>";
			  	var cell22 = "<td id='"+rowNo+"_noOfPackPerUnit'  column ='noOfPackPerUnit'>"+ $("#noOfPackPerUnit").val(); +"</td>";
			  	var cell23 = "<td id='"+rowNo+"_fobValue'  column ='fobValue'>"+ $("#fobValue").val(); +"</td>";
			  	var cell24 = "<td id='"+rowNo+"_dbkSrNo'  column ='dbkSrNo'>"+ $("#dbkSrNo").val(); +"</td>";
			  	var cell25 = "<td id='"+rowNo+"_onWt'  column ='onWt'>"+ $("#onWt").val(); +"</td>";
			  	var cell26 = "<td id='"+rowNo+"_dbkPerUnit'  column ='dbkPerUnit'>"+ $("#dbkPerUnit").val(); +"</td>";
			  	var cell27 = "<td id='"+rowNo+"_onFOB'  column ='onFOB'>"+ $("#onFOB").val(); +"</td>";
			  	var cell28 = "<td id='"+rowNo+"_dbkQuantity'  column ='dbkQuantity'>"+ $("#dbkQuantity").val(); +"</td>";
			  	var cell29 = "<td id='"+rowNo+"_dbkQtyPerUnit'  column ='dbkQtyPerUnit'>"+ $("#dbkQtyPerUnit").val(); +"</td>";
			  	var cell30 = "<td id='"+rowNo+"_stateFOB'  column ='stateFOB'>"+ $("#stateFOB").val(); +"</td>";
			  	var cell31 = "<td id='"+rowNo+"_statePerQty'  column ='statePerQty'>"+ $("#statePerQty").val(); +"</td>";
			  	var cell32 = "<td id='"+rowNo+"_statePerQty'  column ='statePerQty'>"+ $("#statePerQty").val(); +"</td>";
			  	var cell33 = "<td id='"+rowNo+"_stateWt'  column ='stateWt'>"+ $("#stateWt").val(); +"</td>";
			  	var cell34 = "<td id='"+rowNo+"_stateAmt'  column ='stateAmt'>"+ $("#stateAmt").val(); +"</td>";
			  	var cell35 = "<td id='"+rowNo+"_jobNotificationNo'  column ='jobNotificationNo'>"+ $("#jobNotificationNo").val(); +"</td>";
			  	var cell36 = "<td id='"+rowNo+"_itemCodeStr'  column ='itemCodeStr'>"+ $("#itemCodeStr").val(); +"</td>";
				var cell37 = "<td id='"+rowNo+"_itemCodeReward'  column ='itemCodeReward'>"+ $("#itemCodeReward").val(); +"</td>";
				var cell38 = "<td id='"+rowNo+"_stateFOBWt'  column ='stateFOBWt'>"+ $("#stateFOBWt").val(); +"</td>";
				var cell39 = "<td id='"+rowNo+"_endUse'  column ='endUse'>"+ $("#endUse").val(); +"</td>";
				var cell40 = "<td id='"+rowNo+"_accessoryState'  column ='accessoryState'>"+ $("#accessoryState").val(); +"</td>";
				var cell41 = "<td id='"+rowNo+"_hawbNo'  column ='hawbNo'>"+ $("#hawbNo").val(); +"</td>";
				var cell42 = "<td id='"+rowNo+"_totalPackage'  column ='totalPackage'>"+ $("#totalPackage").val(); +"</td>";
				var cell43 = "<td id='"+rowNo+"_igstPaymentStatus'  column ='igstPaymentStatus'>"+ $("#igstPaymentStatus").val(); +"</td>";
				var cell44 = "<td id='"+rowNo+"_taxableValue'  column ='taxableValue'>"+ $("#taxableValue").val(); +"</td>";
				var cell45 = "<td id='"+rowNo+"_igstAmount'  column ='igstAmount'>"+ $("#igstAmount").val(); +"</td>";
				
			  	var deleteRow = "<button id='delButton' class='btn default' onclick='deleteRow($(this));'>delete</button>"
			  	var row = "<tr  data-row='data-bean' item-bean ="+JSON.stringify(text)+" id='"+rowNo+"'>"+checkbox+cell01+cell02+cell03+cell04+cell05+cell06+cell07+cell08+cell09+cell10+cell11+cell12+cell13+cell14+cell15+cell16+cell17+cell18+cell19+cell20+cell21+cell22+cell23+cell24+cell25+cell26+cell27+cell28+cell29+cell30+cell31+cell32+cell33+cell34+cell35+cell36+cell37+cell38+cell39+cell40+cell41+cell42+cell43+cell44+cell45+"</tr>";
			      $("#productDetailTable tbody").after(row);
				console.log("SUCCESS: ", pdtId);
				
			},
			error : function(e) {
				console.log("ERROR: ", e);				
			},
			done : function(e) {
				console.log("DONE");
			}
		});             
		
}
function editData(rowNo){
	var  rowId ="#"+rowNo; 
	var tr = $("#"+rowNo);
	var itemBn = tr.attr("item-bean");
	var itemBean = JSON.parse(itemBn);
	//var item-bean = $("#w3s").attr("href");
	$("#rowId").val(rowNo);
	$("#desc").val(itemBean.desc);
	$("#pdtId").val(itemBean.pdtId); 
	$("#productName").val(itemBean.productName); 
	$("#desc").val(itemBean.desc); 
	$("#accessories").val( itemBean.accessories); 
	$("#pkgDetails").val( itemBean.pkgDetails);
	$("#ritcNo").val( itemBean.ritcNo);
	$("#schemeCode").val( itemBean.schemeCode); 
	$("#category").val( itemBean.category); 
	$("#invoiceNo").val( itemBean.invoiceNo);
	$("#invDate").val( itemBean.invDate);
	$("#qty").val( itemBean.qty); 
	$("#unit").val( itemBean.unit);
	$("#itemRate").val( itemBean.itemRate); 
	$("#per").val( itemBean.per);
	$("#goodsValue").val( itemBean.goodsValue); 
	$("#pmvUnit").val( itemBean.pmvUnit);
	$("#pmvValue").val(itemBean.pmvValue); 
	$("#grossWeight").val( itemBean.grossWeight); 
	$("#netWeight").val( itemBean.netWeight); 
	$("#perUnit").val(itemBean.perUnit); 
	$("#noOfPackages").val( itemBean.noOfPackages); 
	$("#noOfPackPerUnit").val( itemBean.noOfPackPerUnit);
	$("#fobValue").val(itemBean.fobValue); 
	$("#dbkSrNo").val( itemBean.dbkSrNo);
	$("#onWt").val( itemBean.onWt);
	$("#dbkPerUnit").val( itemBean.dbkPerUnit);
	$("#onFOB").val( itemBean.onFOB);
	$("#dbkQuantity").val( itemBean.dbkQuantity); 
	$("#dbkQtyPerUnit").val( itemBean.dbkQtyPerUnit);
	$("#stateFOB").val( itemBean.stateFOB); 
	$("#statePerQty").val( itemBean.statePerQty);
	$("#stateWt").val( itemBean.stateWt); 
	$("#stateAmt").val( itemBean.stateAmt); 
	$("#jobNotificationNo").val( itemBean.jobNotificationNo);
	$("#itemCodeStr").val( itemBean.itemCodeStr);
	$("#itemCodeReward").val( itemBean.itemCodeReward); 
	$("#stateFOBWt").val( itemBean.stateFOBWt); 
	$("#endUse").val( itemBean.endUse); 
	$("#accessoryState").val( itemBean.accessoryState);
	$("#hawbNo").val( itemBean.hawbNo); 
	$("#totalPackage").val( itemBean.totalPackage); 
	$("#igstPaymentStatus").val( itemBean.igstPaymentStatus); 
	$("#taxableValue").val( itemBean.taxableValue);
	$("#igstAmount").val( itemBean.igstAmount);
	$('#addBttn').hide();
	$('#editBttn').show();		
	
}

function editRows(){
    var rowNo = $("#rowId").val();
	var tr = $("#"+rowNo);
	var itemBn = tr.attr("item-bean");
	var itemBean = JSON.parse(itemBn);
	//var item-bean = $("#w3s").attr("href");
	 
	 
	itemBean.productName =$("#productName").val(); 
	itemBean.desc =$("#desc").val(); 
	itemBean.accessories =$("#accessories").val(); 
	 itemBean.pkgDetails = $("#pkgDetails").val();
	 itemBean.ritcNo = $("#ritcNo").val();
	 itemBean.schemeCode = $("#schemeCode").val(); 
	 itemBean.category = $("#category").val(); 
	 itemBean.invoiceNo = $("#invoiceNo").val();
	 itemBean.invDate =$("#invDate").val();
	 itemBean.qty = $("#qty").val(); 
	 itemBean.unit = $("#unit").val();
	 itemBean.itemRate = $("#itemRate").val(); 
	 itemBean.per = $("#per").val();
	 itemBean.goodsValue = $("#goodsValue").val(); 
	 itemBean.pmvUnit = $("#pmvUnit").val();
	 itemBean.pmvValue = $("#pmvValue").val(); 
	 itemBean.grossWeight = $("#grossWeight").val(); 
	 itemBean.netWeight = $("#netWeight").val(); 
	 itemBean.perUnit = $("#perUnit").val(); 
	 itemBean.noOfPackages = $("#noOfPackages").val(); 
	 itemBean.noOfPackPerUnit = $("#noOfPackPerUnit").val();
	 itemBean.fobValue = $("#fobValue").val(); 
	 itemBean.dbkSrNo = $("#dbkSrNo").val();
	 itemBean.onWt = $("#onWt").val();
	 itemBean.dbkPerUnit = $("#dbkPerUnit").val();
	 itemBean.onFOB = $("#onFOB").val();
	 itemBean.dbkQuantity = $("#dbkQuantity").val(); 
	 itemBean.dbkQtyPerUnit = $("#dbkQtyPerUnit").val();
	 itemBean.stateFOB = $("#stateFOB").val(); 
	 itemBean.statePerQty =   $("#statePerQty").val();
	 itemBean.stateWt =  $("#stateWt").val(); 
	 itemBean.stateAmt = $("#stateAmt").val(); 
	 itemBean.jobNotificationNo = $("#jobNotificationNo").val();
	 itemBean.itemCodeStr = $("#itemCodeStr").val();
	 itemBean.itemCodeReward = $("#itemCodeReward").val(); 
	 itemBean.stateFOBWt = $("#stateFOBWt").val(); 
	 itemBean.endUse = $("#endUse").val(); 
	 itemBean.accessoryState = $("#accessoryState").val();
	 itemBean.hawbNo = $("#hawbNo").val(); 
	 itemBean.totalPackage = $("#totalPackage").val(); 
	 itemBean.igstPaymentStatus = $("#igstPaymentStatus").val(); 
	 itemBean.taxableValue = $("#taxableValue").val();
	 itemBean.igstAmount = $("#igstAmount").val();
	  $.ajax({
			type : "POST",
			contentType:'application/json',
			url : "${pageContext.request.contextPath}/updateProductDetails",
			data : JSON.stringify(itemBean),
			dataType : "json",
			headers: {
		        'X-CSRF-Token': token
		    },
			success : function(data) {
	$("#"+rowNo+"_description").text(itemBean.desc) 
	$("#"+rowNo+"_productName").val(itemBean.productName); 
	$("#"+rowNo+"_desc").val(itemBean.desc.trim()); 
	$("#"+rowNo+"_accessories").val( itemBean.accessories); 
	$("#"+rowNo+"_pkgDetails").val( itemBean.pkgDetails);
	$("#"+rowNo+"_ritcNo").val( itemBean.ritcNo);
	$("#"+rowNo+"_schemeCode").val( itemBean.schemeCode); 
	$("#"+rowNo+"_category").val( itemBean.category); 
	$("#"+rowNo+"_invoiceNo").val( itemBean.invoiceNo);
	$("#"+rowNo+"_invDate").val( itemBean.invDate);
	$("#"+rowNo+"_qty").val( itemBean.qty); 
	$("#"+rowNo+"_unit").val( itemBean.unit);
	$("#"+rowNo+"_itemRate").val( itemBean.itemRate); 
	$("#"+rowNo+"_per").val( itemBean.per);
	$("#"+rowNo+"_goodsValue").val( itemBean.goodsValue); 
	$("#"+rowNo+"_pmvUnit").val( itemBean.pmvUnit);
	$("#"+rowNo+"_pmvValue").val(itemBean.pmvValue); 
	$("#"+rowNo+"_grossWeight").val( itemBean.grossWeight); 
	$("#"+rowNo+"_netWeight").val( itemBean.netWeight); 
	$("#"+rowNo+"_perUnit").val(itemBean.perUnit); 
	$("#"+rowNo+"_noOfPackages").val( itemBean.noOfPackages); 
	$("#"+rowNo+"_noOfPackPerUnit").val( itemBean.noOfPackPerUnit);
	$("#"+rowNo+"_fobValue").val(itemBean.fobValue); 
	$("#"+rowNo+"_dbkSrNo").val( itemBean.dbkSrNo);
	$("#"+rowNo+"_onWt").val( itemBean.onWt);
	$("#"+rowNo+"_dbkPerUnit").val( itemBean.dbkPerUnit);
	$("#"+rowNo+"_onFOB").val( itemBean.onFOB);
	$("#"+rowNo+"_dbkQuantity").val( itemBean.dbkQuantity); 
	$("#"+rowNo+"_dbkQtyPerUnit").val( itemBean.dbkQtyPerUnit);
	$("#"+rowNo+"_stateFOB").val( itemBean.stateFOB); 
	$("#"+rowNo+"_statePerQty").val( itemBean.statePerQty);
	$("#"+rowNo+"_stateWt").val( itemBean.stateWt); 
	$("#"+rowNo+"_stateAmt").val( itemBean.stateAmt); 
	$("#"+rowNo+"_jobNotificationNo").val( itemBean.jobNotificationNo);
	$("#"+rowNo+"_itemCodeStr").val( itemBean.itemCodeStr);
	$("#"+rowNo+"_itemCodeReward").val( itemBean.itemCodeReward); 
	$("#"+rowNo+"_stateFOBWt").val( itemBean.stateFOBWt); 
	$("#"+rowNo+"_endUse").val( itemBean.endUse); 
	$("#"+rowNo+"_accessoryState").val( itemBean.accessoryState);
	$("#"+rowNo+"_hawbNo").val( itemBean.hawbNo); 
	$("#"+rowNo+"_totalPackage").val( itemBean.totalPackage); 
	$("#"+rowNo+"_igstPaymentStatus").val( itemBean.igstPaymentStatus); 
	$("#"+rowNo+"_taxableValue").val( itemBean.taxableValue);
	$("#"+rowNo+"_igstAmount").val( itemBean.igstAmount);  
								
				tr.data('item-bean',itemBean);
				console.log("SUCCESS: ", data);				
			},
			error : function(e) {
				console.log("ERROR: ", e);				
			},
			done : function(e) {
				console.log("DONE");
			}
		});											
}
function delRows(){
	var deleteArrayList=[];
	rowIdList =[];
	$('#productDetailTable').find('input[type="checkbox"]:checked').each(function () {
		
		var rowNo =$(this).attr("id");
		var arr =rowNo.split("_");
		var tr = $("#"+arr[0]);
		var itemBn = tr.attr("item-bean");
		var itemBean = JSON.parse(itemBn);
		deleteArrayList.push(itemBean);  
		rowIdList.push(arr[0]); 
		//this is the current checkbox
	    });
	
	$.ajax({
		type : "POST",
		contentType:'application/json',
		url : "${pageContext.request.contextPath}/deleteProductDetails",
		data :  JSON.stringify(deleteArrayList),
		dataType : "json",
		headers: {
	        'X-CSRF-Token': token
	    },			
		success : function(data) {
			if(data =="success"){
				for (rowIdList in rowNo) {
					$("#"+rowNo).remove();
				}
				
			}
			console.log("SUCCESS: ", data);				
		},
		error : function(e) {
			console.log("ERROR: ", e);				
		},
		done : function(e) {
			console.log("DONE");
		}
	});
	
}
</script>

  </body>
</html>
