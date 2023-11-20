package com.cognizant.school.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Library {
	
  @Autowired
  private Book book;
  
  List<Book> books=new ArrayList<Book>();
 
  public void displayBookDetails () {
	    System.out.println("Printing Details Of Book");
	  
	    	System.out.println("title\t"+book.getTitle());
	    	System.out.println("Author\t"+book.getAuthor());
	   
  }
    

}
