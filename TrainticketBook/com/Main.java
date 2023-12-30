package com;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TrainModel model = new TrainModel();
        View view = new View();
        Presenter presenter = new Presenter(model, view);
        initializeSampleData(model);
        System.out.println("Welcome to the Train Booking System!");
        while (true) {
            presenter.displayMenu();
            int choice = presenter.getUserChoice(scanner);

            switch (choice) {
                case 1:
                    presenter.displayTrains();
                    break;

                case 2:
                    String passengerName = presenter.getUserInputString(scanner, "Enter passenger name: ");
                    String trainNumber = presenter.getUserInputString(scanner, "Enter train number: ");
                    char preference = presenter.getUserInputChar(scanner, "Enter preference (U/L/M): ");
                    String contact = presenter.getUserInputString(scanner, "Enter contact number: ");
                    presenter.bookTicket(passengerName, trainNumber, preference, contact);
                
                    break;

                case 3:
                    presenter.displayTickets();
                    break;

                case 4:
                    String trainNum = presenter.getUserInputString(scanner, "Enter train number: ");
                    presenter.findTrainAvailablity(trainNum);
                    break;

                case 5:
                    String trainNumDetails = presenter.getUserInputString(scanner, "Enter train number: ");
                    presenter.displayTrainDetails(trainNumDetails);
                    break;

                case 6:
                    int passengerId = presenter.getUserInputInt(scanner, "Enter passenger Id: ");
                    presenter.displayPassengerDetails(passengerId);
                    break;

                case 7:
                    int cancelPassengerId= presenter.getUserInputInt(scanner, "Enter passenger Id to cancel: ");
                    presenter.cancelTicket(cancelPassengerId);
                    break;

                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                    break;
            }
        }
    }

    private static void initializeSampleData(TrainModel model) {
        Train train1 = new Train("123", "Tenkasi", "Chennai", 100, LocalDate.now());
        Train train2 = new Train("456", "Tenkasi", "Kollam", 50, LocalDate.now());

        model.addTrain(train1);
        model.addTrain(train2);
    }
}
