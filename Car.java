package Assignment;

public class Car {

    private String carnum;
    private int model;
    private String brand;
    private int Passenger;
    public Car(){    
    }
    public Car(String carnum,int model,String brand,int Passenger){
    this.Passenger = Passenger;
    this.brand = brand;
    this.carnum = carnum;
    this.model = model;
}

    public String getCarnum() {
        return carnum;
    }

    public int getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getPassenger() {
        return Passenger;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPassenger(int Passenger) {
        this.Passenger = Passenger;
    }
    
}
