package org.big.cloud.web.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "dao", fallback = WebServiceHystric.class)
public interface WebService {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    String demo(@RequestParam("name") String name);

}