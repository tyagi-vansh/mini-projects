public class RentalSystem {
    public static void main(String[] args) {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
}
