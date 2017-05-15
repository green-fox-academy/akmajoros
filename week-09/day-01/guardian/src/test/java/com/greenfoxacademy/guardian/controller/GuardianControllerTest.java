package com.greenfoxacademy.guardian.controller;


import org.junit.runner.RunWith;
import com.greenfoxacademy.guardian.GuardianApplication;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void grootSpeakTest() throws Exception{
    mockMvc.perform(get("/groot").param("message", "some"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received", is("some")))
            .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void grootSpeakTestTwo() throws Exception{
    mockMvc.perform(get("/groot").param("message", ""))
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }

}