package com.company;

public class AnimalType {

    private String animalType;
    private String animalName;

    public AnimalType(String animalType, String animalName){
        this.animalType = animalType;
        this.animalName = animalName;
    }

    public String toString(){
        String result;
        result = "This animal is a " + animalType + " its name is " + animalName;
        return result;
    }

}
