package utf7;

import java.util.ArrayList;

public class PruebaAL {

	public static void main(String[] args) {
		ArrayList<String> listaMCoches = new ArrayList<String>();
		
		System.out.println("Tamaño inicial: " + listaMCoches.size());
		
		listaMCoches.add("Audi");
		listaMCoches.add("Porche");
		listaMCoches.add("Aston Martin");
		listaMCoches.add("Ferrari");
		listaMCoches.add("Jaguar");
		listaMCoches.add("Jaguar");
		listaMCoches.add("Mercedes");
		listaMCoches.add("Jaguar");
		
		System.out.println("Tamaño tras añadir los elementos: " + listaMCoches.size());
		
		mostrarMarca(listaMCoches);
		
		//borrar elemento jaguar
		
		borrarElemento(listaMCoches, "Jaguar");
		
		mostrarMarca(listaMCoches);
	}

	private static void borrarElemento(ArrayList<String> listaMCoches,
			String marca) {
		for (int i = 0; i < listaMCoches.size(); i++) {
			if (listaMCoches.get(i).equals(marca)) {
				listaMCoches.remove(i);
				i--;
			}
		}
	}

	private static void mostrarMarca(ArrayList<String> listaMCoches) {
		System.out.println("\n Lista de maarcas de coches");
		for (String marca : listaMCoches) {
			System.out.println(marca);
		}
	}

}
