package ru.stqa.pft.sandbox;

public class MyFirstProgram{

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Nadya");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами "+ r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(1, 1);
    Point p2 = new Point(-3, -3);
    System.out.println("Расстояние между точками (" + p1.x + ", "+ p1.y + ") и (" + p2.x + ", " + p2.y + ") = " + p1.distance(p2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double distance(Point p1, Point p2) {
    double x = Math.abs(p2.x - p1.x);
    double y = Math.abs(p2.y - p1.y);
    double s = Math.sqrt(x * x + y * y);

    return s;
  }

}