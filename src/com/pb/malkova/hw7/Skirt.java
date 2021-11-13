package com.pb.malkova.hw7;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt: " +
                "size " + size +
                ", price " + price +
                ", color '" + color + '\'';
    }
}
