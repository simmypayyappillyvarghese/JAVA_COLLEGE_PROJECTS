/*
 *This class is used as a Tester.
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese
 */
public class CarTester {

    public static void main(String args[]) {

        System.out.printf("%-20s", "##########Testing Standard Car##########");
        System.out.println();
        Car standardCar = new Car("Honda", "Civic EX", 2);
        System.out.printf("%-20s", standardCar.toString());
        System.out.println();
        standardCar.setMake("Ford");
        standardCar.setModel("Tough");
        standardCar.setNumberOfDoors(5);

        System.out.printf("%-20s", standardCar.toString());
        System.out.println();
        System.out.printf("%-20s", "Starting Car...");
        System.out.println();
        System.out.printf("%-20s", "Is car running: " + standardCar.isRunning());
        System.out.println();
        System.out.printf("%-20s", "Adding Fuel...");
        System.out.println();
        standardCar.addFuel();
        System.out.printf("%-20s", "Starting Car...");
        System.out.println();
        standardCar.start();
        // Is this required.............standardCar.setpowerSource(1);
        System.out.printf("%-20s", standardCar.toString());
        System.out.println();
        for (int i = 0; i < 6; i++) {
            standardCar.addFuel();
            System.out.printf("%-20s", "Fuel Level: " + standardCar.getFuelLevel());
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            standardCar.accelerate();
            System.out.printf("%-20s", "Current Speed: " + standardCar.currentSpeed);
            System.out.println();
        }
        System.out.printf("%-20s", standardCar.toString());
        System.out.println();
        standardCar.stop();
        System.out.printf("%-20s", "Stopping Car...");
        System.out.println();
        System.out.printf("%-20s", standardCar.toString());
        System.out.println();
        System.out.println();
        System.out.printf("%-20s", "##########Testing Hybrid Car##########");
        System.out.println();
        HybridCar hybrid = new HybridCar("Toyota", "Camry", 4);
        System.out.printf("%-20s", hybrid.toString());
        hybrid.setMake("Nissan");
        hybrid.setModel("Leaf");
        hybrid.setNumberOfDoors(2);
        System.out.println();
        System.out.printf("%-20s", hybrid.toString());
        System.out.println();
        System.out.printf("%-20s", "Starting Hybrid Car...");
        System.out.println();
        hybrid.start();
        System.out.printf("%-20s", "Is car running: " + hybrid.isRunning());
        System.out.println();
        System.out.printf("%-20s", "Adding Fuel...");
        hybrid.addFuel();
        System.out.println();
        System.out.printf("%-20s", "Starting Hybrid Car...");
        hybrid.start();
        System.out.println();
        System.out.printf("%-20s", hybrid.toString());
        System.out.println();
        for (int i = 0; i < 10; i++) {
            hybrid.addFuel();
            System.out.printf("%-20s", "Fuel Level: " + hybrid.getFuelLevel());
            System.out.println();
        }
        for (int i = 0; i < 12; i++) {
            hybrid.accelerate();
            System.out.printf("%-20s", "Current Speed: " + hybrid.getCurrentSpeed());
            System.out.println();
        }
        System.out.printf("%-20s", hybrid.toString());
        System.out.println();
        System.out.printf("%-20s", "Stopping Hybrid Car...");
        System.out.println();
        hybrid.stop();
        System.out.printf("%-20s", hybrid.toString());
        System.out.println();
        System.out.println();
        System.out.printf("%-20s", "##########Testing Electric Car##########");
        System.out.println();
        ElectricCar electric = new ElectricCar("Ford", "Volt", 3);
        System.out.printf("%-20s", electric.toString());
        electric.setMake("Tesla");
        electric.setModel("S");
        electric.setNumberOfDoors(4);
        System.out.println();
        System.out.printf("%-20s", electric.toString());
        System.out.println();
        System.out.printf("%-20s", "Starting Electric Car...");
        System.out.println();
        electric.start();
        System.out.printf("%-20s", "Is car running: " + electric.isRunning());
        System.out.println();
        System.out.printf("%-20s", "Adding Fuel...");
        electric.addFuel();
        System.out.println();
        System.out.printf("%-20s", "Starting Electric Car...");
        electric.start();
        System.out.println();
        System.out.printf("%-20s", electric.toString());
        System.out.println();
        for (int i = 0; i < 20; i++) {
            electric.addFuel();
            System.out.printf("%-20s", "Fuel Level: " + electric.getFuelLevel());
            System.out.println();
        }
        for (int i = 0; i < 19; i++) {
            electric.accelerate();
            System.out.printf("%-20s", "Current Speed: " + electric.getCurrentSpeed());
            System.out.println();
        }
        System.out.printf("%-20s", electric.toString());
        System.out.println();
        System.out.printf("%-20s", "Stopping Electric Car...");
        System.out.println();
        electric.stop();
        System.out.printf("%-20s", electric.toString());
        System.out.println();
    }
}
