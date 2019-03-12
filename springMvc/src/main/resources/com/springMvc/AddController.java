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
	       ModelAndView mv=new ModelAndView();
	       
	       /*Getting value of text box from jsp by using request */
		   String fName=request.getParameter("t1");
		   String lName=request.getParameter("t2");
		   
	   
		  /* request.setAttribute("fName", fName);
		   request.setAttribute("lName", lName);*/
		   
		   /*in spring mvc we can send data from controller to jsp by using ModelAndView object*/
		   mv.setViewName("success");
		   mv.addObject("fName", fName);
		   mv.addObject("lName", lName);
		   
		   return mv;
	    }
		
}

