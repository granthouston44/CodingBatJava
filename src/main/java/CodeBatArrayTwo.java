import java.util.ArrayList;
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

    public int bigDiff(int[] nums) {
        int max = nums[nums.length - 1];
        int min = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
            if(min > nums[i]){
                min = nums[i];
            }
        }
        return max-min;
    }

    public ArrayList<Integer> sumPairs(ArrayList<Integer> nums, int sum){
        int result = 0;
        ArrayList pairs = new ArrayList();
        for(int i = 0; i < nums.size(); i++){
            for(int j = i + 1; j < nums.size(); j++){
                result = nums.get(i) + nums.get(j);
                if (result == sum){
                    pairs.add(nums.get(i));
                    pairs.add(nums.get(j));
                }
            }
        }
        return pairs;
    }

    public int centeredAverage(int[] nums) {
    int total = 0;
    int result = 0;
    int max = nums[0];
    int min = nums[nums.length-1];

    for(int i = 0; i < nums.length ; i++){
        if(max < nums[i]){
            max = nums[i];
        }
        if(min > nums[i]){
             min = nums[i];
        }
         total += nums[i];
    }

    result = (total - max - min) / (nums.length-2);
    return result;
    }


}
