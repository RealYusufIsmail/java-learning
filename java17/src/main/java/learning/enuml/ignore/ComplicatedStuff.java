package learning.enuml.ignore;

enum ComplicatedStuff {
  MERCURY(3.303e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6), EARTH(5.976e+24, 6.37814e6), MARS(
      6.421e+23, 3.3972e6), JUPITER(1.9e+27, 7.1492e7), SATURN(5.688e+26,
          6.0268e7), URANUS(8.686e+25, 2.5559e7), NEPTUNE(1.024e+26, 2.4746e7);

  private static final double GRAVITY_CONSTANT = 6.67300E-11;
  private final double mass;
  private final double radius;

  ComplicatedStuff(double mass, double radius) {
    this.mass = mass;
    this.radius = radius;
  }

  public double mass() {
    return mass;
  }

  public double radius() {
    return radius;
  }

  public double surfaceGravity() {
    return (GRAVITY_CONSTANT * mass) / (radius * radius);
  }

  public double surfaceWeight(double otherMass) {
    return otherMass * surfaceGravity();
  }

  public static void main(String[] args) {
    for (ComplicatedStuff p : ComplicatedStuff.values()) {
      System.out.printf("%s: %f%n", p, p.surfaceGravity());
    }
  }
}


class Main {
  public static void main(String[] args) {
    // enum = enumerated (ordered listing of items in a collection)
    // grouping of constants that behave similarly to objects
    // enumerated types are immutable
  }
}
