package ru.stqa.pft.sandbox;

/* Created by NKU on 07.05.2020 */

public class Point {
  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p2) {
    double x = Math.abs(p2.x - this.x);
    double y = Math.abs(p2.y - this.y);
    double s = Math.sqrt(x * x + y * y);

    return s;
  }
}
