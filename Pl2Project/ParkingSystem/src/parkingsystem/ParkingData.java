/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingsystem;
 import java.util.ArrayList;
/**
 *
 * @author youse
 */

public class ParkingData {

    private static ParkingData data;

    private ArrayList<String> tickets;
    private ArrayList<String> spots;
    private ArrayList<String> payments;

    private ParkingData() {
        tickets = new ArrayList<>();
        spots = new ArrayList<>();
        payments = new ArrayList<>();
    }

    public static ParkingData getdata() {
        if (data == null) {
            data = new ParkingData();
        }
        return data;
    }

    // Tickets
    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    public ArrayList<String> getTickets() {
        return tickets;
    }

    // Spots
    public void addSpot(String spot) {
        spots.add(spot);
    }

    public ArrayList<String> getSpots() {
        return spots;
    }

    // Payments
    public void addPayment(String payment) {
        payments.add(payment);
    }

    public ArrayList<String> getPayments() {
        return payments;
    }
}

