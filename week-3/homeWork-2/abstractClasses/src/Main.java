public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();
        
        // abstract class isn't newable
        // GameCalculator gameCalculator = new GameCalculator();
    }
}