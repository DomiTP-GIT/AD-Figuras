import utils.ConsoleColors;

import java.util.ArrayList;
import java.util.Collections;

public class Lienzo {
  /**
   * Almacena todas las figuras
   */
  private static ArrayList<Figura> figuras = new ArrayList<>();

  /**
   * Dibuja las figuras
   */
  public static void dibujar() {
    for (Figura figura : figuras) {
      figura.dibujar();
    }
  }

  /**
   * Imprime el área de todas las figuras
   */
  public static void area() {
    for (Figura figura : figuras) {
      System.out.println("El " + figura.getClass().getName() + " con id " + figura.getId() + " tiene un área de " + figura.area());
    }
  }

  /**
   * Imprime el perímetro de todas las figuras
   */
  public static void perimetro() {
    for (Figura figura : figuras) {
      System.out.println("El " + figura.getClass().getName() + " con id " + figura.getId() + " tiene un perímetro de " + figura.perimetro());
    }
  }

  /**
   * Calcula la distancia entre una figura y el resto.
   *
   * @param id ID de la figura
   */
  public static void distancia(int id) {
    Figura f = buscarFigura(id);
    if (f == null) {
      return;
    }
    for (Figura figura : figuras) {
      if (figura.getId() == id) {
        continue;
      }
      System.out.println("La distancia entre " + id + " y " + figura.getId() + " es " + figura.distancia(f));
    }
  }

  /**
   * Imprime la información de todas las figuras
   */
  public static void listar() {
    System.out.println("Información de las figuras:");
    for (Figura figura : figuras) {
      System.out.println(figura);
    }
  }

  /**
   * Cambia el tamaño de la figura
   *
   * @param id         ID de la figura
   * @param porcentaje porcentaje a escalar
   */
  public static void escalar(int id, int porcentaje) {
    Figura f = buscarFigura(id);
    if (f == null) {
      return;
    }
    f.escalar(porcentaje);
  }

  /**
   * Mueve la figura a un nuevo punto
   *
   * @param id ID de la figura
   * @param p  nuevo punto
   */
  public static void mover(int id, Punto p) {
    Figura f = buscarFigura(id);
    if (f == null) {
      return;
    }
    f.mover(p);
  }

  /**
   * Desplaza horizontalmente una figura
   *
   * @param id ID de la figura
   * @param x  distancia a desplazar
   */
  public static void desplazarh(int id, double x) {
    Figura f = buscarFigura(id);
    if (f == null) {
      return;
    }
    f.desplazarh(x);
  }

  /**
   * Desplaza verticalmente una figura
   *
   * @param id ID de la figura
   * @param y  distancia a desplazar
   */
  public static void desplazarv(int id, double y) {
    Figura f = buscarFigura(id);
    if (f == null) {
      return;
    }
    f.desplazarv(y);
  }

  /**
   * Busca una figura en el ArrayList mediante su ID y la devuelve
   *
   * @param id distancia a desplazar
   * @return figura
   */
  public static Figura buscarFigura(int id) {
    for (Figura figura : figuras) {
      if (figura.getId() == id) {
        return figura;
      }
    }
    System.out.println(ConsoleColors.RED + "No se ha encontrado una figura con esa ID." + ConsoleColors.RESET);
    return null;
  }

  /**
   * Ordena e imprime las figuras
   *
   * @param tipo     Tipo de orden
   * @param asc_desc Orden ascendente o descendente
   */
  public static void ordenarImprimir(int tipo, int asc_desc) {
    switch (tipo) {
      case 1:
        Collections.sort(figuras, Figura::compareTo);
        if (asc_desc == 2) {
          Collections.reverse(figuras);
        }
        area();
        break;
      case 2:
        Collections.sort(figuras, Figura::compararPerimetro);
        if (asc_desc == 2) {
          Collections.reverse(figuras);
        }
        perimetro();
        break;
      case 3:
        Collections.sort(figuras, Figura::compararDistancia);
        if (asc_desc == 2) {
          Collections.reverse(figuras);
        }
        area();
        break;
      default:
        System.out.println(ConsoleColors.RED + "Opción no válida" + ConsoleColors.RESET);
    }

  }

  /**
   * Añade multiples figuras al ArrayList
   *
   * @param figura ArrayList de figuras
   */
  public static void add(ArrayList<Figura> figura) {
    for (Figura f : figura) {
      figuras.add(f);
    }
  }

  /**
   * Añade una sola figura
   *
   * @param figura
   */
  public static void add(Figura figura) {
    figuras.add(figura);
  }
}
