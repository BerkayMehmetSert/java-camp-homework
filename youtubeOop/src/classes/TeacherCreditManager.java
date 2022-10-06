package classes;

public class TeacherCreditManager extends BaseCreditManager implements CreditService {
    @Override
    public void calculate() {
        // calculate
        System.out.println("Teacher credit calculated");
    }
}
