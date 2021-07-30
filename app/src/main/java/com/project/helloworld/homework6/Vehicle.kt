package com.project.helloworld.homework6

open class Vehicle(
    var vehicleName: String,
    var model: String,
    var year: Int,
    var weight: Int,
) {
    var needsMaintenance: Boolean = false
    var tripSinceMaintenance = 0

    fun repair() {
        tripSinceMaintenance = 0
        needsMaintenance = false
    }

    fun printVehicleInfo(){
        println("\t\t\t\t\t\t\t\t[VEHICLE INFORMATION]")
        println("(NAME)\t\t\t(MODEL)\t\t(YEAR)\t(WEIGHT)\t(TRIP SINCE MAINTENANCE)\t(NEED MAINTENANCE)")
        println("$vehicleName\t\t$model\t\t$year\t  $weight\t\t\t\t  $tripSinceMaintenance\t\t\t\t\t\t  $needsMaintenance")
        println("----------------------------------------------------------------------------------------------------------------")
    }
}