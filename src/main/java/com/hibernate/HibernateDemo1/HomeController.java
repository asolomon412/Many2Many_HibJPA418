package com.hibernate.HibernateDemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hibernate.HibernateDemo1.dao.PersonSpringDataRepository;

@Controller
public class HomeController {

	@Autowired
	PersonSpringDataRepository p;
	// PersonDao p;

	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println(p.findAll());
		return new ModelAndView("index", "list", p.findAll());
	}

}
