package com.maldonadopublisher.springwebapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.maldonadopublisher.springwebapp.model.Author;
import com.maldonadopublisher.springwebapp.model.Book;
import com.maldonadopublisher.springwebapp.model.Publisher;
import com.maldonadopublisher.springwebapp.repositories.AuthorRepository;
import com.maldonadopublisher.springwebapp.repositories.BookRepository;
import com.maldonadopublisher.springwebapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner{

private final AuthorRepository authorRepository;
private final BookRepository bookRepository;
private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    this.publisherRepository = publisherRepository;
    
}

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "12343456789");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book ("J2EE Development without EJB", "3637464736474");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());

        Publisher pub = new Publisher("3184 mel", "Los Angeles", "CA", "99999");
        publisherRepository.save(pub);

        System.out.println("Number of publisher: " + publisherRepository.count());

    }
    
}
