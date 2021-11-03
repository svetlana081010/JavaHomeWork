package com.pb.malkova.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String scratchingPost;

    public Cat(String variety, String food, String location) {
        super(variety, food, location);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(scratchingPost, cat.scratchingPost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scratchingPost);
    }

    @Override
    public String toString() {
        return "Cat: " +
                "food = '" + getFood() + '\'' +
                ", location = '" + getLocation() + '\'' +
                ';';
    }
}
