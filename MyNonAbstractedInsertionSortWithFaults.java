public class MyNonAbstractedInsertionSortWithFaults {
 
    public static void main(String a[]){
        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
     
    public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 0; i <= input.length; i++) {
            for(int j = i-1 ; j >= 0 ; j--){
                if(input[j] < input[j+1]){
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }
}
