package com;

import java.util.List;
import java.util.Scanner;


public class Presenter {
	private TrainModel model;
	private View view;
	private String currentUser;
	Passenger passenger;

	Presenter(TrainModel model, View view) {
		this.model = model;
		this.view = view;
		this.currentUser = null;
	}

	boolean login(String username, String password) {
		if ("admin".equals(username) && "password".equals(password)) {
			currentUser = username;
			return true;
		}
		return false;
	}

	void displayTrains() {
		view.displayTrains(model.getTrains());
	}

	void bookTicket(String passengerName, String trainNumber, char preference, String contact) {
        Train train = model.findTrain(trainNumber);
        Passenger passenger;
        if(train!=null)
        {
        
        if((preference=='l'&& train.getLowerBerth() > 0 )||
           (preference=='m' && train.getMiddleBerth()> 0) ||
           (preference=='u' && train.getUpperBerth() > 0)||
           (preference=='s'&& train.getSeats()>0))
        {
            System.out.println("Preferred Berth Available");
            if(preference=='l')
            {
                System.out.println("Lower Berth Given");
                train.setLowerBerth(train.getLowerBerth()-1);
                train.setTotalSeats(train.getTotalSeats()-1);
                passenger=new Passenger(passengerName,train,preference,contact);
                model.addTickets(passenger);    
            }
            else if(preference=='m')
            {
                System.out.println("Middle Berth Given");
                train.setMiddleBerth(train.getMiddleBerth()-1);
                train.setTotalSeats(train.getTotalSeats()-1);
                passenger=new Passenger(passengerName,train,preference,contact);
                model.addTickets(passenger); 
                

            }
            else if(preference=='u')
            {
                System.out.println("Upper Berth Given");
                train.setUpperBerth(train.getUpperBerth()-1);
                train.setTotalSeats(train.getTotalSeats()-1);
                passenger=new Passenger(passengerName,train,preference,contact);
                model.addTickets(passenger); 
            }
            else if(preference=='s')
            {
            	System.out.println("Seat given");
            	train.setSeats(train.getSeats()-1);
                train.setTotalSeats(train.getTotalSeats()-1);
                passenger=new Passenger(passengerName,train,preference,contact);
                model.addTickets(passenger); 
            }

        }
        else if(train.getLowerBerth() > 0)
        {
        	System.out.println("Lower Berth Given");
            train.setLowerBerth(train.getLowerBerth()-1);
            train.setTotalSeats(train.getTotalSeats()-1);
            passenger=new Passenger(passengerName,train,preference,contact);
            model.addTickets(passenger); 
        }
        else if(train.getMiddleBerth() > 0)
        {
        	System.out.println("Middle Berth Given");
            train.setMiddleBerth(train.getMiddleBerth()-1);
            train.setTotalSeats(train.getTotalSeats()-1);
            passenger=new Passenger(passengerName,train,preference,contact);
            model.addTickets(passenger); 
        }
        else if(train.getUpperBerth()> 0)
        {
        	System.out.println("Upper Berth Given");
            train.setUpperBerth(train.getUpperBerth()-1);
            train.setTotalSeats(train.getTotalSeats()-1);  
            passenger=new Passenger(passengerName,train,preference,contact);
            model.addTickets(passenger); 
        }
        else if(train.getRac() > 0)
        {
            System.out.println("RAC available");
            passenger=new Passenger(passengerName,train,preference,contact);
            model.racList.add(passenger); 
            
        }
        else if(train.getWaiting() > 0)
        {
            System.out.println("Added to Waiting List");
            passenger=new Passenger(passengerName,train,preference,contact);
            model.waitingList.add(passenger); 
           // booker.addToWaitingList(p,(TicketBooker.waitingListPositions.get(0)),"WL");
            
        }
        }
        else
        	System.out.println("Invalid train Number : ");
        
    }

	void displayTickets() {
		view.displayTickets(model.getTickets());
	}

//	void displayBookedSeats(String trainNumber) {
//		Train train = model.findTrain(trainNumber);
//		if (train != null) {
//			view.displayBookedSeats(train);
//		} else {
//			System.out.println("Train not found with the given number.");
//		}
//	}

	void displayTrainDetails(String trainNumber) {
		Train train = model.findTrain(trainNumber);
		if (train != null) {
			view.displayTrainDetails(train);
		} else {
			System.out.println("Train not found with the given number.");
		}
	}
	void displayTrainAvailablity(String trainNumber) {
		Train train = model.findTrain(trainNumber);
		if (train != null) {
			view.displayTrainAvailablity(train);
		} else {
			System.out.println("Train not found with the given number.");
		}
	}

	void displayPassengerDetails(int passengerId) {
		Passenger passenger = model.findPassenger(passengerId);
		if (passenger != null) {
			view.displayPassengerDetails(passenger);
		} else {
			System.out.println("Passenger not found with the given name.");
		}
	}

	void cancelTicket(int passengerId) {
		Passenger passenger = model.findPassenger(passengerId);
		if (passenger != null) {
			model.cancelTicket(passengerId);
			System.out.println("Ticket canceled successfully!");
		} else {
			System.out.println("Passenger not found with the given name.");
		}
	}

	void displayMenu() {
		System.out.println("1. Display Available Trains");
		System.out.println("2. Book Ticket");
		System.out.println("3. Display Booked Tickets");
		System.out.println("4. Display Availablity");
		System.out.println("5. Display Train Details");
		System.out.println("6. Display Passenger Details");
		System.out.println("7. Cancel Ticket");
		System.out.println("8. Exit");
	}

	String getCurrentUser() {
		return currentUser;
	}

	int getUserChoice(Scanner scanner) {
		System.out.print("Enter your choice: ");
		return scanner.nextInt();
	}

	String getUserInputString(Scanner scanner, String print) {
		System.out.print(print);
		return scanner.next();
	}
	int getUserInputInt(Scanner scanner,String print)
	{
		System.out.println(print);
		return scanner.nextInt();
	}

	char getUserInputChar(Scanner scanner, String prompt) {
		System.out.print(prompt);
		return scanner.next().charAt(0);
	}

	void displayMessage(String message) {
		System.out.println(message);
	}
	void findTrainAvailablity(String number)
	{
		Train train=model.findTrain(number);
		view.displayTrainAvailablity(train);
	}
}
