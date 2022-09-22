public class Main {
    public static void main(String[] args) {
        numberGuessing();
    }
    
    // Method naming convention: camelCase
    public static void numberGuessing() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int searchNumber = 6;
        boolean isFound = false;
        
        for (int number : numbers) {
            if (number == searchNumber) {
                isFound = true;
                break;
            }
        }
        
        if (isFound) {
            sendMessage("Number found : " + searchNumber);
        } else {
            sendMessage("Number is not found : " + searchNumber);
        }
    }
    
    // parameterized method
    public static void sendMessage(String message) {
        System.out.println(message);
    }
}
