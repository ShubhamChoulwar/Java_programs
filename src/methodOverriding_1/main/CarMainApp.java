package methodOverriding_1.main;

import methodOverriding_1.CarBooking;
import methodOverriding_1.CarEnquiry;

import java.util.Scanner;

public class CarMainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'enquiry' for car enquiry and 'booking' for car booking");
        String input = sc.next();
        if (input.equalsIgnoreCase("enquiry")) {
            CarEnquiry carEnquiry = new CarEnquiry();
            System.out.println("For Car enquiry: " + carEnquiry.displayCars());
        }
        if(input.equalsIgnoreCase("booking")){
            CarBooking carBooking = new CarBooking();
            System.out.println("For car booking: " + carBooking.displayCars());
        }
    }
}
