package com;

import java.util.List;

class View {
    void displayTrains(List<Train> trains) {
        System.out.println("Available Trains:");
        for (Train train : trains) {
            System.out.println(train.getTrainNumber() + " - " + train.getSource() + " to " + train.getDestination()
                    + " (Available Seats: " + train.getSeats() + ")");
        }
    }

    void displayTickets(List<Passenger> tickets) {
        System.out.println("Booked Tickets:");
        for (Passenger ticket : tickets) {
            System.out.println("Passenger: " + ticket.getPassengerName() + ", Train: " + ticket.getTrain().getTrainNumber() +
                    ", Seats: " + ticket.getNumberOfSeats() + ", Booking Date: " + ticket.getBookingDate());
        }
    }

//    void displayBookedSeats(Train train) {
//        System.out.println("Booked Seats for Train : " + train.getTrainNumber() + ":");
//       
//       
//    }

    void displayTrainDetails(Train train) {
        System.out.println("Train Details for Train " + train.getTrainNumber() + ":");
        System.out.println("From : "+train.getSource());
        System.out.println("To : "+train.getDestination());
        System.out.println("Available Seats "+train.getSeats());
        System.out.println("Running Date : "+train.getRunningDate());
        
    }

    void displayPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details for " + passenger.getPassengerName() + ":");
        System.out.println("Passenger Berth preference : "+passenger.getPreference());
        System.out.println("Passsenger AllotedSeat : "+passenger.getAllotedSeat());
        System.out.println("Booking date : "+passenger.getBookingDate());
        
    }
    void displayTrainAvailablity(Train train)
    {
    	System.out.println("Available LowerBerth :"+train.getLowerBerth());
    	System.out.println("Available MiddleBerth : "+train.getMiddleBerth());
    	System.out.println("Available UpperBerth : "+train.getUpperBerth());
    	System.out.println(" No of RAC : "+train.getRac());
    	System.out.println("No of WaitingList : "+train.getWaiting());
    }
}
