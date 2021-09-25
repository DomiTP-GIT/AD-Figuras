import utils.ConsoleColors;
import utils.Leer;

import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
    generar();  // Generar 10 figuras aleatorias
    int id;
    boolean inicio = true;
    while (inicio) {  // Menú principal
      System.out.println(ConsoleColors.YELLOW + "Opciones disponibles: ");
      System.out.println(ConsoleColors.BLUE + "1.- Listar\n2.- Dibujar\n3.- Perímetros\n4.- Areas\n5.- Escalar\n6.- Mover\n7.- Desplazar\n8.- Ordenar\n9.- Cerrar Programa");
      int opc = Leer.leerEntero(ConsoleColors.PURPLE + "~ " + ConsoleColors.YELLOW + "Selecciona una opción: " + ConsoleColors.GREEN);
      System.out.print(ConsoleColors.RESET);
      switch (opc) {
        case 1:
          Lienzo.listar();
          break;
        case 2:
          Lienzo.dibujar();
          break;
        case 3:
          Lienzo.perimetro();
          break;
        case 4:
          Lienzo.area();
          break;
        case 5:
          id = Leer.leerEntero("Introduce el id de la figura: ");
          int porcentaje = Leer.leerEntero("Introduce el porcentaje: ");
          Lienzo.escalar(id, porcentaje);
          break;
        case 6:
          id = Leer.leerEntero("Introduce el id de la figura: ");
          Punto p = new Punto(Leer.leerDouble("Introduce la 'x': "), Leer.leerDouble("Introduce la 'y': "));
          Lienzo.mover(id, p);
          break;
        case 7:
          id = Leer.leerEntero("Introduce el id de la figura: ");
          String res = Leer.leerTexto("vertical/horizontal ? ");
          double despl = Leer.leerDouble("Indica la cantidad a desplazar: ");
          if (res.equalsIgnoreCase("VERTICAL")) {
            Lienzo.desplazarv(id, despl);
          } else if (res.equalsIgnoreCase("HORIZONTAL")) {
            Lienzo.desplazarh(id, despl);
          } else {
            System.out.println(ConsoleColors.RED + "Error!" + ConsoleColors.RESET);
          }
          break;
        case 8:
          System.out.println(ConsoleColors.YELLOW + "Criterios de comparación: ");
          System.out.println(ConsoleColors.BLUE + "1.- Area\n2.- Perímetro\n3.- Posición");
          int opc2 = Leer.leerEntero(ConsoleColors.PURPLE + "~ " + ConsoleColors.YELLOW + "Selecciona una opción: " + ConsoleColors.GREEN);
          System.out.println(ConsoleColors.YELLOW + "\nOrden: ");
          System.out.println(ConsoleColors.BLUE + "1.- Ascendente\n2.- Descendente");
          int opc3 = Leer.leerEntero(ConsoleColors.PURPLE + "~ " + ConsoleColors.YELLOW + "Selecciona una opción: " + ConsoleColors.GREEN);
          System.out.print(ConsoleColors.RESET);
          Lienzo.ordenarImprimir(opc2, opc3);
          break;
        case 9:
          inicio = false;
          System.out.println(ConsoleColors.RED + "Programa Finalizado");
          break;
        default:
          System.out.println(ConsoleColors.RED + "Opción no válida" + ConsoleColors.RESET);
      }
    }
  }

  /**
   * Genera 10 figuras aleatorias
   */
  public static void generar() {
    ArrayList<Figura> tmp = new ArrayList<>();
    String[] colores = {"rojo", "verde", "azul", "amarillo", "negro", "blanco"};
    for (int i = 0; i < 10; i++) {
      int random = (int) (Math.random() * 3);
      switch (random) {
        case 0:
          Circulo c = new Circulo(i, Math.random() * 10, Math.random() * 10, colores[(int) (Math.random() * 5)], colores[(int) (Math.random() * 5)], Math.random() * 10);
          tmp.add(c);
          break;
        case 1:
          Cuadrado cu = new Cuadrado(i, Math.random() * 10, Math.random() * 10, colores[(int) (Math.random() * 5)], colores[(int) (Math.random() * 5)], Math.random() * 10);
          tmp.add(cu);
          break;
        case 2:
          Rectangulo r = new Rectangulo(i, Math.random() * 10, Math.random() * 10, colores[(int) (Math.random() * 5)], colores[(int) (Math.random() * 5)], Math.random() * 10, Math.random() * 10);
          tmp.add(r);
          break;
        case 3:
          Triangulo t = new Triangulo(i, Math.random() * 10, Math.random() * 10, colores[(int) (Math.random() * 5)], colores[(int) (Math.random() * 5)], Math.random() * 10, Math.random() * 10);
          tmp.add(t);
          break;
      }
    }
    Lienzo.add(tmp);
  }
}
