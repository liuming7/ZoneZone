package com.keeen.zonezone.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/finance")
public class FinanceHomeController {

    @RequestMapping(value = "/ping",method = RequestMethod.GET)
    @ResponseBody
    public String ping(){
        return "finance";
    }
}
