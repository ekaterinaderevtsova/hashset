public class Student {
    private String name;
    private String surname;
    private String group;
    private int year;

    Student(String name, String surname, String group, int year) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student: " +
                name + ' ' +
                surname + ' ' +
                ", group: " + group +
                year + " year; ";
    }
}
