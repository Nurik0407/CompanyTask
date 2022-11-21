import java.sql.Array;
import java.util.Arrays;

public class Company {
    private String name;
    private String address;
    private Course[] courses;
    private String languageOfInstructon;

    public Company(String name, String address, Course[] courses, String languageOfInstructon) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.languageOfInstructon = languageOfInstructon;
    }

    @Override
    public String toString() {
        return "Company: \n" +
                "name: " + name +
                "\naddress: " + address +
                "\ncourses: " + Arrays.toString(courses) +
                "\nlanguageOfInstructon: " + languageOfInstructon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getLanguageOfInstructon() {
        return languageOfInstructon;
    }

    public void setLanguageOfInstructon(String languageOfInstructon) {
        this.languageOfInstructon = languageOfInstructon;
    }

    //метод бардык студенттердин контрагынын  суммасын кайтарсын.
    public static double income(Student[] students) {
        double incomes = 0;
        for (Student student : students) {
            incomes += student.getContract();
        }
        System.out.print("Contract of all students: ");
        return incomes;
    }
}
