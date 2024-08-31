public class Main {
    public static void main(String[] args) {
        // Create a parking lot with 5 spots
        ParkingLot parkingLot = new ParkingLot(5);

        // Test parking vehicles
        parkingLot.parkVehicle("KA-01-HH-1234");
        parkingLot.parkVehicle("KA-01-HH-9999");
        parkingLot.parkVehicle("KA-01-BB-0001");
        parkingLot.parkVehicle("KA-01-HH-7777");
        parkingLot.parkVehicle("KA-01-HH-2701");

        // Try parking when full
        parkingLot.parkVehicle("KA-01-HH-3141");

        // Test removing vehicles
        parkingLot.removeVehicle("KA-01-HH-1234");
        parkingLot.removeVehicle("KA-01-HH-7777");

        // Test parking after removing vehicles
        parkingLot.parkVehicle("KA-01-HH-3141");

        // Check available spots
        System.out.println("Available spots: " + parkingLot.availableSpots());

        // Check specific vehicle spot
        System.out.println("Spot for vehicle KA-01-HH-3141: " + parkingLot.getVehicleSpot("KA-01-HH-3141"));
    }
}
