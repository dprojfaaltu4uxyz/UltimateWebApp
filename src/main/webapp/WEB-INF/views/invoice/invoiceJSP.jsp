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
    <script>
	$(".form-control").css({'height': '21px!important' });
	$(".form-control").css({'width': '23%!important' });

</script>
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
                          <table id="invTable" class="table table-striped">
											<thead>
												<tr data-row='data-row'>
													<th>Description</th>
													<th>Rate</th>
													<th>QTY</th>
													<th>CURRENCY</th>
													<th>Ex Rate</th>
													<th>Rate X Qty</th>
													<th>Amount</th>
													<th>Date</th>
													<th>Gross Weight</th>
													<th>Net Unit</th>
													<th>Goods Value</th>
													<th>Nature of Contract</th>
													<th>Freight</th>
													<th>Unit</th>
													<th>Actual Freight</th>
													<th>Insurance</th>
													<th>Unit</th>
													<th>Actual Insurance</th>
													<th>Packaging and Misc</th>
													<th>Unit</th>
													<th>Actual PM</th>
													<th>Other Charges</th>
													<th>Unit</th>
													<th>FOB Value</th>
													<th>PMV Rate</th>
													<th>PMV Unit</th>
													<th>PMV Value</th>
												</tr>
											</thead>
											<tbody>
										</table>
										</div>
                          </div>
		  	   </section>
                  </div>
                  </div>
                  
                  
               <div class="row">
                    <div class="col-lg-12">
                        <section class="panel">
                            <header class="panel-heading">
                                Invoice Details
                            </header>

                            <div class="panel-body">

                                <form class="form-horizontal" id="default">
                                     <!-- Select Basic -->
                                    <div class="form-group">
                                        <label class="col-md-1 " for="desc">Description </label>
                                        <div class="col-md-3">
                                            <input id="desc" name="desc" type="text" placeholder="Description" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="rate">Rate </label>
                                        <div class="col-md-3">
                                            <input id="rate" name="rate" type="text" placeholder="Rate" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="qty">QTY </label>
                                        <div class="col-md-3">
                                            <input id="qty" name="qty" type="text" placeholder="Job No" class="form-control input-md">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="currency">Currency </label>
                                        <div class="col-md-3">
                                            <input id="currency" name="currency" type="text" placeholder="Currency" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="exRate">Ex Rate </label>
                                        <div class="col-md-3">
                                            <input id="exRate" name="exRate" type="text" placeholder="Ex Rate" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="rateXqty">Rate X Qty</label>
                                        <div class="col-md-3">
                                            <input id="rateXqty" name="rateXqty" type="text" placeholder="Rate X Qty" class="form-control input-md">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="amount">Amount </label>
                                        <div class="col-md-3">
                                            <input id="amount" name="amount" type="text" placeholder="Amount" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="date">Date </label>
                                        <div class="col-md-3">
                                            <input id="date" name="date" type="text" placeholder="Date" class="form-control input-md date	">
                                        </div>
                                        <label class="col-md-1 " for="grossWeight">Gross Weight </label>
                                        <div class="col-md-3">
                                            <input id="grossWeight" name="grossWeight" type="text" placeholder="Gross Weight" class="form-control input-md">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="netUnit">Net Unit </label>
                                        <div class="col-md-3">
                                            <input id="netUnit" name="netUnit" type="text" placeholder="Net Unit" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="goodsValue">Goods Value </label>
                                        <div class="col-md-3">
                                            <input id="goodsValue" name="goodsValue" type="text" placeholder="Goods Value" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="natureOfContract">Nature of Contract </label>
                                        <div class="col-md-3">
                                            <input id="natureOfContract" name="natureOfContract" type="text" placeholder="Nature of Contract" class="form-control input-md">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="freight">Freight </label>
                                        <div class="col-md-3">
                                            <input id="freight" name="freight" type="text" placeholder="Freight" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="unit">Unit </label>
                                        <div class="col-md-3">
                                            <input id="unit" name="unit" type="text" placeholder="Unit" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="actualFreight">Actual Freight </label>
                                        <div class="col-md-3">
                                             <div class="checkboxes">
                                                    <input name="actualFreight" id="actualFreight" value="1" type="checkbox" /> Actual Freight
                                               </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="freight">Insurance </label>
                                        <div class="col-md-3">
                                            <input id="insurance" name="insurance" type="text" placeholder="Insurance" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="insuranceUnit">Unit </label>
                                        <div class="col-md-3">
                                            <input id="insuranceUnit" name="insuranceUnit" type="text" placeholder="Unit" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="actualInsurance">Actual Insurance </label>
                                        <div class="col-md-3">
                                             <div class="checkboxes">
                                                    <input name="actualInsurance" id="actualInsurance" value="1" type="checkbox" /> Actual Insurance
                                               </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="freight">Packaging and Misc </label>
                                        <div class="col-md-3">
                                            <input id="packagingAndMisc" name="packagingAndMisc" type="text" placeholder="Packaging and Misc" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="pmUnit">Unit </label>
                                        <div class="col-md-3">
                                            <input id="pmUnit" name="pmUnit" type="text" placeholder="Unit" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="actualInsurance">Actual PM </label>
                                        <div class="col-md-3">
                                             <div class="checkboxes">
                                                    <input name="actualPM" id="actualPM" value="1" type="checkbox" /> Actual PM
                                               </div>
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-md-1 " for="freight">Other Charges </label>
                                        <div class="col-md-3">
                                            <input id="otherCharges" name="otherCharges" type="text" placeholder="Other Charges" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="otherUnit">Unit </label>
                                        <div class="col-md-3">
                                            <input id="otherUnit" name="otherUnit" type="text" placeholder="Unit" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="fobValue">FOB Value</label>
                                        <div class="col-md-3">
                                              <input id="fobValue" name="fobValue" type="text" placeholder="FOB Value" class="form-control input-md">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-1 " for="pmvRate">PMV Rate </label>
                                        <div class="col-md-3">
                                            <input id="pmvRate" name="pmvRate" type="text" placeholder="PMV Rate" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="pmvUnit">PMV Unit </label>
                                        <div class="col-md-3">
                                            <input id="pmvUnit" name="pmvUnit" type="text" placeholder="PMV Unit" class="form-control input-md">
                                        </div>
                                        <label class="col-md-1 " for="pmvValue">PMV Value</label>
                                        <div class="col-md-3">
                                              <input id="pmvValue" name="pmvValue" type="text" placeholder="PMV Rate" class="form-control input-md">
                                        </div>
                                    </div>
                                    <input type="hidden" id="rowId" value=""></input>
                                    <div class="form-group">
                                    	<div class="col-lg-offset-2 col-md-6">
                                    	 <button id="addBttn" class="btn btn-danger" onclick="addRows();" type="button">Save</button>
                                    	 <button id="editBttn" class="btn btn-danger" onclick="editRows();" type="button">Update</button>
                                    	 <button id="delBttn" class="btn btn-danger"  onclick="delRows();" type="button">Delete</button>
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
$('.date').datepicker({
    autoclose: true
});
var token = $("meta[name='_csrf']").attr("content"); 
var rowNo = 0;
$(document).ready(function(){
	$.ajax({	
		type: 'GET',
		dataType: 'json',
		contentType:'application/json',
		url: "${pageContext.request.contextPath}/invoicelist",
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
	var text = {'id':rowNo,'invId': itemBean.invId,'desc':itemBean.desc.trim(),'rate': itemBean.rate,'qty': itemBean.qty,'currency':itemBean.currency,'exRate':itemBean.exRate,'rateXqty':itemBean.rateXqty ,'amount':itemBean.amount,'date':itemBean.date,'grossWeight':itemBean.grossWeight, 'netUnit':itemBean.netUnit, 'goodsValue':itemBean.goodsValue,'natureOfContract':itemBean.natureOfContract,'freight':itemBean.freight,  'unit':itemBean.unit,  'actualFreight':itemBean.actualFreight,  'insurance':itemBean.insurance, 'insuranceUnit':itemBean.insuranceUnit,'actualInsurance':itemBean.actualInsurance, 'packagingAndMisc':itemBean.packagingAndMisc, 'pmUnit':itemBean.pmUnit, 'actualPM':itemBean.actualPM, 'otherCharges':itemBean.otherCharges,'otherUnit':itemBean.otherUnit,  'fobValue':itemBean.fobValue,  'pmvRate':itemBean.pmvRate, 'pmvUnit':itemBean.pmvUnit, 'pmvValue':itemBean.pmvValue};
	
	var checkbox = "<td><input type='checkbox' id='"+rowNo+"_check' value='"+rowNo+"'/></td>";
	var cell01 = "<td id='"+rowNo+"_desc' column='description'><a href='#' onclick='editData("+rowNo+");'>"+itemBean.desc+"</td> ";
  	var cell02 = "<td id='"+rowNo+"_rate' column ='rate'>"+itemBean.rate+"</td>";
  	var cell03 = "<td id='"+rowNo+"_qty'   column ='qty'>"+itemBean.qty +"</td>";
  	var cell04 = "<td id='"+rowNo+"_currency'  column ='currency'>"+ itemBean.currency+"</td>";
  	var cell05 = "<td id='"+rowNo+"_exRate'   column ='exRate'>"+itemBean.exRate+"</td>";
  	var cell06 = "<td id='"+rowNo+"_rateXqty'   column ='rateXqty'>"+itemBean.rateXqty +"</td>";
  	var cell07 = "<td id='"+rowNo+"_amount'  column ='amount'>"+itemBean.amount+"</td>";
  	var cell08 = "<td id='"+rowNo+"_date'  column ='date'>"+itemBean.date +"</td>";
  	var cell09 = "<td id='"+rowNo+"_grossWeight'  column ='grossWeight'>"+itemBean.grossWeight +"</td>";
  	var cell10 = "<td id='"+rowNo+"_netUnit'  column ='netUnit'>"+itemBean.netUnit +"</td>";
  	var cell11 = "<td id='"+rowNo+"_goodsValue'  column ='goodsValue'>"+itemBean.goodsValue +"</td>";
  	var cell12 = "<td id='"+rowNo+"_natureOfContract'  column ='natureOfContract'>"+itemBean.natureOfContract +"</td>";
  	var cell13 = "<td id='"+rowNo+"_freight'  column ='freight'>"+itemBean.freight +"</td>";
  	var cell14 = "<td id='"+rowNo+"_unit'  column ='unit'>"+itemBean.unit +"</td>";
  	var cell15 = "<td id='"+rowNo+"_actualFreight'  column ='actualFreight'>"+itemBean.actualFreight +"</td>";
  	var cell16 = "<td id='"+rowNo+"_insurance'  column ='insurance'>"+itemBean.insurance +"</td>";
  	var cell17 = "<td id='"+rowNo+"_insuranceUnit'  column ='insuranceUnit'>"+itemBean.insuranceUnit +"</td>";
  	var cell18 = "<td id='"+rowNo+"_actualInsurance'  column ='actualInsurance'>"+itemBean.actualInsurance +"</td>";
  	var cell19 = "<td id='"+rowNo+"_packagingAndMisc'  column ='packagingAndMisc'>"+itemBean.packagingAndMisc +"</td>";
  	var cell20 = "<td id='"+rowNo+"_pmUnit'  column ='pmUnit'>"+itemBean.pmUnit +"</td>";
  	var cell21 = "<td id='"+rowNo+"_actualPM'  column ='actualPM'>"+itemBean.actualPM +"</td>";
  	var cell22 = "<td id='"+rowNo+"_otherCharges'  column ='otherCharges'>"+itemBean.otherCharges +"</td>";
  	var cell23 = "<td id='"+rowNo+"_otherUnit'  column ='otherUnit'>"+itemBean.otherUnit +"</td>";
  	var cell24 = "<td id='"+rowNo+"_fobValue'  column ='fobValue'>"+itemBean.fobValue +"</td>";
  	var cell25 = "<td id='"+rowNo+"_pmvRate'  column ='pmvRate'>"+itemBean.pmvRate+"</td>";
  	var cell26 = "<td id='"+rowNo+"_pmvUnit'  column ='pmvUnit'>"+itemBean.pmvUnit+"</td>";
  	var cell27 = "<td id='"+rowNo+"_pmvValue'  column ='pmvValue'>"+itemBean.pmvValue+"</td>";
  	var deleteRow = "<button id='delButton' class='btn default' onclick='deleteRow($(this));'>delete</button>"
  	var row = "<tr  data-row='data-bean' item-bean ="+JSON.stringify(text)+" id='"+rowNo+"'>"+checkbox+cell01+cell02+cell03+cell04+cell05+cell06+cell07+cell08+cell09+cell10+cell11+cell12+cell13+cell14+cell15+cell16+cell17+cell18+cell19+cell20+cell21+cell22+cell23+cell24+cell25+cell26+cell27+"</tr>";
      $("#invTable tbody").before(row);
}
function addRows() {
	//$('#editBttn').hide();
  rowNo++;
  var text = {'id':rowNo,'invId': null,'desc':$('#desc').val().trim(),'rate': $("input[name=rate]").val(),'qty': $("input[name=qty]").val(),'currency':$("input[name=currency]").val(),'exRate':$("input[name=exRate]").val(),'rateXqty':$("input[name=rateXqty]").val(),'amount':$("input[name=amount]").val(),'date':$("input[name=date]").val(),'grossWeight':$("input[name=grossWeight]").val(),'netUnit':$("input[name=netUnit]").val(),'goodsValue':$("input[name=goodsValue]").val(),'natureOfContract':$("input[name=natureOfContract]").val(),'freight':$("input[name=freight]").val(),'unit':$("input[name=unit]").val(),'actualFreight':$("#actualFreight").val(),'insurance':$("input[name=insurance]").val(),'insuranceUnit':$("input[name=insuranceUnit]").val(),'actualInsurance':$("#actualInsurance").val(),'packagingAndMisc':$("input[name=packagingAndMisc]").val(),'pmUnit':$("input[name=pmUnit]").val(),'actualPM':$("#actualPM").val(),'otherCharges':$("input[name=otherCharges]").val(),'otherUnit':$("input[name=otherUnit]").val(),'fobValue':$("input[name=fobValue]").val(),'pmvRate':$("input[name=pmvRate]").val(),'pmvUnit':$("input[name=pmvUnit]").val(),'pmvValue':$("input[name=pmvValue]").val()};
 
  var itemBean = JSON.stringify(text);
  
  $.ajax({	
		type: 'POST',
		dataType: 'json',
		contentType:'application/json',
		url: "${pageContext.request.contextPath}/saveInv",
		data:itemBean,
		headers: {
	        'X-CSRF-Token': token
	    },
		success :function(invId){
			text.invId = invId;
			var checkbox = "<td><input type='checkbox' id='"+rowNo+"_check' value='"+rowNo+"'/></td>";
			var cell01 = "<td id='"+rowNo+"_desc' column='description'><a href='#' onclick='editData("+rowNo+");'>"+$('textarea#desc').val() +"</td> ";
		  	var cell02 = "<td id='"+rowNo+"_rate' column ='rate'>"+$("input[name=rate]").val(); +"</td>";
		  	var cell03 = "<td id='"+rowNo+"_qty'   column ='qty'>"+$("input[name=qty]").val(); +"</td>";
		  	var cell04 = "<td id='"+rowNo+"_currency'  column ='currency'>"+$("input[name=currency]").val(); +"</td>";
		  	var cell05 = "<td id='"+rowNo+"_exRate'   column ='exRate'>"+$("input[name=exRate]").val(); +"</td>";
		  	var cell06 = "<td id='"+rowNo+"_rateXqty'   column ='rateXqty'>"+$("input[name=rateXqty]").val(); +"</td>";
		  	var cell07 = "<td id='"+rowNo+"_amount'  column ='amount'>"+$("input[name=amount]").val(); +"</td>";
		  	var cell08 = "<td id='"+rowNo+"_date'  column ='date'>"+$("input[name=date]").val(); +"</td>";
		  	var cell09 = "<td id='"+rowNo+"_grossWeight'  column ='grossWeight'>"+$("input[name=grossWeight]").val(); +"</td>";
		  	var cell10 = "<td id='"+rowNo+"_netUnit'  column ='netUnit'>"+$("input[name=netUnit]").val(); +"</td>";
		  	var cell11 = "<td id='"+rowNo+"_goodsValue'  column ='goodsValue'>"+$("input[name=goodsValue]").val(); +"</td>";
		  	var cell12 = "<td id='"+rowNo+"_natureOfContract'  column ='natureOfContract'>"+$("input[name=natureOfContract]").val(); +"</td>";
		  	var cell13 = "<td id='"+rowNo+"_freight'  column ='freight'>"+$("input[name=freight]").val(); +"</td>";
		  	var cell14 = "<td id='"+rowNo+"_unit'  column ='unit'>"+$("input[name=unit]").val(); +"</td>";
		  	var cell15 = "<td id='"+rowNo+"_actualFreight'  column ='actualFreight'>"+$("input[name=actualFreight]").val(); +"</td>";
		  	var cell16 = "<td id='"+rowNo+"_insurance'  column ='insurance'>"+$("input[name=insurance]").val(); +"</td>";
		  	var cell17 = "<td id='"+rowNo+"_insuranceUnit'  column ='insuranceUnit'>"+$("input[name=insuranceUnit]").val(); +"</td>";
		  	var cell18 = "<td id='"+rowNo+"_actualInsurance'  column ='actualInsurance'>"+$("input[name=actualInsurance]").val(); +"</td>";
		  	var cell19 = "<td id='"+rowNo+"_packagingAndMisc'  column ='packagingAndMisc'>"+$("input[name=packagingAndMisc]").val(); +"</td>";
		  	var cell20 = "<td id='"+rowNo+"_pmUnit'  column ='pmUnit'>"+$("input[name=pmUnit]").val(); +"</td>";
		  	var cell21 = "<td id='"+rowNo+"_actualPM'  column ='actualPM'>"+$("#actualPM").val(); +"</td>";
		  	var cell22 = "<td id='"+rowNo+"_otherCharges'  column ='otherCharges'>"+$("input[name=otherCharges]").val(); +"</td>";
		  	var cell23 = "<td id='"+rowNo+"_otherUnit'  column ='otherUnit'>"+$("input[name=otherUnit]").val(); +"</td>";
		  	var cell24 = "<td id='"+rowNo+"_fobValue'  column ='fobValue'>"+$("input[name=fobValue]").val(); +"</td>";
		  	var cell25 = "<td id='"+rowNo+"_pmvRate'  column ='pmvRate'>"+$("input[name=pmvRate]").val(); +"</td>";
		  	var cell26 = "<td id='"+rowNo+"_pmvUnit'  column ='pmvUnit'>"+$("input[name=pmvUnit]").val(); +"</td>";
		  	var cell27 = "<td id='"+rowNo+"_pmvValue'  column ='pmvValue'>"+$("input[name=pmvValue]").val(); +"</td>";
		  	
		  	var deleteRow = "<button id='delButton' class='btn default' onclick='deleteRow($(this));'>delete</button>"
		  	var row = "<tr  data-row='data-bean' item-bean ="+JSON.stringify(text)+" id='"+rowNo+"'>"+checkbox+cell01+cell02+cell03+cell04+cell05+cell06+cell07+cell08+cell09+cell10+cell11+cell12+cell13+cell14+cell15+cell16+cell17+cell18+cell19+cell20+cell21+cell22+cell23+cell24+cell25+cell26+cell27+"</tr>";
		      $("#invTable tbody").after(row);
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
function editRows(){
    var rowNo = $("#rowId").val();
	var tr = $("#"+rowNo);
	var itemBn = tr.attr("item-bean");
	var itemBean = JSON.parse(itemBn);
	//var item-bean = $("#w3s").attr("href");
	itemBean.desc =$("#desc").val();
	itemBean.rate = $("input[name=rate]").val();
	itemBean.qty =$("input[name=qty]").val();
	itemBean.currency = $("input[name=currency]").val();
	itemBean.exRate = $("input[name=exRate]").val();
	itemBean.rateXqty = $("input[name=rateXqty]").val();
	itemBean.amount = $("input[name=amount]").val();
	itemBean.date=$("input[name=date]").val();
  	itemBean.grossWeight=$("input[name=grossWeight]").val(); 
  	 itemBean.netUnit=$("input[name=netUnit]").val(); 
  	 itemBean.goodsValue=$("input[name=goodsValue]").val(); 
  	 itemBean.natureOfContract=$("input[name=natureOfContract]").val(); 
  	 itemBean.freight=$("input[name=freight]").val(); 
  	 itemBean.unit=$("input[name=unit]").val(); 
  	itemBean.actualFreight=$("input[name=actualFreight]").val(); 
  	itemBean.insurance=$("input[name=insurance]").val(); 
  	itemBean.insuranceUnit=$("input[name=insuranceUnit]").val(); 
  	itemBean.actualInsurance=$("input[name=actualInsurance]").val(); 
  	itemBean.packagingAndMisc=$("input[name=packagingAndMisc]").val(); 
  	itemBean.pmUnit=$("input[name=pmUnit]").val(); 
  	itemBean.actualPM=$("#actualPM").val(); 
  	itemBean.otherCharges=$("input[name=otherCharges]").val(); 
  	itemBean.otherUnit=$("input[name=otherUnit]").val(); 
  	 itemBean.fobValue=$("input[name=fobValue]").val(); 
  	 itemBean.pmvRate=$("input[name=pmvRate]").val(); 
  	 itemBean.pmvUnit=$("input[name=pmvUnit]").val(); 
  	 itemBean.pmvValue=$("input[name=pmvValue]").val(); 
	  $.ajax({
			type : "POST",
			contentType:'application/json',
			url : "${pageContext.request.contextPath}/updateInv",
			data : JSON.stringify(itemBean),
			dataType : "json",
			headers: {
		        'X-CSRF-Token': token
		    },
			success : function(data) {
				$("#"+rowNo+"_description").text(itemBean.desc)
				$("#"+rowNo+"_rate").text(itemBean.rate);
				$("#"+rowNo+"_qty").text(itemBean.qty);
				$("#"+rowNo+"_currency").text(itemBean.currency);
				$("#"+rowNo+"_exRate").text(itemBean.exRate);
				$("#"+rowNo+"_rateXqty").text(itemBean.rateXqty);
				$("#"+rowNo+"_amount").text(itemBean.amount);
				$("#"+rowNo+"_date").text(itemBean.date);
				$("#"+rowNo+"_grossWeight").text(itemBean.grossWeight); 
				$("#"+rowNo+"_netUnit").text(itemBean.netUnit); 
				$("#"+rowNo+"_goodsValue").text(itemBean.goodsValue); 
				$("#"+rowNo+"_natureOfContract").text(itemBean.natureOfContract); 
				$("#"+rowNo+"_freight").text(itemBean.freight); 
				$("#"+rowNo+"_unit").text(itemBean.unit); 
				$("#"+rowNo+"_actualFreight").text(itemBean.actualFreight); 
				$("#"+rowNo+"_insurance").text(itemBean.insurance); 
				$("#"+rowNo+"_insuranceUnit").text(itemBean.insuranceUnit); 
				$("#"+rowNo+"_actualInsurance").text(itemBean.actualInsurance); 
				$("#"+rowNo+"_packagingAndMisc").text(itemBean.packagingAndMisc); 
				$("#"+rowNo+"_pmUnit").text(itemBean.pmUnit); 
				$("#"+rowNo+"_actualPM").text(itemBean.actualPM); 
				$("#"+rowNo+"_otherCharges").text(itemBean.otherCharges); 
				$("#"+rowNo+"_otherUnit").text(itemBean.otherUnit); 
				$("#"+rowNo+"_fobValue").text(itemBean.fobValue); 
				$("#"+rowNo+"_pmvRate").text(itemBean.pmvRate); 
				$("#"+rowNo+"_pmvUnit").text(itemBean.pmvUnit); 
				$("#"+rowNo+"_pmvValue").text(itemBean.pmvValue); 
								
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
function editData(rowNo){
	var  rowId ="#"+rowNo; 
	var tr = $("#"+rowNo);
	var itemBn = tr.attr("item-bean");
	var itemBean = JSON.parse(itemBn);
	//var item-bean = $("#w3s").attr("href");
	$("#rowId").val(rowNo);
	$("#desc").val(itemBean.desc);
	$("input[name=rate]").val(itemBean.rate);
	$("input[name=qty]").val(itemBean.qty);
	$("input[name=currency]").val(itemBean.currency);
	$("input[name=exRate]").val(itemBean.exRate);
	$("input[name=rateXqty]").val(itemBean.rateXqty);
	$("input[name=amount]").val(itemBean.amount);
	$("input[name=date]").text(itemBean.date);
	$("input[name=grossWeight]").text(itemBean.grossWeight); 
	$("input[name=netUnit]").text(itemBean.netUnit); 
	$("input[name=goodsValue]").text(itemBean.goodsValue); 
	$("input[name=natureOfContract]").text(itemBean.natureOfContract); 
	$("input[name=freight]").text(itemBean.freight); 
	$("input[name=unit]").text(itemBean.unit); 
	$("input[name=actualFreight]").text(itemBean.actualFreight); 
	$("input[name=insurance]").text(itemBean.insurance); 
	$("input[name=insuranceUnit]").text(itemBean.insuranceUnit); 
	$("input[name=actualInsurance]").text(itemBean.actualInsurance); 
	$("input[name=packagingAndMisc]").text(itemBean.packagingAndMisc); 
	$("input[name=pmUnit]").text(itemBean.pmUnit); 
	$("#actualPM").val(itemBean.actualPM); 
	$("input[name=otherCharges]").text(itemBean.otherCharges); 
	$("input[name=otherUnit]").text(itemBean.otherUnit); 
	$("input[name=fobValue]").text(itemBean.fobValue); 
	$("input[name=pmvRate]").text(itemBean.pmvRate); 
	$("input[name=pmvUnit]").text(itemBean.pmvUnit); 
	$("input[name=pmvValue]").text(itemBean.pmvValue);
	$('#addBttn').hide();
	$('#editBttn').show();		
	
}

function delRows(){
	var deleteArrayList=[];
	rowIdList =[];
	$('#invTable').find('input[type="checkbox"]:checked').each(function () {
		
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
		url : "${pageContext.request.contextPath}/deleteInv",
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
