package com.xworkz.library.crud;

import com.xworkz.library.dto.BookDTO;

public interface Library {
	boolean createBook(BookDTO book);
	void getBookDetails();
	boolean updatePublicationByName(String name, String publication);
	boolean deleteByName(String name);
	boolean deleteByAuthor(String author);
	String getBookNameById(int id);
	String[] getAllBooksName();
}
