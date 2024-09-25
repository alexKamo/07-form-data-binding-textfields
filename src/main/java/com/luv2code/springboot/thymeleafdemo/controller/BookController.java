package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @GetMapping("/showBookForm")
    public String showBook(Model theModel){

        Book theBook = new Book();

        theModel.addAttribute("book", theBook);

        return "book-form";
    }

    @PostMapping("/processBookForm")
    public String processBookForm(@ModelAttribute("book") Book theBook){

        System.out.println("theBook: " + theBook.getTitle() + " " + theBook.getAuthor() + " " + theBook.getPageAmount());

        return "book-confirmation";
    }
}
