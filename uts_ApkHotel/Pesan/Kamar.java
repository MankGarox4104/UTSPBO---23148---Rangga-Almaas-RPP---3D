package uts_ApkHotel.Pesan;

public class Kamar {
    private int roomNumber;
    private boolean isAvailable;
    private String roomType;

    public Kamar(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void showRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Ketersediaan: " + (isAvailable ? "Tersedia" : "Terpakai"));
    }
}