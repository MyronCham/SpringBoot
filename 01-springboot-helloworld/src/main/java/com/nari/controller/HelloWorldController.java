package com.nari.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot HelloWorld
 * @author Administrator
 *
 */
//@Controller
//@ResponseBody
@RestController //相当于@Controller+@ResponseBody
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public Map<String, Object> showHelloWord() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("msg", "HelloWorld");
		return map;
	}

}
