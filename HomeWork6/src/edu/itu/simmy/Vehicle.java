/*
 To create an application that models the different types of cars and vehicles.
 This class is an abstract class which is extended to the subclass Car.
 *
 */
package edu.itu.simmy;

/**
 *
 * @author Simmy Payyappilly Varghese date:12/16/2014
 */
public abstract class Vehicle {                //These static constants can be used in comparing the fuelLevel 

    static final int Power_Gas = 1;
    static final int Power_Diesel = 2;
    static final int Power_Electricity = 3;
    static final int Power_Hybrid = 4;
    static final int Power_Hydrogen = 5;
    static final int Power_Human = 6;
    static final int Power_SolarEnergy = 7;
    static final int DefaultPowerSource = Power_Gas;
    boolean isRunning;
    int currentSpeed;
    int fuelLevel;                             //a number between 0 and 100; level 100 means fuel is full.
    int powerSource;

    abstract boolean start();                  //These abstract methods are implemented in subclass Car

    abstract void stop();

    abstract boolean accelerate();

    abstract boolean addFuel();

    public void setpowerSource(int power) {    //This set method set value of powersource
        powerSource = power;
    }
}
