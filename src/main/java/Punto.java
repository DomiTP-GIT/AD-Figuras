public class Punto {
  private double x;
  private double y;

  /**
   * Crea un nuevo punto
   *
   * @param x Coordenada X
   * @param y Coordenada Y
   */
  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}
