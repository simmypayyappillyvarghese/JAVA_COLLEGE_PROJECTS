/*
 *This is a Tester Class
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese date:12/17/2014
 */
public class ClassTester1 {

    public static void main(String args[]) {
        System.out.println();
        System.out.printf("%-20s", "##########Testing Solar Car##########");
        System.out.println();
        SolarCar solar = new SolarCar("SolarWorld", "GT", 2);
        System.out.printf("%-20s", solar.toString());
        solar.setMake("PowerCore");
        solar.setModel("SunCruiser");
        solar.setNumberOfDoors(3);
        System.out.println();
        System.out.printf("%-20s", solar.toString());
        System.out.println();
        System.out.printf("%-20s", "Starting Solar Car...");
        System.out.println();
        solar.start();
        System.out.printf("%-20s", "Is car running: " + solar.isRunning());
        System.out.println();
        System.out.printf("%-20s", "Adding Fuel...");
        solar.addFuel();
        System.out.println();
        System.out.printf("%-20s", "Starting Solar Car...");
        solar.start();
        System.out.println();
        System.out.printf("%-20s", solar.toString());
        System.out.println();
        for (int i = 0; i < 9; i++) {
            solar.addFuel();
            System.out.printf("%-20s", "Fuel Level: " + solar.getFuelLevel());
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            solar.accelerate();
            System.out.printf("%-20s", "Current Speed: " + solar.getCurrentSpeed());
            System.out.println();
        }
        System.out.printf("%-20s", solar.toString());
        System.out.println();
        System.out.printf("%-20s", "Stopping Solar Car...");
        System.out.println();
        solar.stop();
        System.out.printf("%-20s", solar.toString());
        System.out.println();
        System.out.println();
        System.out.printf("%-20s", "##########Testing Hydrogen Car##########");
        System.out.println();
        HydrogenCar hydrocar = new HydrogenCar("BMW", "750hl", 4);
        System.out.printf("%-20s", hydrocar.toString());
        hydrocar.setMake("Honda");
        hydrocar.setModel("FCX ");
        hydrocar.setNumberOfDoors(4);
        System.out.println();
        System.out.printf("%-20s", hydrocar.toString());
        System.out.println();
        System.out.printf("%-20s", "Starting Hydrogen Car...");
        System.out.println();
        hydrocar.start();
        System.out.printf("%-20s", "Is car running: " + hydrocar.isRunning());
        System.out.println();
        System.out.printf("%-20s", "Adding Fuel...");
        hydrocar.addFuel();
        System.out.println();
        System.out.printf("%-20s", "Starting Hydrogen Car...");
        hydrocar.start();
        System.out.println();
        System.out.printf("%-20s", hydrocar.toString());
        System.out.println();
        for (int i = 0; i < 9; i++) {
            hydrocar.addFuel();
            System.out.printf("%-20s", "Fuel Level: " + hydrocar.getFuelLevel());
            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            hydrocar.accelerate();
            System.out.printf("%-20s", "Current Speed: " + hydrocar.getCurrentSpeed());
            System.out.println();
        }
        System.out.printf("%-20s", hydrocar.toString());
        System.out.println();
        System.out.printf("%-20s", "Stopping Hydrogen Car...");
        System.out.println();
        hydrocar.stop();
        System.out.printf("%-20s", hydrocar.toString());
        System.out.println();
        System.out.println();
        System.out.printf("%-20s", "##########Testing Bicycle##########");
        System.out.println();
        Bicycle bicyc = new Bicycle("GMC", "Denali 700c", 18);
        System.out.printf("%-20s", bicyc.toString());
        bicyc.setMake("Cannodale");
        bicyc.setModel("SL 29er ");
        bicyc.setNumberOfGear(30);
        System.out.println();
        System.out.printf("%-20s", bicyc.toString());
        System.out.println();
        System.out.printf("%-20s", "Starting Bicycle...");
        System.out.println();
        bicyc.start();
        System.out.printf("%-20s", "Is bicycle running: " + bicyc.isRunning());
        System.out.println();
        System.out.printf("%-20s", "Filling Air...");
        bicyc.addFuel();
        System.out.println();
        System.out.printf("%-20s", "Starting Bicycle...");
        bicyc.start();
        System.out.println();
        System.out.printf("%-20s", bicyc.toString());
        System.out.println();
        for (int i = 0; i < 8; i++) {
            bicyc.addFuel();
            System.out.printf("%-20s", "TyrePressure Level: " + bicyc.getTyrePressureLevel());
            System.out.println();
        }
        for (int i = 0; i < 8; i++) {
            bicyc.accelerate();
            System.out.printf("%-20s", "Current Speed: " + bicyc.getCurrentSpeed());
            System.out.println();
        }
        System.out.printf("%-20s", bicyc.toString());
        System.out.println();
        System.out.printf("%-20s", "Stopping Bicycle...");
        System.out.println();
        bicyc.stop();
        System.out.printf("%-20s", bicyc.toString());
        System.out.println();
    }
}
