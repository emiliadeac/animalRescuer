package org.fasttrackit;


public class App {
    public static void main(String[] args) {

        Game game = new Game();
        Rescuer rescuer = new Rescuer();
        rescuer.name = "Jon";
        rescuer.residence = "apartament";
        game.rescuer = rescuer;



        Dog dog1 = new Dog();
        dog1.name = "Rex";
        dog1.age = 2;
        dog1.healthCondition = "healthy";
        dog1.height = "medium";
        dog1.race = "Beagle";

        DogFood dogfood1 = new DogFood();
        dogfood1.price = 12;
        dogfood1.brand= "Pedigree";
        dogfood1.flavor = "bird";
        //dog1.dogfood1 = dogfood1;


        Dog dog2 = new Dog();
        dog2.name = "No name";
        dog2.age = 12;
        dog2.healthCondition = "";
        dog2.height = "tal";
        dog2.race = "Bulldog";


    }
}