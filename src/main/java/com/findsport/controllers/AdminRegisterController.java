package com.findsport.controllers;

import com.findsport.DataAccessor.StadiumDAO;
import com.findsport.DataObjects.AdminData;
import com.findsport.DataObjects.Stadium;
import com.findsport.DataObjects.StadiumAddress;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Arjun on 12/28/2016.
 */
@RestController
@Controller
public class AdminRegisterController {

    @RequestMapping(value= "/stadium", method = RequestMethod.POST)
    public ResponseEntity<Void> createAdmin(@RequestBody AdminData adminData){
        System.out.println("Inside /Stadium");
        boolean reslut = false;
        Stadium stadium = adminData.getStadium();
        StadiumAddress stadiumAddress = adminData.getStadiumAddress();
        System.out.println("stadium.getStadiumAddress() stadium.getStadiumName() "+stadium.getStadiumName()+
                " stadium.getStadiumPhoneNo() "+stadium.getStadiumPhoneNo()+" stadium.getStadiumLatitude() "+stadium.getStadiumLatitude());
        int addressId = StadiumDAO.insertStadiumAddress(stadiumAddress);
        if(addressId>-1) {
             reslut = StadiumDAO.insertData(stadium,addressId);
        }
        if(reslut){
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
    }
    @RequestMapping(value="/firstTest",method = RequestMethod.POST)
    public @ResponseBody Stadium testMethod(@PathVariable Stadium Value){
        System.out.print(Value.getStadiumID());
        return Value;
    }
}
