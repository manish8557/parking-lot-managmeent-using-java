import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ParkingLot {
    private int capacity;
    private Queue<Integer> availableSpots;
    private HashMap<String, Integer> parkedVehicles;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        availableSpots = new LinkedList<>();
        parkedVehicles = new HashMap<>();

        // Initially, all spots are available
        for (int i = 1; i <= capacity; i++) {
            availableSpots.add(i);
        }
    }

    // Method to park a vehicle
    public boolean parkVehicle(String vehicleNumber) {
        if (availableSpots.isEmpty()) {
            System.out.println("Parking Full. No available spots.");
            return false;
        }

        int spot = availableSpots.poll(); // Get and remove the next available spot
        parkedVehicles.put(vehicleNumber, spot);
        System.out.println("Vehicle " + vehicleNumber + " parked at spot " + spot);
        return true;
    }

    // Method to remove a vehicle from the parking lot
    public boolean removeVehicle(String vehicleNumber) {
        if (!parkedVehicles.containsKey(vehicleNumber)) {
            System.out.println("Vehicle not found in the parking lot.");
            return false;
        }

        int spot = parkedVehicles.remove(vehicleNumber);
        availableSpots.add(spot); // Mark the spot as available again
        System.out.println("Vehicle " + vehicleNumber + " removed from spot " + spot);
        return true;
    }

    // Method to check the availability of parking spots
    public int availableSpots() {
        return availableSpots.size();
    }

    // Method to get the parking spot of a specific vehicle
    public int getVehicleSpot(String vehicleNumber) {
        return parkedVehicles.getOrDefault(vehicleNumber, -1);
    }
}
