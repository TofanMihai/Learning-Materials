package org.mihai.flyweight._2024;

import java.util.HashMap;
import java.util.Objects;

public class BookTypeFactory {
    private static final HashMap<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distibutor) {
        if (Objects.isNull(bookTypes.get(type))) {
            BookType bookType = new BookType(type, distibutor);
            bookTypes.put(type, bookType);
            System.out.println("Adding type " + type.toUpperCase());
            return bookType;
        }
        System.out.println("HashMap size " + bookTypes.size());
        return bookTypes.get(type);
    }
}
