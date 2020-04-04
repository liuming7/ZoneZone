package com.keeen.zonezone.bill.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/bill")
@Slf4j
public class BillHomeController {

    @RequestMapping(value = "ping",method = RequestMethod.GET)
    @ResponseBody
    public String ping(){
        log.info("test in bill package");
        return "bill";
    }
}
