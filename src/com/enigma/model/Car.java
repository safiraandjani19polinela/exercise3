package com.enigma.model;

public class Car extends Vehicle{

    private Integer door;

    public Car(Integer bench, Integer wheel, Integer door){
        super(bench,wheel);
        this.door=door;
    }
    //    public void getDoor(Integer door){
//        this.door=door;
//    }
    public String getType(){
        if ((this.door==2)&&(this.wheel==6)&&(this.bench==2)){

            return ("Jenis mobil adalah truk");
        }
        else if ((this.door==2)&&(this.wheel==4)&&(this.bench==2)){
            return ("Jenis mobil Sport");
        }
        else if((this.door==3)&&(this.wheel==4)&&(this.bench==13)){
            return ("Jenis mobil (angkot)");
        }
        else if((this.door==4)&&(this.wheel==4)&&(this.bench==4)) {
            return ("Jenis mobil  pribadi");
        }
        return "Anda salah memasukan angka" ;
    }
    public String print() {
        return "Car{" +
                "door=" + door +
                ", wheel=" + wheel +
                ", bench=" + bench +
                ", "+ getType()+
                '}';
    }
}