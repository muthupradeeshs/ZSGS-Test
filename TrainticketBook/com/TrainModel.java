package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TrainModel {
    private List<Train> trains;
    private List<Passenger> tickets;
    Queue<Passenger> waitingList = new LinkedList<Passenger>(); 
	 Queue<Passenger> racList = new LinkedList<Passenger>();

    TrainModel() {
        trains = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    void addTrain(Train train) {
        trains.add(train);
    }

    List<Train> getTrains() {
        return trains;
    }
    void addTickets(Passenger passenger)
    {
    	tickets.add(passenger);
    }

    Train findTrain(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equals(trainNumber)) {
                return train;
            }
        }
        return null;
    }

  
    List<Passenger> getTickets() {
        return tickets;
    }
    Passenger findPassenger(int id)
    {
    	 for (Passenger passenger: tickets) {
             if (passenger.getPassengerId()==id) {
                 return passenger;
             }
         }
         return null;
    	
    }
    void cancelTicket(int id)
    {
    	for(Passenger passenger:tickets)
    	{
    		if(passenger.getPassengerId()==id)
    			tickets.remove(passenger);
    	}
    }
}
