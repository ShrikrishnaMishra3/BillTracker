
package com.billTracker.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.billTracker.Service.VisitorService;
import com.billTracker.model.VisitorModel;

@Controller
public class VisitorController {

	@Autowired
	private VisitorService service;

	@RequestMapping("/")
	public ModelAndView home() {

		ModelAndView mav = new ModelAndView("index");
		List<VisitorModel> listVisitor = service.listAll();
		mav.addObject("listVisitor", listVisitor);

		return mav;
	}

	@RequestMapping("/new")
	public String newVisitorForm(Map<String, Object> model) {
		model.put("visitorNew", new VisitorModel());
		return "new_visitor";

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveVisitorModel(@ModelAttribute("visitorNew") VisitorModel visitorNew) {
		service.save(visitorNew);
		return "redirect:/bill/billPage";

	}
}
