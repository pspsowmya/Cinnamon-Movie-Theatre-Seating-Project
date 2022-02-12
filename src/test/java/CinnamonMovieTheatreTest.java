import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CinnamonMovieTheatreTest {

    @Test
    public void checkUserInputForValidNumberOfSeats() {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Act
        boolean isValidInput = theatreSeatAllocation.validateUserInput(3);

        //Assert
        assertEquals(true, isValidInput);
    }

    @Test
    public void checkUserInputForInvalidNumberOfSeats() {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Act
        boolean isValidInput = theatreSeatAllocation.validateUserInput(8);

        //Assert
        assertEquals(false, isValidInput);
    }


    @Test
    public void checkNumberOfSeatsAvailableAtTheBeginning() {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Act
        int seatsAvailable = theatreSeatAllocation.seatListCreation().size();

        //Assert
        assertEquals(15, seatsAvailable);
    }
}
