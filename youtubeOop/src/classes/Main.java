package classes;

public class Main {
    public static void main(String[] args) {
//        CreditManager creditManager = new CreditManager();
//        creditManager.calculate();
//        creditManager.calculate();
//        creditManager.save();
//
//        Customer customer = new Customer(); // Create a instance of Customer class
//        customer.id = 1;
//        customer.firstName = "Engin";
//        customer.lastName = "Demiroğ";
//        customer.nationalId = "12345678910";
//        customer.city = "Ankara";
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.save();
//        customerManager.delete();
//
//        Company company = new Company();
//        company.id = 2;
//        company.CompanyName = "Kodlama.io";
//        company.TaxNumber = "1234567890";
//
//        CustomerManager customerManager2 = new CustomerManager(new Person());
//
//        Person person = new Person();
//        person.nationalId = "12345678910";
//
//        Customer c1 = new Customer();
//        Customer c2 = new Person();
//        Customer c3 = new Company();
        CustomerManager customerManager = new CustomerManager(new Customer(),new CarCreditManager());
        customerManager.giveCredit();
    }
}
