package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.LocationStats;
import com.example.demo.service.DataService;

@Controller
public class HomeController {

	@Autowired
	DataService dataService;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> list = dataService.getAllStats();
		model.addAttribute("locationStats",list);
		int totalReportedCases = list.stream().mapToInt(stat->stat.getTotalCases()).sum();
		model.addAttribute("totalReportedCases", totalReportedCases);
		return "home";
	}
	
	@GetMapping("/home")
	public String homePage(Model model) {
		List<LocationStats> list = dataService.getAllStats();
		model.addAttribute("locationStats",list);
		int totalReportedCases = list.stream().mapToInt(stat->stat.getTotalCases()).sum();
		model.addAttribute("totalReportedCases", totalReportedCases);
		return "home";
	}
	
}
