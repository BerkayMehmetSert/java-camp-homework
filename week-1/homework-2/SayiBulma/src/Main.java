public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int aranan = 5;
        boolean varMi = false;
        
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranan) {
                varMi = true;
                break;
            }
        }
        
        if (varMi) {
            System.out.println("Sayı bulundu.");
        
        } else {
            System.out.println("Sayı bulunamadı.");
        
        }
    }
}