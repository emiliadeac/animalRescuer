package org.fasttrackit;

public class Animal {

    private String name;


    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double age;
    private String healthCondition;
    private String height;
    private String color;
    private String weight;
    private String race;


    public void SetName(String name) { this.name = name; }
    public void SetAge(int age) { this.age =age; }
    public void SetHealthCondition (String healthCondition) {this.healthCondition = healthCondition; }
    public void SetHeight (String height) {this.height = height;}
    public void SetRace (String race) {this.race = race; }
}
