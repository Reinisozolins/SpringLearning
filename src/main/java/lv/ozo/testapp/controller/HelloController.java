package lv.ozo.testapp.controller;

import lv.ozo.testapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    @ResponseBody
    public String helloWorld(){ return helloService.getHello() ;}

//    @GetMapping("/test")
//    @ResponseBody
//    public String helloWorld(){ return helloService.getHello() ;}


}
