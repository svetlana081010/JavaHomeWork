package com.pb.malkova.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    public Tshirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tshirt: " +
                "size " + size +
                ", price " + price +
                ", color '" + color + '\'';
    }
}
