import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShowroomManagementSystem showroomSystem = new ShowroomManagementSystem();
        showroomSystem.run();
    }
}

class ShowroomManagementSystem {
    private List<Showroom> showrooms;
    private List<Employees> employees;
    private List<Cars> cars;
    private Scanner scanner;

    public ShowroomManagementSystem() {
        showrooms = new ArrayList<>();
        employees = new ArrayList<>();
        cars = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        int choice = -1;
        while (choice != 0) {
            displayMainMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addShowroom();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    addCar();
                    break;
                case 4:
                    displayShowrooms();
                    break;
                case 5:
                    displayEmployees();
                    break;
                case 6:
                    displayCars();
                    break;
                case 7:
                    updateShowroom();
                    break;
                case 8:
                    updateEmployee();
                    break;
                case 9:
                    updateCar();
                    break;
                case 10:
                    deleteShowroom();
                    break;
                case 11:
                    deleteEmployee();
                    break;
                case 12:
                    deleteCar();
                    break;
                case 13:
                    searchShowroomByName();
                    break;
                case 14:
                    searchEmployeeById();
                    break;
                case 15:
                    searchCarByName();
                    break;
                case 16:
                    displayTotalCarsInStock();
                    break;
                case 17:
                    displayShowroomEmployees();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private void displayMainMenu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        // Displaying available options in the main menu
        System.out.println("1. ADD SHOWROOM");
        System.out.println("2. ADD EMPLOYEE");
        System.out.println("3. ADD CAR");
        System.out.println("4. DISPLAY SHOWROOMS");
        System.out.println("5. DISPLAY EMPLOYEES");
        System.out.println("6. DISPLAY CARS");
        System.out.println("7. UPDATE SHOWROOM");
        System.out.println("8. UPDATE EMPLOYEE");
        System.out.println("9. UPDATE CAR");
        System.out.println("10. DELETE SHOWROOM");
        System.out.println("11. DELETE EMPLOYEE");
        System.out.println("12. DELETE CAR");
        System.out.println("13. SEARCH SHOWROOM BY NAME");
        System.out.println("14. SEARCH EMPLOYEE BY ID");
        System.out.println("15. SEARCH CAR BY NAME");
        System.out.println("16. DISPLAY TOTAL CARS IN STOCK");
        System.out.println("17. DISPLAY SHOWROOM EMPLOYEES");
        System.out.println("0. EXIT");
        System.out.println();
        System.out.print("Enter your choice: ");
    }

    // Implementing the functionalities for each menu option

    private void addShowroom() {
        Showroom showroom = new Showroom();
        showroom.setDetails(scanner);
        showrooms.add(showroom);
        System.out.println("Showroom added successfully!");
    }

    private void addEmployee() {
        Employees employee = new Employees();
        employee.setDetails(scanner);
        employees.add(employee);
        System.out.println("Employee added successfully!");
    }

    private void addCar() {
        Cars car = new Cars();
        car.setDetails(scanner);
        cars.add(car);
        System.out.println("Car added successfully!");
    }

    private void displayShowrooms() {
        System.out.println("======================= *** SHOWROOM DETAILS *** =======================");
        for (Showroom showroom : showrooms) {
            showroom.getDetails();
            System.out.println();
        }
    }

    private void displayEmployees() {
        System.out.println("======================= *** EMPLOYEE DETAILS *** =======================");
        for (Employees employee : employees) {
            employee.getDetails();
            System.out.println();
        }
    }

    private void displayCars() {
        System.out.println("======================= *** CAR DETAILS *** =======================");
        for (Cars car : cars) {
            car.getDetails();
            System.out.println();
        }
    }

    private void updateShowroom() {
        System.out.println("Enter the showroom name to update: ");
        String name = scanner.nextLine();

        for (Showroom showroom : showrooms) {
            if (showroom.getShowroomName().equals(name)) {
                showroom.setDetails(scanner);
                System.out.println("Showroom updated successfully!");
                return;
            }
        }

        System.out.println("Showroom not found!");
    }

    private void updateEmployee() {
        System.out.println("Enter the employee ID to update: ");
        String id = scanner.nextLine();

        for (Employees employee : employees) {
            if (employee.getEmpId().equals(id)) {
                employee.setDetails(scanner);
                System.out.println("Employee updated successfully!");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    private void updateCar() {
        System.out.println("Enter the car name to update: ");
        String name = scanner.nextLine();

        for (Cars car : cars) {
            if (car.getCarName().equals(name)) {
                car.setDetails(scanner);
                System.out.println("Car updated successfully!");
                return;
            }
        }

        System.out.println("Car not found!");
    }

    private void deleteShowroom() {
        System.out.println("Enter the showroom name to delete: ");
        String name = scanner.nextLine();

        for (Showroom showroom : showrooms) {
            if (showroom.getShowroomName().equals(name)) {
                showrooms.remove(showroom);
                System.out.println("Showroom deleted successfully!");
                return;
            }
        }

        System.out.println("Showroom not found!");
    }

    private void deleteEmployee() {
        System.out.println("Enter the employee ID to delete: ");
        String id = scanner.nextLine();

        for (Employees employee : employees) {
            if (employee.getEmpId().equals(id)) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    private void deleteCar() {
        System.out.println("Enter the car name to delete: ");
        String name = scanner.nextLine();

        for (Cars car : cars) {
            if (car.getCarName().equals(name)) {
                cars.remove(car);
                System.out.println("Car deleted successfully!");
                return;
            }
        }

        System.out.println("Car not found!");
    }

    // New functionalities

    private void searchShowroomByName() {
        System.out.println("Enter the showroom name to search: ");
        String name = scanner.nextLine();

        for (Showroom showroom : showrooms) {
            if (showroom.getShowroomName().equalsIgnoreCase(name)) {
                System.out.println("======================= *** SHOWROOM DETAILS *** =======================");
                showroom.getDetails();
                return;
            }
        }

        System.out.println("Showroom not found!");
    }

    private void searchEmployeeById() {
        System.out.println("Enter the employee ID to search: ");
        String id = scanner.nextLine();

        for (Employees employee : employees) {
            if (employee.getEmpId().equals(id)) {
                System.out.println("======================= *** EMPLOYEE DETAILS *** =======================");
                employee.getDetails();
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    private void searchCarByName() {
        System.out.println("Enter the car name to search: ");
        String name = scanner.nextLine();

        for (Cars car : cars) {
            if (car.getCarName().equalsIgnoreCase(name)) {
                System.out.println("======================= *** CAR DETAILS *** =======================");
                car.getDetails();
                return;
            }
        }

        System.out.println("Car not found!");
    }

    private void displayTotalCarsInStock() {
        System.out.println("======================= *** TOTAL CARS IN STOCK *** =======================");
        for (Showroom showroom : showrooms) {
            System.out.println("Showroom: " + showroom.getShowroomName());
            System.out.println("Total Cars In Stock: " + showroom.getTotalCarsInStock());
            System.out.println();
        }
    }

    private void displayShowroomEmployees() {
        System.out.println("Enter the showroom name: ");
        String name = scanner.nextLine();

        for (Showroom showroom : showrooms) {
            if (showroom.getShowroomName().equalsIgnoreCase(name)) {
                System.out.println("======================= *** EMPLOYEES IN SHOWROOM *** =======================");
                for (Employees employee : employees) {
                    if (employee.getShowroomName().equalsIgnoreCase(name)) {
                        employee.getDetails();
                        System.out.println();
                    }
                }
                return;
            }
        }

        System.out.println("Showroom not found!");
    }
}
