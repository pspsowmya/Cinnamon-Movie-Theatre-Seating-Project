# Cinnamon Movie Theatre Challenge Java

## Overview 

This repository contains the implementation of Cinnamon Movie Theatre Challenge. 
The main aim of this challenge is to allocate seats to customers purchasing tickets for a movie in Cinnamon Theatre.
There are 15 seats in the theatre arranged in 3 rows of 5. Rows are assigned a letter from A to C. Seats are assigned a number from 1 to 5.

The User Story is as follows:
GIVEN a customer wants to request some tickets
WHEN they request a number of seats between 1 and 3 for a movie
THEN the customer should be allocated the required number of seats
from the available seats on the seating plan
AND the seats should be recorded as allocated

It has been assumed that the user input for number of seats should be between 1 and 3. 
The program will allocate seats by filling in the auditorium from left to right, front to back.
All the seats will be available for purchase when the program first begins. 
When all the seats are filled in then the program throws an exception and terminates.

### Implementation Details

The solution has been developed using Test Driven Development Approach. 
There is a test class which has all the methods to test the functionality.
And a class called TheatreSeatAllocation where the logic has been implemented.

## Instructions to run

To run this project you need to fork the repository to your git account and clone it to your machine. 
Once cloned you can run the tests using

mvn test

All the tests should pass and the application should run successfully for additional inputs.