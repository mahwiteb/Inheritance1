package com.company;


public class Pigeon {
    private String speciesMahwite55478;

    Pigeon(){
        super();
        speciesMahwite55478="NN";
    }

    public Pigeon(String nameMahwite55478, int ageMahwite55478, int weightMahwite55478, String featherColorMahwite55478, String speciesMahwite55478){
        super(nameMahwite55478, ageMahwite55478, weightMahwite55478,featherColorMahwite55478);
        this.speciesMahwite55478= speciesMahwite55478;
    }

    public Pigeon(int ageMahwite55478, String featherColorMahwite55478, String speciesMahwite55478){
        super(ageMahwite55478, featherColorMahwite55478);
        this.speciesMahwite55478=speciesMahwite55478;
    }

    public void peckingWoodMahwite55478(){
        System.out.println("The Pigeon is pecking wood");
    }

    @Override
    public void getVoiceMahwite55478() {
        System.out.println("The Pigeon chirps");
    }

    @Override
    public void eatMahwite55478(String FoodName) {
        System.out.println("The Pigeon is eating: "+ FoodName);
    }

    public String getSpeciesMahwite55478() {
        return speciesMahwite55478;
    }

    public void setSpecieMahwite55478(String speciesMahwite55478) {
        this.speciesMahwite55478 = speciesMahwite55478;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "specieMahwite55478='" + speciesMahwite55478 + '\'' +
                '}';
    }
}
