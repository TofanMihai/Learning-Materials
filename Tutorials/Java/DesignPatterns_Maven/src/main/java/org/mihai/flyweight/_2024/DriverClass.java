package org.mihai.flyweight._2024;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {

    private static final String[] bookTypes = {"Crime", "Mistery", "Romance", "Novel"};

    public static Long generateRandomPrice() {
        return (long) (Math.random() * 100);
    }

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < 49; i++) {
            BookType bookType = BookTypeFactory.getBookType(bookTypes[(int) (Math.random() * bookTypes.length)], "Mihai");
            bookList.add(new Book(
                    generateRandomPrice(),
                    bookType
            ));
        }

        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}
