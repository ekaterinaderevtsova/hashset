import java.util.HashSet;
import java.util.NoSuchElementException;

public class StudentsTracker implements iStudentsTracker {
    private HashSet<Student> students;

    public StudentsTracker() {
        students = new HashSet<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
        } else {
            throw new NoSuchElementException("The student is not in the set");
        }
    }

    @Override
    public void removeStudent(String name, String surname) {
        Student studentToRemove = null;
        for (Student element : students) {
            if ((element.getName().equals(name)) && (element.getSurname().equals(surname))) {
                studentToRemove = element;
                break;
            }
        }
        if (studentToRemove == null) {
            throw new NoSuchElementException("The student is not in the set");
        }
        students.remove(studentToRemove);
    }

    @Override
    public boolean containsStudent(Student student) {
        if (students.contains(student)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void displayStudents() {
        students.forEach(element -> System.out.println(element));
    }

    @Override
    public void clearAllStudents() {
        students.clear();
    }
}
