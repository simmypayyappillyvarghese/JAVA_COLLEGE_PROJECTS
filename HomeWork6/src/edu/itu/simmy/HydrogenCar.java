/**
 * Hydrogen Car class is subclass of Car .It has different features when
 * compared to Car. These features are added by overriding methods of its
 * superclass Car.
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese date:12/17/2014
 */
public class HydrogenCar extends Car {

    public HydrogenCar(String make, String model, int numberOfDoors) {
        super(make, model, numberOfDoors);
        this.powerSource = Power_Hydrogen;
    }

    /**
     * This method implements the starting feature of the hydrogen car. If fuelLevel is 7
     * or more car starts and speed is set to 50
     *
     * @return :true if fuelLevel is greater than or equal to 5 else false
     */
    @Override
    public boolean start() {
        if (fuelLevel < Power_Electricity) {

            return false;
        } else {
            currentSpeed = 30;
            isRunning = true;
            return true;

        }
    }

    /**
     * This method implements the stopping feature of the car. when Hydrogen car
     * stops, current speed is set to zero
     */
    @Override
    public void stop() {
        currentSpeed = 0;
        isRunning = false;

    }

    /**
     * This method defines adding fuel. Maximum fuel level is 150.
     *
     * @return :true if fuel level is less than 150 else false
     */
    @Override
    public boolean addFuel() {
        if (fuelLevel < 150) {
            fuelLevel = fuelLevel + 20;
            if (fuelLevel == 160) {
                fuelLevel = fuelLevel - 10;
            }

            return true;
        } else {
            return false;
        }

    }

    /**
     * This method defines the acceleration of car .Maximum speed is set to 100
     * If speed is less than 100 ,it is accelerated by speed of 10 units
     *
     * @return :true if currentSpeed is less than 100 else false
     */
    @Override
    public boolean accelerate() {
        if (fuelLevel < Power_Electricity || isRunning == false) {

            return false;
        } else if (currentSpeed <= 90) {
            currentSpeed = currentSpeed + 10;

        }
        return true;

    }

    /**
     * Prints the useful information of Hydrogen car
     *
     * @return label: make,model and all required information is returned as
     * string type
     */
    @Override
    public String toString() {

        String label = "Hydrogen " + super.toString();
        return label;
    }

}
