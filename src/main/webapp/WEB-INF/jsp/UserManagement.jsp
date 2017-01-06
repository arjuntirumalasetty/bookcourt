<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Stadium Registration</title>
    <style>
      .username.ng-valid {
          background-color: lightgreen;
      }
      .username.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .username.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  </head>
  <body ng-app="myApp" class="ng-cloak">
      <div class="generic-container" ng-controller="adminController as ctrl">
          <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">stadium Registration Form </span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
                      <input type="hidden" ng-model="ctrl.stadium.id" />
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="uname">Name</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.stadium.stadiumName" id="uname" class="username form-control input-sm" placeholder="Enter your stadium name" required ng-minlength="3" />
                                  <div class="has-error" ng-show="myForm.$dirty">
                                      <span ng-show="myForm.uname.$error.required">This is a required field</span>
                                      <span ng-show="myForm.uname.$error.minlength">Minimum length required is 3</span>
                                      <span ng-show="myForm.uname.$invalid">This field is invalid </span>
                                  </div>
                              </div>
                          </div>
                      </div>

                      <div class="row">
                            <div class="form-group col-md-12">
                                <label class="col-md-2 control-lable" for="phno">Phone number</label>
                                <div class="col-md-7">
                                    <input type="text" ng-model="ctrl.stadium.stadiumPhoneNo" id="phno" class="username form-control input-sm" placeholder="Enter stadium phone number" required ng-minlength="10"/>
                                </div>
                            </div>
                        </div>

                      <div class="row">
                           <div class="form-group col-md-12">
                               <label class="col-md-2 control-lable" for="streetName">Street Name</label>
                               <div class="col-md-7">
                                   <input type="text" ng-model="ctrl.stadiumAddress.streetName" id="streetName" class="username form-control input-sm" placeholder="Enter stadium Street name" required/>
                               </div>
                           </div>
                       </div>
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="cityName">City Name</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.stadiumAddress.cityName" id="cityName" class="username form-control input-sm" placeholder="Enter City Name" required/>
                              </div>
                          </div>
                      </div>

                      <div class="row">
                            <div class="form-group col-md-12">
                                <label class="col-md-2 control-lable" for="landMark">Land Mark</label>
                                <div class="col-md-7">
                                    <input type="text" ng-model="ctrl.stadiumAddress.landMark" id="landMark" class="username form-control input-sm" placeholder="Enter Land mark nearby" required/>
                                </div>
                            </div>
                      </div>
                         <div class="row">
                               <div class="form-group col-md-12">
                                   <label class="col-md-2 control-lable" for="state">State</label>
                                   <div class="col-md-7">
                                       <input type="text" ng-model="ctrl.stadiumAddress.state" id="state" class="username form-control input-sm" placeholder="Enter State" required/>
                                   </div>
                               </div>
                          </div>
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="country">State</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.stadiumAddress.country" id="state" class="username form-control input-sm" placeholder="Enter country" required/>
                              </div>
                          </div>
                     </div>

                      <div class="row">
                          <div class="form-actions floatRight">
                              <button type="button" ng-click="ctrl.submit()" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">Submit</button>
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
                          </div>
                      </div>
                  </form>
              </div>
          </div>

      </div>

      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/services/admin.service.js' />"></script>
      <script src="<c:url value='/static/js/controllers/admin.controller.js' />"></script>
  </body>
</html>