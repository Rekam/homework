package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    val numberOfTickets = scanner.nextInt()
    print("How man round-trip tickets:")
    val numberOfRoundTrip = scanner.nextInt()

    val ticketsKotlin = TicketsKotlin(numberOfTickets,numberOfRoundTrip)
    ticketsKotlin.showInfo()


}