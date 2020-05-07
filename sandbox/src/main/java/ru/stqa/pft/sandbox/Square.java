package ru.stqa.pft.sandbox;
/* Created by NKU on 07.05.2020 */

public class Square {

  public double l;

  /*конструктор класса*/
  public Square(double l){
    this.l = l;
  }

  public double area() {
    return this.l * this.l;
  }
}
