import java.util.Arrays;

public abstract class Person {
    private long id;
    private String fullname;
    private int age;
    private char gender;

    public abstract double period(Group group);


    //Instructor Student жана Ментордун жашын сорттоп берсин.
    public static void sortAge(Person[] people) {
        int[] ages = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            ages[i] = people[i].getAge();
        }
        Arrays.sort(ages);
        System.out.println("Sorted by age:\n ");
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length; j++) {
                if (ages[i] == people[j].getAge()) {
                    System.out.println(ages[i] + " " + people[j].getFullname() );
                    System.out.println("-------------");
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Person: " +
                "\nid: " + id +
                "\nfullname: " + fullname +
                "\nage: " + age +
                "\ngender: " + gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(long id, String fullname, int age, char gender) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
    }

    public Person() {

    }
}
