package org.mihai.composite._2024;

import lombok.Getter;

import java.util.List;

@Getter
public class CompositeTask implements Task {
    private final String title;

    //    Methods for operating on the list of objects are highly needed but this is not what the pattern is about,
    // thus they will be skipped
    private final List<Task> subTasks;

    public CompositeTask(String title, List<Task> subTasks) {
        this.title = title;
        this.subTasks = subTasks;
    }

    @Override
    public void displayTitle() {
        this.stringBuilder.append(this.title).append(" ");
        for (Task t :
                subTasks) {
            t.displayTitle();
        }
    }
}
