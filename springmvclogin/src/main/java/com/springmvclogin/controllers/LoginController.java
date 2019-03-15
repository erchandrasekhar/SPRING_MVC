package com.springmvclogin.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	

	@RequestMapping("/")
   public String home()
	{
	   return "login";
    }
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	   public ModelAndView login(HttpServletRequest request,HttpServletResponse response)
		{
		  ModelAndView mv=new ModelAndView();
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(userName+":::::"+password);
		
		if(userName.equals("admin") && password.equals("123"))
		{
			mv.setViewName("success");
			mv.addObject("msg", "login successfully");
		}
		
		
		else
		{
			mv.setViewName("login");
			mv.addObject("msgfail", "Login Faild...");
		}
		    
		   return mv;
	    }
		
	
	   @RequestMapping(value="/registration",method=RequestMethod.POST)
        public ModelAndView registrartion(HttpServletRequest request,HttpServletResponse response)
        {
        	
        	ModelAndView mv=new ModelAndView();
        	mv.setViewName("login");
        	return mv;
        }
	
	

}
