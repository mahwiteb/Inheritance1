package com.company;

public class BlowFish extends Fish implements BlowFishe {
    private int diameterMahwite55478;

    BlowFish(){
        super();
        diameterMahwite55478=10;
    }

    public BlowFish(String nameMahwite55478String , int ageMahwite55478 , int weightMahwite55478, String scaleColorMahwite55478, int diameterMahwite55478){
        super( nameMahwite55478String,ageMahwite55478 ,weightMahwite55478,scaleColorMahwite55478);
        this.diameterMahwite55478 = diameterMahwite55478;

    }

    public BlowFish(int ageMahwite55478, String scaleColorMahwite55478, int diameterMahwite55478){
        super(ageMahwite55478,scaleColorMahwite55478);
        this.diameterMahwite55478= diameterMahwite55478;
    }

    public void swimMahwite554780(){
        System.out.println("The BlowFish is swiming upstream");
    }

    @Override
    public void eatMahwite55478(String FoodName) {
        System.out.println("The BlowFish is eating: "+ FoodName);
    }

    @Override
    public void getMahwite55478() {

    }

    @Override
    public void getVoiceMahwite55478() {
        System.out.println("The blowfish is howling");
    }

    public int getDiameterMahwite55478() {
        return diameterMahwite55478;
    }

    public void setDiameterMahwite55478(int diameterMahwite55478) {
        this.diameterMahwite55478 = diameterMahwite55478;
    }

    @Override
    public String toString() {
        return "BlowFish{" +
                "diameterMahwite55478=" + diameterMahwite55478 +
                '}';
    }
}