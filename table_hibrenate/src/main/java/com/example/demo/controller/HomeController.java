package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.GeneDao;
import com.example.demo.entity.Drug;
import com.example.demo.entity.Gene;

@Controller
public class HomeController {
	
	@Autowired
	GeneDao geneDao;
	

	@GetMapping("/")
	public String getGenes(){
		return "home";
	}
	
	@GetMapping("/gene_search")
	public String geneSearch() {
			return "gene_search";
	}
	
	@GetMapping("/drug_search")
	public String drugSearch() {
		return "drug_search";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@PostMapping("/geneDetails")
	public ModelAndView geneDetails(@RequestParam("searchtext") String gene) {
		ModelAndView m = new ModelAndView("gene_details");
		
		List<Gene> genelist = geneDao.geneList(gene);
		m.addObject("gene",gene);
		m.addObject("url", "/drug_search/");
		m.addObject("geneList", genelist);
		return m;
	}
	
	@GetMapping("/drug_search/{drugName}")
	public ModelAndView drugDetails(@PathVariable("drugName") String drugName) {
		ModelAndView m = new ModelAndView("drug_details");
		System.out.println(drugName);
		List<Drug> drugList = geneDao.drugList(drugName,null);
		m.addObject("drugName", drugName);
		m.addObject("drugList", drugList);
		return m;
	}
	
	@GetMapping("/drugDetails")
	public ModelAndView drugDetailsList(@RequestParam("drugName") String drugName,@RequestParam("category") String category) {
		ModelAndView m = new ModelAndView("drug_details");
		System.out.println(drugName+"  "+category);
		List<Drug> drugList = geneDao.drugList(drugName,"aaa");
		m.addObject("drugName", drugName);
		m.addObject("drugList", drugList);
		return m;
	}
	
}
