import java.util.Scanner;

public class Showroom {
    private String showroom_name;
    private String showroom_address;
    private int total_employees;
    private int total_cars_in_stock = 0;
    private String manager_name;

    public String getShowroomName() {
        return showroom_name;
    }

    public void getDetails() {
        System.out.println("Showroom Name: " + showroom_name);
        System.out.println("Showroom Address: " + showroom_address);
        System.out.println("Manager Name: " + manager_name);
        System.out.println("Total Employees: " + total_employees);
        System.out.println("Total Cars In Stock: " + total_cars_in_stock);
    }

    public void setDetails(Scanner sc) {
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.print("Showroom Name: ");
        showroom_name = sc.nextLine();
        System.out.print("Showroom Address: ");
        showroom_address = sc.nextLine();
        System.out.print("Manager Name: ");
        manager_name = sc.nextLine();
        System.out.print("Total Employees: ");
        total_employees = sc.nextInt();
        sc.nextLine();
    }

    public int getTotalCarsInStock() {
        return total_cars_in_stock;
    }
}
