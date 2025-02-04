package methodOverriding_1;

import methodOverriding_1.pojo.CarParams;


import java.util.ArrayList;

public class CarEnquiry extends CarList {
    @Override
    public ArrayList<CarParams> displayCars(){
        System.out.println("Please find below details for car enquiry");
        CarList carList = new CarList();
        ArrayList<CarParams> carEnquiry = carList.displayCars();
        return carEnquiry;

    }

}
