import java.lang.reflect.Array;

public class Algorithms {

    public int[] bubbleSort(int[] myArray){

        int n = myArray.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(myArray[j-1] > myArray[j]){
                    //swap elements
                    temp = myArray[j-1];
                    myArray[j-1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
return myArray;
    }

}
