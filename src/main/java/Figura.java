public abstract class Figura implements Dibujable, Comparable<Figura> {
  protected int id;
  protected String colorBorde;
  protected String colorRelleno;
  protected Punto origen;

  /**
   * Crea una nueva figura.
   *
   * @param id           Identificador único de la figura
   * @param x            Coordenada x
   * @param y            Coordenada y
   * @param colorBorde   Color del borde
   * @param colorRelleno Color del relleno
   */
  public Figura(int id, double x, double y, String colorBorde, String colorRelleno) {
    this.id = id;
    this.colorBorde = colorBorde;
    this.colorRelleno = colorRelleno;
    this.origen = new Punto(x, y);
  }

  /**
   * Calcula el área de una figura
   *
   * @return area
   */
  public abstract double area();

  /**
   * Calcula el perímetro de una figura
   *
   * @return perimetro
   */
  public abstract double perimetro();

  /**
   * Calcula la distancia entre los puntos de dos figuras
   *
   * @param f Figura
   * @return distancia entre las figuras
   */
  public double distancia(Figura f) {
    return Math.sqrt(Math.pow(f.origen.getX() - this.origen.getX(), 2) + Math.pow(f.origen.getY() - this.origen.getY(), 2));
  }

  /**
   * Cambia el tamaño de la figura
   *
   * @param porcentaje porcentaje de escalado
   */
  public abstract void escalar(int porcentaje);

  /**
   * Mueve la figura al punto pasado como parámetro
   *
   * @param p nuevo punto
   */
  public void mover(Punto p) {
    this.origen = p;
  }

  /**
   * Desplaza la figura horizontalmente
   *
   * @param x punto x
   */
  public void desplazarh(double x) {
    this.origen = new Punto(x + this.origen.getX(), this.origen.getY());
  }

  /**
   * Desplaza la figura verticalmente
   *
   * @param y punto y
   */
  public void desplazarv(double y) {
    this.origen = new Punto(this.origen.getX(), y + this.origen.getY());
  }

  /**
   * Devuelve la ID de la figura
   *
   * @return ID de la figura
   */
  public int getId() {
    return id;
  }

  /**
   * Compara el área de dos figuras
   *
   * @param f Figura
   * @return un número negativo, cero o positivo
   */
  @Override
  public int compareTo(Figura f) {
    return (int) (this.area() - f.area());
  }

  /**
   * Compara el perímetro de dos figuras
   *
   * @param f Figura
   * @return un número negativo, cero o positivo
   */
  public int compararPerimetro(Figura f) {
    return (int) (this.perimetro() - f.perimetro());
  }

  /**
   * Compara la distancia de dos figuras
   *
   * @param f Figura
   * @return un número negativo, cero o positivo
   */
  public int compararDistancia(Figura f) {
    return (int) (this.distancia(f) - f.distancia(this));
  }

  /**
   * Dibuja la figura
   */
  @Override
  public void dibujar() {
    System.out.println(this);
  }

  /**
   * Rellena la figura con el color
   */
  @Override
  public void rellenar() {

  }
}
