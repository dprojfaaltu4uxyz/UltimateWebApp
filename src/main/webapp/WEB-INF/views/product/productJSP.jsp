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

<title>Invoice</title>

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
<style type="text/css">
.side {
	position: fixed;
}

.scroll-area {
	width: 100%;
	height: calc(100% - 200px);
	margin-top: 100px;
	float: left;
	overflow-y: scroll;
}
</style>
<script>
	$(".form-control").css({'height': '21px!important' });
	$(".form-control").css({'width': '23%!important' });

</script>
</head>

<body class="full-width">

	<section id="container">
		<!--header start-->

		<!--header end-->
		<!--sidebar start-->

		<section id="main-content">

			<section class="wrapper">
				<div class="row">
					<div class="col-lg-12">
						<section class="panel">
							<header class="panel-heading"> Add Invoice Details Below
							</header>
							<div class="panel-body"
								style="padding: 60px; padding-top: 0px; padding-left: 10px; padding-bottom: 0px; padding-right: 10px;">
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
					<div class="col-lg-12">
						<section class="panel">
							<header class="panel-heading"> Product Details </header>
							<div class="panel-body">
								<!-- Select Basic -->
								<div class="form-group">
									<label class="col-md-1 " for="productName">Product Name
									</label>
									<div class="col-md-7">
										<input id="productName" path="productName" type="text"
											placeholder="Product Name" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="desc">Description </label>
									<div class="col-md-7">
										<input id="desc" path="desc" type="text"
											placeholder="Description" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="accessories">Accessories
									</label>
									<div class="col-md-5">
										<input id="accessories" path="accessories" type="text"
											placeholder="Accessories" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="pkgDetails">Pkg. Details</label>
									<div class="col-md-3">
										<input id="pkgDetails" path="pkgDetails" type="text"
											placeholder="Pkg. Details" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="ritcNo">RITC No</label>
									<div class="col-md-3">
										<input id="ritcNo" path="ritcNo" type="text"
											placeholder="RITC No" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="schemeCode">Scheme Code </label>
									<div class="col-md-3">
										<input id="schemeCode" path="schemeCode" type="text"
											placeholder="Scheme Code" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="category">Category, If
										NFEI</label>
									<div class="col-md-3">
										<input id="category" path="category" type="text"
											placeholder="Category" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="amount">Invoice No </label>
									<div class="col-md-3">
										<input id="invoiceNo" path="invoiceNo" type="text"
											placeholder="Invoice No" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="invDate">Date </label>
									<div class="col-md-3">
										<input id="invDate" path="invDate" type="text"
											placeholder="Date" class="form-control input-md date">
									</div>
									<label class="col-md-1 " for="qty">Quantity </label>
									<div class="col-md-3">
										<input id="qty" path="qty" type="text" placeholder="Quantity"
											class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="unit">Unit</label>
									<div class="col-md-3">
										<input id="unit" path="unit" type="text" placeholder="Unit"
											class="form-control input-md">
									</div>
									<label class="col-md-1 " for="itemRate">Item Rate</label>
									<div class="col-md-3">
										<input id="itemRate" path="itemRate" type="text"
											placeholder="Item Rate" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="per">Per </label>
									<div class="col-md-3">
										<input id="per" path="per" type="text" placeholder="Per"
											class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="goodsValue">Goods Value </label>
									<div class="col-md-3">
										<input id="goodsValue" path="goodsValue" type="text"
											placeholder="Goods Value" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="pmvValue">PMV </label>
									<div class="col-md-3">
										<input id="pmvValue" path="pmvValue" type="text"
											placeholder="PMV" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="pmvUnit">Unit </label>
									<div class="col-md-3">
										<input id="pmvUnit" path="pmvUnit" type="text"
											placeholder="Unit" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="grossWeight">Gross Weight
									</label>
									<div class="col-md-3">
										<input id="grossWeight" path="grossWeight" type="text"
											placeholder="Gross Weight" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="netWeight">Net Weight </label>
									<div class="col-md-3">
										<input id="netWeight" path="netWeight" type="text"
											placeholder="Net Weight" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="perUnit">/Unit </label>
									<div class="col-md-3">
										<input id="perUnit" path="perUnit" type="text"
											placeholder="/ Unit" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="noOfPackages">No. Of
										Packages </label>
									<div class="col-md-5">
										<input id="noOfPackages" path="noOfPackages" type="text"
											placeholder="No. of Packages" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="noOfPackPerUnit">/Unit </label>
									<div class="col-md-3">
										<input id="noOfPackPerUnit" path="noOfPackPerUnit" type="text"
											placeholder="/Unit" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="epcg">EPCG </label>
									<div class="col-md-5">
										<a href="#myModal" data-toggle="modal"
											class="btn btn-xs btn-success"> EPCG Licence Details </a>
									</div>
									<label class="col-md-1 " for="epcg">DEEC </label>
									<div class="col-md-5">
										<a href="#myModal" data-toggle="modal"
											class="btn btn-xs btn-success"> DEEC Licence Details </a>
									</div>
									<label class="col-md-1 " for="fobValue">FOB Value</label>
									<div class="col-md-3">
										<input id="fobValue" path="fobValue" type="text"
											placeholder="FOB Value" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="dbkSrNo">Drawback Sr.No</label>
									<div class="col-md-3">
										<input id="dbkSrNo" path="dbkSrNo" type="text"
											placeholder="Drawback Sr.No" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="onWt">On WT </label>
									<div class="col-md-3">
										<input id="onWt" path="onWt" type="text" placeholder="On WT"
											class="form-control input-md">
									</div>
									<label class="col-md-1 " for="dbkPerUnit">/Unit </label>
									<div class="col-md-3">
										<input id="dbkPerUnit" path="dbkPerUnit" type="text"
											placeholder="/Unit" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="onFOB">On FOB</label>
									<div class="col-md-3">
										<input id="onFOB" path="onFOB" type="text"
											placeholder="On FOB" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="dbkQuantity">Drawback
										Quantity </label>
									<div class="col-md-3">
										<input id="dbkQuantity" path="dbkQuantity" type="text"
											placeholder="Drawback Quantity" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="dbkQtyPerUnit">/Unit </label>
									<div class="col-md-3">
										<input id="dbkQtyPerUnit" path="dbkQtyPerUnit" type="text"
											placeholder="/Unit" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="stateFOB">State FOB %</label>
									<div class="col-md-3">
										<input id="stateFOB" path="stateFOB" type="text"
											placeholder="State FOB %" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="statePerQty">/ Quantity</label>
									<div class="col-md-3">
										<input id="statePerQty" path="statePerQty" type="text"
											placeholder="/ Quantity" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="stateWt">State FOB % on
										WT </label>
									<div class="col-md-3">
										<input id="stateWt" path="stateWt" type="text"
											placeholder="State FOB % on WT "
											class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="stateAmt">State Amount</label>
									<div class="col-md-5">
										<input id="stateAmt" path="stateAmt" type="text"
											placeholder="State Amount" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="epcg">DFIA </label>
									<div class="col-md-3">
										<a href="#myModal" data-toggle="modal"
											class="btn btn-xs btn-success"> DFIA Details </a>
									</div>
									<label class="col-md-1 " for="epcg">Job Work Details </label>
									<div class="col-md-3">
										<a href="#myModal" data-toggle="modal"
											class="btn btn-xs btn-success"> Job Work Details </a>
									</div>
									<label class="col-md-1 " for="jobNotificationNo">Job
										Notification No.</label>
									<div class="col-md-3">
										<input id="jobNotificationNo" path="jobNotificationNo"
											type="text" placeholder="Job Notification No."
											class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="itemCodeStr">Item Code as
										Per Str Directory</label>
									<div class="col-md-3">
										<input id="itemCodeStr" path="itemCodeStr" type="text"
											placeholder="Item Code as Per Str Directory"
											class="form-control input-md">
									</div>
									<label class="col-md-1 " for="itemCodeReward">Item Code
										as Per Reward Directory (MEIS)</label>
									<div class="col-md-3">
										<input id="itemCodeReward" path="itemCodeReward" type="text"
											placeholder="Item Code as Per Reward Directory (MEIS)"
											class="form-control input-md">
									</div>
									<label class="col-md-1 " for="stateFOBWt">State FOB %
										on WT </label>
									<div class="col-md-3">
										<input id="stateFOBWt" path="stateFOBWt" type="text"
											placeholder="State FOB % on WT "
											class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="endUse">End Use</label>
									<div class="col-md-3">
										<input id="endUse" path="endUse" type="text"
											placeholder="End Use" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="accessoryState">Accessory
										Status</label>
									<div class="col-md-3">
										<input id="accessoryState" path="accessoryState" type="text"
											placeholder="Accessory Status" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="hawbNo">HAWB No </label>
									<div class="col-md-3">
										<input id="hawbNo" path="hawbNo" type="text"
											placeholder="HAWB No" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for="totalPackage">Total
										Package</label>
									<div class="col-md-3">
										<input id="totalPackage" path="totalPackage" type="text"
											placeholder="Total Package" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="igstPaymentStatus">IGST
										Payment Status</label>
									<div class="col-md-3">
										<input id="igstPaymentStatus" path="igstPaymentStatus"
											type="text" placeholder="IGST Payment Status"
											class="form-control input-md">
									</div>
									<label class="col-md-1 " for="taxableValue">Taxable
										Value </label>
									<div class="col-md-3">
										<input id="taxableValue" path="taxableValue" type="text"
											placeholder="Taxable Value" class="form-control input-md">
									</div>
									<label class="col-md-1 " for="igstAmount">IGST Amount</label>
									<div class="col-md-3">
										<input id="igstAmount" path="igstAmount" type="text"
											placeholder="IGST Amount" class="form-control input-md">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-1 " for=productDetails>Product
										Details </label>
									<div class="col-md-5">
										<textarea class="form-control custom-control" rows="1"
											name="productDetails" id="productDetails"
											style="height: 80px"></textarea>
									</div>
								</div>
								<input type="hidden" id="rowId" value=""></input>
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

									</ul>
								</div>

								<fieldset title="Additional Details" class="step"
									id="default-step-2">
									<legend> </legend>
									<!-- Select Basic -->
									<div class="form-group">
										<label class="col-md-1 " for="consignee">Consignee (*)</label>
										<div class="col-md-3">
											<input id="consignee" name="consignee" type="text"
												placeholder="Consignee" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="consigneeAddress">Address
											(*)</label>
										<div class="col-md-7">
											<input id="consigneeAddress" name="consigneeAddress"
												type="text" placeholder="Address"
												class="form-control input-md">
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 " for="country">Country (*)</label>
										<div class="col-md-7">
											<input id="country" name="country" type="text"
												placeholder="Country" class="form-control input-md">
										</div>
										<label class="col-md-1 label_check" for="consigneeBuyerSame">(*)
											Is Consignee & Buyer Same?</label>
										<div class="col-md-3">
											<div class="checkboxes">
												<input name="consigneeBuyerSame" id="consigneeBuyerSame"
													value="1" type="checkbox"> Is Consignee & Buyer
												Same?
											</div>
										</div>
									</div>


									<!-- Select Basic -->
									<div class="form-group">
										<label class="col-md-1 " for="buyer">Buyer (*)</label>
										<div class="col-md-3">
											<input id="buyer" name="buyer" type="text"
												placeholder="Buyer" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="buyerAddress">Address
											(*)</label>
										<div class="col-md-7">
											<input id="buyerAddress" name="buyerAddress" type="text"
												placeholder="Address" class="form-control input-md">
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 " for="buyerCountry">Country
											(*)</label>
										<div class="col-md-7">
											<input id="buyerCountry" name="buyerCountry" type="text"
												placeholder="Country" class="form-control input-md">
										</div>
										<label class="col-md-1 label_check" for="pmvRequired">(*)
											Shall itemwise PMV required?</label>
										<div class="col-md-3">
											<div class="checkboxes">
												<input name="pmvRequired" id="pmvRequired" value="1"
													type="checkbox"> Shall itemwise PMV required?
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 " for="productHead">Product
											Head</label>
										<div class="col-md-7">
											<input id="productHead" name="productHead" type="text"
												placeholder="Product Head" class="form-control input-md">
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
								<fieldset title="Doc And Agency Details" class="step"
									id="default-step-1">
									<legend> </legend>

									<div class="form-group">
										<label class="col-md-1 " for="accountPartyName">Account/Party
											Name (*)</label>
										<div class="col-md-3">
											<input id="accountPartyName" name="accountPartyName"
												type="text" placeholder="Account/Party Name"
												class="form-control input-md">
										</div>
										<label class="col-md-1 " for="service">Service </label>
										<div class="col-md-3">
											<input id="service" name="service" type="text"
												placeholder="Service" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="organization">Organization
											(*)</label>
										<div class="col-md-3">
											<input id="Organization" name="organization" type="text"
												placeholder="Organization" class="form-control input-md">
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 " for="partyAddress">Address
											(*)</label>
										<div class="col-md-7">
											<input id="partyAddress" name="partyAddress" type="text"
												placeholder="partyAddress" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="grBank">GR Bank </label>
										<div class="col-md-3">
											<input id="grBank" name="grBank" type="text"
												placeholder="GR Bank" class="form-control input-md">
										</div>
									</div>

									<!-- Select Basic -->
									<div class="form-group">
										<label class="col-md-1" for="stateOfOriginOfGoods">State
											of Origin of Goods</label>
										<div class="col-md-7">
											<input id="stateOfOriginOfGoods" name="stateOfOriginOfGoods"
												type="text" placeholder="State of Origin of Goods"
												class="form-control input-md">
										</div>
										<label class="col-md-1 " for="branchNo">Branch No</label>
										<div class="col-md-1">
											<input id="branchNo" name="branchNo" type="text"
												placeholder="Branch No" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="itemCode">Item code as
											per Reward Directory (MEIS)</label>
										<div class="col-md-1">
											<input id="itemCode" name="itemCode" type="text"
												placeholder="Item Code" class="form-control input-md">
										</div>
									</div>


									<!-- Text input-->
									<div class="form-group">
										<label class="col-md-1 " for="iecCodeNo">IEC Code No</label>
										<div class="col-md-3">
											<input id="iecCodeNo" name="iecCodeNo" type="text"
												placeholder="IEC Code No" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="panNo">PAN No</label>
										<div class="col-md-3">
											<input id="panNo" name="panNo" type="text"
												placeholder="PAN No" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="category">Category</label>
										<div class="col-md-3">
											<input id="category" name="category" type="text"
												placeholder="Category" class="form-control input-md">
										</div>

										<!-- Multiple Radios (inline) 

                                    <label class="col-md-1 " for="radios">Inline Radios</label>
                                    <div class="col-md-3"> 
                                        <label class="radio-inline" for="radios-0">
                                        <input type="radio" name="radios" id="radios-0" value="1" checked="checked">
                                        Yes
                                        </label> 
                                        <label class="radio-inline" for="radios-1">
                                        <input type="radio" name="radios" id="radios-1" value="2">
                                        No
                                        </label> 
                                    </div>-->

									</div>
									<div class="form-group">
										<label class="col-md-1 " for="exporterClass">Exporter
											Class</label>
										<div class="col-md-3">
											<input id="exporterClass" name="exporterClass" type="text"
												placeholder="Exporter Class" class="form-control input-md">
										</div>
									</div>

									<div class="form-group">
										<label class="col-md-1 " for="natureOfPayment">Nature
											Of Payment</label>
										<div class="col-md-3">
											<input id="natureOfPayment" name="natureOfPayment"
												type="text" placeholder="Nature Of Payment"
												class="form-control input-md">
										</div>
										<label class="col-md-1 " for="bankName">Bank Name</label>
										<div class="col-md-3">
											<input id="bankName" name="bankName" type="text"
												placeholder="Bank Name" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="periodPfPaymentInDays">Period
											Of Payment In Days</label>
										<div class="col-md-3">
											<input id="periodPfPaymentInDays"
												name="periodPfPaymentInDays" type="text"
												placeholder="Period Of Payment In Days"
												class="form-control input-md">
										</div>

									</div>
									<div class="form-group">

										<label class="col-md-1 " for="exportContactNo">Export
											Contact No.</label>
										<div class="col-md-3">
											<input id="exportContactNo" name="exportContactNo"
												type="text" placeholder="Export Contact No"
												class="form-control input-md">
										</div>

										<label class="col-md-1 " for="drawbackBankAccount">Drawback
											Bank Account</label>
										<div class="col-md-3">
											<input id="drawbackBankAccount" name="drawbackBankAccount"
												type="text" placeholder="Drawback Bank Account"
												class="form-control input-md">
										</div>

									</div>
								</fieldset>
								<fieldset title="Re-Export" class="step" id="default-step-2">
									<legend> </legend>

									<div class="form-group">
										<label class="col-md-1 " for="accountPartyName">Account/Party
											Name (*)</label>
										<div class="col-md-3">
											<input id="accountPartyName" name="accountPartyName"
												type="text" placeholder="Account/Party Name"
												class="form-control input-md">
										</div>
										<label class="col-md-1 " for="service">Service </label>
										<div class="col-md-3">
											<input id="service" name="service" type="text"
												placeholder="Service" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="organization">Organization
											(*)</label>
										<div class="col-md-3">
											<input id="Organization" name="organization" type="text"
												placeholder="Organization" class="form-control input-md">
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-1 " for="partyAddress">Address
											(*)</label>
										<div class="col-md-7">
											<input id="partyAddress" name="partyAddress" type="text"
												placeholder="partyAddress" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="grBank">GR Bank </label>
										<div class="col-md-3">
											<input id="grBank" name="grBank" type="text"
												placeholder="GR Bank" class="form-control input-md">
										</div>
									</div>

									<!-- Select Basic -->
									<div class="form-group">
										<label class="col-md-1" for="stateOfOriginOfGoods">State
											of Origin of Goods</label>
										<div class="col-md-7">
											<input id="stateOfOriginOfGoods" name="stateOfOriginOfGoods"
												type="text" placeholder="State of Origin of Goods"
												class="form-control input-md">
										</div>
										<label class="col-md-1 " for="branchNo">Branch No</label>
										<div class="col-md-1">
											<input id="branchNo" name="branchNo" type="text"
												placeholder="Branch No" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="itemCode">Item code as
											per Reward Directory (MEIS)</label>
										<div class="col-md-1">
											<input id="itemCode" name="itemCode" type="text"
												placeholder="Item Code" class="form-control input-md">
										</div>
									</div>


									<!-- Text input-->
									<div class="form-group">
										<label class="col-md-1 " for="iecCodeNo">IEC Code No</label>
										<div class="col-md-3">
											<input id="iecCodeNo" name="iecCodeNo" type="text"
												placeholder="IEC Code No" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="panNo">PAN No</label>
										<div class="col-md-3">
											<input id="panNo" name="panNo" type="text"
												placeholder="PAN No" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="category">Category</label>
										<div class="col-md-3">
											<input id="category" name="category" type="text"
												placeholder="Category" class="form-control input-md">
										</div>

										<!-- Multiple Radios (inline) 

                                    <label class="col-md-1 " for="radios">Inline Radios</label>
                                    <div class="col-md-3"> 
                                        <label class="radio-inline" for="radios-0">
                                        <input type="radio" name="radios" id="radios-0" value="1" checked="checked">
                                        Yes
                                        </label> 
                                        <label class="radio-inline" for="radios-1">
                                        <input type="radio" name="radios" id="radios-1" value="2">
                                        No
                                        </label> 
                                    </div>-->

									</div>
									<div class="form-group">
										<label class="col-md-1 " for="exporterClass">Exporter
											Class</label>
										<div class="col-md-3">
											<input id="exporterClass" name="exporterClass" type="text"
												placeholder="Exporter Class" class="form-control input-md">
										</div>
									</div>

									<div class="form-group">
										<label class="col-md-1 " for="natureOfPayment">Nature
											Of Payment</label>
										<div class="col-md-3">
											<input id="natureOfPayment" name="natureOfPayment"
												type="text" placeholder="Nature Of Payment"
												class="form-control input-md">
										</div>
										<label class="col-md-1 " for="bankName">Bank Name</label>
										<div class="col-md-3">
											<input id="bankName" name="bankName" type="text"
												placeholder="Bank Name" class="form-control input-md">
										</div>
										<label class="col-md-1 " for="periodPfPaymentInDays">Period
											Of Payment In Days</label>
										<div class="col-md-3">
											<input id="periodPfPaymentInDays"
												name="periodPfPaymentInDays" type="text"
												placeholder="Period Of Payment In Days"
												class="form-control input-md">
										</div>

									</div>
									<div class="form-group">

										<label class="col-md-1 " for="exportContactNo">Export
											Contact No.</label>
										<div class="col-md-3">
											<input id="exportContactNo" name="exportContactNo"
												type="text" placeholder="Export Contact No"
												class="form-control input-md">
										</div>

										<label class="col-md-1 " for="drawbackBankAccount">Drawback
											Bank Account</label>
										<div class="col-md-3">
											<input id="drawbackBankAccount" name="drawbackBankAccount"
												type="text" placeholder="Drawback Bank Account"
												class="form-control input-md">
										</div>

									</div>
								</fieldset>
								<div class="form-group">
									<div class="col-lg-offset-2 col-md-6">
										<button id="addBttn1" class="btn btn-danger"
											style="float: right" onclick="saveRows();" type="button">Save</button>
										<button id="editBttn1" class="btn btn-danger"
											style="float: right" onclick="updateRows();" type="button">Update</button>
									</div>
								</div>

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

	<script type="text/javascript"
		src="<c:url value='/static/assets/bootstrap-datepicker/js/bootstrap-datepicker.js'/>"></script>

	<!--select2-->
	<script>

