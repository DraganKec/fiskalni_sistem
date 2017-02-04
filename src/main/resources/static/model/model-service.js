/**
 * Created by Dragan on 04/02/17.
 */
angular.module('fiskalniSistem')
    .factory('modelService', function ($http) {

        return {
            getAllModel: function () {
                return $http({
                    method: "GET",
                    url: "/getAllModels"
                }).then(function (response) {
                    return response.data;
                });
            },
            saveModel: function (model) {
                return $http({
                    method: 'POST',
                    url: '/saveModel',
                    data: model
                }).then(function (result) {
                    return result.data;
                })
            },
            getModel: function (id) {
                return $http({
                    method: "POST",
                    url: "/getModel",
                    data: id
                }).then(function (response) {
                    return response.data;
                });
            }
        }
    });