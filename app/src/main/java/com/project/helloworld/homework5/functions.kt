package com.project.helloworld.homework5

/**
 * Title: Homework Assignment #4: Functions
 * From: Pirple/Nirmish
 *
 * Details: Let's return to the music example from assignment one. Pick 3 of the attributes you listed.
 * For our example we're going to say "Genre", "Artist" and "Year".
 * Create a new Kotlin file and create 3 functions with the same name as those attributes.
 * So in this example we'd have one function named "genre" another named "artist" and another called "year".
 *
 * When someone calls any of those functions, that function should return the corresponding value for that attribute.
 * For example, if we call the "Artist" function our function would return "Dave Brubeck".
 * Yours should return whatever values make sense for your music choice.
 */

fun main(){
    val song = song()
    val artist = artist()
    val genre = genre()
    val year = year()

    println("Song: $song")
    println("Artist: $artist")
    println("Genre: $genre")
    println("Year Released: $year")
}

fun song(): String{
    return "I Love You"
}

fun genre(): String {
    return "Pop"
}

fun artist(): String {
    return "Avril Lavigne"
}

fun year(): Int {
    return 2011
}