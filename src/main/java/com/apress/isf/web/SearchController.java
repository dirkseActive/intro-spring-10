package com.apress.isf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apress.isf.spring.data.DocumentDAO;

/**
 * From Ch 10, p135
 * @author dirkseActive
 * @since  04/03/2017
 *
 */

@Controller
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	DocumentDAO documentDAO;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public String searchAll(Model model){
		model.addAttribute("docs", documentDAO.getAll());
		return "search/all";
	}

}
