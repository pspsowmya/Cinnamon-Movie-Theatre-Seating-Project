import java.util.*;

public class TheatreSeatAllocation {

    private static final int NO_OF_ROWS = 3;
    private static final int NO_OF_COLUMNS = 5;

    static List<String> seatsAvailable = new LinkedList<>();

    //static block to create initial list of available seats
    public static void createSeats() {
        seatsAvailable.clear();
        for (int i = 1; i <= NO_OF_ROWS; i++) {
            for (int j = 1; j <= NO_OF_COLUMNS; j++) {
                if (i == 1) {
                    seatsAvailable.add("A" + j);
                } else if (i == 2) {
                    seatsAvailable.add("B" + j);
                } else if (i == 3) {
                    seatsAvailable.add("C" + j);
                }
            }
        }
    }


    //Method to validate user input
    public boolean validateUserInput(int numberOfSeatsRequired) {
        boolean isValid = false;
        if (numberOfSeatsRequired >= 1 && numberOfSeatsRequired <= 3) {
            isValid = true;
        }
        return isValid;
    }


    //Method to allocate seats based on user request
    public List allocateSeats(int numberOfSeatsRequired) throws Exception {
        List seatsAllocated = new ArrayList();
        if (validateUserInput(numberOfSeatsRequired)) {
            if (seatsAvailable.size() >= numberOfSeatsRequired) {
                for (int i = 0; i <= numberOfSeatsRequired - 1; i++) {
                    seatsAllocated.add(seatsAvailable.get(i));
                }
                seatsAvailable.removeAll(seatsAllocated);
            } else if ((seatsAvailable.size() == 2 || seatsAvailable.size() == 1) && numberOfSeatsRequired >= 2) {
                System.out.println("No. of seats left are: " + seatsAvailable.size() + " Please select another number of seats");
            } else {
                throw new Exception("No seats left. Please try for another movie... !!");
            }
        }
        return seatsAllocated;
    }

}
