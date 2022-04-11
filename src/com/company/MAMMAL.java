package com.company;


public class MAMMAL {
    private String orderMahwite55478;

    public MAMMAL(){
        super();
        orderMahwite55478 = "NN";
    }

    public MAMMAL(String nameMahwite55478, int ageMahwite55478 , int weightMahwite55478, String orderMahwite55478){
        super(nameMahwite55478, ageMahwite55478, weightMahwite55478);
        this.orderMahwite55478=orderMahwite55478;
    }

    public MAMMAL(int ageMahwite55478 , String orderMahwite55478){
        super(ageMahwite55478);
        this.orderMahwite55478=orderMahwite55478;
    }

    public void drinkMilkMahwite55478(){
        System.out.println("Gulp gulp");
    }



    public void getVoiceMahwite55478() {
        System.out.println("Mammal is making sounds");
    }

    public void eatMahwite55478(String FoodName) {
        System.out.println("Mammal is eating: " + FoodName);
    }

    public String getOrderMahwite55478() {
        return orderMahwite55478;
    }

    public void setOrderMahwite55478(String orderMahwite55478) {
        this.orderMahwite55478 = orderMahwite55478;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "ordeMahwite55478='" + orderMahwite55478 + '\'' +
                '}';
    }
}

