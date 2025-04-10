package org.mihai.composite._2024;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleTask implements Task {

    private final String title;

    public SimpleTask(String title) {
        this.title = title;
    }

    @Override
    public void displayTitle() {
        stringBuilder.append(this.title).append(" ");
    }
}
