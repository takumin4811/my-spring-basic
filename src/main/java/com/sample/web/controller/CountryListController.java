package com.sample.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/countryList")
public class CountryListController {

  @RequestMapping
  public String index() {
    return "countryList";
  }

}
