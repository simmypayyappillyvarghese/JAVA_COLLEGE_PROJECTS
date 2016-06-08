/**
 * Solar Car class is subclass of Car .It has different features when compared
 * to Car. These features are added by overriding methods of its superclass Car.
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese date:12/17/2014
 */
public class SolarCar extends Car {

    public SolarCar(String make, String model, int numberOfDoors) {
        super(make, model, numberOfDoors);
        this.powerSource = Power_SolarEnergy;
    }

    /**
     * This method implements the starting feature of the solar car. If fuelLevel is 4
     * or more car starts and speed is set to 40
     *
     * @return :true if fuelLevel is greater than or equal to 4 else false
     */
    @Override
    public boolean start() {
        if (fuelLevel < Power_Hybrid) {

            return false;
        } else {
            currentSpeed = 40;
            isRunning = true;
            return true;

        }
    }

    /**
     * This method implements the stopping feature of the car. when Solar car
     * stops, current speed is set to zero
     */
    @Override
    public void stop() {
        currentSpeed = 0;
        isRunning = false;

    }

    /**
     * This method defines adding fuel. Maximum fuel level is 90.
     *
     * @return :true if fuel level is less than 90 else false
     */
    @Override
    public boolean addFuel() {
        if (fuelLevel < 80) {
            fuelLevel = fuelLevel + 10;
            return true;
        } else if (fuelLevel == 90) {

        }

        return false;

    }

    /**
     * This method defines the acceleration of car .Maximum speed is set to 75
     * If speed is less than 75 ,it is accelerated by speed of 5 units
     *
     * @return :true if currentSpeed is less than 75 else false
     */
    @Override
    public boolean accelerate() {
        if (fuelLevel < Power_Hydrogen || isRunning == false) {

            return false;
        } else if (currentSpeed < 75) {
            currentSpeed = currentSpeed + 5;

        }
        return true;

    }

    /**
     * Prints the useful information of Solar car
     *
     * @return label: make,model and all required information is returned as
     * string type
     */
    @Override
    public String toString() {

        String label = "Solar " + super.toString();
        return label;
    }

}
