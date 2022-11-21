public class Mentor extends Instructor{


    public Mentor(long id, String fullname, int age, char gender, double salary) {
        super(id, fullname, age, gender, salary);
    }

    @Override
    public double period(Group group) {

        return super.period(group);
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
}
