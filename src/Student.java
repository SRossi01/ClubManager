public class Student {

    private int grade;
    private String name;
    private Membership status;

    public Student(int grade, String name, Membership status) {
        this.grade = grade;
        this.name = name;
        this.status = status;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Membership getStatus() {
        return status;
    }

    public void setStatus(Membership status) {
        this.status = status;
    }
}