$('.invDate').datepicker({
    autoclose: true
});

var rowNo = 0;
function saveRows() {
	//$('#editBttn').hide();
  rowNo++;
  var text = {'id':rowNo,'pdtId': null,'productName':$('#productName').val(),'desc':$('#desc').val().trim(),'accessories': $("input[name=accessories]").val(),'pkgDetails': $("input[name=pkgDetails]").val(),'ritcNo':$("input[name=ritcNo]").val(),'schemeCode':$("input[name=schemeCode]").val(),'category':$("input[name=category]").val(),'invoiceNo':$("input[name=invoiceNo]").val(),'invDate':$("input[name=invDate]").val(),'qty':$("input[name=qty]").val(),'unit':$("input[name=unit]").val(),'itemRate':$("input[name=itemRate]").val(),'per':$("input[name=per]").val(),'goodsValue':$("input[name=goodsValue]").val(),'pmvUnit':$("input[name=pmvUnit]").val(),'pmvValue':$("#pmvValue").val(),'grossWeight':$("input[name=grossWeight]").val(),'netWeight':$("input[name=netWeight]").val(),'perUnit':$("#perUnit").val(),'noOfPackages':$("input[name=noOfPackages]").val(),'noOfPackPerUnit':$("input[name=noOfPackPerUnit]").val(),'fobValue':$("#fobValue").val(),'dbkSrNo':$("input[name=dbkSrNo]").val(),'onWt':$("input[name=onWt]").val(),'dbkPerUnit':$("input[name=dbkPerUnit]").val(),'onFOB':$("input[name=onFOB]").val(),'dbkQuantity':$("input[name=dbkQuantity]").val(),'dbkQtyPerUnit':$("input[name=dbkQtyPerUnit]").val(),'stateFOB':$("input[name=stateFOB]").val(),'statePerQty':$("input[name=statePerQty]").val(),'stateWt':$("input[name=stateWt]").val(),'stateAmt':$("input[name=stateAmt]").val(),'jobNotificationNo':$("input[name=jobNotificationNo]").val(),'itemCodeStr':$("input[name=itemCodeStr]").val(),'itemCodeReward':$("input[name=itemCodeReward]").val(),'stateFOBWt':$("input[name=stateFOBWt]").val(),'endUse':$("input[name=endUse]").val(),'accessoryState':$("input[name=accessoryState]").val(),'hawbNo':$("input[name=hawbNo]").val(),'totalPackage':$("input[name=totalPackage]").val(),'igstPaymentStatus':$("input[name=igstPaymentStatus]").val(),'taxableValue':$("input[name=taxableValue]").val(),'igstAmount':$("input[name=igstAmount]").val()};
 
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
			var cell01 = "<td id='"+rowNo+"_desc' column='description'><a href='#' onclick='editData("+rowNo+");'>"+$('textarea#desc').val() +"</td> ";
		  	var cell02 = "<td id='"+rowNo+"_productName' column ='productName'>"+$("input[name=productName]").val(); +"</td>";
		  	var cell03 = "<td id='"+rowNo+"_accessories'   column ='accessories'>"+$("input[name=accessories]").val(); +"</td>";
		  	var cell04 = "<td id='"+rowNo+"_pkgDetails'  column ='pkgDetails'>"+$("input[name=pkgDetails]").val(); +"</td>";
		  	var cell05 = "<td id='"+rowNo+"_ritcNo'   column ='ritcNo'>"+$("input[name=ritcNo]").val(); +"</td>";
		  	var cell06 = "<td id='"+rowNo+"_schemeCode'   column ='schemeCode'>"+$("input[name=schemeCode]").val(); +"</td>";
		  	var cell07 = "<td id='"+rowNo+"_category'  column ='category'>"+$("input[name=category]").val(); +"</td>";
		  	var cell08 = "<td id='"+rowNo+"_invoiceNo'  column ='invoiceNo'>"+$("input[name=invoiceNo]").val(); +"</td>";
		  	var cell09 = "<td id='"+rowNo+"_invDate'  column ='invDate'>"+$("input[name=invDate]").val(); +"</td>";
		  	var cell10 = "<td id='"+rowNo+"_qty'  column ='qty'>"+$("input[name=qty]").val(); +"</td>";
		  	var cell11 = "<td id='"+rowNo+"_unit'  column ='unit'>"+$("input[name=unit]").val(); +"</td>";
		  	var cell12 = "<td id='"+rowNo+"_itemRate'  column ='itemRate'>"+$("input[name=itemRate]").val(); +"</td>";
		  	var cell13 = "<td id='"+rowNo+"_per'  column ='per'>"+$("input[name=per]").val(); +"</td>";
		  	var cell14 = "<td id='"+rowNo+"_goodsValue'  column ='goodsValue'>"+$("input[name=goodsValue]").val(); +"</td>";
		  	var cell15 = "<td id='"+rowNo+"_pmvUnit'  column ='pmvUnit'>"+$("input[name=pmvUnit]").val(); +"</td>";
		  	var cell16 = "<td id='"+rowNo+"_pmvValue'  column ='pmvValue'>"+$("input[name=pmvValue]").val(); +"</td>";
		  	var cell17 = "<td id='"+rowNo+"_grossWeight'  column ='grossWeight'>"+$("input[name=grossWeight]").val(); +"</td>";
		  	var cell18 = "<td id='"+rowNo+"_netWeight'  column ='netWeight'>"+$("input[name=netWeight]").val(); +"</td>";
		  	var cell19 = "<td id='"+rowNo+"_perUnit'  column ='perUnit'>"+$("input[name=perUnit]").val(); +"</td>";
		  	var cell20 = "<td id='"+rowNo+"_pmUnit'  column ='pmUnit'>"+$("input[name=pmUnit]").val(); +"</td>";
		  	var cell21 = "<td id='"+rowNo+"_noOfPackages'  column ='noOfPackages'>"+$("#noOfPackages").val(); +"</td>";
		  	var cell22 = "<td id='"+rowNo+"_noOfPackPerUnit'  column ='noOfPackPerUnit'>"+$("input[name=noOfPackPerUnit]").val(); +"</td>";
		  	var cell23 = "<td id='"+rowNo+"_fobValue'  column ='fobValue'>"+$("input[name=fobValue]").val(); +"</td>";
		  	var cell24 = "<td id='"+rowNo+"_dbkSrNo'  column ='dbkSrNo'>"+$("input[name=dbkSrNo]").val(); +"</td>";
		  	var cell25 = "<td id='"+rowNo+"_onWt'  column ='onWt'>"+$("input[name=onWt]").val(); +"</td>";
		  	var cell26 = "<td id='"+rowNo+"_dbkPerUnit'  column ='dbkPerUnit'>"+$("input[name=dbkPerUnit]").val(); +"</td>";
		  	var cell27 = "<td id='"+rowNo+"_onFOB'  column ='onFOB'>"+$("input[name=onFOB]").val(); +"</td>";
		  	var cell28 = "<td id='"+rowNo+"_dbkQuantity'  column ='dbkQuantity'>"+$("input[name=dbkQuantity]").val(); +"</td>";
		  	var cell29 = "<td id='"+rowNo+"_dbkQtyPerUnit'  column ='dbkQtyPerUnit'>"+$("input[name=dbkQtyPerUnit]").val(); +"</td>";
		  	var cell30 = "<td id='"+rowNo+"_stateFOB'  column ='stateFOB'>"+$("input[name=stateFOB]").val(); +"</td>";
		  	var cell31 = "<td id='"+rowNo+"_statePerQty'  column ='statePerQty'>"+$("input[name=statePerQty]").val(); +"</td>";
		  	var cell32 = "<td id='"+rowNo+"_statePerQty'  column ='statePerQty'>"+$("input[name=statePerQty]").val(); +"</td>";
		  	var cell33 = "<td id='"+rowNo+"_stateWt'  column ='stateWt'>"+$("input[name=stateWt]").val(); +"</td>";
		  	var cell34 = "<td id='"+rowNo+"_stateAmt'  column ='stateAmt'>"+$("input[name=stateAmt]").val(); +"</td>";
		  	var cell35 = "<td id='"+rowNo+"_jobNotificationNo'  column ='jobNotificationNo'>"+$("input[name=jobNotificationNo]").val(); +"</td>";
		  	var cell36 = "<td id='"+rowNo+"_itemCodeStr'  column ='itemCodeStr'>"+$("input[name=itemCodeStr]").val(); +"</td>";
			var cell37 = "<td id='"+rowNo+"_itemCodeReward'  column ='itemCodeReward'>"+$("input[name=itemCodeReward]").val(); +"</td>";
			var cell38 = "<td id='"+rowNo+"_stateFOBWt'  column ='stateFOBWt'>"+$("input[name=stateFOBWt]").val(); +"</td>";
			var cell39 = "<td id='"+rowNo+"_endUse'  column ='endUse'>"+$("input[name=endUse]").val(); +"</td>";
			var cell40 = "<td id='"+rowNo+"_accessoryState'  column ='accessoryState'>"+$("input[name=accessoryState]").val(); +"</td>";
			var cell41 = "<td id='"+rowNo+"_hawbNo'  column ='hawbNo'>"+$("input[name=hawbNo]").val(); +"</td>";
			var cell42 = "<td id='"+rowNo+"_totalPackage'  column ='totalPackage'>"+$("input[name=totalPackage]").val(); +"</td>";
			var cell43 = "<td id='"+rowNo+"_igstPaymentStatus'  column ='igstPaymentStatus'>"+$("input[name=igstPaymentStatus]").val(); +"</td>";
			var cell44 = "<td id='"+rowNo+"_taxableValue'  column ='taxableValue'>"+$("input[name=taxableValue]").val(); +"</td>";
			var cell45 = "<td id='"+rowNo+"_igstAmount'  column ='igstAmount'>"+$("input[name=igstAmount]").val(); +"</td>";
			
		  	var deleteRow = "<button id='delButton' class='btn default' onclick='deleteRow($(this));'>delete</button>"
		  	var row = "<tr  data-row='data-bean' item-bean ="+JSON.stringify(text)+" id='"+rowNo+"'>"+checkbox+cell01+cell02+cell03+cell04+cell05+cell06+cell07+cell08+cell09+cell10+cell11+cell12+cell13+cell14+cell15+cell16+cell17+cell18+cell19+cell20+cell21+cell22+cell23+cell24+cell25+cell26+cell27+cell28+cell29+cell30+cell31+cell32+cell33+cell34+cell35+cell36+cell37+cell38+cell39+cell40+cell41+cell42+cell43+cell44+cell45+"</tr>";
		      $("#productDetailTable tbody").after(row);
			console.log("SUCCESS: ", invId);
			
		},
		error : function(e) {
			console.log("ERROR: ", e);				
		},
		done : function(e) {
			console.log("DONE");
		}
	});             
	
}


<script type="text/javascript" src="<c:url value='/static/assets/bootstrap-datepicker/js/bootstrap-datepicker.js'/>"></script>

	<!--right slidebar-->
	<script src="<c:url value='/static/js/slidebars.min.js' />"></script>

	<!--script for this page-->
	<script src="<c:url value='/static/js/jquery.stepy.js' />"></script>

	<!--common script for all pages-->
	<script src="<c:url value='/static/js/common-scripts.js' />"></script>


	<!--toastr-->
	<script src="<c:url value='/static/assets/toastr-master/toastr.js'/>"></script>

	<script src="<c:url value='/static/js/bootstrap3-typeahead.min.js'/>"></script>
	<script src="<c:url value='/static/js/jquery.easy-autocomplete.js'/>"></script>

	<script src="<c:url value='/static/js/masters/party.js'/>"></script>

	<script>

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
	</script>

</body>
</html>
