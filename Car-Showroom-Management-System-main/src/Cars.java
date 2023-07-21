import java.util.Scanner;

public class Cars {
    private String car_name;
    private String car_color;
    private String car_fuel_type;
    private int car_price;
    private String car_type;
    private String car_transmission;

    public String getCarName() {
        return car_name;
    }

    public void getDetails() {
        System.out.println("Name: " + car_name);
        System.out.println("Color: " + car_color);
        System.out.println("Fuel Type: " + car_fuel_type);
        System.out.println("Price: " + car_price);
        System.out.println("Car Type: " + car_type);
        System.out.println("Transmission: " + car_transmission);
    }

    public void setDetails(Scanner sc) {
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.print("Car Name: ");
        car_name = sc.nextLine();
        System.out.print("Car Color: ");
        car_color = sc.nextLine();
        System.out.print("Car Fuel Type (PETROL/DIESEL/EV): ");
        car_fuel_type = sc.nextLine();
        System.out.print("Car Price: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.print("Car Type (SEDAN/SUV/HATCHBACK/SPORTS): ");
        car_type = sc.nextLine();
        System.out.print("Transmission Type (AUTOMATIC/MANUAL): ");
        car_transmission = sc.nextLine();
    }
}
