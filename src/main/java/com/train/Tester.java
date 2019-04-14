package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int numberOfTickets = scanner.nextInt();
        System.out.print("How man round-trip tickets:");
        int numberOfRoundTrip = scanner.nextInt();

        Tickets tickets = new Tickets(numberOfTickets,numberOfRoundTrip);
        tickets.showInfo();

    }
}
