package Password;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioPassword {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("¿Cuántas contraseñas quieres guardar?");
		int numPass = input.nextInt();
		System.out.println("¿Con qué tamaño quieres guardar la contraseña?");
		int tamPass = input.nextInt();
		
		//Password[] arrPass = new Password[numPass];
		String[] arrPass = new String[numPass];
		
		for (int i = 0; i < numPass; i++) {
			//arrPass[i] = new Password(tamPass);
			arrPass[i] = new Password(tamPass).getContrasena();
		}
		
		//Password[] arrPassCopy = new Password[numPass];
		String[] arrPassCopy = new String[numPass];
		
		for (int i = 0; i < numPass; i++) {
			//arrPassCopy[i] = new Password(arrPass[i]);
			arrPassCopy[i] = new String(arrPass[i]);
		}
		
		Arrays.sort(arrPassCopy);
		
		System.out.println("Array de copias: ");
		for (int i = 0; i < arrPassCopy.length; i++) {
			//System.out.println(arrPassCopy[i].getContrasena());
			System.out.println(arrPassCopy[i]);
		}
		

		System.out.println("Todas las contraseñas: ");
		for (int i = 0; i < arrPass.length; i++) {
			System.out.println(arrPass[i] + "   " + Password.esFuerte(arrPass[i]));
		}
	}

}
