package com.pwc.cara.cucumber;

import com.pwc.cara.CaraApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = CaraApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
