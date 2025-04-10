package org.mihai.builder;

public class Engine {
    public String name = "V8 Engine";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Engine [name=" + name + "]";
    }


}
