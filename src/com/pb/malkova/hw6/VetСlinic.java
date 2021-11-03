package com.pb.malkova.hw6;


import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        Dog dog = new Dog("Dog", "meat", "aviary");
        Cat cat = new Cat("Cat", "milk", "house");
        Horse horse = new Horse("Horse", "hay", "paddock");
        Animal[] animal = new Animal[3];
        animal[0] = dog;
        animal[1] = cat;
        animal[2] = horse;

        Class clazz = Class.forName("com.pb.malkova.hw6.Veterinarian");
        Constructor cons = clazz.getConstructor(new Class[]{});
        Object obj = cons.newInstance();

        if (obj instanceof Veterinarian) {
            for (int i = 0; i < animal.length; i++) {
                ((Veterinarian) obj).treatAnimal(animal[i]);

            }
        }
    }

}
