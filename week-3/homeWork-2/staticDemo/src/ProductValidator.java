public class ProductValidator {
    static {
        System.out.println("Static constructor is running");
    }
    
    public ProductValidator() {
        System.out.println("Constructor is running");
    }
    
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void something() {
        System.out.println("Something");
    }
    
    // Inner class
    public static class AnotherClass {
        public void delete() {
            System.out.println("Delete");
        }
    }
}
