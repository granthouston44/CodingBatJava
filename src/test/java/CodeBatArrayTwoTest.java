import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CodeBatArrayTwoTest {

    private CodeBatArrayTwo codeBatArrayTwo;

    @Before
    public void before(){
        codeBatArrayTwo = new CodeBatArrayTwo();
    }

    @Test
    public void missingNum(){
        Integer[] myArray = new Integer[]{9,10,11,1,2,4,5,6,7,8};
        Integer[] anotherArray = new Integer[]{9,10,11,13,1,2,3,4,5,6,7,8};
        assertEquals(3, codeBatArrayTwo.missingNumber(myArray));
        assertEquals(12, codeBatArrayTwo.missingNumber(anotherArray));
    }

    @Test
    public void duplicateNum(){
        Integer[] myArray = new Integer[]{9,10,11,1,2,2,5,6,7,8};
        Integer[] anotherArray = new Integer[]{9,10,13,13,1,2,3,4,5,6,7,8};
        assertEquals(2, codeBatArrayTwo.duplicate(myArray));
        assertEquals(13, codeBatArrayTwo.duplicate(anotherArray));
    }

    @Test
    public void countEvens(){
        int[] array = new int[]{2, 1, 2, 3, 4};
        assertEquals(3,codeBatArrayTwo.countEvens(array));
    }



}
