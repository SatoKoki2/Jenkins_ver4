package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JenkinsController {

	@RequestMapping(value = "/")
	private String jenkinsCon() {
		return "/index.html";
	}

	@PostMapping("/result")
	public ModelAndView result(@RequestParam("demoText") String demoText, ModelAndView mv) {

		mv.setViewName("result");
		mv.addObject("demoText", demoText);

		return mv;
	}

}