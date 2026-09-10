interface vehicle14{
    void displayDetails();
    void calculateRent(int days);
}
class car14 implements vehicle14{
    String vehiclNumber;
    String brand;
    int rentPerDay;

    car14(String vehiclNumber, String brand, int rentPerDay){
        this.vehiclNumber = vehiclNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    @Override
    public void displayDetails(){
        System.out.println("Car");
        System.out.println("Number : "+vehiclNumber);
        System.out.println("Brand : "+brand);
        System.out.println("Rent/Day : ₹"+rentPerDay);
    }
    @Override
    public void calculateRent(int days){
        System.out.println("Days : "+days);
        int rent = rentPerDay*days;
        System.out.println("Total Rent = ₹"+rent);
    }
}
class bike14 implements vehicle14{
    String vehicleNumber;
    String brand;
    int rentPerDay;

    bike14(String vehicleNumber, String brand, int rentPerDay){
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    @Override
    public void displayDetails(){
        System.out.println("Bike");
        System.out.println("Number : "+vehicleNumber);
        System.out.println("Brand : "+brand);
        System.out.println("Rent/Day : "+rentPerDay);
    }
    @Override
    public void calculateRent(int days){
        int rent = rentPerDay*days;
        if (days>5){
            double discountedRent = rent*0.10;
            double finalRent = rent-discountedRent;
            System.out.println("Number of Days : "+days);
            System.out.println("Original : "+rent);
            System.out.println("10% Dicounted Rent : "+discountedRent);
            System.out.println("Final Rent : "+finalRent);
        }else {
            System.out.println("Number of days : "+days);
            System.out.println("Total rent : "+rent);
        }
    }

}
class truck14 implements vehicle14{
    String vehicleNumber;
    String brand;
    int rentPerDay;
    truck14(String vehicleNumber, String brand, int rentPerDay){
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }
    @Override
    public void displayDetails(){
        System.out.println("Truck");
        System.out.println("Number : "+vehicleNumber);
        System.out.println("Brand : "+brand);
        System.out.println("Rent/Day : "+rentPerDay);
    }
    @Override
    public void calculateRent(int days){
        int rent = rentPerDay*days;
        if (days>10){
            double discount = rent*0.15;
            double discountedRent = rent-discount;
            System.out.println("Number of Days : "+days);
            System.out.println("Rent : "+rent);
            System.out.println("15% Discount : "+discount);
            System.out.println("Final Rent : "+discountedRent);
        }
        else {
            System.out.println("Number of Days : "+days);
            System.out.println("Rent : "+rent);
        }
    }
}
public class Revision_Practice_Test7{
    public static void main(String [] args){
        vehicle14 c1 = new car14("MH12XU1590", "Taigun", 720);
        c1.displayDetails();
        c1.calculateRent(6);
        System.out.println();
        c1 = new bike14("MH12XU7183", "Pulsar 125", 500);
        c1.displayDetails();
        c1.calculateRent(7);
        System.out.println();
        bike14 c2 = new bike14("MH04XV3453", "Yamaha", 400);
        c2.displayDetails();
        c2.calculateRent(4);
        System.out.println();
        vehicle14 c3 = new truck14("MH12WJ2134", "TATA", 1700);
        c3.displayDetails();
        c3.calculateRent(12);


    }
}