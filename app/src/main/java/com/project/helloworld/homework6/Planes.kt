package com.project.helloworld.homework6

class Planes(
    vehicleName: String,
    model: String,
    year: Int,
    weight: Int
) : Vehicle(vehicleName, model, year, weight) {

    private var isFlying = false

    fun flying() {
        if (needsMaintenance){
            showMaintenanceAlert()
        }else{
            println("The $vehicleName is flying...")
            isFlying = true
        }
    }

    fun landing() {
        if (needsMaintenance){
            showMaintenanceAlert()
        }else{
            println("The $vehicleName landing...")
            isFlying = false
            tripSinceMaintenance += 50

            if (tripSinceMaintenance == 100) {
                needsMaintenance = true
            }
        }
    }

    private fun showMaintenanceAlert(){
        println("The plane can't fly until it's repaired")
    }
}