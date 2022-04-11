package com.company;

public class Bird extends ANIMAL{
    private String featherColorMahwite55478;



    public Bird(){
        super();
        featherColorMahwite55478="NN";

    }

    public Bird (String nameMahwite55478, int ageMahwite55478, int weightMahwite55478, String featherColorMahwite55478){
        super(nameMahwite55478, ageMahwite55478, weightMahwite55478);
        this.featherColorMahwite55478=featherColorMahwite55478;
    }

    public Bird(int ageMahwite55478 , String featherColorMahwite55478){
        super(ageMahwite55478);
        this.featherColorMahwite55478=featherColorMahwite55478;
    }

    public void takingFlightMahwite55478(){
        System.out.println("Flap flap");
    }

    @Override
    public void getVoiceMahwite55478() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatMahwite55478(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    @Override
    public void getMahwite55478() {

    }

    public String getFeatherColorMahwite55478() {
        return featherColorMahwite55478;
    }

    public void setFeatherColoMahwite554780(String featherColorMahwite55478) {
        this.featherColorMahwite55478= featherColorMahwite55478;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorMahwite55478='" + featherColorMahwite55478 + '\'' +
                '}';
    }
}
