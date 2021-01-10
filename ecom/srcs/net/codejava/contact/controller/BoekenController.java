package net.codejava.contact.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.contact.model.Boeken;
import net.codejava.contact.service.ShoppingService;

@RestController
public class BoekenController {

	/*@Autowired
	private ShoppingService service;
	
	List<Boeken> FoundBoekenStorage = new ArrayList<>();
	 
	@GetMapping ("/getBooks/{filter}")
	public ResponseEntity<List<Boeken>> getFilter(@PathVariable("filter") String filter) {
		try {
			List<Boeken> bookList = service.getFilter(filter);
			System.out.println(bookList);
			
		    return new ResponseEntity<List<Boeken>>(bookList, HttpStatus.OK);
		    
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
		
		 
	}*/
}
