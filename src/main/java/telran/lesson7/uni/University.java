package telran.lesson7.uni;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> ListOfStudents = new ArrayList<>();

    private List<Student> ListOfBlockedStudents = new ArrayList<>();

    public void generateStudents() {
        for (int i = 1; i <= 10; i++) {
            String studentName = "Student" + i;
            int studentAge = 18 + i;
            int rate = i;

            List<Phone> Phones = new ArrayList<>();
            String number = null;
            for (int j = 1; j <= 2; j++) {
                String code = "+371";
                number = "293" + i + j + "826";
                Phones.add(new Phone(code, number));
            }

            Student student = new Student(studentName, studentAge, rate, Phones);
            ListOfStudents.add(student);
        }
    }

    public List<Student> getStudentList() {
        return ListOfStudents;
    }

    public void addStudent(Student student) {

        for (Student student1 : ListOfStudents) {
            if (student1.getName().equals(student.getName())) {
                System.out.println("Unable to add student " + student.getName() + " student already exists");
                return;
            }
        }
        ListOfStudents.add(student);
    }

    public void removeStudents(Student student) {
        System.out.println("Student " + student.getName() + " added to a black list");
        ListOfStudents.remove(student);
        ListOfBlockedStudents.add(student);
    }

    public void printAllStudents() {
        System.out.println("All students:");
        for (Student student : ListOfStudents) {
            System.out.println("Student:" + student.getName() + ", age: " + student.getAge() + " , rate: " + student.getRate() +
            " , phone number: " + student.getNumbers());
        }
    }

    public void printBlackList () {
         System.out.println("Students in black list are: ");
         for (Student student : ListOfBlockedStudents) {
             System.out.println("Student :" + student.getName() + ", age : " + student.getAge() + " , rate : " + student.getRate() +
             " , phone numbers : " + student.getNumbers());
            }
        }

    public void upgradeRate(List<Student> ListOfStudents) {
        for (Student student : ListOfStudents) {
            int value = student.getRate();
            value = value + 1;
            student.setRate(value);
        }
    }

    @Override
    public String toString() {
        return "University{" +
                "ListOfStudents=" + ListOfStudents +
                ", ListOfBlockedStudents=" + ListOfBlockedStudents +
                '}';
    }
}
