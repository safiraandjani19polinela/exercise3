package com.enigma.model;

public class MotorCycle extends Vehicle {

    private Integer standar;

    public MotorCycle(Integer bench, Integer wheel, Integer standar) {
        super(bench, wheel);
        this.standar = standar;
    }

    //    public void getDoor(Integer door){
//        this.door=door;
//    }
    public String getType() {
        if ((this.bench == 2) && (this.wheel == 2) && (this.standar == 1)) {

            return ("Jenis motor biasa");
        } else if
        ((this.bench == 1) && (this.wheel == 3) && (this.standar == 0)) {
            return ("Jenis motor adalah Tossa");

        } else {
            return "Anda salah memasukan angka";
        }
    }



    public String toString() {
        return "MotorCycle{" +
                "bench=" + bench +
                ", wheel=" + wheel +
                ", standar=" + standar +
                ", type=" + getType() +
                '}';
    }
}