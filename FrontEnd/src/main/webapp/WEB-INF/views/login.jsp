<html>
<head>
<jsp:include page="linking.jsp" />
<title>Login</title>
</head>
<body>


	<jsp:include page="header.jsp" />

	<div class="container" id="box"
		style="background-color: grey; padding-top: 250px;">
		<center>
			<form>
				<div class="form-group">
					<label for="email">User Name:</label> <input type="email"
						class="form-control" id="email">
				</div>
				<div class="form-group">
					<label for="pwd">Password</label> <input type="password"
						class="form-control" id="pwd">
				</div>
				<div class="checkbox">
					<label><input type="checkbox"> Remember me</label>
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</center>
	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>

