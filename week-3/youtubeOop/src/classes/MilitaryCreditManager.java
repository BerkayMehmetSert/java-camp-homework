package classes;

public class MilitaryCreditManager extends BaseCreditManager implements CreditService{
    @Override
    public void calculate() {
        System.out.println("Military credit calculated");
    }
    
}
