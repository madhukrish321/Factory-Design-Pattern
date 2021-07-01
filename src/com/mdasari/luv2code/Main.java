package com.mdasari.luv2code;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Optional<Shape> optionalSquare = shapeFactory.getShape("Square");
    optionalSquare.ifPresent(Shape::draw);

    Optional<Shape> optionalRectangle = shapeFactory.getShape("RECTANGLE");
    optionalRectangle.ifPresent(Shape::draw);

    Optional<Shape> optionalCircle = shapeFactory.getShape("Circle");
    if (optionalCircle.isPresent()) {
      Shape shape = optionalCircle.get();
      shape.draw();
    }

    Optional<Shape> optional = shapeFactory.getShape("Hello");
    if (optional.isEmpty()) {
      System.out.println("There is no shape available");
    }
  }
}
