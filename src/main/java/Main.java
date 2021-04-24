
public class Main {
    public static void main (String args[]){
       BubbleSort executeBubbleSort = new BubbleSort();
       InsertionSort executeInsertionSort = new InsertionSort();
       SelectionSort executeSelectionSort = new SelectionSort();
       QuickSort executeQuickSort = new QuickSort();
       
        int vetorBubble1[] = {8,9,2,3,1};
        int vetorBubble2[] = {4,7,6,5,2};
       
            int vetorInsertion1[] = {3,7,4,2,1};
            int vetorInsertion2[] = {7,5,1,3,8};
        
        int vetorSelection1[] = {2,9,3,6,7};
        int vetorSelection2[] = {8,5,2,3,11};
        
            int vetorQuick1[] = {3, 5, 1, 2, 7};
            int vetorQuick2[] = {9, 1, 7, 4, 5};
            int n1 = vetorQuick1.length;
            int n2 = vetorQuick2.length;
            
       executeBubbleSort.algoritimoBubblesort(vetorBubble1);//é para apresentar:(1  2  3  8  9)
       executeBubbleSort.algoritimoBubblesort(vetorBubble2);//é para apresentar:(2  4  5  6  7)
       
            executeInsertionSort. algoritmoInsertionSort(vetorInsertion1);//é para apresentar:(1  2  3  4  7) 
            executeInsertionSort.algoritmoInsertionSort(vetorInsertion2);//é para apresentar:(1  3  5  7  8)
       
       executeSelectionSort. algoritmoSelectionSort(vetorSelection1);//é para apresentar:(2  3  6  7  9) 
       executeSelectionSort.algoritmoSelectionSort(vetorSelection2);//é para apresentar:(2  3  5  8  11)
       
            executeQuickSort.algoritmoQuickSort(vetorQuick1, 0, n1 - 1);//é para apresentar:(1  2  3  5  7)
            executeQuickSort.printQuickSort(vetorQuick1);
            executeQuickSort.algoritmoQuickSort(vetorQuick2, 0, n2 - 1);//é para apresentar:(1  4  5  7  9)
            executeQuickSort.printQuickSort(vetorQuick2);
    }
    
}
