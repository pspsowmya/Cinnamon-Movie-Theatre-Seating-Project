import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CinnamonMovieTheatreTest {

    TheatreSeatAllocation theatreSeatAllocation;

    @BeforeEach
    public void setup() {
        theatreSeatAllocation = new TheatreSeatAllocation();
    }

    @Test
    @Order(1)
    public void checkUserInputForValidNumberOfSeats() {
        //Act
        boolean isValidInput = theatreSeatAllocation.validateUserInput(3);

        //Assert
        assertEquals(true, isValidInput);
    }

    @Test
    @Order(2)
    public void checkUserInputForInvalidNumberOfSeats() {
        //Act
        boolean isValidInput = theatreSeatAllocation.validateUserInput(8);

        //Assert
        assertEquals(false, isValidInput);
    }


    @Test
    @Order(3)
    public void checkSeatAllocationForFirstRequest() throws Exception {
        //Arrange
        List expectedList = new ArrayList();
        expectedList.add("A1");
        expectedList.add("A2");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }

    @Test
    @Order(4)
    public void checkSeatAllocationForSecondRequest() throws Exception {
        //Arrange
        List expectedList = new ArrayList();
        expectedList.add("A3");
        expectedList.add("A4");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }


    @Test
    @Order(5)
    public void checkSeatAllocationForThirdRequest() throws Exception {
        //Arrange
        List expectedList = new ArrayList();
        expectedList.add("A5");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(1);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }

    @Test
    @Order(6)
    public void checkSeatAllocationForFourthRequest() throws Exception {
        //Arrange
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
    @Order(7)
    public void checkSeatAllocationForFifthRequest() throws Exception {
        //Arrange
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
    @Order(8)
    public void checkSeatAllocationForSixthRequest() throws Exception {
        //Arrange
        List expectedList = new ArrayList();
        expectedList.add("C2");
        expectedList.add("C3");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }


    @Test
    @Order(9)
    public void checkSeatAllocationForSeventhRequest() throws Exception {
        //Arrange
        List expectedList = new ArrayList();
        expectedList.add("C4");
        expectedList.add("C5");

        //Act
        List seatsAllocated = theatreSeatAllocation.allocateSeats(2);

        //Assert
        assertEquals(expectedList, seatsAllocated);
    }


    @Test
    @Order(10)
    public void checkSeatAllocationWhenSeatsAreFull() {
        //Act and assert
        assertThrows(Exception.class, () -> {
            theatreSeatAllocation.allocateSeats(2);
        });
    }
}
