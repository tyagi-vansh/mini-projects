public class Car{
    private int carId;
    private String model;
    private String Brand;
    private double Rentprice;
    private boolean avail;
    public Car(int carId, String model, String brand, double rentprice) {
        this.carId = carId;
        this.model = model;
        this.Brand = brand;
        this.Rentprice = rentprice;
        this.avail = true;
    }
    public int getCarId() {
        return carId;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return Brand;
    }
    public void rent(){
        avail=false;
    }
    public void returncar(){
        avail=true;
    }
    public double totalbill(int days){
        return Rentprice*days;
    }
}