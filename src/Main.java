import com.enigma.model.Car;
import com.enigma.model.MotorCycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("input jumlah ban");
        Car car = new Car(2,6,2);
        System.out.println(car.print());
//        System.out.println(car.getType());
        MotorCycle motorCycle = new MotorCycle(2,2,1);
        System.out.println(motorCycle.toString());
    }
}
