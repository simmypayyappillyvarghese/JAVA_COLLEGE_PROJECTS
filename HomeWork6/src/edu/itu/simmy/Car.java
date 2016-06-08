/**
 * This is the subclass of abstract class Vehicle.Car implements the abstract
 * methods of its Superclass .
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese date:12/16/2014
 */
public class Car extends Vehicle {

    private String make;                                       //Instance variables of Car defining make.model and number of doors of Car
    private String model;
    private int numberOfDoors;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;

    }                                                             //Overloading constructor Car()

    public Car(String make, String model, int numberOfDoors) {    //Constructor initialise the instance variables
        this(make, model);
        this.numberOfDoors = numberOfDoors;
        this.powerSource = Power_Gas;

    }

    /**
     * Set value to instance variable make
     *
     * @param make: make of standard Car.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Set value to instance variable model
     *
     * @param model: model of standard Car.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Set value to numberOfDoors
     *
     * @param numberOfDoors: number of Doors in standard Car.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;

    }

    /**
     * This method implements starting feature of the car. If fuelLevel is 3 or
     * more car starts with speed 50
     *
     * @return :true if fuelLevel is greater than or equal to 3 else false
     */
    @Override
    public boolean start() {                                   //Abstract methods of Superclass is implemented in Car class

        if (fuelLevel >= Power_Electricity) {
            currentSpeed = 50;
            isRunning = true;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method defines the stopping feature of the car. when car
     * stops,current speed is set to zero
     */
    @Override
    public void stop() {

        currentSpeed = 0;
        isRunning = false;
    }

    /**
     * This method defines adding fuel. Maximum fuel level is 100.
     *
     * @return :true if fuel level is less than 80 else false
     */
    @Override
    public boolean addFuel() {
        if (fuelLevel <= 80) {
            fuelLevel = fuelLevel + 20;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method defines the acceleration of car Maximum speed is set to 200
     * If speed is less than 200 ,it is accelerated by 20
     *
     * @return :true if currentSpeed is less than 200 else false
     */
    @Override
    public boolean accelerate() {

        if (currentSpeed < 200) {
            currentSpeed = currentSpeed + 20;
            if (currentSpeed == 210) {
                currentSpeed = currentSpeed - 10;
            }
            return true;
        } else if ((isRunning == false) || (fuelLevel < Power_Electricity)) {
            return false;
        } else {
            return false;
        }

    }

    /**
     * Gives the running status of Car
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
    public int getFuelLevel() {

        return fuelLevel;
    }

    /**
     * Gives the current speed of Car.
     *
     * @return fuelLevel:level of fuel
     */
    public int getCurrentSpeed() {

        return currentSpeed;
    }

    /**
     * Prints the useful information of car
     *
     * @return label: make,model and all required information is returned as
     * string type
     */
    @Override
    public String toString() {

        String label = "Car Make: " + make + ", Car Model: " + model + ", Power Source: " + powerSource + ", Running: " + isRunning + ", CurrentSpeed: " + currentSpeed + ", Fuel Level: " + fuelLevel;
        return label;
    }

}
