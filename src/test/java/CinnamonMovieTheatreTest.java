import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



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

    @Test
    public void checkSeatAllocation(){
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        List expectedList = new ArrayList();
        expectedList.add("A1");
        expectedList.add("A2");

        //Act
        List seatsAllocated = new ArrayList<>();
        seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }

}
