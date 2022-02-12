import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TheatreSeatAllocation {

    private static final int NO_OF_ROWS = 3;
    private static final int NO_OF_COLUMNS = 5;
    List<String> seatsAvailable = new LinkedList<String>();
    List<String> seatsAllocated = new ArrayList<>();

    public boolean validateUserInput(int numberOfSeatsRequired) {
        boolean isValid = false;
        if (numberOfSeatsRequired >= 1 && numberOfSeatsRequired <= 3) {
            isValid = true;
        }
        return isValid;
    }

    public List seatListCreation() {
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
        return seatsAvailable;
    }


}
