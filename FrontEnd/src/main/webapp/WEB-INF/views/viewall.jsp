<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/bootstrap.css">
<link rel="stylesheet" href="resources/css/bootstrap.map.css">
<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.js"></script>
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<title>View</title>
</head>
<body ng-app="myModule">
    <div ng-controller="myController">
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Price</th>
                   
                </tr>
            </thead>
            <tbody>
                <tr ng-repeat="employee in employees">
                    <td>{{pro.Id}}</td>
                    <td>{{pro.Name}}</td>
                    <td>{{pro.Price}}</td>
                    
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>

