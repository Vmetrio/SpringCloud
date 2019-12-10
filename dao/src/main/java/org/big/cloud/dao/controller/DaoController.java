package org.big.cloud.dao.controller;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "v1.0", value = "测试接口", description = "测试接口", produces = "application/json, application/xml")
public class DaoController {

    private final static Logger logger = LoggerFactory.getLogger(DaoController.class);

    @GetMapping(value = "/info")
    @ApiOperation(value = "测试web数据传输")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名称", dataType = "String", required=false, paramType = "query")
    })
    public String demo(@RequestParam("name") String name) {
        String info = "欢迎 "+ name + " 使用SpringCloud脚手架！";
        return info;
    }
}