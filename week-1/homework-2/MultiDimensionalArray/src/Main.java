public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        // String[][] cities = {{"New York", "Los Angeles", "Chicago"}, {"Houston", "Philadelphia", "Phoenix"}, {"San Antonio", "San Diego", "Dallas"}};
        cities[0][0] = "New York";
        cities[0][1] = "Los Angeles";
        cities[0][2] = "Chicago";
        
        cities[1][0] = "Houston";
        cities[1][1] = "Philadelphia";
        cities[1][2] = "Phoenix";
        
        cities[2][0] = "San Antonio";
        cities[2][1] = "San Diego";
        cities[2][2] = "Dallas";
        
        for (int i = 0; i < cities.length; i++) {
            System.out.println();
            
            for (int j = 0; j < cities[i].length; j++) {
                System.out.print(cities[i][j] + " ");
                
            }
        }
    }
}