package com.pluralsight;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * A vehicle inventory System
 * with search and add functions.
 */
public class Main {

    static Vehicle[] vehicles = preLoadVehicles();

    /**
     *  start the program
     * @param args
     */
    public static void main(String[] args) {
        homeScreen();


    }

    /**
     * homeScreen for user to select the option.
     */
    public static void homeScreen() {
        printMenu();

        int command;

        do {
            command = Integer.parseInt(promptForString("Ener your index/number :"));

            switch (command) {
                case 1 -> displayVehicles();
                case 2 -> searchByModel();
                case 3 -> searchByPriceRange();
                case 4 -> searchByColor();
                case 5 -> addVehicle();
                case 6 -> exit(-0);
            }

        } while (command != 6);


    }

    /**
     * add vehicle
     */

    private static void addVehicle() {
       String command =  promptForString("Would you like another vehicle:  (yes/y | No/n)");

       if (!command.equalsIgnoreCase("Yes") || !command.equalsIgnoreCase("Y")) {
           return;
       }

       /*
       private long vehicleId;
        private String makeModel;
        private String color;
        private int odometerReading;
        private float price;
        */
        long vehicleId = Long.parseLong(promptForString("Enter your vehicleId"));
        String makeModel = promptForString("Enter your makeModel");
        String color = promptForString("Enter your color");
        int odometerReading = Integer.parseInt(promptForString("Enter your odometerReading"));
        float price = Float.parseFloat(promptForString("Enter your price"));

        Vehicle vehicle = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        add(vehicle);


    }

    /**
     *  loop through the vehicles and add the vehicle to the first null index.
     * @param vehicle
     */
    private static void add(Vehicle vehicle) {

        for (int i = 0; i < vehicles.length; i++) {


            // if the index of the vehicles is null, add new vehicle to it!
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                break;
            } else {
                System.out.println("Our garage is full! You cannot add a new vehicle.");
            }
        }

    }

    /**
     * Search vehicles by Color
     */

    private static void searchByColor() {
        String color =  promptForString("Enter yor Color: ");

        for (Vehicle vehicle: vehicles) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                vehicle.displayVehicleInfo();
            }
        }
    }

    /**
     * Search vehicles by Price Range
     */
    private static void searchByPriceRange() {
       double startRange = Double.parseDouble(promptForString("Enter the start Range: "));
       double endRange = Double.parseDouble(promptForString("Enter the end Range: "));

       for (Vehicle vehicle: vehicles) {
         if (vehicle.getPrice() < endRange && startRange <  vehicle.getPrice()) {
             vehicle.displayVehicleInfo();
         }
       }
    }

    /**
     * Search vehicles by Model
     */
    private static void searchByModel() {
       String model =  promptForString("Enter yor model: ");

       for (Vehicle vehicle: vehicles) {
           if (vehicle.getMakeModel().equalsIgnoreCase(model)) {
               vehicle.displayVehicleInfo();
           }
       }
    }

    /**
     * Display the garage
     */
    private static void displayVehicles() {

        for (Vehicle vehicle: vehicles) {
            vehicle.displayVehicleInfo();
        }
    }

    /**
     * print out the selection
     */
    public static void printMenu() {
        String promptInfo = """
                        1 - List all vehicles
                        2 - Search by make/model
                        3 - Search by price range
                        4 - Search by color
                        5 - Add a vehicle
                        6 - Quit
                """;
        System.out.println("What do you want to do?");
        System.out.println(promptInfo);

    }

    /**
     * create vehicle objects and add to the vehicle list.
     * @return a list of vehicle
     */
    public static Vehicle[] preLoadVehicles() {

        Vehicle[] vehicles = new Vehicle[20];


        // Preload the array with 20 vehicles
        vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        vehicles[6] = new Vehicle(101127, "Nissan Altima", "Silver", 40000, 12500);
        vehicles[7] = new Vehicle(101128, "BMW X5", "Black", 35000, 22000);
        vehicles[8] = new Vehicle(101129, "Mercedes-Benz C-Class", "Blue", 27000, 30000);
        vehicles[9] = new Vehicle(101130, "Hyundai Sonata", "Gray", 50000, 10500);

//        vehicles[10] = new Vehicle(101131, "Tesla Model 3", "White", 15000, 45000);
//        vehicles[11] = new Vehicle(101132, "Audi A4", "Black", 60000, 23000);
//        vehicles[12] = new Vehicle(101133, "Volkswagen Jetta", "Silver", 75000, 8500);
//        vehicles[13] = new Vehicle(101134, "Kia Sorento", "Green", 42000, 17000);
//        vehicles[14] = new Vehicle(101135, "Mazda CX-5", "Red", 30000, 19500);
//        vehicles[15] = new Vehicle(101136, "Chevrolet Tahoe", "Blue", 65000, 25000);
//        vehicles[16] = new Vehicle(101137, "Ford Mustang", "Black", 55000, 27000);
//        vehicles[17] = new Vehicle(101138, "Honda Accord", "White", 48000, 15000);
//        vehicles[18] = new Vehicle(101139, "Jeep Grand Cherokee", "Silver", 38000, 32000);
//        vehicles[19] = new Vehicle(101140, "Toyota Corolla", "Blue", 68000, 9500);


        return vehicles;
    }

    /**
     * ask user for input with propmt
     * @param prompt
     * @return value
     */
    private static String promptForString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String value = "";
        try {
            value = scanner.nextLine().trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }

    /**
     * ask user input
     * @return value
     */
    private static String promptForString() {
        Scanner scanner = new Scanner(System.in);
        String value = "";
        try {
            value = scanner.nextLine().trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}