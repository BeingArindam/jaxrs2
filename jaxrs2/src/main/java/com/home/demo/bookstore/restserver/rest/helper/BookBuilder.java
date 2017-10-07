package com.home.demo.bookstore.restserver.rest.helper;

import java.util.Date;

import com.home.demo.bookstore.restserver.rest.domain.Book;

public class BookBuilder {
	private String isbn;
	private String name;
	private String author;
	private String publisher;
	private Double price;
	private String url;
	private Date releaseDate;

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public BookBuilder setIsbn(String isbn) {
		this.isbn = isbn;
		return this;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public BookBuilder setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public BookBuilder setAuthor(String author) {
		this.author = author;
		return this;
	}

	/**
	 * @param publisher
	 *            the publisher to set
	 */
	public BookBuilder setPublisher(String publisher) {
		this.publisher = publisher;
		return this;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public BookBuilder setPrice(Double price) {
		this.price = price;
		return this;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public BookBuilder setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @param releaseDate
	 *            the releaseDate to set
	 */
	public BookBuilder setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
		return this;
	}

	public Book build() {
		return new Book(this.isbn, this.name, this.author, this.publisher, this.price, this.url, this.releaseDate);
	}

}
