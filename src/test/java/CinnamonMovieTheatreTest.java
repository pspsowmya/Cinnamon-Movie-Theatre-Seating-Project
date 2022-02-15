import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(ints = {2, 2, 3, 1, 1, 3, 1})
    @Order(3)
    public void checkSeatAllocationForParameterizedInput(int seats) throws Exception {
        //Arrange
        int seatsAllocated = 0;

        //Act
        List allocation = theatreSeatAllocation.allocateSeats(seats);
        seatsAllocated = allocation.size();

        //Assert
        assertEquals(seats, seatsAllocated);
    }

    @Test
    @Order(4)
    public void checkSeatAllocationWhenOnlyTwoSeatsLeftAndThreeSeatsAreRequired() throws Exception {
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
        int seats = 2;

        //Act
        List allocation = theatreSeatAllocation.allocateSeats(seats);

        //Assert
        assertEquals(seats, allocation.size());
    }


    @Test
    @Order(6)
    public void checkSeatAllocationWhenSeatsAreFull() {
        //Act and assert
        assertThrows(Exception.class, () -> {
            theatreSeatAllocation.allocateSeats(2);
        });
    }
}
