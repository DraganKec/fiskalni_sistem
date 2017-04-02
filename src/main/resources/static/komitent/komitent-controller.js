angular.module('fiskalniSistem')
    .controller('addKomitentCtrl', ['$scope', '$http', 'komitentService',
        function ($scope, $http, komitentService) {

            $scope.saveKomitent = function (komitent) {
                komitentService.saveKomitent(komitent);
                $scope.komitent = {};
                $scope.addKomitentForm.$setPristine();
            };

        }])
    .controller('allKomitentsCtrl', ['$scope', '$http', 'komitentService',
        function ($scope, $http, komitentService) {

            komitentService.getAllKomitent().then(function (data) {
                $scope.allKomitent = data;
            });
            $scope.deleteKomitent = function (id) {
                komitentService.deleteKomitent(id);
            };
        }]);
