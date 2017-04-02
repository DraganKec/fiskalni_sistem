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
    });