package org.mihai.flyweight._2024;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class BookType {
    private final String type;
    private final String distributor;

    public BookType(String type, String distributor) {
        this.type = type;
        this.distributor = distributor;
    }
}
