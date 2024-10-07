package uts_ApkHotel;

import java.util.Scanner;
import uts_ApkHotel.Pesan.*;
import uts_ApkHotel.users.*;

public class APKHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kamar[] rooms = new Kamar[3];
        rooms[0] = new Kamar(101, "Mewah");

        rooms[1] = new Kamar(102, "Biasa Ajah");
        rooms[2] = new Kamar(103, "Tipe Jelata");

        User admin = new User("MankGarox", "admin");
        User customer = new User("Rusdi", "customer");

        System.out.println("Login sebagai: 1. Admin atau 2. Customer");
        int loginChoice = scanner.nextInt();
        User currentUser = loginChoice == 1 ? admin : customer;

        if (currentUser.isAdmin()) {
            System.out.println("Menu Admin:");
            System.out.println("1. Cek Ketersediaan Kamar");
            System.out.println("2. Lihat Semua Booking");

            int choice = scanner.nextInt();
            if (choice == 1) {
                for (Kamar room : rooms) {
                    room.showRoomDetails();
                }
            }
        } else if (currentUser.isCustomer()) {
            System.out.println("Menu Customer:");
            System.out.println("1. Cek Ketersediaan Kamar");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Lihat Detail Pesanan");

            int choice = scanner.nextInt();
            if (choice == 1) {
                for (Kamar room : rooms) {
                    if (room.isAvailable()) {
                        room.showRoomDetails();
                    }
                }
            } else if (choice == 2) {
                System.out.println("Masukkan nomor kamar yang ingin dipesan:");
                int roomNumber = scanner.nextInt();
                Kamar selectedRoom = null;
                for (Kamar room : rooms) {
                    if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                        selectedRoom = room;
                        break;
                    }
                }
                if (selectedRoom != null) {
                    System.out.println("Masukkan jumlah malam untuk menginap:");
                    int nights = scanner.nextInt();
                    PesanKamar booking = new PesanKamar(currentUser, selectedRoom, nights);
                    System.out.println("Kamar berhasil dipesan!");
                } else {
                    System.out.println("Kamar tidak tersedia!");
                }
            }
        }
        scanner.close();
    }
}