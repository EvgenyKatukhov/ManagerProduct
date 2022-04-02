package ru.netology.domain;

public class Book extends Product {
    private final String author;
    private final String name;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
}
