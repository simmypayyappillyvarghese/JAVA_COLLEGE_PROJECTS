/**
 * Electric car class is subclass of Car .It has different features when
 * compared to Car. These features are added by overriding methods of its
 * superclass Car.
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese date:12/16/2014
 */
public class ElectricCar extends Car {

    public ElectricCar(String make, String model, int numberOfDoors) {
        super(make, model, numberOfDoors);
        this.powerSource = Power_Electricity;
    }

    /**
     * This method implements the starting feature of the electric car. If fuelLevel is 1
     * or more car starts and speed is set to 30
     *
     * @return :true if fuelLevel is greater than or equal to 2 else false
     */
    @Override
    public boolean start() {
        if (fuelLevel < Power_Gas) {

            return false;
        } else {
            currentSpeed = 30;
            isRunning = true;
            return true;

        }
    }

    /**
     * This method implements the stopping feature of the electric car. when Electric car
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
     * @return :true if fuel level is less than 100 and adds fuel by 5 units
     * else false
     */
    @Override
    public boolean addFuel() {
        if (fuelLevel < 100) {
            fuelLevel = fuelLevel + 5;
            return true;
        } else if (fuelLevel == 100) {
            return false;
        }

        return false;

    }

    /**
     * This method defines the acceleration of car .Maximum speed is set to 120
     * If speed is less than 120 ,it is accelerated by speed of 5 units
     *
     * @return :true if currentSpeed is less than 120 else false
     */
    @Override
    public boolean accelerate() {
        if (fuelLevel < Power_Gas || isRunning == false) {

            return false;
        } else if (currentSpeed < 120) {
            currentSpeed = currentSpeed + 5;

        }
        return true;

    }

    /**
     * Prints the useful information of Electric car
     *
     * @return label: make,model and all required information is returned as
     * string type
     */
    @Override
    public String toString() {

        String label = "Electric " + super.toString();                   //fetches the information from its parent class toString() method
        return label;
    }

}
