package com.kolbeev.digcrimea

import kotlin.random.Random

//класс с информацией о футбольном матче
class FootballMatch(var goalsTeam1: Int, var goalsTeam2: Int) {
    //задание количества голов
    fun setGoals(goals1: Int, goals2: Int) {
        goalsTeam1 = goals1
        goalsTeam2 = goals2
    }

    //разрыв в голах
    fun goalDifference(): Int {
        return kotlin.math.abs(goalsTeam1 - goalsTeam2)
    }

    //является матч ничейным
    fun isDraw(): Boolean {
        return goalsTeam1 == goalsTeam2
    }

    //переопределение метода toString() для удобного вывода
    override fun toString(): String {
        return "Матч(Команда 1: $goalsTeam1, Команда 2: $goalsTeam2)"
    }
}

fun main() {
    //массив из 10 матчей со случайным значением голов
    val matches = Array(10) { FootballMatch((0..5).random(), (0..5).random()) }

    //удаление матчей с ничьёй
    val nonDrawMatches = matches.filterNot { it.isDraw() }

    //множество с максимальным разрывом в голах
    val maxDifferenceSet = nonDrawMatches.map { it.goalDifference() }.toSet()

    //вывод всех результатов
    println("Все матчи:")
    matches.forEach { println(it) }

    println("\nМатчи без ничьи:")
    nonDrawMatches.forEach { println(it) }

    println("\nМаксимальные разрывы в голах:")
    println(maxDifferenceSet.sortedDescending())

}