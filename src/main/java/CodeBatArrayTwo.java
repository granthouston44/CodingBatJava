import java.util.Arrays;
import java.util.Collections;

public class CodeBatArrayTwo {

    public int countEvens(int[] nums) {
        int count=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count += 1;
            }
        }
        return count;
    }

    public int missingNumber(Integer[] someArray){
        Arrays.sort(someArray, Collections.<Integer>reverseOrder());
        int result = 0;
        int missingNum = 0;
        for(int i = 0; i < someArray.length; i++){
            result = someArray[i] - someArray[i+1];
            if(result > 1) {
                missingNum = someArray[i] - 1;
                return missingNum;
            }

        }
        return missingNum;
    }

    public int duplicate(Integer[] someArray){
        Arrays.sort(someArray, Collections.<Integer>reverseOrder());
        int result;
        int dupe = 0;
        for(int i = 0; i < someArray.length; i++){
            result = someArray[i] - someArray[i+1];
            if(result == 0){
                dupe = someArray[i];
                return dupe;
            }
        }
        return dupe;
    }
}
