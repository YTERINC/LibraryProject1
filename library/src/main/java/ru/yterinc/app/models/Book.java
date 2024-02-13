package ru.yterinc.app.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    private int idperson;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 100 characters")
    private String name;

    @Size(min = 2, max = 100, message = "Author should be between 2 and 100 characters")
    private String author;

    @Size(min = 0, max = 2120, message = "Year should be between 0 and 2120 characters")
    private int year;

    public Book() {
    }

    public Book(int id, int idperson, String name, String author, int year) {
        this.id = id;
        this.idperson = idperson;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdperson() {
        return idperson;
    }

    public void setIdperson(int idperson) {
        this.idperson = idperson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
