/**
 * HybridCar class is subclass of Car .It has different features when compared
 * to Car. These features are added by overriding methods of its superclass Car.
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese date:12/16/2014
 */
public class HybridCar extends Car {

    public HybridCar(String make, String model, int numberOfDoors) {

        super(make, model, numberOfDoors);                           //Calls its superclass condtructor
        this.powerSource = Power_Hybrid;
    }

    /**
     * This method implements the starting feature of the hybrid car. If fuelLevel is 2
     * or more car starts and speed is set to 40
     *
     * @return :true if fuelLevel is greater than or equal to 2 else false
     */
    @Override
    public boolean start() {

        if (fuelLevel < Power_Diesel) {

            return false;
        } else {

            currentSpeed = 40;
            isRunning = true;

            return true;
        }
    }

    /**
     * This method implements the stopping feature of the hybrid car. when Hybrid car
     * stops, current speed is set to zero
     */
    @Override
    public void stop() {
        currentSpeed = 0;
        isRunning = false;

    }

    /**
     * This method defines adding fuel. Maximum fuel level is 100.
     *
     * @return :true if fuel level is less than 100 else false
     */
    @Override
    public boolean addFuel() {

        if (fuelLevel < 100) {

            fuelLevel = fuelLevel + 10;
            return true;
        } else if (fuelLevel == 100) {

            return false;
        }
        return false;
    }

    /**
     * This method defines the acceleration of hybrid car .Maximum speed is set to 150
     * If speed is less than 150 ,it is accelerated by speed of 10 units
     *
     * @return :true if currentSpeed is less than 150 else false
     */
    @Override
    public boolean accelerate() {
        if ((fuelLevel < Power_Diesel) || isRunning == false) {

            return false;
        } else if (currentSpeed < 150) {

            currentSpeed = currentSpeed + 10;

        }
        return true;

    }

    /**
     * Prints the useful information of Hybrid car
     *
     * @return label: make,model and all required information is returned as
     * string type
     */
    @Override
    public String toString() {

        String label = "Hybrid " + super.toString();
        return label;
    }

}
