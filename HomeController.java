package com.niit.shoppingcart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Controller
public class HomeController {
	@Autowired
	CategoryDAO categoryDAO;
	@RequestMapping("/")
	public ModelAndView home(){
	
		
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("message", "Thank you for using this URL");
		List<Category> categoryList=categoryDAO.list();
		mv.addObject("categoryList", categoryList);
		System.out.println("size:"+categoryList.size());
		
		
		return mv;
	}

}
