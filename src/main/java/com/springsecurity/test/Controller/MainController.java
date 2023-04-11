package com.springsecurity.test.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class MainController {

    @RequestMapping(path = "/main", method = RequestMethod.GET)
    public String getMain() {
        log.info("/getMain START");
        return "main";
    }
}
