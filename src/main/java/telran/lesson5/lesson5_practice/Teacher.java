package telran.lesson5.lesson5_practice;

public class Teacher {

    private Subject subject;

    public void teach(Student student) {
        student.addSubject(subject);
    }

    public void teach(Student[] students) {
        for (Student student : students) {
            teach(student);
        }
    }

    public Teacher(Subject subject) {
        this.subject = subject;
    }
}
