package Assn2;

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    return "Rectangle is drawn";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() 
    {
    return "Line is drawn";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    return "cube is drawn";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) 
    {
    Rectangle5 r = new Rectangle5();
    System.out.println(r.draw());
    Line5 l = new Line5();
    System.out.println(l.draw());
    Cube5 c = new Cube5();
    System.out.println(c.draw());
    
    }
}