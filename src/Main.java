public class Main {
    public static void main(String[] args) {
        StudentsTracker manager = new StudentsTracker();
        manager.addStudent(new Student("Mark", "Smith", "1b", 5));
        manager.addStudent(new Student("Emily", "Smith", "5bc", 3));
        manager.addStudent(new Student("Wayne", "Ivanov", "20o", 1));

        manager.removeStudent("Mark", "Smith");

        manager.displayStudents();
    }
}
