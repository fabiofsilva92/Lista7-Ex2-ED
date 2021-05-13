
public class QuickSort {
	
	public void quicksort(int [] lista, int inicio, int fim) {
		
		int i = inicio;
		int j = fim;
		int pos = (inicio+fim)/2; //elemento central
		int pivo = lista[pos];
		int aux;
		
		if(inicio < fim) { // se a lista for unitária
			while(i<j) {
				while(lista[i] < pivo) {
					i++;
				}
				while(lista[j] > pivo) {
					j--;
				}
				if(lista[i] == pivo) {
					pos = i;
				}
				else if(lista[j] == pivo) {
					pos = j;
				}
				aux = lista[i];
				lista[i] = lista[j];
				lista[j] = aux;
			}
			quicksort(lista, inicio, pos); // inicio até a posição
			quicksort(lista, pos+1, fim); //frente da posição até o final.

		}
		
	}

}
