public class Main {
    public static void main(String[] args) {
//        Product product = new Product();
//        product.setId(1);
//        product.setName("Laptop");
//        product.setPrice(5000);
//        product.setDescription("Asus Laptop");
//        product.setStockAmount(3);
//        product.setColor("Black");
//        System.out.println(product.name);
        
        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Black" );
        
        ProductManager productManager = new ProductManager();
        productManager.add(product);
    
        System.out.println(product.getBarcode());
        
    }
}