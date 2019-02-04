package reflection.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        checkAllByType(shapes,Triangle.class);
        shapes.forEach(shape->{
            shape.draw();
            shape.rotate();
        });
        Rhomboid rhomboid = new Rhomboid();
        Shape shape = rhomboid;
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
        }

    }
    public static void checkAllByType(List<Shape> list,final Class clazz) {
        list.stream().filter(shape -> clazz.isInstance(shape)).forEach(shape -> shape.setChecked(true));
    }




}

abstract class Shape {
    private boolean checked;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    void draw() {
        System.out.println(toString());
    }
    void rotate(){
        if (!(this instanceof Circle)) {
            System.out.println("rotating");
        }
    }

    abstract public String toString();
}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle "+isChecked();
    }
}

class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle "+isChecked();
    }
}

class Square extends Shape {
    @Override
    public String toString() {
        return "Square "+isChecked();
    }
}

class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "Rhomboid";
    }

}
