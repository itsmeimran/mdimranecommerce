<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="req" value="${pageContext.request.contextPath}" />
<div class="panel pannel-default">


	<div class="panel-header">
		
		Product Form
	
	</div>
	
	
	<div class="panel-body">
			
		<form:form action="${req}/admin/insert" method="post" modelAttribute="pro">
		 <form:hidden path="id"/> 
		 
		<form:input path="name"/> 
			
			<hr/>		
			<form:input path="category"/>
			
			<hr/>
			
			<form:input path="supplier"/>
			
			<hr/>
				
			
			<form:input path="price"/>
			
			<hr/>
			
			
			
			<input type="submit" value="Save"/>
									
		</form:form>	
		
	</div>


</div>




<table class="table table-striped">

	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Price</th>
		<th>&#160;</th>
	</tr>

	<c:forEach items="${products}" var="product">	
		<tr>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
			<td>				
				<a href="${req}/admin/edit/${product.id}" class="btn btn-sm btn-primary">Edit</a>&#160;
				<a href="${req}/admin/delete/${product.id}" class="btn btn-sm btn-primary">Delete</a>			
			</td>		
		</tr>
	</c:forEach>



</table>


