import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CinnamonMovieTheatreTest {

    @Test
    @Order(1)
    public void checkUserInputForValidNumberOfSeats() {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();
        theatreSeatAllocation.createSeats();

        //Act
        boolean isValidInput = theatreSeatAllocation.validateUserInput(3);

        //Assert
        assertEquals(true, isValidInput);
    }

    @Test
    @Order(2)
    public void checkUserInputForInvalidNumberOfSeats() {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Act
        boolean isValidInput = theatreSeatAllocation.validateUserInput(8);

        //Assert
        assertEquals(false, isValidInput);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 2, 3, 1, 1, 3, 1})
    @Order(3)
    public void checkSeatAllocationForParameterizedInput(int seats) throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Arrange
        int seatsAllocated = 0;

        //Act
        //List allocation = theatreSeatAllocation.allocateSeats(seats);
        List allocation = theatreSeatAllocation.allocateSeats(seats);
        seatsAllocated = allocation.size();

        //Assert
        assertEquals(seats, seatsAllocated);
    }

    @Test
    @Order(4)
    public void checkSeatAllocationWhenOnlyTwoSeatsLeftAndThreeSeatsAreRequired() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Arrange
        int seats = 3;

        //Act
        List allocation = theatreSeatAllocation.allocateSeats(seats);

        //Assert
        assertEquals(0, allocation.size());
    }

    @Test
    @Order(5)
    public void checkSeatAllocationWhenOnlyTwoSeatsLeft() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Arrange
        int seats = 2;

        //Act
        List allocation = theatreSeatAllocation.allocateSeats(seats);

        //Assert
        assertEquals(seats, allocation.size());
    }


    @Test
    @Order(6)
    public void checkSeatAllocationWhenSeatsAreFull() {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation = new TheatreSeatAllocation();

        //Act and assert
        assertThrows(Exception.class, () -> {
            theatreSeatAllocation.allocateSeats(2);
        });
    }


    @Test
    @Order(7)
    public void checkSeatAllocationForOneSeatInEmptyTheatre() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation1 = new TheatreSeatAllocation();
        int seats = 1;
        List allocatedList = new ArrayList();
        allocatedList.add("A1");

        //Act
        theatreSeatAllocation1.createSeats();
        List allocation = theatreSeatAllocation1.allocateSeats(seats);

        //Assert
        assertEquals(allocatedList, allocation);
    }

    @Test
    @Order(8)
    public void checkOneSeatAllocationWhenOneSeatIsAlreadyFilled() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation1 = new TheatreSeatAllocation();
        int seats = 1;
        List allocatedList = new ArrayList();
        allocatedList.add("A2");

        //Act
        List allocation = theatreSeatAllocation1.allocateSeats(seats);

        //Assert
        assertEquals(allocatedList, allocation);
    }

    @Test
    @Order(9)
    public void checkSeatAllocationForTwoSeatsInEmptyTheatre() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation2 = new TheatreSeatAllocation();
        int seats = 2;
        List allocatedList = new ArrayList();
        allocatedList.add("A1");
        allocatedList.add("A2");

        //Act
        theatreSeatAllocation2.createSeats();
        List allocation = theatreSeatAllocation2.allocateSeats(seats);

        //Assert
        assertEquals(allocatedList, allocation);
    }

    @Test
    @Order(10)
    public void checkTwoSeatsAllocationsWhenTwoSeatsAreAlreadyFilled() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation2 = new TheatreSeatAllocation();
        int seats = 2;
        List allocatedList = new ArrayList();
        allocatedList.add("A3");
        allocatedList.add("A4");

        //Act
        List allocation = theatreSeatAllocation2.allocateSeats(seats);

        //Assert
        assertEquals(allocatedList, allocation);
    }


    @Test
    @Order(11)
    public void checkSeatAllocationForThreeSeatsInEmptyTheatre() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation3 = new TheatreSeatAllocation();
        int seats = 3;
        List allocatedList = new ArrayList();
        allocatedList.add("A1");
        allocatedList.add("A2");
        allocatedList.add("A3");

        //Act
        theatreSeatAllocation3.createSeats();
        List allocation = theatreSeatAllocation3.allocateSeats(seats);

        //Assert
        assertEquals(allocatedList, allocation);
    }


    @Test
    @Order(12)
    public void checkThreeSeatsAllocationWhenThreeSeatsAlreadyFilled() throws Exception {
        //Arrange
        TheatreSeatAllocation theatreSeatAllocation3 = new TheatreSeatAllocation();
        int seats = 3;
        List allocatedList = new ArrayList();
        allocatedList.add("A4");
        allocatedList.add("A5");
        allocatedList.add("B1");

        //Act
        List allocation = theatreSeatAllocation3.allocateSeats(seats);

        //Assert
        assertEquals(allocatedList, allocation);
    }
}
