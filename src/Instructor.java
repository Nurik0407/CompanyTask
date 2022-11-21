import java.time.Period;

public class Instructor extends Person {
    private double salary;

    @Override
    public double period(Group group) {
        int period = Period.between(group.getDateOfStart(), group.getDateOfFinish()).getMonths();
        return (int) (period * getSalary());
    }

    public Instructor(long id, String fullname, int age, char gender, double salary) {
        super(id, fullname, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

