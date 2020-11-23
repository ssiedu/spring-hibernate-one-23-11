package com.ssi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("newbook")
	public String showBookEntryForm() {
		return "dataentry";
	}
	
	@RequestMapping("savebook")
	public ModelAndView saveBookDetails(@ModelAttribute("bookinfo") Book book) {
		bookService.addNewBook(book);
		ModelAndView mv=new ModelAndView("saveconfirm");
		return mv;
	}
}
