import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        LocalTime checkIn = null;
        LocalTime checkOut = null;
        int choice;
        do {
            System.out.println(" Employee Attendance System ");
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. Working Hours");
            System.out.println("4. View Attendance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkIn = LocalTime.now();
                    System.out.println("Check-in successful!");
                    System.out.println("Time: " + checkIn);
                    break;

                case 2:
                    if (checkIn == null) {
                        System.out.println("Please check in first !");
                    } else {
                        checkOut = LocalTime.now();
                        System.out.println("Checkout successful !");
                        System.out.println("Time: " + checkOut);
                    }
                    break;
        
                case 3:
                    Duration workingHours = Duration.between(checkIn, checkOut);
                    System.out.println("Working Hours: " + workingHours.toHours() + " hours");
                    break;

                case 4:
                    Optional<LocalTime> checkInOptional = Optional.ofNullable(checkIn);
                    Optional<LocalTime> checkOutOptional = Optional.ofNullable(checkOut);

                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
                    DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
                    System.out.println(" Attendance Details !");

                    System.out.println("Date: "+ date.format(dateFormat));
                    System.out.println("Check-in: "+ checkInOptional.map(time -> time.format(timeFormat)).orElse("Not checked in")); 
                    System.out.println("Check-out: "+ checkOutOptional.map(time -> time.format(timeFormat)).orElse("Not checked out"));

                    LocalDateTime currentDateTime = LocalDateTime.now();
                    System.out.println("Current Date and Time: "+ currentDateTime);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

