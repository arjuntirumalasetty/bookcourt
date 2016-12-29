package com.findsport.controllers;

import com.findsport.BusinessObjects.StadiumHandler;
import com.findsport.DataAccessor.StadiumDAO;
import com.findsport.DataObjects.Stadium;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by renu on 12/29/2016.
 */
@Controller
public class TestStadiumDataFlow {

    @RequestMapping("/teststadium")

    public ModelAndView helloWorld() {

        ModelAndView model = new ModelAndView("testOperation");
        Stadium testStadiumDeatils = MockObjectCreator.getMockStadiumObject();
        String status = StadiumHandler.handleStadiumInsertRequest(testStadiumDeatils);
        model.addObject("msg", status);

        return model;
    }
}
