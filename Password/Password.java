package Password;
import java.util.concurrent.ThreadLocalRandom;

public class Password {
	
	private int longitud;
	private String contrasena;
	
	public Password() {
		longitud = 8;
		contrasena = "12345678";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		contrasena = generarPassword(longitud);
	}
	
	public Password(Password p) {
		this.longitud = p.longitud;
		this.contrasena = p.contrasena;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public static String esFuerte(String contrasena) {
		String[] arrContrasena = new String[contrasena.length()];
		int contUpper = 0, contLower = 0;
		
		for (int i = 0; i < contrasena.length(); i++) {
			//arrContrasena[i] = contrasena.substring(i);
			if (Character.isUpperCase(contrasena.charAt(i))) {
				contUpper ++;
			} else if (Character.isLowerCase(contrasena.charAt(i))) {
				contLower ++;
			}
		}
		
		if (contUpper < 2) {
			return "No";
		} else {
			return "Sí";
		}
	}
	
	public static String generarPassword(int longitud) {
	    // El banco de caracteres
	    String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";//1234567890";
	    // La cadena en donde iremos agregando un carácter aleatorio
	    String cadena = "";
	    for (int x = 0; x < longitud; x++) {
	        int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
	        char caracterAleatorio = banco.charAt(indiceAleatorio);
	        cadena += caracterAleatorio;
	    }
	    return cadena;
	}
	
	public static int numeroAleatorioEnRango(int minimo, int maximo) {
	    // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
	    return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
	}

}
