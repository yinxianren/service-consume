package com.yinxianren.study.serviceconsume.controller;

import com.yinxianren.study.serviceconsume.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    HiService hiService;


    /**
     *   测试 多次请求  http://localhost:5002/hi?name=forezp
     *
     *                 http://localhost:5002/actuator/hystrix.stream
     * @param name
     * @return
     */
    @GetMapping("/hi")
    public String hi(String name) {
        return hiService.hi(name);
    }

}
