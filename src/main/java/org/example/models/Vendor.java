package org.example.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;

@Entity
@Table(name = "vendors")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(cascade = {PERSIST,MERGE},fetch = FetchType.EAGER)
    private List<Book> books;

    public Vendor(String name, String email) {
        this.name = name;
        this.email = email;

    }
    public void setBook(Book newBook) {
        books.add(newBook);
    }
}
