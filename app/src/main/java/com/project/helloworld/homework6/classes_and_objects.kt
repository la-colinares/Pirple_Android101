package com.project.helloworld.homework6

/**
 * Title: Homework Assignment #6: Classes and Objects
 * From: Pirple/Nirmish
 *
 * Details: Create a class called "Vehicle" and add methods that allow you to set the "Make", "Model", "Year,", and "Weight".
 * The class should also contain a "NeedsMaintenance" boolean that defaults to False, and and "TripsSinceMaintenance" Integer that defaults to 0.
 * Next create a subclass that inherits the properties of Vehicle class. Call this new subclass "Cars".
 *
 * The Cars class should contain a method called "Drive" that sets the state of a boolean isDriving to True.
 * It should have another method called "Stop" that sets the value of isDriving to false.
 *
 * Switching isDriving from true to false should increment the "TripsSinceMaintenance" counter.
 * And when TripsSinceMaintenance exceeds 100, then the NeedsMaintenance boolean should be set to true.
 * Add a "Repair" method to either class that resets the TripsSinceMaintenance to zero, and NeedsMaintenance to false.
 *
 * Create 3 different cars, using your Cars class, and drive them all a different number of times.
 * Then print out their values for Make, Model, Year, Weight, NeedsMaintenance, and TripsSinceMaintenance
 *
 * Extra Credit: Create a Planes class that is also a subclass of Vehicle.
 * Add methods to the Planes class for Flying and Landing (similar to Driving and Stopping),
 * but different in one respect: Once the NeedsMaintenance boolean gets set to true, any attempt at flight should be rejected (return false),
 * and an error message should be printed saying that the plane can't fly until it's repaired.
 */

fun main(){
    val flashCar = Cars("Flash Car", model = "Mustang", year = 2015, weight = 800)
    val amazingCar = Cars("Amazing Car", model = "Tesla", year = 2016, weight = 900)
    val greatCar = Cars("Great Car", model = "Ferrari", year = 2017, weight = 700)
    drive(flashCar)
    drive(amazingCar)
    drive(greatCar)

    val jet = Planes("Superb Plane", model = "Jet", year = 2018, weight = 1200)
    val airbus = Planes("Great Plane", model = "Airbus", year = 2019, weight = 2100)
    fly(jet)
    fly(airbus)
}

fun drive(car: Cars){
    with(car){
        //Drive for the 1st, 2nd & 3rd time
        drive()
        drive()
        drive()
        //Stop driving
        stop()
        //Drive for the 4th & 5th time
        drive()
        drive()
        //Stop driving
        stop()
        //Drive for the 6th time
        drive()
        //Stop driving
        stop()
        //Drive for the 7th & 8th time
        drive()
        drive()
        //Stop driving
        stop()
        //Check the info
        printVehicleInfo()
        //Attempting to drive again even if maintenance/repair is requested already
        drive()
        //Repairing the vehicle
        println("The car is repairing...")
        repair()
        //Check the info again
        printVehicleInfo()
        println("The car is repaired!")
        //If NEED MAINTENANCE is false on the VEHICLE INFORMATION, it means it can drive again.
        println("Happy Driving!")
    }
}

fun fly(plane: Planes){
    with(plane){
        //Fly for the 1st, 2nd & 3rd time
        flying()
        flying()
        flying()
        //Land the Plane
        landing()
        //Fly for the 4th & 5th time
        flying()
        flying()
        //Land the Plane
        landing()
        //Check the info
        printVehicleInfo()
        //Attempting to drive again even if maintenance/repair is requested already
        flying()
        //Repairing the vehicle
        println("The plane is repairing...")
        repair()
        //Check the info again
        printVehicleInfo()
        println("The plane is repaired!")
        //If NEED MAINTENANCE is false on the VEHICLE INFORMATION, it means it can drive again.
        println("Happy Driving!\n")
    }
}