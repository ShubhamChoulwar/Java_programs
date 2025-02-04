package methodOverriding_1;

import methodOverriding_1.pojo.CarParams;
import java.util.ArrayList;

public class CarBooking {

    public ArrayList<CarParams> displayCars(){
        System.out.println("Please find below details for car booking");
        CarList carList = new CarList();
        ArrayList<CarParams> carBooking = carList.displayCars();
        return carBooking;

    }
}
