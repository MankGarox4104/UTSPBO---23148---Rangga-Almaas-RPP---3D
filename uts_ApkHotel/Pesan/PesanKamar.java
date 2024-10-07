package uts_ApkHotel.Pesan;

import uts_ApkHotel.users.User;

public class PesanKamar {
    private User customer;
    private Kamar room;
    private int numberOfNights;

    public PesanKamar(User customer, Kamar room, int numberOfNights) {
        this.customer = customer;
        this.room = room;
        this.numberOfNights = numberOfNights;
        room.setAvailable(false);
    }

    public void showBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Number of Nights: " + numberOfNights);
    }
}