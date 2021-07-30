package com.project.helloworld.homework6

class Cars(
    vehicleName: String,
    model: String,
    year: Int,
    weight: Int
) : Vehicle(vehicleName, model, year, weight) {

    private var isDriving = false

    fun drive() {
        isDriving = true
        println("The $vehicleName is driving...")
    }

    fun stop() {
        isDriving = false
        println("The $vehicleName is stopped...")
        tripSinceMaintenance += 50

        if (tripSinceMaintenance == 100){
            needsMaintenance = true
        }
    }

}