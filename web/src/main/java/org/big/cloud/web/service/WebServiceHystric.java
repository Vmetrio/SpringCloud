package org.big.cloud.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class WebServiceHystric implements WebService {

    private final static Logger logger = LoggerFactory.getLogger(WebServiceHystric.class);

    @Override
    public String demo(@RequestParam String name) {
        String info = "数据获取失败";
        logger.info("数据获取失败");
        return info;
    }
}