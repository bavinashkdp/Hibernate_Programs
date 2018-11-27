package com.telusko.CachingLevel1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book 
{
	@Id
	private int bookPages;
	private String bookName;
	private double price;
	public int getBookPages() {
		return bookPages;
	}
	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookPages=" + bookPages + ", bookName=" + bookName + ", price=" + price + "]";
	}
	

}
