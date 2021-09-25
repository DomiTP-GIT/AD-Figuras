public class Rectangulo extends Figura {
  private double base;
  private double altura;

  public Rectangulo(int id, double x, double y, String colorBorde, String colorRelleno, double base, double altura) {
    super(id, x, y, colorBorde, colorRelleno);
    this.base = base;
    this.altura = altura;
  }


  @Override
  public double area() {
    return this.base * this.altura;
  }

  @Override
  public double perimetro() {
    return (this.base * 2) + (this.altura * 2);
  }

  @Override
  public void escalar(int porcentaje) {
    this.base = (porcentaje / 100) * this.base;
    this.altura = (porcentaje / 100) * this.altura;
  }

  @Override
  public String toString() {
    return "Rectangulo{" +
        "id=" + this.id +
        ", x=" + this.origen.getX() +
        ", y=" + this.origen.getY() +
        '}';
  }
}
