angular.module("myApp", []).controller("UserRestCtrl", function($scope, $http) {
    $scope.mode = "get";
    $scope.init = function() {
        $scope.message = "";
        $scope.user = {};
        $http({
            url: "/userService/user/getUsers",
            method: 'POST',
            dataType: 'json',
            headers: {
                "contentType": "applicatin/json"
            }

        }).success(function(response) {
            $scope.users = response.users;

            return true;

        });

    };
    $scope.fn_create = function() {
        $http({
            url: "/userService/user/createOrUpdateUser",
            method: 'POST',
            dataType: 'json',
            data: JSON.stringify($scope.user),
            headers: {
                "contentType": "applicatin/json"
            }

        }).success(function(response) {
            $scope.userData = response.status;
            $scope.message = "Created/Updated Successfully"

            return true;
        }).
        error(function(response) {
            $scope.message = "Create/Update User Failed"

            return false;
        });

    };

    $scope.fn_update = function(item) {

        $scope.mode = "update";
        $scope.user = item;

    };
});