<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/bootstrap.css">

<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.js"></script>
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/angular.min.js"></script>
<script src="resources/js/angular.js"></script>
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
                <tr ng-repeat="p in pro">
                    <td>{{p.id}}</td>
                    <td>{{p.name}}</td>
                    <td>{{p.price}}</td>
                    
                </tr>
            </tbody>
        </table>
        
    </div>
    <script src="resources/js/Script.js"></script>
</body>
</html>

