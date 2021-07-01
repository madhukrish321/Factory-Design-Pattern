package com.mdasari.luv2code;

import java.util.Optional;

public class ShapeFactory {
  public Optional<Shape> getShape(String name) {
    switch (name) {
      case "circle":
        return Optional.ofNullable(new Circle());
      case "rectangle":
        return Optional.ofNullable(new Rectangle());
      case "square":
        return Optional.ofNullable(new Square());
      default:
        return Optional.ofNullable(null);
    }
  }
}
