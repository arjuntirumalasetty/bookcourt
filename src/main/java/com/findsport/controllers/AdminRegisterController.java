package com.findsport.controllers;

import com.findsport.DataAccessor.StadiumDAO;
import com.findsport.DataObjects.Stadium;
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

    @RequestMapping(value= "/stadium/", method = RequestMethod.GET)
    public ResponseEntity<Void> createAdmin(@RequestBody Stadium stadium ){
        boolean reslut = StadiumDAO.insertData(stadium);
        if(reslut){
            return new ResponseEntity<Void>(HttpStatus.CREATED);
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
