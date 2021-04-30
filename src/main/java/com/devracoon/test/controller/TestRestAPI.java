package com.devracoon.test.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/test/api")
public class TestRestAPI {

    @RequestMapping("{name}")
    public TestDTO testapi(HttpServletRequest request , HttpServletResponse response,
                           @PathVariable("name") String name) throws Exception{
        response.sendRedirect(request.getContextPath() + "/test/api/forward/" + name);

        return TestDTO.builder().id("1").name(name).build();
    }

    @RequestMapping("/forward/{name}")
    public TestDTO forwardTestApi(@PathVariable("name") String name){

        return TestDTO.builder().id("1").name(name).build();
    }

}
