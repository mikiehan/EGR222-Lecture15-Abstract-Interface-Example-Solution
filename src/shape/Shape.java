package shape;

import java.awt.*;

public abstract class Shape {
    protected Color color;

    public abstract double getArea();

    public void setColor(Color color){
        this.color = color;
    }
}
