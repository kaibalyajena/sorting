package sorting;


public class BubbleSort {  
    static void bubbleSort(int[] arr) {   
        int temp = 0;  
         for(int i=0; i < arr.length; i++){  
                 for(int j=1; j < (arr.length-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};   
                bubbleSort(arr);
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
