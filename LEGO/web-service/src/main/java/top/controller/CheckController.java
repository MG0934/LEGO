package top.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description: 检查网关转发测试
 * create by : Mxy
 * time : 2018-10-23 11:35:37
 */
@RestController
@RequestMapping("/check")
public class CheckController {

    @GetMapping("/add")

    public Integer add(Integer a,Integer b){

        return a+b;
    }

    @GetMapping("/getPort")

    public String add(HttpServletRequest httpServletRequest){

        return httpServletRequest.getServerName()+":"+httpServletRequest.getServerPort();
    }
}
