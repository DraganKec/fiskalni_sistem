/**
 * Created by Dragan on 04/02/17.
 */
angular.module("fiskalniSistem")
    .controller('addModelCtrl', ['$scope', '$http', '$routeParams', 'modelService',
        function ($scope, $http, $routeParams, modelService) {

            var id = $routeParams.id;

            if (id !== 'undefine') {
                modelService.getModel(id).then(function (data) {
                    $scope.model = data;
                });
            }
            $scope.addModel = function (model) {
                modelService.saveModel(model);
            };

        }])
    .controller('allModelCtrl', ['$scope', '$http', 'modelService',
        function ($scope, $http, modelService) {

            modelService.getAllModel().then(function (data) {
                $scope.allModels = data;
            });

        }]);