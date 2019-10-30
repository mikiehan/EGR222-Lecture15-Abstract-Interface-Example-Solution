package student;

public class MsStudent extends Student{
    boolean withThesis;

    public MsStudent(String name, boolean withThesis) {
        super(name);
        this.withThesis = withThesis;
    }

    public MsStudent(String login, String department, String name, boolean withThesis) {
        super(login, department, name);
        this.withThesis = withThesis;
    }
}
