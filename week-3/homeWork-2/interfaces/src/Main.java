public class Main {
    public static void main(String[] args) {
        // Interfaces isn't newable
//        CustomerDao customerDao = new OracleCustomerDao();
        
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDao());
//        customerManager.customerDao = new MySqlCustomerDao();
        customerManager.add();
    }
}