package com.project.helloworld.homework3

/**
 * Title: Homework Assignment #3: Collections
 * From: Pirple/Nirmish
 *
 * Details: What is the difference between a list and an array? When would each be appropriate too use?
 */

/**
 * List - is an Interface from Collections Framework and it is immutable or Read-only by default. It can consist of elements with different data types.
 * It can be mutable by using MutableList<T> or mutableListOf() or toMutableList() to allow operations such as Add or Remove an element at specific position.
 * It also offers several features or functions which Array doesn't such as mapping, filtering, sorting, string representation, flatten, grouping, etc.
 *
 * When to use List?
 * - if the size of the data can vary, then List/Mutable List can be used.
 *
 */

/**
 * Array - is a Class, Mutable, and fixed-sized sequence of elements or cannot expand its size during runtime.
 * It only consists of elements with the same data type.
 * We can replace the value of each element but we are not able to add or delete element during runtime.
 *
 * When to use Array?
 * - If you have a fixed size data then Array can be used
 */

/**
 * What is Mutable?
 *  - The value of the mutable variable can be change.
 */

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    // Error: immutable list cannot be reassigned
    //list = listOf(2,3,4,5,6)

    // List can have different data types
    val differentDataTypesList = listOf("String", 1, true)

    // List can be mutable
    val mutableList = list.toMutableList()
    // Mutable list can do Adding or Removing element
    mutableList.add(6)
    mutableList.removeAt(0)

    // List/Mutable List supports other features such as map, filter, sorting, string representation, flatten, grouping, etc.
    val listMapping = list.map { it == 4 }
    val listFiltering = list.filter { it < 3 }
    val listSorted = list.sorted()
    val listSortedBy = list.sortedBy { it < 5 }
    val listStringRepresentation = list.joinToString(separator = ",", prefix = "-", postfix = "-")
    val listFlatten = listOf(list, mutableList).flatten()
    val listGrouping = list.groupBy { it == 2 }

    // Array consist of same data type
    val arrays : IntArray = intArrayOf(1,2,3,4,5)

    // replace value in array but the size of it cannot be modified during runtime
    arrays[0] = 10

    println("List with different data types: $differentDataTypesList")
    println("List to Mutable List: Adding/Removing Element...")
    println("1. Mutable List original size: ${mutableList.size}")
    mutableList.add(6)
    println("2. Mutable List new size after adding new element: ${mutableList.size}")
    mutableList.removeAt(0)
    println("3. Mutable List new size after removing element: ${mutableList.size}")
    println("List Mapping: $listMapping")
    println("List Filtering: $listFiltering")
    println("List Sorted: $listSorted")
    println("List SortedBy: $listSortedBy")
    println("List String-Representation: $listStringRepresentation")
    println("List Flatten: $listFlatten")
    println("List Grouping: $listGrouping")

    println("Array 1st element original value: ${arrays[0]}")
    println("Array new values after modifying 1st element: ${arrays[1]}")
}