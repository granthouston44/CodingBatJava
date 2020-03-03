import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CodeBatTest {

    private CodeBat codeBat;
    private Algorithms algorithms;

    @Before
    public void before(){
        codeBat = new CodeBat();
        algorithms = new Algorithms();
    }

    @Test
    public void canTakeStringAndPrintLastCharAtFrontAndAddAtEnd(){
        assertEquals("tcatt", codeBat.backAround("cat"));
        assertEquals("gdogg", codeBat.backAround("dog"));
    }

    @Test
    public void willReturnTrueIfNonNegativeNumberIsDivisbleBy3Or5(){
        assertEquals(true, codeBat.or35(3));
        assertEquals(true, codeBat.or35(5));
        assertEquals(true, codeBat.or35(50));
        assertEquals(true, codeBat.or35(30));
    }

    @Test
    public void willReturnFalseIfNonNegativeNumberIsNotDivisbleBy3Or5(){
        assertEquals(false, codeBat.or35(2));
        assertEquals(false, codeBat.or35(4));
    }

    @Test
    public void lessThanTwoCharsFront22(){
        assertEquals("aaa", codeBat.front22("a"));
    }

    @Test
    public void twoCharsOrMoreFront22(){
        assertEquals("dodogdo", codeBat.front22("dog"));
    }

    @Test
    public void canSleepIn(){
        assertEquals(true, codeBat.sleepIn(false, true));
        assertEquals(true, codeBat.sleepIn(true, true));
        assertEquals(false, codeBat.sleepIn(true, false));
        assertEquals(true, codeBat.sleepIn(false, false));

    }
    @Test
    public void inTrouble(){
        assertEquals(false, codeBat.monkeyTrouble(false, true));
        assertEquals(false, codeBat.monkeyTrouble(true, false));
        assertEquals(true, codeBat.monkeyTrouble(false, false));
        assertEquals(true, codeBat.monkeyTrouble(true, true));
    }

    @Test
    public void sumDouble(){
        assertEquals(8, codeBat.sumDouble(2,2));
    }

    @Test
    public void diff21(){
    assertEquals(2, codeBat.diff21(19));
    assertEquals(11, codeBat.diff21(10));
    assertEquals(21, codeBat.diff21(0));
    }

    @Test
    public void parrotTrouble(){
        assertEquals(true, codeBat.parrotTrouble(true, 6));
        assertEquals(false, codeBat.parrotTrouble(true, 7));
        assertEquals(false, codeBat.parrotTrouble(false, 6));
    }

    @Test
    public void makesTen(){
        assertEquals(true, codeBat.makes10(10,5));
        assertEquals(true, codeBat.makes10(1,10));
        assertEquals(true, codeBat.makes10(5,5));
        assertEquals(false, codeBat.makes10(8,5));
    }

    @Test
    public void posNeg(){
        assertEquals(false, codeBat.posNeg(-4,-5, false));
    }

    @Test
    public void notString(){
        assertEquals("not bad", codeBat.notString("not bad"));
    }

    @Test
    public void bubbleSort(){
        int[] myArray = new int[]{4,2,1,3};
        int[] expected = new int[]{1,2,3,4};
        assertArrayEquals(expected, algorithms.bubbleSort(myArray));
    }

    @Test
    public void startHi(){
        assertEquals(true, codeBat.startHi("hi"));
        assertEquals(false, codeBat.startHi("Hello hi"));
    }

    @Test
    public void missingNum(){
        Integer[] myArray = new Integer[]{9,10,11,1,2,4,5,6,7,8};
        Integer[] anotherArray = new Integer[]{9,10,11,13,1,2,3,4,5,6,7,8};
        assertEquals(3, codeBat.missingNumber(myArray));
        assertEquals(12, codeBat.missingNumber(anotherArray));
    }

}
