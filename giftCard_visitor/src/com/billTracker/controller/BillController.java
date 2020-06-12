package com.billTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.billTracker.Service.BillService;
import com.billTracker.model.BillModel;

@Controller
public class BillController {

	@Autowired
	private BillService service;

	@RequestMapping("/bill")
	public ModelAndView home() {

		ModelAndView mav = new ModelAndView("billPage");

		List<BillModel> listbill = service.listAll();

		mav.addObject("listbill", listbill);
		System.out.println(listbill);

		return mav;
		
	
	}
}
