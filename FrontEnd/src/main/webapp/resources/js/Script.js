var app = angular
        .module("myModule", [])
        .controller("myController", function ($scope, $http) {

            $http.get("mdFrontEnd/product/all")
                 .then(function (response) {
                     $scope.pro = response.data;
                 });
        });