package net.codejava.contact.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.contact.dao.BoekenDAO;
import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.CartItem;
import net.codejava.contact.model.GetKlantID;
import net.codejava.contact.model.Klant;
import net.codejava.contact.model.ShoppingCart;
import net.codejava.contact.model.Sum;
import net.codejava.contact.service.ShoppingService;

@Controller
@SessionAttributes("Cart")
public class MainController {
	
	@Autowired
	private ShoppingService service;
	
	@ModelAttribute("Cart")
	 public List<int[]> shopcart(){
		return new ArrayList<int[]>(); 
	}
	
	@RequestMapping(value = "/")
	public ModelAndView listBoeken(ModelAndView model) {
		List<Boeken> bookList = service.getBooks();
		model.addObject("bookList", bookList);
		model.setViewName("home");
		//System.out.println(model);
		return model;
	}
	@RequestMapping(value = "/myBooks/{filter}", method = RequestMethod.GET)
	public ModelAndView myBooks(ModelAndView model, @PathVariable("filter") String filter) {
		
		List<Boeken> bookList = service.getFilter(filter);
		model.addObject("returned_books", bookList);
		model.setViewName("product_filtered");
		
		//System.out.println(model);
		return model;
	}
	
	 
	
	@RequestMapping(value = "/AddToCart", method = RequestMethod.POST)
    public String addToCart(@ModelAttribute("Cart") List<int[]>  cart, Model model, Integer item_id) {
      
		
		CartItem item = service.get(item_id);
		
		service.addToCart(item, cart);
		model.addAttribute("status", service.getPostStatusCode());
        return "AddToCart";
    }
	
	@RequestMapping(value = "/removeItem/{item_id}", method = RequestMethod.GET)
    public String removefromcart(@ModelAttribute("Cart") List<int[]>  cart, Model model, @PathVariable("item_id") Integer item_id) {
      
		CartItem item = service.get(item_id);
		
		service.removeFromCart(item, cart);
		//System.out.println(item.getId());
		
		model.addAttribute("statuscode", service.getPostStatusCode());
        return "removeItem";
    }
	
	
	 
	
	@GetMapping("/cart")
	 public String cart(@ModelAttribute("Cart") List<int[]>  cart, final Model model) {
			
 
		
		List<ShoppingCart> FoundBooks = new ArrayList();

		Sum sum = new Sum();
		sum.setSum(0.0);
		
		/* Update db met nieuwe voorraad
		Integer nieuweVooraad;*/
		
		 for(int i=0; i < cart.size(); i++) {
		         	
 					/*System.out.println("new");

			 		System.out.println("id = " + cart.get(i)[0]);
		 			System.out.println("quant = " + cart.get(i)[1]  );*/
		 			
		 			ShoppingCart item = service.getBoek(cart.get(i)[0]);
		 			
		 			FoundBooks.add(item);
		 			FoundBooks.get(i).setQuantity(cart.get(i)[1]);
		 			
		 			/* Update db met nieuwe voorraad
		 			nieuweVooraad = FoundBooks.get(i).getVooraad() - FoundBooks.get(i).getQuantity();
		 			System.out.println(nieuweVooraad);*/
		 			
		 			double total = FoundBooks.get(i).getPrijs() * FoundBooks.get(i).getQuantity();
		 			
		 			sum.addSum(total);
		 			
		 			
		 			
		 			 
			 		//System.out.println("end");
		    }
		 	//System.out.println("sum: "+sum.getSum());
	 	  model.addAttribute("Sum", sum);
		  model.addAttribute("CartItems", FoundBooks);

		  return "cart";
	 }
	
	@GetMapping("/checkout")
	 public ModelAndView checkout(@ModelAttribute("Cart") List<int[]>  cart, final ModelAndView model) {
		if(cart.size() == 0) {
			return new ModelAndView("redirect:/cart");
		} 
 		model.setViewName("checkout_form");

		return model;
	}
	
	@RequestMapping(value = "/action_page", method = RequestMethod.POST)
	 public ModelAndView action_page(@ModelAttribute("Cart") List<int[]>  cart, final ModelAndView model
			 , String exampleInputVoornaam, String exampleInputAchternaam, String exampleInputEmail1, String exampleInputTelefoonnummer, String exampleInputAddress
			 , String exampleInputPostcode) {
		if(cart.size() == 0) {
			return new ModelAndView("redirect:/cart");
		} 
		Klant klant = new Klant(exampleInputVoornaam, exampleInputAchternaam, exampleInputEmail1, exampleInputTelefoonnummer, exampleInputAddress, exampleInputPostcode);
		
		//insert klant gegevens in db
		service.insertKlant(klant);
		
		List<GetKlantID> klantenId = service.getKlantId(); 
		
		Integer klantID = klantenId.get(0).getId();
		
		List<ShoppingCart> FoundBooks = new ArrayList();

		// Update db met nieuwe voorraad
		Integer nieuweVooraad;
		
		 for(int i=0; i < cart.size(); i++) {
		         	
 					/*System.out.println("new");

			 		System.out.println("id = " + cart.get(i)[0]);
		 			System.out.println("quant = " + cart.get(i)[1]  );*/
		 			
		 			ShoppingCart item = service.getBoek(cart.get(i)[0]);
		 			
		 			FoundBooks.add(item);
		 			FoundBooks.get(i).setQuantity(cart.get(i)[1]);
		 			
		 			// Update db met nieuwe voorraad
		 			nieuweVooraad = FoundBooks.get(i).getVooraad() - FoundBooks.get(i).getQuantity();
		 			//System.out.println("new voor: "+nieuweVooraad);
		 			service.updateVoorraad(FoundBooks.get(i).getId(), nieuweVooraad);
		 			
		 			//plaats de bestelling in de db
		 			Integer bestelDetailsID = FoundBooks.get(i).getId();
		 			service.nieuwBestelling(bestelDetailsID, klantID, FoundBooks.get(i).getQuantity());
		 			
		 			
		 			
		 			 
			 		//System.out.println("end");
		    }
		cart.clear();
		return new ModelAndView("redirect:/success_page");
	}
	
	
	@GetMapping("/success_page")
	 public String success_page(@ModelAttribute("Cart") List<int[]>  cart, final Model model) {
			return "success_page";
	}
	
	@GetMapping("/cartSum")
	 public String cartSum(@ModelAttribute("Cart") List<int[]>  cart, final Model model) {
			

		
		List<ShoppingCart> FoundBooks = new ArrayList();

		Sum sum = new Sum();
		sum.setSum(0.0);
		
		 for(int i=0; i < cart.size(); i++) {
		         	 
		 			ShoppingCart item = service.getBoek(cart.get(i)[0]);
		 			
		 			FoundBooks.add(item);
		 			FoundBooks.get(i).setQuantity(cart.get(i)[1]);
		 			
		 			double total = FoundBooks.get(i).getPrijs() * FoundBooks.get(i).getQuantity();
		 			
		 			sum.addSum(total);
		 			
		 			
		 			
		 			 
			 		//System.out.println("end");
		    }
		 	//System.out.println("sum: "+sum.getSum());
	 	  model.addAttribute("Sum", sum.getSum());
		  model.addAttribute("CartItems", FoundBooks);

		  return "getSum";
	 }
}
