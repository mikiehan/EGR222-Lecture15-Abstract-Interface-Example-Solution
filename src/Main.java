import shape.Circle;
import shape.Shape;
import student.Student;
import student.UndergradStudent;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Student s = new UndergradStudent("lancer", "CSDS", "Jonny", "ACM");

	// write your code here
        Shape shape = new Shape();
        Shape s = new Circle(4.0);
        double area = s.getArea();
        System.out.println(area);
        Circle c = new Circle(3.0);
        c.setColor(Color.GREEN);
        area = c.getArea();
        System.out.println(area);
    }
}
