import java.util.Scanner;

//Tabla de multiplicar
public class Ej1357 {

	public static void main(String[] args) {
		System.out.printf("Tabla Multiplicar 5");
		for (int i = 0; i < 11; i++) {
			System.out.printf("5 * %d = %d", i, i * 5).println();
		}

		System.out.printf("Tabla Multiplicar del 1 al 9");
		for (int j = 1; j < 10; j++) {
			for (int i1 = 0; i1 < 11; i1++) {
				System.out.printf("%d * %d = %d", j, i1, j * i1).println();
			}
		}
		System.out.println("Otro ejercicio");
		// Suma número
		Scanner keyboard = new Scanner(System.in);
		int numero= keyboard.nextInt();
		System.out.printf("Escribe en pantalla un número: %d ",numero).println();
		for(int i2 = numero-1;i2>0;i2--){
			System.out.printf("%d + %d = %d",numero, i2, numero+i2)
			.println();
			numero+=i2;
		}
		System.out.printf("El resultado final es: %d", numero).println();
	}
}

