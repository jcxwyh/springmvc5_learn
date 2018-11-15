package pro.onlyou.springmvc5.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("")
    @ResponseBody
    public String sayHello(){
        return "hello";
    }

    @RequestMapping("/cookie")
    @ResponseBody
    public String cookie(@CookieValue("JSESSIONID") String jsession){
        return jsession;
    }

}
