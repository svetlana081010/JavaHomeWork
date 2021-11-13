package com.pb.malkova.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie: " +
                "size " + size +
                ", price " + price +
                ", color '" + color + '\'';
    }
}
