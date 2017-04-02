/**
    * Created by Dragan on 03/02/17.
    */
angular.module('fiskalniSistem')
    .factory('komitentService', function ($http) {

        return {
            getAllKomitent: function () {
                return $http({
                    method: "GET",
                    url: "/getAllKomitents"
                }).then(function (response) {
                    return response.data;
                });
            },
            getNazivKomitenta: function () {
                return $http({
                    method: "GET",
                    url: "/getNazivKomitenta"
                }).then(function (response) {
                    return response.data;
                });
            },
            saveKomitent: function (komitent) {
                return $http({
                    method: 'GET',
                    url: '/saveKomitent',
                    data: komitent
                }).then(function (result) {
                    return result.data;
                }, function () {
                    return {statusCode: 500};
                })
            },
            deleteKomitent: function (id) {
                return $http({
                    method: 'POST',
                    url: '/deleteKomitent',
                    data: id
                }).then(function (result) {
                    return result.data;
                });
            },
            getKomitent: function (id) {
                return $http({
                    method: 'POST',
                    url: '/getOneKomitent',
                    data: id
                }).then(function (response) {
                    return response.data;
                });
            }
        }
    });