package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        int number = 0;
        while(number!=-1){
            System.out.print("Please enter number of tickets:");
            Scanner scanner = new Scanner(System.in);
            int numberOfTickets = scanner.nextInt();
            if (numberOfTickets !=-1){
                System.out.print("How man round-trip tickets:");
                int numberOfRoundTrip = scanner.nextInt();
                Tickets tickets = new Tickets(numberOfTickets,numberOfRoundTrip);
                tickets.showInfo();
            } else {break;}


        }


    }
}
