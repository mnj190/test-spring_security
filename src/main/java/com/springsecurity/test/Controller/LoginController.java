package com.springsecurity.test.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
public class LoginController {

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String getLogin() {
        log.info("/login START");
        return "login";
    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String getTest() {

        return "test";
    }

//    @RequestMapping(path = "/", method = RequestMethod.GET)
//    public String getIndex() {
//
//        return "index";
//    }
}
