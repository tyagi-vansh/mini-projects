public class Customer {
    private String name;
    private int id;
    private String mobile_no;
    private String aadhar;
    public Customer(String name, int id, String mobile_no, String aadhar) {
        this.name = name;
        this.id = id;
        this.mobile_no = mobile_no;
        this.aadhar = aadhar;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getMobile_no() {
        return mobile_no;
    }
    public String getaadhar() {
        return aadhar;
    }
}
