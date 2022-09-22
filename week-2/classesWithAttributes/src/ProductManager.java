public class ProductManager {
    public void add(Product product) {
        // JDBC
        System.out.println(product.getName() + " added.");
    }
    
    public void add2(int id, String name, String description, double price, int stockAmount) {
        System.out.println(name + " added.");
    }
}
