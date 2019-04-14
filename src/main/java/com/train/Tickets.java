package com.train;

public class Tickets {
    int numberOfTickets;
    int numberOfRoundTrip;
    static double oneWayPrice = 1000;
    static double roundTripPrice = oneWayPrice*2*0.9;

    public Tickets(int numberOfTickets, int numberOfRoundTrip) {
        this.numberOfTickets = numberOfTickets;
        this.numberOfRoundTrip = numberOfRoundTrip;
    }


    public double TotalPrice() {
        return (numberOfTickets-numberOfRoundTrip)*oneWayPrice +numberOfRoundTrip*roundTripPrice;
    }

    public void showInfo() {
        if (validate()){
            double totalPrice = TotalPrice();
            System.out.println("Total tickets:"+numberOfTickets);
            System.out.println("Round-trip:"+numberOfRoundTrip);
            System.out.println("Total:"+Math.round(totalPrice));
            // eg.
            //        Total tickets: 5
            //        Round-trip: 3
            //        Total: 7400
        } else {
            System.out.println("Failed Input");
        }

    }

    public boolean validate(){
        if (numberOfTickets>=numberOfRoundTrip && numberOfTickets>0 && numberOfRoundTrip>=0){
            return true;
        } else return false;
    }
}
