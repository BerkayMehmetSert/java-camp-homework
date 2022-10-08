package kodlamaio.core.logging;

public class EmailLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Logged to email: " + message);
    }
}