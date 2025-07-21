package methodOverriding_1;
/*
 * this class is parent class for CarEnquiry and CarBooking
 */

import methodOverriding_1.pojo.CarParams;

import java.util.ArrayList;

public class CarList {

    public ArrayList<CarParams> displayCars(){

        CarParams car1 = new CarParams(1,"MS-Swift","VXI","white","8L50T",2024,"normal","Petrol");
        CarParams car2 = new CarParams(2,"MS-Swift","VDI","white","8L90T",2024,"normal","Diesel");
        ArrayList<CarParams> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        return carList;
    }
}
