class Vehicle {
    public String VehicleNumber, Brand, Model, FuelType;
    public Double price;

    public Vehicle(String VehicleNumber, String Brand, String Model, String FuelType, Double price){
        this.VehicleNumber = VehicleNumber;
        this.Model = Model;
        this.Brand = Brand;
        this.FuelType = FuelType;
        this.price = price;
    }

    public void DisplayDetails(){
        System.out.println("The Vehicle no. is : "+VehicleNumber);
        System.out.println("The Brand is : "+ Brand);
        System.out.println("The Model is : "+ Model);
        System.out.println("The Fuel Type is : "+FuelType);
        System.out.println("The Price is : "+price);
    }

    public void StartVehicle(){
        System.out.println("The Vehicle Started !");
    }
    public void StopVehicle(){
        System.out.println("The Vehicle Stopped !");
    }
}

class Car extends Vehicle{
    int SeatingCapacity;
    public Car(String VehicleNumber, String Brand, String Model, String FuelType, Double price, int SeatingCapacity){
        super(VehicleNumber, Brand, Model, FuelType, price);
        this.SeatingCapacity = SeatingCapacity;
    }

    public void CarFunc(){
        super.StartVehicle();
        super.DisplayDetails();
        System.out.println("The Seating Capacity is: "+SeatingCapacity);
        super.StopVehicle();
    }
}

class Bike extends Vehicle{
    String BikeType;
    public Bike(String VehicleNumber, String Brand, String Model, String FuelType, Double price, String BikeType){
        super(VehicleNumber, Brand, Model, FuelType, price);
        this.BikeType = BikeType;
    }
    public void BikeFunc(){
        super.StartVehicle();
        super.DisplayDetails();
        System.out.println("The Bike Type is: "+BikeType);
        super.StopVehicle();
    }
}

class Truck extends Vehicle{
    public int LoadingCapacity;
    public Truck(String VehicleNumber, String Brand, String Model, String FuelType, Double price, int LoadingCapacity){
        super(VehicleNumber, Brand, Model, FuelType, price);
        this.LoadingCapacity = LoadingCapacity;
    }
    public void TruckFunc(){
        super.StartVehicle();
        super.DisplayDetails();
        System.out.println("The Loading Capacity is: "+LoadingCapacity+" Tons");
        super.StopVehicle();
    }
}

public class Main2{
    public static void main(String[] args){
        Car c1 = new Car("MP04SO1234", "Tata", "Nexon", "Petrol", 2000000.00,7);
        c1.CarFunc();
        Bike b1 = new Bike("MP04DL5678", "Royal Enfield", "Methaphore", "Petrol", 1500000.0, "Sports");
        b1.BikeFunc();
        Truck t1 = new Truck("MP04KC0910", "Local","yux20","Diesel",2500000.0, 300);
        t1.TruckFunc();
    }
}