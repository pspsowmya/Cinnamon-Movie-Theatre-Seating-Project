import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


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
    public void checkSeatAllocation() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        List expectedList = new ArrayList();
        expectedList.add("A1");
        expectedList.add("A2");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }

    @Test
    public void checkSeatAllocation2() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        List expectedList = new ArrayList();
        expectedList.add("A3");
        expectedList.add("A4");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }


    @Test
    public void checkSeatAllocation3() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        List expectedList = new ArrayList();
        expectedList.add("A5");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(1);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }

    @Test
    public void checkSeatAllocation4() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        List expectedList = new ArrayList();
        expectedList.add("B1");
        expectedList.add("B2");
        expectedList.add("B3");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(3);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }


    @Test
    public void checkSeatAllocation5() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        List expectedList = new ArrayList();
        expectedList.add("B4");
        expectedList.add("B5");
        expectedList.add("C1");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(3);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }

    @Test
    public void checkSeatAllocation6() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        List expectedList = new ArrayList();
        expectedList.add("C2");
        expectedList.add("C3");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }


    @Test
    public void checkSeatAllocation7() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        List expectedList = new ArrayList();
        expectedList.add("C4");
        expectedList.add("C5");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }


    @Test
    public void checkSeatAllocation8() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Act and assert
        assertThrows(Exception.class, () -> {
            theatreSeatAllocation.allocateSeats(2);
        });
    }
}
