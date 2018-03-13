package utf7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;



public class PruebaMap {

	static final int MIN = 1;
	static final int MAX = 100;
	static final int REP_5 = 5;
	static final int REP_2 = 2;
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> TablaAlea = new HashMap <Integer,Integer>();
		
		rellenarHasMap(TablaAlea);
		
		mostrarNoContenidos(TablaAlea);
		
		mostrarCincoREP(TablaAlea);
		
		mostrarDosREP(TablaAlea);
		
		mostrarTabla(TablaAlea);

		TreeMap<Integer,Integer> mapa = new TreeMap<Integer,Integer>();
		mapa.putAll(TablaAlea);
		mostrarTabla(mapa);
	}
	
	private static void mostrarTabla (Map<Integer, Integer> TablaAlea) {
		System.out.println("\nLista de numeros y veces de repeticion");
		for (Entry<Integer, Integer> e : TablaAlea.entrySet()) {
			System.out.println("Numero: " + e.getKey() 
				+ " - Repetido: " + e.getValue());
		}
	}

	private static void mostrarDosREP(HashMap<Integer, Integer> TablaAlea) {
		System.out.println("\nNumeros repetidos" + REP_2 + " veces: ");
		for (Entry<Integer, Integer> e : TablaAlea.entrySet()) {
			if(e.getValue() == REP_2) {
				System.out.println(e.getKey());
			}
		}
	}

	private static void mostrarCincoREP(HashMap<Integer, Integer> TablaAlea) {
		System.out.println("\nNumeros repetidos" + REP_5 + " veces: ");
		for (Entry<Integer, Integer> e : TablaAlea.entrySet()) {
			if(e.getValue() == REP_5) {
				System.out.println(e.getKey());
			}
		}
	}

	private static void mostrarNoContenidos(HashMap<Integer, Integer> TablaAlea) {
		System.out.println("Lista de numeros fuera del registro");
		for (int i = 1; i < 100; i++) {
			if (!TablaAlea.containsKey(i)){
				System.out.println(i + " No está");
			}
		}
	}

	private static void rellenarHasMap(HashMap<Integer, Integer> TablaAlea) {
		int num = 0;
		int valor = 0; // numero de veces que se repite un numero 
		for (int i = 1; i <= 100; i++) {
			valor = 0;
			num = generarAleatorio(MIN, MAX);
			
			//para añadir el numero al hasmap comprobamos si ya esta
			if (TablaAlea.containsKey(num)) {
				//si esta recuperamos su valor que indicare el nmero de veces que se repite
				valor = TablaAlea.get(num);
			}
			
			//añadimos o remplazamos el numero de veces que aparecen num
			TablaAlea.put(num, valor + 1);
		}
	}
	
	private static int generarAleatorio(int min, int max) {
		Random r = new Random();
		int n = r.nextInt(max-min+1); //me devuelve un valor de [1,max]
		return n;
	}

}
