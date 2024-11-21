package telran.lesson5.lesson5_practice;

import java.util.Arrays;

public class Student {

    private Subject[] subjects = new Subject[Subject.values().length];

    private int subjectNum = 0;

    public boolean knows(Subject subject) {
        boolean hasSubject = false;
        for (Subject studentSubject : subjects) {
            if (studentSubject == subject) {
                hasSubject = true;
                break;
            }
        }
        return hasSubject;
    }

    public void addSubject(Subject subject) {
        this.subjects[subjectNum++] = subject;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
