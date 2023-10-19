package com.example.exemplektliste
//    1
class Etudiant(var name: String, var code:Int, var gender:String, var adress:String, var age:Int)

fun main() {
//    2
    val etudiants = mutableListOf(
        Etudiant("Otmane",1,"male","safi",20),
        Etudiant("Aymen",2,"male","safi",19),
        Etudiant("hassan",3,"male","bengurir",40),
        Etudiant("Sara",4,"female","casablaca",27),
        Etudiant("Ghoudaina",5,"female","safi",30),
    )
//    3
    etudiants.sortBy {it.age}
    println(etudiants)
//    4
    val groupe = etudiants.groupBy { it.gender }
//    5
    val females = groupe.get("female")
//    6
    val premierMale = etudiants.first{ it.gender == "male" }
    println("Nom du premier male: ${premierMale.name}")
//    7
    premierMale.name = "Mohammed"
    println("Nouveau nom du premier male: ${premierMale.name}")
//    8
    val nomsEtudiants = mutableListOf<String>()
    for (et in etudiants){
        nomsEtudiants.add(et.name)
    }
//    9
    val genderToDelete = "female"
    etudiants.removeIf { it.gender == genderToDelete }
//    10
    etudiants.reverse()
    println(etudiants)
//    11
    etudiants.clear()
    println(etudiants)
}