import java.time.LocalDate;
import java.time.Period;

public class Student extends Person {
    private double contract;

    public Student(long id, String fullname, int age, char gender, double contract) {
        super(id, fullname, age, gender);
        this.contract = contract;
    }

    @Override
    public double period(Group group) {
        int period = Period.between(group.getDateOfStart(), group.getDateOfFinish()).getMonths();
        return (int) (period * getContract());
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncontract: " + contract + "\n";
    }
public void getContract(double contract){
        this.contract=contract;
}
public double setContract(){
        return contract;
}


}
