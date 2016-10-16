

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	
<jsp:include page="linking.jsp" />
<title>home</title>
</head>
<body>

	<div class="container">
		<jsp:include page="header.jsp" />
	</div>
	<div>
		<jsp:include page="carousel.jsp" />
	</div>
	<div class="container">
		<div class="row" id="CategoriesHeading">
			<div class="col-12">
				<h2>Categories</h2>
				<p class="lead">You can go for any specific category as per your
					requirement.</p>
			</div>
		</div>
	</div>

	<div class="row" id="Categories">
		<div class="col-sm-4 Categories">
			<div class="panel">
				<div class="panel-heading">
					<h3 class="panel-title">Mobiles</h3>
				</div>
				<img src="" alt="Mobiles images"> <a href="${req.contextPath}/mobile"
					target="_blank" class="btn btn-warning btn-block">Mobiles</a>
			</div>
		</div>
		<div class="col-sm-4 Categories">
			<div class="panel">
				<div class="panel-heading">
					<h3 class="panel-title">Televisions</h3>
				</div>
				<img src="" alt="Televisions images"> <a
					href="${req.contextPath}/mobile" target="_blank"
					class="btn btn-warning btn-block">Televisions</a>
			</div>
		</div>
		<div class="col-sm-4 Categories">
			<div class="panel">
				<div class="panel-heading">
					<h3 class="panel-title">Air Conditionar</h3>
				</div>
				<img src="" alt="Air Conditionar images"> <a
					href="${req.contextPath}/mobile" target="_blank"
					class="btn btn-warning btn-block">Air Conditionar</a>
			</div>
		</div>
	</div>



	<jsp:include page="footer.jsp" />


</body>
</html>