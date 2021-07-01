package com.mdasari.luv2code;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Optional<Shape> optionalSquare = shapeFactory.getShape("Square".toLowerCase());
    optionalSquare.ifPresent(Shape::draw);

    Optional<Shape> optionalRectangle = shapeFactory.getShape("Rectangle".toLowerCase());
    optionalRectangle.ifPresent(Shape::draw);

    Optional<Shape> optionalCircle = shapeFactory.getShape("Circle".toLowerCase());
    if (optionalCircle.isPresent()) {
      optionalCircle.get().draw();
    }

    Optional<Shape> optional = shapeFactory.getShape("Hello".toLowerCase());
    if (optional.isEmpty()) {
      System.out.println("There is no shape available");
    }
  }
}
