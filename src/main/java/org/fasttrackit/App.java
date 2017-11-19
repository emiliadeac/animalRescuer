package org.fasttrackit;


public class App {
    public static void main(String[] args) {

        Game game = new Game();
        Rescuer rescuer = new Rescuer();
        rescuer.name = "Jon";
        rescuer.residence = "apartament";
        game.rescuer = rescuer;



        Dog dog1 = new Dog();
        dog1.SetName("Rex");
        dog1.leash = true;
        dog1.setAge(2.00);
        dog1.SetHealthCondition("healthy");
        dog1.SetHeight("medium");
        dog1.setRace("Beagle");

        DogFood dogfood1 = new DogFood();
        dogfood1.price = 12;
        dogfood1.brand= "Pedigree";
        dogfood1.flavor = "bird";
        //dog1.dogfood1 = dogfood1;


        Dog dog2 = new Dog();
        dog2.leash = false;
        dog2.setName("No name");
        dog2.setAge(12);
        dog2.SetHealthCondition("broken leg");
        dog2.SetHeight("tall");
        dog2.setRace("Bulldog");


    }
}