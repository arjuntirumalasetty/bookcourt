'use strict';

angular.module('myApp',[]).factory('adminService',['$http','$q',function($http,$q){

     var REST_SERVICE_URI = 'http://localhost:8080/bookcourt';
     var factory = {
             createStadium:createStadium
         };
      return factory;

     function createStadium(stadium) {
             var deferred = $q.defer();
             $http.post(REST_SERVICE_URI+"/stadium", stadium)
                 .then(
                 function (response) {
                     deferred.resolve(response.data);
                 },
                 function(errResponse){
                     console.error('Error while updating User');
                     deferred.reject(errResponse);
                 }
             );
             return deferred.promise;
         }
}])
