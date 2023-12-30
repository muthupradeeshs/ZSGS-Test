package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Train {
    private String trainNumber;
    private String source;
    private String destination;
    private int totalSeats;
    private int availableSeats;
	private LocalDate runningDate;
	private int upperBerth;
	private int middleBerth;
    private int rac;
    private int seats;
    private int waiting;
//	 List<Integer> bookedTicketList = new ArrayList<>();
//	 List<Integer> lowerBerthsPositions = new ArrayList<>(lowerBerth);
//	 List<Integer> middleBerthsPositions = new ArrayList<>(middleBerth);
//	 List<Integer> upperBerthsPositions = new ArrayList<>(upperBerth);
//	 List<Integer> racPositions = new ArrayList<>(rac); List<Integer>
//	  waitingListPositions = new ArrayList<>(waitingList);
	 

    Train(String trainNumber, String source, String destination, int totalSeats, LocalDate runningDate) {
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.runningDate = runningDate;
        this.upperBerth =(totalSeats/4)-1;
        this.lowerBerth=(totalSeats/4)-1;
        this.seats=(totalSeats/4);
        this.middleBerth=(totalSeats/4)-1;
        this.rac=3;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    String getSource() {
        return source;
    }

    String getDestination() {
        return destination;
    }

    int getTotalSeats() {
        return totalSeats;
    }

    int getSeats() {
        return seats;
    }
   void setSeats(int in) {
       this.seats=in;
    }

    void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    LocalDate getRunningDate() {
        return runningDate;
    }
    private int lowerBerth;
    public int getLowerBerth() {
		return lowerBerth;
	}

	public int getUpperBerth() {
		return upperBerth;
	}

	public int getMiddleBerth() {
		return middleBerth;
	}

	public int getRac() {
		return rac;
	}

	public void setLowerBerth(int lowerBerth) {
		this.lowerBerth = lowerBerth;
	}

	public void setUpperBerth(int upperBerth) {
		this.upperBerth = upperBerth;
	}

	public void setMiddleBerth(int middleBerth) {
		this.middleBerth = middleBerth;
	}

	public void setRac(int rac) {
		this.rac = rac;
	}
	public int getWaiting() {
		return waiting;
	}

	public void setWaiting(int waiting) {
		this.waiting = waiting;
	}
	public void setTotalSeats(int in)
	{
		this.totalSeats=in;
	}

	
}
