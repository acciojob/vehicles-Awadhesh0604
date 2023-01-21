package com.driver;

public class boat implements WaterVehicle{
    String name;
    int capacity;

    public boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    public void  setName(String name){
        this.name=name;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }



    public String getVehicleName(){
        return this.name ;
}

    @Override
    public int getVehicleCapacity() {
        return this.capacity ;
    }

}