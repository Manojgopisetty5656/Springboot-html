package com.okayjava.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.okayjava.html.model.Product;

@Controller
public class GuidedNavController {
	
	@GetMapping("/guided")
	public String index() {
		
		return "guidednav";
	}
	
	@PostMapping("/guidedform")
	public String productSearch(@ModelAttribute Product product, Model model) {
		
	   System.out.println(product.toString());
	   System.out.println(product.getOriginalBrand());
	   System.out.println(product.getGuidancePrice());
	   System.out.println(product.getIsvPrice());
		model.addAttribute("OriginalBrand", product.getOriginalBrand());
		model.addAttribute("GuidancePrice", product.getGuidancePrice());
		model.addAttribute("IsvPrice", product.getIsvPrice());
		
		return "welcome2";
	}	
	
	

}
