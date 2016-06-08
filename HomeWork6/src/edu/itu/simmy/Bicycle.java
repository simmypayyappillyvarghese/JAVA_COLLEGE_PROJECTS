/**
 * This is the subclass of abstract class Vehicle.Bicycle implements the
 * abstract methods of its Superclass .
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese date:12/17/2014
 */
public class Bicycle extends Vehicle {

    private String make;                        //Instance variables of Bicycle defining make.model and number of Gears of Bicycle
    private String model;
    private int numberOfGear;
    int tyrePressure;

    public Bicycle(String make, String model, int numberOfGear) {
        this.make = make;
        this.model = model;
        this.numberOfGear = numberOfGear;
        this.powerSource = Power_Human;
    }

    /**
     * Set value to instance variable make
     *
     * @param make: make of Bicycle.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Set value to instance variable model
     *
     * @param model: model of Bicycle.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Set value to numberOfGear
     *
     * @param numberOfGear: number of Gear in Bicycle.
     */
    public void setNumberOfGear(int numberOfGear) {
        this.numberOfGear = numberOfGear;

    }

    /**
     * This method implements starting feature of the Bicycle. If tyrePressure
     * is 10 or more bicycle starts with speed 5
     *
     * @return :true if tyrePressure is greater than or equal to 10 else false
     */
    @Override
    public boolean start() {
        if (tyrePressure < 10) {                         //tyre pressure in psi  

            return false;
        } else {
            currentSpeed = 5;
            isRunning = true;
            return true;

        }
    }

    /**
     * This method implements the stopping feature of the Bicycle. when Bicycle
     * stops, current speed is set to zero
     */
    @Override
    public void stop() {
        currentSpeed = 0;
        isRunning = false;

    }

    /**
     *  It is an abstract method of Vehicle  which needs to be implemented by Bicycle.
     * It calls fillAir().
     *
     * @return result:value passed by method fillAir()
     */
    @Override
    public boolean addFuel() {

        boolean result = fillAir();
        return result;
    }

    /**
     * This method defines filling air. Maximum tyrePressure is 80.
     *
     * @return :true if tyrePressure is less than 80 and adds tyrePressure by 10
     * units else false
     */

    public boolean fillAir() {
        if (tyrePressure <= 70) {
            tyrePressure = tyrePressure + 10;

            return true;
        } else {
            return false;
        }

    }

    /**
     * This method defines the acceleration of Bicycle .Maximum speed is set to
     * 40 If speed is less than 40 ,it is accelerated by speed of 5 units
     *
     * @return :true if currentSpeed is less than 40 else false
     */
    @Override
    public boolean accelerate() {
        if (currentSpeed < 40) {
            currentSpeed = currentSpeed + 5;

            return true;
        } else if ((isRunning == false) || (tyrePressure < 20)) {
            return false;
        } else {
            return false;
        }

    }

    /**
     * Gives the running status of Bicycle
     *
     * @return isRunning:running status
     */
    public boolean isRunning() {

        return isRunning;
    }

    /**
     * Gives the fuel level.
     *
     * @return fuelLevel:level of fuel
     */
    public int getTyrePressureLevel() {

        return tyrePressure;
    }

    /**
     * Gives the current speed of Bicycle.
     *
     * @return fuelLevel:level of fuel
     */
    public int getCurrentSpeed() {

        return currentSpeed;
    }

    /**
     * Prints the useful information of Bicycle
     *
     * @return label: make,model and all required information is returned as
     * string type
     */
    @Override
    public String toString() {
        String label = "Bicycle Make: " + make + ", Bicycle Model: " + model + ", Power Source: " + powerSource + ", Running: " + isRunning + ", CurrentSpeed: " + currentSpeed + ", Tyre Pressure: " + tyrePressure;
        return label;

    }

}
