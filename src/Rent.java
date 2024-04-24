public class Rent {
    private Car car;
    private Customer customer ;
    private int days;
    public Rent(Car c, Customer m, int days) {
        this.car = c;
        this.customer = m;
        this.days = days;
    }
    public Car getCar() {
        return car;
    }
    public Customer getCustomer() {
        return customer;
    }
    public int getDays() {
        return days;
    }
    
}
