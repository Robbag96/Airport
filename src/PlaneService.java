import java.util.Scanner;


public class PlaneService {

    public void planeInfo(Plane p1) {
        System.out.println("Name: " + p1.getName());
        System.out.println("Country: " + p1.getCountry());
        System.out.println("Year: " + p1.getYear());
        System.out.println("Hours: " + p1.getHours());
        System.out.println("Is Military: " + p1.isMilitary());
        System.out.println("Weight: " + p1.getWeightOfPlane());
        System.out.println("Wingspan: " + p1.getWingspan());
        System.out.println("Top speed: " + p1.getTopSpeed());
        System.out.println("Seats: " + p1.getNumberOfSeats());
        System.out.println("Coast: " + p1.getCoast());

    }

    public void planeIsMilitary(Plane p2) {
        if (p2.isMilitary()) {

            System.out.println(p2.getCoast() + p2.getTopSpeed());

        } else {
            System.out.println(p2.getName() + p2.getCountry());
        }
    }

    public Plane newPlane(Plane p1, Plane p2) {

        if (p1.getYear() >= p2.getYear()) {
            return p1;
        } else {
            return p2;

        }
    }

    public String biggerWingspan(Plane p1, Plane p2){
        if (p1.getWingspan()<=p2.getWingspan()){
            return p2.getName();
        }
            return p1.getName();


    }

    public void smallestSeats(Plane p1,Plane p2, Plane p3){
        if (p1.getNumberOfSeats()<p2.getNumberOfSeats()&&p1.getNumberOfSeats()<p3.getNumberOfSeats()){
            System.out.println(p1.getCountry());
        }else{
            if (p2.getNumberOfSeats()<p1.getNumberOfSeats()&&p2.getNumberOfSeats()<p3.getNumberOfSeats()){
                System.out.println(p3.getCountry());
            }else{
                System.out.println(p3.getCountry());
            }
        }
    }

}


