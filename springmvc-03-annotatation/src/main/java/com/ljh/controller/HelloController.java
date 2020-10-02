package com.ljh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author laijinhan
 * @date 2020/10/2 4:12 下午
 */

@Controller
public class HelloController {

	@RequestMapping("/hello") // 这里就相当于网页上请求的url
	public String hello(Model model){
		// 封装数据
		model.addAttribute("msg", "Hello SrpingMvcAnnotation");
		return "hello"; // 会被视图解析器处理
	}
}
