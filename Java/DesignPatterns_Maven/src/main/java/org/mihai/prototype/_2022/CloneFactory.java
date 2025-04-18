package org.mihai.prototype._2022;

public class CloneFactory {
    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
