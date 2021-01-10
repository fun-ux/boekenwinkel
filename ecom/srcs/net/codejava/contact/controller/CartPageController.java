package net.codejava.contact.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("Cart")
public class CartPageController {

	/*@GetMapping("/cart")
	 public String cart(@ModelAttribute("Cart") List<int[]>  cart, final Model model) {
		
		  model.addAttribute("shopcart", cart);
		  return "cart";
	 }*/
}
