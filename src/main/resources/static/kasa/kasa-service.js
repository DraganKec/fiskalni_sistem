/**
 * Created by Dragan on 04/02/17.
 */
angular.module('fiskalniSistem')
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