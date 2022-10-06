package valueAndReferenceType;

public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        
        number1 = number2;
        number2 = 100;
        
        System.out.println(number1);    // Result: 20
        System.out.println("====================");
        
        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};
        
        numbers1 = numbers2;
        numbers2[0] = 1000;
        
        System.out.println(numbers1[0]);    // Result: 1000
    }
}