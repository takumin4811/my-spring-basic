package com.sample.web.restcontroller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.domain.Hoge;

/**
 * @author t-nishimura.
 */
@RestController
@RequestMapping("/api/Hello/")
public class HelloWorldRestController {
  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public String hello() {
    return "Hello World!!!";
  }

  /**
   * コントローラメソッド.
   */
  @RequestMapping(method = RequestMethod.POST)
  public Hoge hoge1(@RequestBody Hoge param) {
    System.out.println(param);

    Hoge hoge = new Hoge();
    hoge.id = 20;
    hoge.value = "Response";

    return hoge;
  }

}
