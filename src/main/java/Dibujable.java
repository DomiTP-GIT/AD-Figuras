import java.awt.*;

public interface Dibujable {
  Color rojo = Color.RED;
  Color verde = Color.GREEN;
  Color azul = Color.BLUE;
  Color amarillo = Color.YELLOW;
  Color negro = Color.BLACK;
  Color blanco = Color.WHITE;

  /**
   * Imprime la información de la figura por pantalla
   */
  void dibujar();

  /**
   * Rellena la figura
   */
  void rellenar();
}
