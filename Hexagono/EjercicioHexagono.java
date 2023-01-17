
public class EjercicioHexagono {

	public static void main(String[] args) {
		Hexagono h = new Hexagono();
		int tamMenor = h.getMenor();
		int tamMayor = h.getMayor();
		
		int cont = h.getMayor() - h.getMenor();
		
		int x = 0;

		System.out.println("Dimensión 1: " + h.getMenor());
		System.out.println("Dimensión 2: " + h.getMayor());
		
		//String[] arrStr = new String[h.getMayor()];
		
		for (int i = 0; i <= (h.getMayor() - h.getMenor()); i++) {
			//System.out.println("cont : " +cont + "   i : " + i);
			if (cont == 0) {
				System.out.println(String.format("%" + tamMayor + "s", "").replace(' ','+'));
				cont += 2;
			} else if (i < (h.getMayor() - h.getMenor())/2) {
				System.out.println(	String.format("%" + (cont/2) + "s", "") + 
						String.format("%" + (tamMenor+(i*2)) + "s", "").replace(' ','+') +
						String.format("%-" + (cont/2) + "s", ""));
				cont -= 2;
			} else {
				System.out.println(	String.format("%" + (cont/2) + "s", "") + 
						String.format("%" + (tamMenor+i-x) + "s", "").replace(' ','+') +
						String.format("%-" + (cont/2) + "s", ""));
				cont += 2;
				x += 3;
			}
			
			
			/*if (i < (h.getMayor() - h.getMenor())/2) {
				cont -= 2;
			} else {
				cont += 2;
			}*/
					
		}
	}

}
