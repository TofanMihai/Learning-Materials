package org.mihai.composite._2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverClass {

    public static void main(String[] args) {
        SimpleTask simpleTask1 = new SimpleTask("simpleTask1");
        SimpleTask simpleTask2 = new SimpleTask("simpleTask2");

        List<Task> firstIterationTasks = new ArrayList<>(Arrays.asList(simpleTask1, simpleTask2));
        CompositeTask compositeTask1 = new CompositeTask("compositeTask1", firstIterationTasks);


        SimpleTask simpleTask3 = new SimpleTask("simpleTask3");
        SimpleTask simpleTask4 = new SimpleTask("simpleTask4");
        List<Task> secondterationTasks = new ArrayList<>(Arrays.asList(simpleTask3, simpleTask4));
        CompositeTask compositeTask2 = new CompositeTask("compositeTask2", secondterationTasks);


        List<Task> sprintTasks = new ArrayList<>(Arrays.asList(compositeTask1, compositeTask2));
        CompositeTask wholeSprint = new CompositeTask("BigSprint", sprintTasks);


//        Treating composites just as we would treat leaves
        simpleTask1.displayTitle();
        System.out.println(Task.stringBuilder);
        System.out.println("\n");
        Task.stringBuilder.setLength(0);


        compositeTask1.displayTitle();
        System.out.println(Task.stringBuilder);
        System.out.println("\n");
        Task.stringBuilder.setLength(0);


        wholeSprint.displayTitle();
        System.out.println(Task.stringBuilder);
        Task.stringBuilder.setLength(0);
    }
}
