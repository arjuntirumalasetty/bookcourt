package com.controller;

import com.findsport.controllers.AdminRegisterController;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

/**
 * Created by Arjun on 12/29/2016.
 */
public class AdminRegistrationControllerTest {
    @InjectMocks
    AdminRegisterController adminRegistrationController;

    private MockMvc mockMVC;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        mockMVC = MockMvcBuilders.standaloneSetup(adminRegistrationController).build();
    }

    @Test
    public void test(){
        try {
            mockMVC.perform(post("/firstTest").
                    content("{\"stadiumID\":0,\"stadiumLongitude\":\"1234.1234\",\"stadiumLatitude\":\"1234.123\",\"stadiumPhoneNo\":\"1234567890\",\"stadiumAddress\":\"testStadiumaddress\",\"stadiumName\":\"testStadiumName\"}").
                    contentType(MediaType.APPLICATION_JSON)).
                    andDo(print());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
