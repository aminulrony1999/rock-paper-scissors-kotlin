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
    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if(winner == "Tie")
        println("It's a tie")
    else if(winner == "Player")
        println("Player won!")
    else
        println("Computer won!");
}