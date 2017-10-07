<!--header start-->
<header class="header white-bg">
	<div class="navbar-header">
		<button type="button" class="navbar-toggle" data-toggle="collapse"
			data-target=".navbar-collapse">
			<span class="fa fa-bars"></span>
		</button>

		<!--logo start-->
		<a href="index.html" class="logo">Flat<span>lab</span></a>
		<!--logo end-->
		<div class="horizontal-menu navbar-collapse collapse ">
			<ul class="nav navbar-nav">
				<li><a href="${pageContext.request.contextPath}/dashboard">Dashboard</a></li>
				<li class="active"><a href="#">Components</a></li>
				<li class="dropdown"><a data-toggle="dropdown"
					data-hover="dropdown" class="dropdown-toggle" href="#">Masters
						<b class=" fa fa-angle-down"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="${pageContext.request.contextPath}/newparty">Party
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newagent">Agent
								Master</a></li>
						<li><a
							href="${pageContext.request.contextPath}/newdepositbank">Deposit
								Bank Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newairagent">Air
								Agent Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newcha">CHA
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newcarrier">Carrier
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newcharges">Charges
								Master</a></li>
						<li><a
							href="${pageContext.request.contextPath}/newservicetaxcode">Charges
								Service Tax A/C Code</a></li>
						<li><a href="${pageContext.request.contextPath}/newcity">City
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newcoloader">Co
								Loader Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newcustomer">Customer
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newlocalfees">Local
								Fees</a></li>
						<li><a href="${pageContext.request.contextPath}/newlocation">Location
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newpackages">Packages
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newvendor">Vendor
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newvessel">Vessel
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newvoyage">Voyage
								Master</a></li>
						<li><a href="${pageContext.request.contextPath}/newjobcard">Job
								Card Consolidation New</a></li>
					</ul></li>
				<li><a href="basic_table.html">Tables</a></li>
				<li class="dropdown"><a data-toggle="dropdown"
					data-hover="dropdown" class="dropdown-toggle" href="#">Extra <b
						class=" fa fa-angle-down"></b></a>
					<ul class="dropdown-menu">
						<li><a href="blank.html">Blank Page</a></li>
						<li><a href="boxed_page.html">Boxed Page</a></li>
						<li><a href="profile.html">Profile</a></li>
						<li><a href="invoice.html">Invoice</a></li>
						<li><a href="search_result.html">Search Result</a></li>
						<li><a href="404.html">404 Error Page</a></li>
						<li><a href="500.html">500 Error Page</a></li>
					</ul></li>
			</ul>

		</div>
		<div class="top-nav ">
			<ul class="nav pull-right top-menu">
				<li><input type="text" class="form-control search"
					placeholder=" Search"></li>
				<!-- user login dropdown start-->
				<li class="dropdown"><a data-toggle="dropdown"
					class="dropdown-toggle" href="#"> <img alt=""
						src="img/avatar1_small.jpg"> <span class="username">${loggedinuser}</span>
						<b class="caret"></b>
				</a>
					<ul class="dropdown-menu extended logout">
						<div class="log-arrow-up"></div>
						<li><a href="#"><i class=" fa fa-suitcase"></i>Profile</a></li>
						<li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
						<li><a href="#"><i class="fa fa-bell-o"></i> Notification</a></li>
						<li><a href="<c:url value="/logout" />"><i
								class="fa fa-key"></i> Log Out</a></li>
					</ul></li>
				<!-- user login dropdown end -->
			</ul>
		</div>

	</div>

</header>
