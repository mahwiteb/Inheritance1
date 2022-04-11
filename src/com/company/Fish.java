package com.company;

public abstract class Fish extends ANIMAL{
    private String scaleColorMahwite55478;

    public Fish(){
        super();
        scaleColorMahwite55478= "NN";
    }

    public Fish(String nameMahwite55478, int ageMahwite55478 , int weightMahwite55478, String scaleColorMahwite55478){
        super(nameMahwite55478, ageMahwite55478, weightMahwite55478);
        this.scaleColorMahwite55478 = scaleColorMahwite55478;
    }

    public Fish(int ageMahwite55478 , String scaleColorMahwite55478){
        super(ageMahwite55478);
        this.scaleColorMahwite55478= scaleColorMahwite55478;
    }

    public void drinkWaterMahwite55478(){
        System.out.println("Gulp gulp");
    }


    public void getVoiceMahwite55478() {
        System.out.println("Fish is making sounds");
    }


    public void eatMahwite55478(String FoodName) {
        System.out.println("Fish is eating: "+ FoodName);
    }

    public String getScaleColorMahwite55478() {
        return scaleColorMahwite55478;
    }

    public void setScaleColoMahwite55478(String scaleColorMahwite55478) {
        this.scaleColorMahwite55478 = scaleColorMahwite55478;
    }


    public String toString() {
        return "Fish{" +
                "scaleColorMahwite55478='" + scaleColorMahwite55478 + '\'' +
                '}';
    }
}