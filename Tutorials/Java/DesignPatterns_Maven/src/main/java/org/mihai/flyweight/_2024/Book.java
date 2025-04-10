package org.mihai.flyweight._2024;

import lombok.ToString;

/**
 * Our original object
 * A book's name and price might vary
 * but if it has a certain type then its distributor and otherData will be the same
 */

@ToString
public class Book {
    private final double price;
    private final BookType bookType;

    public Book(double price, BookType bookType) {

        this.price = price;
        this.bookType = bookType;
    }
}
