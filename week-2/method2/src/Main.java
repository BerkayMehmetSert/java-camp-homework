public class Main {
    public static void main(String[] args) {
        /*
         *  Notlar:
         *  Void method bir değişkene atanamaz.
         * */
        
        String message = "Today is a good day";
        String newMessage = sendCity();
        System.out.println(newMessage);
        
        int number = sum(5, 7);
        System.out.println("Total: " + number);
        
        int total = sum(2, 3, 4, 5, 6);
        System.out.println("Multiple total: " + total);
    }
    
    public static void add() {
        System.out.println("Added");
    }
    
    public static void delete() {
        System.out.println("Deleted");
    }
    
    public static void update() {
        System.out.println("Updated");
    }
    
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }
    
    // variable arguments
    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    
    public static String sendCity() {
        return "Ankara";
    }
}