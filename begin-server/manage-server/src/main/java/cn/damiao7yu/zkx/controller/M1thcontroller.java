package cn.damiao7yu.zkx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Controller
@RestController
public class M1thcontroller {

	
	@RequestMapping("/customer/saveImage")
	@ResponseBody
	public Object saveImage(@RequestParam(value="image",required=false) String image) throws Exception {
		return "ok:"+image;
	}
	
}
