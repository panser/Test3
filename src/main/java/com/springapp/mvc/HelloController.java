package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class HelloController {

    private HibernateSpitterDao hibernateSpitterDao;

    @Autowired
    public HelloController(HibernateSpitterDao hibernateSpitterDao) {
        this.hibernateSpitterDao =  hibernateSpitterDao;
    }


	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(Model model) {
		model.addAttribute("message", "Hello world!");
        model.addAttribute("Student",new Student());
		return "hello";
	}

    @RequestMapping(method = RequestMethod.POST)
    public String printWelcome1(@Valid @ModelAttribute("Student") Student student,
                                BindingResult result,Model model) {

        if(result.hasErrors())
            return "start";
        else {
        hibernateSpitterDao.savestudent(student);
        return "hello";
           }
    }

}