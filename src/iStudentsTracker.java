public interface iStudentsTracker {
    public void addStudent(Student student);
    public void removeStudent(Student student);
    public void removeStudent(String name, String surname);
    public boolean containsStudent(Student student);
    public void displayStudents();
    public void clearAllStudents();
}
