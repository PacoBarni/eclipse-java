import java.util.Scanner;

public class Importacion {
	
	public static void main(String[] args) {	
	// crear una instancia de la clase Scanner pasando System.in al constructor 
	Scanner keyboard = new Scanner(System.in);
	System.out.printf("Escribe en pantalla un número: ", keyboard);
	// el programa se detiene en este punto hasta que el usuario introduza un número y pulse ENTER
	int numero = keyboard.nextInt();
	// cerrar la instancia de la clase Scanner 
	keyboard.close();
	System.out.printf("El triple es %d", numero*3).println();
	}
}
