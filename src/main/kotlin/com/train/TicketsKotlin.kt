package com.train

class TicketsKotlin(var numberOfTickets:Int, var numberOfRoundTrip:Int){
    companion object {
        var oneWayPrice = 1000
        var roundTripPrice = oneWayPrice*2*0.9
    }

    fun totalPrice() = Math.round((numberOfTickets-numberOfRoundTrip)*oneWayPrice + numberOfRoundTrip* roundTripPrice)
    fun validate() = (numberOfTickets >= numberOfRoundTrip && numberOfTickets > 0 && numberOfRoundTrip >= 0)
    fun showInfo() {
        if (validate()){
            println("Total tickets: $numberOfTickets\n Round-trip: $numberOfRoundTrip\n Total: ${totalPrice()}\n")
        } else {
            println("Failed Input")
        }
    }
}