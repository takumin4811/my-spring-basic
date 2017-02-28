package com.sample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Hello")
public class HelloWorldController {
  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public String hello() {
    return "Hello World";
  }
}
