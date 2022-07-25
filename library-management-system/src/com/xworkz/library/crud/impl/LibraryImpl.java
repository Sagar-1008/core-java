package com.xworkz.library.crud.impl;

import java.util.Arrays;

import com.xworkz.library.crud.Library;
import com.xworkz.library.dto.BookDTO;

public class LibraryImpl implements Library {
	BookDTO[] books;
    int index;

   public LibraryImpl(int size){
	      books = new BookDTO[size];
		  System.out.println("The Library constructor is created");
	  
	  } 
     
		@Override
    public boolean createBook(BookDTO book){
	      System.out.println("Inside createBook()");
		  boolean isAdded = false;
		  if(book != null && book.getName() != null){
		      
			  this.books[index++] = book;
			  isAdded = true;
			  System.out.println("The book details are saved");
		  }
		  else{
		      System.out.println("The book details are not saved");
		  }
		  System.out.println("createBook() ended");
        return isAdded;
	   }

    @Override
    public void getBookDetails(){
		   System.out.println("Inside getBookDetails()");
	       for(int i=0; i<books.length;i++){
		   
		    System.out.println(books[i]);

		   }
		   System.out.println("The getBookDetails() ended");
	   
	   }
       
		  @Override
     public boolean updatePublicationByName(String name, String publication){
		 
		 System.out.println("Inside updatePublicationByName ");
		 boolean updatePublication = false;
		 for(int i=0; i<books.length;i++){
			 if(books[i].getName().equals(name)){
				 books[i].setPublication(publication);
				 updatePublication = true;
				 
			 }
			 else{
				 System.out.println("The book name is not found");
			 }
		 }
		 return updatePublication;
	 }	   
	 
	 @Override
	 public boolean deleteByName(String name){
		 System.out.println("inside deleteByName");
		 boolean deleteBook=false;
		 int i,j;
		 for(i=0,j=0;j<books.length;j++){
			 if(!books[j].getName().equals(name)){
				 books[i++]=books[j];
				 deleteBook = true;
			 } else {
				 System.out.println("the book is deleted");
			 }
		 }
		 books = Arrays.copyOf(books, i);
		 return deleteBook;
	 }
	 
	 @Override
	 public boolean deleteByAuthor(String author){
		 System.out.println("inside deleteByAuthor");
		 boolean deleteBook=false;
		 int i,j;
		 for(i=0,j=0;j<books.length;j++){
			 if(!books[j].getAuthor().equals(author)){
				 books[i++]=books[j];
				 deleteBook = true;
			 } else {
				 System.out.println("the book is deleted");
			 }
		 }
		 books = Arrays.copyOf(books, i);
		 return deleteBook;
	 }
	 
	 @Override
	 public String getBookNameById(int id){
		 System.out.println("Inside getBookNameById() ");
		 String bookName = null;
		 for(int i=0; i<books.length;i++){
			 if(books[i].getId()==id){
				 bookName = books[i].getName();
			 }
			 else{
				 System.out.println("The id is not matched");
			 }
		 }
		 return bookName;
	 }
	 
	 @Override
	 public String[] getAllBooksName(){
		 System.out.println("Inside getAllBooksName() ");
		 int i,j;
		 for( j=0,i=0;i<books.length;i++){ 
			  System.out.println(books[i].getName());
			  j++;
		 }
		    
		  String[] allbooksName = new String[j];
		   for(int k=0,m=0;k<books.length;k++){
			 allbooksName[m++] = books[k].getName(); 
		  }
        System.out.println("End getAllBooksName() ");
		 return allbooksName;
	 }
}