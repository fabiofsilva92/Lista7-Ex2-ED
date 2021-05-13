
public class Main {

	public static void main(String[] args) {
		
		QuickSort op = new QuickSort();
		
		int [] lista = {11, 15, 32, 43, 28, 17, 79, 18, 33,  99,  88,  75,  45,  82,  42,  55,  78};
		
		op.quicksort(lista, 0, 16);
		
		for(int i = 0; i< lista.length; i++) {
			System.out.println(lista[i]);
		}

	}

}
