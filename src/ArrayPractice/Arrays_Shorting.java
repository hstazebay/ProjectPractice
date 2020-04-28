package ArrayPracticeZero;



import java.util.Arrays;
public class Arrays_Shorting {
    public static void main (String[] args){
    int[] myArray = {10, 19, 5, 2, 3, 5, -1, 300};
    //  0   1 2 3 4 5  6  7
    ///Arrays.sort(myArray);
        bubblesort(myArray);

    System.out.println(Arrays.toString(myArray));
    System.out.println("First min number is: "+myArray[0]);

    System.out.println("Second min number is: "+myArray[1]);

    System.out.println("First max number is: "+myArray[myArray.length-1]);

     System.out.println("Second max number is: "+myArray[myArray.length-2]);

}
public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr.length-1;j++){

               if(arr[j]>arr[j+1]) {

                   int temp = arr[j];

                   arr[j] = arr[j + 1];

                   arr[j + 1] = temp;
               }
            }
        }
}

}
