package com.company;

abstract class ANIMAL {
    private String nameMahwite55478;

    public String getNameMahwite55478() {
        return nameMahwite55478;
    }

    public void setNameMahwite55478(String nameMahwite55478) {
        this.nameMahwite55478 = nameMahwite55478;
    }

    public int getAgeMahwite55478() {
        return ageMahwite55478;
    }

    public void setAgeMahwite55478(int ageMahwite55478) {
        this.ageMahwite55478 = ageMahwite55478;
    }

    public int getWeightMahwite55478() {
        return weightMahwite55478;
    }

    public void setWeightMahwite55478(int weightMahwite55478) {
        this.weightMahwite55478 = weightMahwite55478;
    }

    private int ageMahwite55478;
    private int weightMahwite55478;

    public ANIMAL(){
        ageMahwite55478 = weightMahwite55478 = 10;
        nameMahwite55478 = "NN";
    }

    public ANIMAL(String nameMahwite55478 , int ageMahwite55478, int weightMahwite55478){
        this.nameMahwite55478 = nameMahwite55478;
        this.ageMahwite55478= ageMahwite55478;
        this.weightMahwite55478= weightMahwite55478;
    }

    public ANIMAL(int ageMahwite55478){
        this.ageMahwite55478= ageMahwite55478;
    }

    public abstract void getVoiceMahwite55478();

    public abstract void eatMahwite55478(String FoodName);

    public abstract void getMahwite55478();


}