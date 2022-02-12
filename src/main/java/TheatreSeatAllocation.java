import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TheatreSeatAllocation {

    private static final int NO_OF_ROWS = 3;
    private static final int NO_OF_COLUMNS = 5;

    static List<String> seatsAvailable = new LinkedList<>();

    //static block to create initial list of available seats
    static {
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
        List allocated = new ArrayList();
        if (validateUserInput(numberOfSeatsRequired)) {
            if (seatsAvailable.size() >= numberOfSeatsRequired) {
                for (int i = 0; i <= numberOfSeatsRequired - 1; i++) {
                    allocated.add(seatsAvailable.get(i));
                }
                seatsAvailable.removeAll(allocated);
            } else {
                throw new Exception("No seats left. Please try for another movie... !!");
            }
        }
        return allocated;
    }

}
