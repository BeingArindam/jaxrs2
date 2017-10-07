package com.home.demo.bookstore.restserver.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.home.demo.bookstore.restserver.rest.domain.Book;
import com.home.demo.bookstore.restserver.rest.helper.BookBuilder;

@Path("/books")
@Stateless
public class BookResources {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllBooks() {
		final BookBuilder builder = new BookBuilder();
		final List<Book> books = new ArrayList<>();
		books.add(builder.setAuthor("Arindam mondal").setIsbn("1234099777473").setName("Java Complete Reference")
				.setPrice(34.59).setPublisher("O'really").setUrl("http://www.bookstore.com/jcr")
				.setReleaseDate(new Date()).build());
		final GenericEntity<List<Book>> genericEntity = new GenericEntity<>(books, ArrayList.class);
		return Response.ok(genericEntity).build();
	}
}
