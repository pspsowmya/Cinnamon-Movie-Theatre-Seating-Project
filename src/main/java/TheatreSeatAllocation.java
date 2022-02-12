public class TheatreSeatAllocation {


    public boolean validateUserInput(int numberOfSeatsRequired) {
        boolean isValid = false;
        if (numberOfSeatsRequired >= 1 && numberOfSeatsRequired <= 3) {
            isValid = true;
        }
        return isValid;
    }

}
