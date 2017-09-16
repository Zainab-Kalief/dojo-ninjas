package com.wura.dojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wura.dojo.models.Dojo;
import com.wura.dojo.models.Ninja;
import com.wura.dojo.services.DojoNinjaService;

@Controller
public class DojoNinjaController {
	private final DojoNinjaService service;
	public DojoNinjaController(DojoNinjaService service) {
		this.service = service;
	}
	@RequestMapping("/{id}")
	public String home(@PathVariable("id") Long id, Model model) {
		service.findDojo(id);
		model.addAttribute("dojo", service.findDojo(id));
		model.addAttribute("ninjas", service.findDojo(id).getNinjas());
		return "home";
	}
	@RequestMapping("/dojos/new")
	public String dojo(@ModelAttribute("newDojo") Dojo dojo) {
		return "dojo";
	}
	@PostMapping("/dojos/new")
	public String newDojo(@ModelAttribute("newDojo") Dojo dojo) {
		service.addDojo(dojo);
		return "redirect:/dojos/new";
	}
	@RequestMapping("/ninjas/new")
	public String ninja(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		model.addAttribute("dojos", service.allDojos());
		return "ninja";
	}
	@PostMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("newNinja") Ninja ninja, @RequestParam("dojo") String id) {
		Long number= Long.valueOf(id);
		ninja.setDojo(service.findDojo(number));
		service.addNinja(ninja);
		return "redirect:/ninjas/new";
	}
	
	
	
}
