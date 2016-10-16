
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
	
	<jsp:include page="linking.jsp"/>
	<c:set var="req" value="${pageContext.request.contextPath}"/>
	<div class="container">
		<div class="row">
			<div class="navbar navbar-default navbar-fixed-top">
				<ul class="nav navbar-nav">
					<li><a href="${req}/home">Home</a></li>
					<li><a href="${req}/about">About</a></li>
					<li><a href="${req}/contact">Contact</a></li>
					
					<li><a href="${req}/login" >Login</a></li>
					<li><a href="${req}/register">Register</a></li>
					<li><a href="${req}/viewall">ViewAll</a></li>
				</ul>
				<div class="dropdown">
    <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">Categories
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">Mobile</a></li>
      <li><a href="#">TV</a></li>
      <li><a href="#">Air Conditioner</a></li>
      <li class="divider"></li>
      <li><a href="#">About Us</a></li>
    </ul>
  </div>
			</div>
			<!-- navbar ends -->
		</div>
		<!-- row1 ends -->

	</div>
	
