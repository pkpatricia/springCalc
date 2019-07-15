package com.example.calculator.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalcRestController {

    @RequestMapping(value = "/add/{x}/{y}", method = RequestMethod.GET, produces = "text/plain")

    public String add(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {

        return String.format("%d + %d = %d", x, y, (x+y));
    }

    @RequestMapping(value = "/sub/{x}/{y}", method = RequestMethod.GET, produces = "text/plain")

    public String sub(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {

        return String.format("%d - %d = %d", x, y, (x-y));
    }

    @RequestMapping(value = "/mul/{x}/{y}", method = RequestMethod.GET, produces = "text/plain")

    public String mul(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {

        return String.format("%d * %d = %d", x, y, (x*y));
    }

    @RequestMapping(value = "/div/{x}/{y}", method = RequestMethod.GET, produces = "text/plain")

    public String div(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {

        return String.format("%d / %d = %d", x, y, (x/y));
    }



}