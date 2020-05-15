package de.nineteenbytes.springboottestcontainers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue
    private long id;
    @NotNull
    private String title;

}
