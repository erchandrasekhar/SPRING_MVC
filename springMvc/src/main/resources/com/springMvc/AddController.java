package com.springMvc;





import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {
	
	@RequestMapping("/")
   public String home()
	{
	   return "index";
    }
	
	
	@RequestMapping("/add")
	   public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
		{   
		   String fName=request.getParameter("t1");
		   String lName=request.getParameter("t2");
		   request.setAttribute("fName", fName);
		   request.setAttribute("lName", lName);
		   
		   return new ModelAndView("sucess");
	    }
		
}

