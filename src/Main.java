import java.sql.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        LocalDate dateOfStart1 = LocalDate.of(2022, 9, 1);
        LocalDate dateOfFinish1 = LocalDate.of(2023, 6, 1);


        Student student1 = new Student(1L, "Zholdoshov Nuradil", 18, 'm', 12000);
        Student student2 = new Student(2L, "Shabdanov Ilim", 19, 'm', 12000);

        Student[] students1 = {student1, student2};

        Student student3 = new Student(3L, "Abdymomunov Sanzhar", 20, 'm', 12000);
        Student student4 = new Student(4L, "Akbaraliev Dastan", 19, 'm', 12000);

        Student[] students2 = {student3, student4};


        Student[] students = new Student[students1.length + students2.length];

        System.arraycopy(students1, 0, students, 0, students1.length);
        System.arraycopy(students2, 0, students, students1.length, students2.length);


        Group group1 = new Group("JAVA-8", students1, dateOfStart1, dateOfFinish1);
        Group group2 = new Group("JAVA-7", students2, dateOfStart1, dateOfFinish1);


        Instructor instructor1 = new Instructor(111L, "Asangazieva Aijamal", 25, 'j', 400000);


        Mentor mentor1 = new Mentor(10L, "Toichubaev Mukhammed", 24, 'm', 20000);
        Mentor mentor2 = new Mentor(11L, "Bazarbaev Rahim", 19, 'm', 20000);
        Mentor mentor3 = new Mentor(12L, "Akyl Maksat", 28, 'm', 20000);


        Course[] courses1 = {new Course("Java",
                new Group[]{group1, group2},
                instructor1, new Mentor[]{mentor1, mentor2, mentor3})};

        Person[] people = {student1, student2, student3, student4, mentor1, mentor2, mentor3, instructor1};

        PeaksoftHouse peaksoftHouse = new PeaksoftHouse("PeakSoft", "Vostok-5", courses1, "Java");


        System.out.println(peaksoftHouse);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(Company.income(students));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total amount for study: " + student1.period(group1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Mentor's salary for the entire period of study: " + mentor1.period(group1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Instructor salary for the entire training period: " + instructor1.period(group1));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Person.sortAge(people);


    }
}