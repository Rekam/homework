package com.train

import java.util.*

fun main(args: Array<String>) {
    var number =0
    while(number!=-1){

        val scanner = Scanner(System.`in`)
        print("Please enter number of tickets:")
        val numberOfTickets = scanner.nextInt()

        if(numberOfTickets!=-1){
            print("How man round-trip tickets:")
            val numberOfRoundTrip = scanner.nextInt()

            val ticketsKotlin = TicketsKotlin(numberOfTickets,numberOfRoundTrip)
            ticketsKotlin.showInfo()
        } else {break}


    }



}