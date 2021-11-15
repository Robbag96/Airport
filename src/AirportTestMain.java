import java.util.Scanner;

public class AirportTestMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter plane name/model: ");
        String name = scanner.next();
        System.out.println("Enter country of plane: ");
        String country = scanner.next();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.println("Is military or no: ");
        boolean isMilitary= scanner.nextBoolean();
        System.out.println("Weight: ");
        int weight = scanner.nextInt();
        System.out.println("Wingspan: ");
        int wingspan= scanner.nextInt();
        System.out.println("Enter top speed: ");
        int topSpeed= scanner.nextInt();
        System.out.println("Enter number of seats: ");
        int numberOfSeats= scanner.nextInt();
        System.out.println("Coast: ");
        double coast = scanner.nextDouble();

        Plane plane = new Plane(name,country,year, hours,isMilitary,weight,wingspan,topSpeed,numberOfSeats,coast);
        PlaneService service = new PlaneService();
        service.planeInfo(plane);

    }


    }



