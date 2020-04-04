package com.keeen.zonezone.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/bill")
public class BillHomeController {

    @RequestMapping(value = "ping",method = RequestMethod.GET)
    @ResponseBody
    public String ping(){
        return "bill";
    }
}
