angular.module('fiskalniSistem', ['ngRoute'])

    .config(function ($routeProvider) {

        $routeProvider.when('/', {})
            .when('/addKomitent', {
                templateUrl: 'komitent/addkomitent.html',
                controller: 'addKomitentCtrl'
            })
            .when('/allKasa', {
                templateUrl: 'kasa/allkasa.html',
                controller: 'allKasaCtrl'
            })
            .when('/addKasa', {
                templateUrl: 'kasa/addkasa.html',
                controller: 'addKasaCtrl'
            })
            .when('/kasa/:id', {
                templateUrl: 'kasa/kasa.html',
                controller: 'kasaCtrl'
            })
            .when('/allKomitents', {
                templateUrl: 'komitent/allkomitents.html',
                controller: 'allKomitentsCtrl'
            })
            .when('/Komitent/:id', {
                templateUrl: 'komitent/komitent.html',
                controller: 'komitentCtrl'
            })
            .when('/addModel/:id', {
                templateUrl: 'model/addmodel.html',
                controller: 'addModelCtrl'
            })
            .when('/allModel', {
                templateUrl: 'model/allmodel.html',
                controller: 'allModelCtrl'
            })
            .otherwise({redirectTo: '/'});
    })
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
        }])
    .controller('komitentCtrl', ['$scope', '$http', '$routeParams', 'komitentService',
        function ($scope, $http, $routeParams, komitentService) {

            var id = $routeParams.id;

            komitentService.getKomitent(id).then(function (data) {
                $scope.komitent = data;
            });

        }])
    .factory('kasaService', function ($http) {

        return {
            getAllKasa: function () {
                return $http({
                    method: "GET",
                    url: "/getAllKasa"
                }).then(function (response) {
                    return response.data;
                });
            },
            saveKasa: function (kasa) {
                return $http({
                    method: 'POST',
                    url: '/saveKasa',
                    data: kasa
                }).then(function (result) {
                    return result.data;
                });
            },
            getKasa: function (id) {
                return $http({
                    method: 'POST',
                    url: '/getKasa',
                    data: id
                }).then(function (response) {
                    return response.data;
                });
            },
            deleteKasa: function (id) {
                return $http({
                    method: 'POST',
                    url: '/deleteKasa',
                    data: id
                }).then(function (result) {
                    return result.data;
                });
            }
        }

    });