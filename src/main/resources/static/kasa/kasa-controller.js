/**
 * Created by Dragan on 04/02/17.
 */
angular.module('fiskalniSistem')
    .controller('allKasaCtrl', ['$scope', '$http',
        function ($scope, $http) {

            $http({
                method: "GET",
                url: "/getAllKasa"
            }).then(function (response) {
                $scope.allKasa = response.data;
            }, function (response) {
                $scope.allKasa = response.statusText;
            });
        }])
    .controller('addKasaCtrl', ['$scope', '$http', 'modelService', 'kasaService', 'komitentService',
        function ($scope, $http, modelService, kasaService, komitentService) {

            $scope.saveKasa = function (kasa) {
                kasaService.saveKasa(kasa);
            };

            modelService.getAllModel().then(function (data) {
                $scope.allModels = data;
            });

            komitentService.getNazivKomitenta().then(function (data) {
                $scope.nazivKomitenta = data;
            });
        }])
    .controller('kasaCtrl', ['$scope', '$http', '$routeParams', 'modelService', 'kasaService',
        function ($scope, $http, $routeParams, modelService, kasaService) {

            var id = $routeParams.id;

            modelService.getAllModel().then(function (data) {
                $scope.allModels = data;
            });

            $scope.saveKasa = function (kasa) {
                kasaService.saveKasa(kasa);
            };

            kasaService.getKasa(id).then(function (data) {
                $scope.kasa = data;
            });
        }]);