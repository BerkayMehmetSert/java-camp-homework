public class Main {
    public static void main(String[] args) {
        String[] students = new String[5];
        students[0] = "John";
        students[1] = "Mary";
        students[2] = "Peter";
        students[3] = "Jane";
        students[4] = "Mark";
        
        // String[] students = {"John","Mary","Peter","Jane","Mark"};
        
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            
        }
        
        System.out.println("===================================");
        
        for (String student : students) {
            System.out.println(student);
        }
    }
}