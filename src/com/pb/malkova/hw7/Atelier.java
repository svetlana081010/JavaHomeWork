package com.pb.malkova.hw7;

import com.pb.malkova.hw3.Array;

import java.util.Arrays;

public class Atelier {
    public static void dressWomen(Clothes[] clothes){
        for(Clothes cloth: clothes)
            if (cloth  instanceof WomenClothes)
            System.out.println(Arrays.toString(new Clothes[]{cloth}));

    }
    public static void dressMan(Clothes[] clothes){
        for(Clothes cloth2: clothes)
            if (cloth2  instanceof ManClothes)
                System.out.println(Arrays.toString(new Clothes[]{cloth2}));

    }
    public static void main(String[] args) {
        Clothes tshirt = new Tshirt(Size.S,599,"Red");
        Clothes tie= new Tie(Size.M,250,"green");
        Clothes pants = new Pants(Size.L,670.99,"blue");
        Clothes skirt = new Skirt(Size.XS,1020,"black");
        Clothes[] clothesNew = {tshirt,tie,pants,skirt};
        System.out.println("Men clothes: ");
        dressMan(clothesNew);
        System.out.println("");
        System.out.println("Women clothes: ");
        dressWomen(clothesNew);


    }
}
