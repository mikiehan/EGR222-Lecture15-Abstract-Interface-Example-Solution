package student;

public class PhDStudent extends Student{
    private String supervisor;

    public PhDStudent(String name, String supervisor) {
        super(name);
        this.supervisor = supervisor;
    }

    public PhDStudent(String login, String department, String name, String supervisor) {
        super(login, department, name);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
