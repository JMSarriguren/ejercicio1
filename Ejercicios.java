import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Ejercicio 7
		/*
		int h, m, s;
		 

		System.out.println("Intorducir un horario válido. ");
		
		System.out.println("Introducir hora: ");
		h = input.nextInt();

		System.out.println("Introducir minutos: ");
		m = input.nextInt();

		System.out.println("Introducir segundos: ");
		s = input.nextInt();
		
		if ((h >= 24 || h < 0) || (m >= 60 || m < 0) || (s >= 60 || s < 0)) {
			System.out.println("La hora insertada no es válida: " + h + ":" + m + ":" + s);
		} else {
			System.out.println("La hora insertada es correcta: " + h + ":" + m + ":" + s);
		}
		*/
		
		
		//Ejercicio 8
		/*
		int mes;

		System.out.println("Intorducir el número de un mes: ");
		mes = input.nextInt();
		
		while (mes < 1 || mes > 12) {
			System.out.println("Intorducir un número de un mes correctamente: ");
			mes = input.nextInt();
		}
		
		switch (mes) {
			case 1:
				System.out.println("Ha indicado el mes de Enero, el cual tiene 31 días");
				break;
			case 2:
				System.out.println("Ha indicado el mes de Febrero, el cual tiene 28 días");
				break;
			case 3:
				System.out.println("Ha indicado el mes de Marzo, el cual tiene 31 días");
				break;
			case 4:
				System.out.println("Ha indicado el mes de Abril, el cual tiene 30 días");
				break;
			case 5:
				System.out.println("Ha indicado el mes de Mayo, el cual tiene 31 días");
				break;
			case 6:
				System.out.println("Ha indicado el mes de Junio, el cual tiene 30 días");
				break;
			case 7:
				System.out.println("Ha indicado el mes de Julio, el cual tiene 31 días");
				break;
			case 8:
				System.out.println("Ha indicado el mes de Agosto, el cual tiene 31 días");
				break;
			case 9:
				System.out.println("Ha indicado el mes de Septiembre, el cual tiene 30 días");
				break;
			case 10:
				System.out.println("Ha indicado el mes de Octubre, el cual tiene 31 días");
				break;
			case 11:
				System.out.println("Ha indicado el mes de Noviembre, el cual tiene 30 días");
				break;
			case 12:
				System.out.println("Ha indicado el mes de Diciembre, el cual tiene 31 días");
				break;
		}
		*/
		
		
		//Ejercicio 9
		/*
		int num;
		
		System.out.println("Introducir números enteros: ");
		num = input.nextInt();
		
		while (num != -25) {
			num = input.nextInt();
		}
		
		System.out.println("Ejecución finalizada");
		*/
		
		
		//Ejercicio 10
		
		String cifra, nuevaCifra = "";
		
		System.out.println("Introducir un número entero positivo: ");
		cifra = Integer.toString(input.nextInt());

		for (int i = cifra.length(); i > 0; i--) {
			nuevaCifra += cifra.charAt(i-1);
		}
		
		System.out.println("La nueva cifra es: " + nuevaCifra);
	}

}
