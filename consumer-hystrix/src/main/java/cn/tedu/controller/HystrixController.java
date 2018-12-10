package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.tedu.feign.HelloFeign;

@RestController
public class HystrixController {
	@Autowired
	private HelloFeign helloFeign;
	@RequestMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="failBackMethod")
	public String hello(@PathVariable String name){
		return helloFeign.hello(name);
	}
	public String failBackMethod(String name){
		return "999";
	}
}
