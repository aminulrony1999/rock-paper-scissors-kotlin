package com.aminulrony.rockpaperscissors

fun main(){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors ? Enter your choice :")
    playerChoice = readln()
    val randomNumber = (1..3).random()
    if(randomNumber == 1)
        computerChoice = "Rock"
    else if(randomNumber == 2)
        computerChoice = "Paper"
    else
        computerChoice = "Scissors"
    println(computerChoice)
}