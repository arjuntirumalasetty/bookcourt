var myApp= angular.module('myApp',['ngRoute']);
myApp.config('$routeProvider',
  function($routeProvider) {
$routeProvider.when('/register',{
        controller : 'admin.controller',
        templateUrl : 'WEB-INF/jsp/UserManagement.jsp'

});
});