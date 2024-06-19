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

        Publisher pub = new Publisher("bupper", "3184 mel", "Los Angeles", "CA", "99999");
        publisherRepository.save(pub);


        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "12343456789");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        ddd.setPublisher(pub);
        pub.getBooks().add(ddd);
        publisherRepository.save(pub);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book ("J2EE Development without EJB", "3637464736474");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(pub);
        pub.getBooks().add(noEJB);


        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(pub);
        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());

        System.out.println("Number of publisher: " + publisherRepository.count());
        System.out.println("Publisher: "+ pub.getName() + "has " + pub.getBooks().size() + " books!");
    }
    
}
