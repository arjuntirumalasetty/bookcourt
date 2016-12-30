'use strict';

angular.module('myApp').controller('adminController', ['$scope', 'adminService', function($scope, adminService) {
    var self = this;
    self.stadium={name:'',address:'',phno:''};

    self.submit = submit;
    self.reset = reset;


    function createUser(stadium){
        adminService.createStadium(stadium)
            .then(
            function(errResponse){
                console.error('Error while creating stadium');
            }
        );
    }


    function submit() {
            console.log('Saving New User', self.user);
            createUser(self.stadium);
        reset();
    }

    function reset(){
        self.stadium={name:'',address:'',email:''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);