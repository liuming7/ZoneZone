package com.keeen.zonezone.finance.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/finance")
@Slf4j
public class FinanceHomeController {

    @RequestMapping(value = "/ping",method = RequestMethod.GET)
    @ResponseBody
    public String ping(){
        log.info("test in finance package");
        return "finance";
    }
}
