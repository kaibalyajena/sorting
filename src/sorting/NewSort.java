package sorting;

public class NewSort {  
    public static void insertionSort(int arr[]) {    
        for (int j=1;j<arr.length;j++) {  
            int key=arr[j];  
            int i = j-1;  
            while ((i>-1)&&(arr[i]>key)) {  
                arr [i+1]=arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr = {44,6,45,89,22,35};    
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){    
            System.out.print(arr[i]+" ");    
        }    
    }    
}    