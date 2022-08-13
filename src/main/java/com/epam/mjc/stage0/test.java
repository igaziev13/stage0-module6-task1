package com.epam.mjc.stage0;

public class test {

    public static void main(String[] Args){
        //Dog object
        Dog dog = new Dog();
        System.out.println(dog.getDescription());

        //Bird object
        Bird bird = new Bird();
        System.out.println(bird.getDescription());

        //Animal object
        Animal animal =new Animal("yellow and black", 4, true);
        System.out.println(animal.getDescription());
    }
}
