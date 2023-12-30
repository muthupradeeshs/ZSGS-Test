package com;

import java.time.LocalDate;

class Passenger {
	private int passengerId=2001;
	private String passengerName;
    private Train train;
    private int numberOfSeats;
    private LocalDate bookingDate;
	private String contact;
    private char preference;
    private int age;
	private String allotedSeat;

    Passenger(String passengerName, Train train, char preference, String contact) {
        this.passengerName = passengerName;
        this.train = train;
        this.preference = preference;
        this.bookingDate = LocalDate.now();
        this.contact = contact;
        this.passengerId=passengerId++;
    }

    String getPassengerName() {
        return passengerName;
    }

    Train getTrain() {
        return train;
    }

    int getNumberOfSeats() {
        return numberOfSeats;
    }

    LocalDate getBookingDate() {
        return bookingDate;
    }
    public String getContact() {
		return contact;
	}

	public char getPreference() {
		return preference;
	}

	public int getAge() {
		return age;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setPreference(char preference) {
		this.preference = preference;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String getAllotedSeat() {
		return allotedSeat;
	}

	public void setAllotedSeat(String allotedSeat) {
		this.allotedSeat = allotedSeat;
	}
	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}


}
