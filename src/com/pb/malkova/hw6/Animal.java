package com.pb.malkova.hw6;

import java.util.Objects;

public class Animal {
    private String variety;
    private String food;
    private String location;

    public Animal(String variety, String food, String location) {
        this.variety = variety;
        this.food = food;
        this.location = location;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void  makeNoise(){
        System.out.println("The animal: " + variety + "makes a noise");
    }
    public void  eat(){
        System.out.println("The animal: " + variety + "eating " + food);
    }
    public void  sleep(){
        System.out.println("The animal: " + variety + "sleeping");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(variety, animal.variety) &&
                Objects.equals(food, animal.food) &&
                Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variety, food, location);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "variety = '" + variety + '\'' +
                ", food = '" + food + '\'' +
                ", location = '" + location + '\'' +
                '}';
    }
}
