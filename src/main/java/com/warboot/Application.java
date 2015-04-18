package com.warboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jesus Barquín on 18/04/15.
 */
@SpringBootApplication
@RestController
public class Application extends SpringBootServletInitializer {

    private static Class<Application> applicationClass = Application.class;

    @RequestMapping(value = "/hi/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name){

        return "hello " + name + " have a nice day";
    }

    public static void main(String[] args){

        SpringApplication.run(Application.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}

