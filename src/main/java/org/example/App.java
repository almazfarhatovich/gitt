package org.example;

import org.example.models.Book;
import org.example.models.Vendor;
import org.example.repositories.BookRepository;
import org.example.repositories.VendorRepository;

import java.math.BigDecimal;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        BookRepository bookRepository = new BookRepository();
        VendorRepository vendorRepository = new VendorRepository();

//        Vendor vendor = new Vendor("Kunzaada","kunzaada@gmail.com");
//        Book book1 = new Book("Becoming", "Mishel Obama", BigDecimal.valueOf(2000));
//        Book book2 = new Book("Educated", "Tara Westover", BigDecimal.valueOf(1400));
//        bookRepository.merge(book1);
//        bookRepository.merge(book2);
//        bookRepository.findAll().forEach(System.out::println);
//        bookRepository.close();
//
//        vendor.setBookList(List.of(book1,book2));
//        vendorRepository.save(vendor);
//        vendorRepository.finAll().forEach(System.out::println);
//        vendorRepository.close();




    }
}
