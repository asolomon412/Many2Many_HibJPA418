package com.hibernate.HibernateDemo1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hibernate.HibernateDemo1.dao.PersonSpringDataRepository;
import com.hibernate.HibernateDemo1.entity.Person;

@Controller
public class HomeController {

	@Autowired
	PersonSpringDataRepository p;
	//PersonDao p;

	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println(p.findAll());
		return new ModelAndView("index", "list", p.findAll());
	}

	@RequestMapping("/search")
	public ModelAndView formResults(@RequestParam("id") int id) {
		Optional<Person> p1 = p.findById(id);
		if (p1 == null) {
			return new ModelAndView("searchresults", "person", "does not exist");

		}
		return new ModelAndView("searchresults", "person", p1);
	}

	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("id") int id) {
		return new ModelAndView("update", "id", id);
	}

	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") int id) {
		p.deleteById(id);
		return new ModelAndView("index", "list", p.findAll());
	}

	@RequestMapping(value = "/formupdate", method = RequestMethod.POST)
	public ModelAndView addUpdate(@RequestParam("id") int id,
			@RequestParam("name") String name, @RequestParam(name = "loc", required = false) String loc) {

//			Person p1 = new Person(id, name, loc);
//			p.save(p1);
//		

		return new ModelAndView("searchresults", "person", "");
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("name") String name,
			@RequestParam(name = "loc", required = false) String loc) {

		Person p1 = new Person(name, loc);
		p.save(p1);

		return new ModelAndView("searchresults", "person", p1);
	}

	// for old example
	// @RequestMapping("/searchName")
	// public ModelAndView formResults(@RequestParam("name") String name) {
	// Customers c = custRepo.findByName(name);
	// return new ModelAndView("searchresults", "cust", c);
	// }

}
