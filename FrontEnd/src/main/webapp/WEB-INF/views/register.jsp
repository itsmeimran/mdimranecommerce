<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="linking.jsp" />
<title>Register</title>
</head>
<body>

	<div class="row">

		<jsp:include page="header.jsp" />
	</div>
	<center>
		<div class="row" style="padding-top: 100px; width: 350px;">
			<form>
				<div class="form-group">
					<label for="exampleInputEmail1">User Name</label> <input
						type="email" class="form-control" id="exampleInputEmail1"
						placeholder="Name">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Email address</label> <input
						type="email" class="form-control" id="exampleInputEmail1"
						placeholder="Email">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> <input
						type="password" class="form-control" id="exampleInputPassword1"
						placeholder="Password">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Contact No</label> <input
						type="email" class="form-control" id="exampleInputEmail1"
						placeholder="Contact">
				</div>

				<button type="submit" class="btn btn-default">Submit</button>
			</form>
		</div>
	</center>
	<jsp:include page="footer.jsp" />

</body>
</html>

