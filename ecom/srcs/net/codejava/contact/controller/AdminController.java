package net.codejava.contact.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.contact.dao.BoekenDAO;
import net.codejava.contact.model.Bestelling;
import net.codejava.contact.model.Boeken;
import net.codejava.contact.model.GetBoekID;
import net.codejava.contact.model.GetKlantID;
import net.codejava.contact.model.loggedIn;
import net.codejava.contact.service.BoekenService;

@Controller
@SessionAttributes("LoggedIn")
public class AdminController {
	
	@Autowired
	private BoekenService service;
	
	 
	
	@ModelAttribute("LoggedIn")
	 public loggedIn Logged(){
		return new loggedIn(0); 
	}
	
	 
	@RequestMapping(value = "/admin")
	public ModelAndView listBoeken(ModelAndView model, @ModelAttribute("LoggedIn") loggedIn  logged) {
		
		if(logged.getLogged() == 0) {
			return new ModelAndView("redirect:/login");
		}
		
		List<Boeken> listBoeken = service.list();
		model.addObject("listBoeken", listBoeken);
		model.setViewName("index");
		//System.out.println(model);
		//System.out.println(logged.getLogged());
		return model;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String index(@ModelAttribute("LoggedIn") loggedIn  logged) {
		if(logged.getLogged() == 1) {
 			return ("redirect:/admin");
		}
		//System.out.println(logged);
		return "login";
	}
	
	@RequestMapping(value = "/confirmation", method = RequestMethod.POST)
	public String login(@ModelAttribute("LoggedIn") loggedIn  logged, String username, String password, final Model model) {
		
		if(logged.getLogged() == 1) {
 			return ("redirect:/admin");
		}
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
			logged.setLogged(1);
			logged.setStatus("gelukt");
			model.addAttribute("LoggedIn", logged);
			
			return "redirect:/admin";
		} else {
			//modelMap.put("error", "Invalid Account");
			logged.setStatus("Invalid Account");
			model.addAttribute("LoggedIn", logged);
			return "login";
		}
	}
	

	@RequestMapping(value = "/admin/aankopen", method = RequestMethod.GET)
	public ModelAndView aankopen(@ModelAttribute("LoggedIn") loggedIn  logged,ModelAndView model) {
		if(logged.getLogged() == 0) {
			return new ModelAndView("redirect:/login");
		}
		List<Bestelling> bestellingen = service.getAankopen();

		//Boeken nieuwBoek = new Boeken();
		model.addObject("aankopen", bestellingen);
		model.setViewName("aankopen");
		//System.out.println(model);
		return model;
	}
	
	
	@RequestMapping(value = "/admin/nieuw", method = RequestMethod.GET)
	public ModelAndView nieuwBoek(@ModelAttribute("LoggedIn") loggedIn  logged,ModelAndView model) {
		if(logged.getLogged() == 0) {
			return new ModelAndView("redirect:/login");
		}
		
		Boeken nieuwBoek = new Boeken();
		model.addObject("boeken", nieuwBoek);
		model.setViewName("boeken_form");
		//System.out.println(model);
		return model;
	}
	
 
	@RequestMapping(value = "/admin/save", method = RequestMethod.POST)
	public ModelAndView saveBoekimg(@ModelAttribute("LoggedIn") loggedIn  logged,
			@ModelAttribute Boeken boeken, @RequestParam("file") MultipartFile file, ModelAndView model, HttpServletRequest request) {
		if(logged.getLogged() == 0) {
			return new ModelAndView("redirect:/login");
		}
		
		System.out.println(boeken);
		
 		
		String saveFolder = "C:\\Users\\hppavilion\\eclipse-workspace\\ecom\\src\\main\\webapp\\resources\\img\\";
		
		//System.out.println(saveFolder);
		
		 String fileName = file.getOriginalFilename();
		 System.out.println("applied directory : " + saveFolder+fileName);
		 
		 if(!"".equalsIgnoreCase(fileName)){
            
			 try {
				file.transferTo(new File(saveFolder + fileName));
			} catch (IllegalStateException | IOException e) {
 				e.printStackTrace();
			}              
		 }
		 
		 
		
		 
		 service.save(boeken);
		 
		 List<GetBoekID> boekIDList = service.GetBoekid(); 
		 Integer boekID = boekIDList.get(0).getId();
		 
		 service.saveDetails(boeken, boekID);
		 
		 
 	
		/*if(boeken.getId() == null) {
			service.save(boeken);
		}
		else {
			service.update(boeken);
		}*/
		
		
		return new ModelAndView("redirect:/admin");
	}
	
	
 
	
	@RequestMapping(value = "/admin/edit", method = RequestMethod.GET)
	public ModelAndView editBoek(@ModelAttribute("LoggedIn") loggedIn  logged, HttpServletRequest request) {
		if(logged.getLogged() == 0) {
			return new ModelAndView("redirect:/login");
		}
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		Boeken boeken = service.get(id);
		
		System.out.println(boeken);
		
		ModelAndView model = new ModelAndView("boeken_form_edit");
		model.addObject("boeken", boeken);
		model.setViewName("boeken_form_edit");
		
		return model;
	}
	
	@RequestMapping(value = "/admin/save_edit", method = RequestMethod.POST)
	public ModelAndView saveBoekedit(@ModelAttribute("LoggedIn") loggedIn  logged,
			@ModelAttribute Boeken boeken, @RequestParam("file") MultipartFile file, ModelAndView model, HttpServletRequest request, Integer id) {
		if(logged.getLogged() == 0) {
			return new ModelAndView("redirect:/login");
		}
		
		System.out.println(boeken);
		System.out.println("id: "+id);
 		
		String saveFolder = "C:\\Users\\hppavilion\\eclipse-workspace\\ecom\\src\\main\\webapp\\resources\\img\\";
		
		//System.out.println(saveFolder);
		
		 String fileName = file.getOriginalFilename();
		 System.out.println("applied directory : " + saveFolder+fileName);
		 
		 if(!"".equalsIgnoreCase(fileName)){
            
			 try {
				file.transferTo(new File(saveFolder + fileName));
			} catch (IllegalStateException | IOException e) {
 				e.printStackTrace();
			}              
		 }
		 
		 
		
		 
		 service.update(boeken, id);
		 
 		 
		 service.updateDetails(boeken, id);
		 
		 
 	
		/*if(boeken.getId() == null) {
			service.save(boeken);
		}
		else {
			service.update(boeken);
		}*/
		
		
		return new ModelAndView("redirect:/admin");
	}
	
	

}
