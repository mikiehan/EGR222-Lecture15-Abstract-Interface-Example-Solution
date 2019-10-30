package student;

public class UndergradStudent extends Student {
    private String club;

    public UndergradStudent(String name, String club) {
        super(name);
        this.club = club;
    }

    public UndergradStudent(String login, String department, String name, String club) {
        super(login, department, name);
        this.club = club;
    }

    public String getClub() {
        return club;
    }
}
