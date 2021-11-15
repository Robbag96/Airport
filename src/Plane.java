
public class Plane {

    public String setMilitary;
    private String name;
    private String country;
    private int year;
    private int hours;
    private boolean isMilitary;
    private int weightOfPlane;
    private int wingspan;
    private int topSpeed;
    private int numberOfSeats;
    private double coast;

    public Plane( String name, String country, int year, int hours, boolean isMilitary, int weightOfPlane,
                 int wingspan, int topSpeed, int numberOfSeats, double coast) {

        this.name = name;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.isMilitary = isMilitary;
        this.weightOfPlane = weightOfPlane;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.numberOfSeats = numberOfSeats;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2021) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Invalid ");
        }

    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeightOfPlane() {
        return weightOfPlane;
    }

    public void setWeightOfPlane(int weightOfPlane) {
        if (weightOfPlane >= 10000 && weightOfPlane <= 160000) {
            this.weightOfPlane = weightOfPlane;
        } else {
            System.out.println("Invalid ");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 10000) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Invalid number ");
        }

    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed > 0 && topSpeed <= 1000) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("Invalid number ");
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            System.out.println("Invalid number ");
        }
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        if (coast >= 0.0) {
            this.coast = coast;
        } else {
            System.out.println("Invalid number ");
        }

    }


}
