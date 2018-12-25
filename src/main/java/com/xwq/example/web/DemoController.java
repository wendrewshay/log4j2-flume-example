package com.xwq.example.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    public static Logger logger = LoggerFactory.getLogger(DemoController.class.getName());

    @RequestMapping("/test")
    public void test() {
        logger.debug("debug级别日志");
        logger.info("info级别日志");
        logger.error("error级别日志");
    }
}
