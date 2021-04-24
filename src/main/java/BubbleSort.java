
public class BubbleSort {
    int j, m, aux;
    int n = 5;
  
    //EX
 public void algoritimoBubblesort(int lista[]){     //cabeçalho das funções
                for(j = 0; j<n; j++){              
		for(m= 0; m < n - 1; m++){      
			if(lista[m] > lista[m + 1]){
				aux = lista[m];
				lista[m] = lista[m+1];
				lista[m+1] = aux;
    
              } 
            }
          }
    //mostrando na tela
        System.out.print("BubbleSort:");
         System.out.print("O vetor feito com o bubble sort apresenta:");
         System.out.print("[");
         for (m=0; m < n; m++) {
         System.out.print(" " + lista[m] + " ");
 
         }
         System.out.println("];");
           
 }
}
