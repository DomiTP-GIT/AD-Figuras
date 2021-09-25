public class Cuadrado extends Figura {
  private double lado;

  public Cuadrado(int id, double x, double y, String colorBorde, String colorRelleno, double lado) {
    super(id, x, y, colorBorde, colorRelleno);
    this.lado = lado;
  }

  @Override
  public double area() {
    return this.lado * this.lado;
  }

  @Override
  public double perimetro() {
    return this.lado * 4;
  }

  @Override
  public void escalar(int porcentaje) {
    this.lado = (porcentaje / 100) * this.lado;
  }

  @Override
  public String toString() {
    return "Cuadrado{" +
        "id=" + this.id +
        ", x=" + this.origen.getX() +
        ", y=" + this.origen.getY() +
        '}';
  }
}
