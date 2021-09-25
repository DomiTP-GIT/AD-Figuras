public class Circulo extends Figura {
  private double radio;

  public Circulo(int id, double x, double y, String colorBorde, String colorRelleno, double radio) {
    super(id, x, y, colorBorde, colorRelleno);
    this.radio = radio;
  }


  @Override
  public double area() {
    return Math.PI * Math.pow(this.radio, 2);
  }

  @Override
  public double perimetro() {
    return 2 * Math.PI * this.radio;
  }

  @Override
  public void escalar(int porcentaje) {
    this.radio = (porcentaje / 100) * this.radio;
  }

  @Override
  public String toString() {
    return "Circulo{" +
        "id=" + this.id +
        ", x=" + this.origen.getX() +
        ", y=" + this.origen.getY() +
        '}';
  }
}
