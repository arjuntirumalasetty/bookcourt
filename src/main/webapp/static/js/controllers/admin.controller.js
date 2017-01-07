'use strict';

angular.module('myApp').controller('adminController', ['$scope', 'adminService', function($scope, adminService) {
    var self = this;
    self.stadium={stadiumID : '',stadiumLongitude:'',stadiumLatitude:'',stadiumPhoneNo:'',stadiumName : '',streetName : '',cityName:'',landMark:'',state:'',country : ''};

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
            self.stadium.stadiumLatitude = 1234.123413;
            self.stadium.stadiumLongitude = 1234.123;
            createUser(self.stadium);
        reset();
    }

    function reset(){
        self.stadium={stadiumID : '',stadiumLongitude:'',stadiumLatitude:'',stadiumPhoneNo:'',stadiumName : '',streetName : '',cityName:'',landMark:'',state:'',country : ''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);