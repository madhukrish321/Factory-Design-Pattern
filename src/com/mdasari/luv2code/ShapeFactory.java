package com.mdasari.luv2code;

import java.util.Optional;

public class ShapeFactory {
  public Optional<Shape> getShape(String name) {

    name = name != null ? name.toLowerCase() : "";

    switch (name) {
      case "circle":
        return Optional.of(new Circle());
      case "rectangle":
        return Optional.of(new Rectangle());
      case "square":
        return Optional.of(new Square());
      default:
        return Optional.empty();
    }
  }
}
