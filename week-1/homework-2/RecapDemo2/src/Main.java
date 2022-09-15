public class Main {
    public static void main(String[] args) {
        double[] myList = {1.0, 2.0, 3.0, 4.0, 5.0};
        double total = 0;
        double max = myList[0];
        
        for (double element : myList) {
            if (element > max) {
                max = element;
                
            }
            total += element;
            System.out.println(element);
            
        }
        System.out.println("Total is " + total);
        System.out.println("Max is " + max);
    }
}