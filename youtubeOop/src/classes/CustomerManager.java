package classes;

public class CustomerManager {
    private Customer customer;
    private CreditService creditService;
    
    public CustomerManager(Customer customer, CreditService creditService) {
        this.customer = customer;
        this.creditService = creditService;
    }
    
    public void save() {
        System.out.println("Customer saved");
    }
    
    public void delete() {
        System.out.println("Customer deleted");
    }
    
    public void giveCredit(){
        creditService.calculate();
        System.out.println("Credit given to customer");
    }
}
