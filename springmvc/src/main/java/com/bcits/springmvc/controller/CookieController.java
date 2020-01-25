package com.bcits.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieController {

	@GetMapping("/cookiePage")
	public String getCookiePage() {
		return "cookiePage";
	}// End of getCookiePage()

	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap modelMap) {
		Cookie myCookie = new Cookie("empName", "Vidhya");
		resp.addCookie(myCookie);

		modelMap.addAttribute("msg", "Cookie Created Successfully..");
		return "cookiePage";
	}// End of createCookie()

	@GetMapping("/readCookie")
	public String readCokkie(@CookieValue(name = "empName", required = false) String employeeName, ModelMap map) {
		if(employeeName != null) {
		map.addAttribute("msg", "Cookie value is " + employeeName);
		} else {
			map.addAttribute("errMsg", "Cookie Not Present");
		}
		return "cookiePage";
		
	}// End of readCookie()

}// End of Class
