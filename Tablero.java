package prueba;

public class Tablero {
	
	//Reprentaciones de los jugadores y del simbolo vacio
	private final char j1='X';
	private final char j2='O';
	private final char VACIO = '-';
	
	
	//turno actual
	//true = J1, false = J2
	//tablero donde vamos a jugar
	private boolean turno;
	private char tablero[][];
	inicialTablero('*');
	
	/*
	 * Inicializa el tablero con el simbolo VACIO
	 */
	private void inicialTablero(char dj) {
	
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero.length; j++) {
			tablero[i][j] = dj ;
	        }
	    }
	 
	}
	
	
	

}
