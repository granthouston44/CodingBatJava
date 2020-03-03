import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CodeBatWarmOneTest {

    private CodeBatWarmOne codeBatWarmOne;
    private Algorithms algorithms;

    @Before
    public void before(){
        codeBatWarmOne = new CodeBatWarmOne();
        algorithms = new Algorithms();
    }

    @Test
    public void canTakeStringAndPrintLastCharAtFrontAndAddAtEnd(){
        assertEquals("tcatt", codeBatWarmOne.backAround("cat"));
        assertEquals("gdogg", codeBatWarmOne.backAround("dog"));
    }

    @Test
    public void willReturnTrueIfNonNegativeNumberIsDivisbleBy3Or5(){
        assertEquals(true, codeBatWarmOne.or35(3));
        assertEquals(true, codeBatWarmOne.or35(5));
        assertEquals(true, codeBatWarmOne.or35(50));
        assertEquals(true, codeBatWarmOne.or35(30));
    }

    @Test
    public void willReturnFalseIfNonNegativeNumberIsNotDivisbleBy3Or5(){
        assertEquals(false, codeBatWarmOne.or35(2));
        assertEquals(false, codeBatWarmOne.or35(4));
    }

    @Test
    public void lessThanTwoCharsFront22(){
        assertEquals("aaa", codeBatWarmOne.front22("a"));
    }

    @Test
    public void twoCharsOrMoreFront22(){
        assertEquals("dodogdo", codeBatWarmOne.front22("dog"));
    }

    @Test
    public void canSleepIn(){
        assertEquals(true, codeBatWarmOne.sleepIn(false, true));
        assertEquals(true, codeBatWarmOne.sleepIn(true, true));
        assertEquals(false, codeBatWarmOne.sleepIn(true, false));
        assertEquals(true, codeBatWarmOne.sleepIn(false, false));

    }
    @Test
    public void inTrouble(){
        assertEquals(false, codeBatWarmOne.monkeyTrouble(false, true));
        assertEquals(false, codeBatWarmOne.monkeyTrouble(true, false));
        assertEquals(true, codeBatWarmOne.monkeyTrouble(false, false));
        assertEquals(true, codeBatWarmOne.monkeyTrouble(true, true));
    }

    @Test
    public void sumDouble(){
        assertEquals(8, codeBatWarmOne.sumDouble(2,2));
    }

    @Test
    public void diff21(){
    assertEquals(2, codeBatWarmOne.diff21(19));
    assertEquals(11, codeBatWarmOne.diff21(10));
    assertEquals(21, codeBatWarmOne.diff21(0));
    }

    @Test
    public void parrotTrouble(){
        assertEquals(true, codeBatWarmOne.parrotTrouble(true, 6));
        assertEquals(false, codeBatWarmOne.parrotTrouble(true, 7));
        assertEquals(false, codeBatWarmOne.parrotTrouble(false, 6));
    }

    @Test
    public void makesTen(){
        assertEquals(true, codeBatWarmOne.makes10(10,5));
        assertEquals(true, codeBatWarmOne.makes10(1,10));
        assertEquals(true, codeBatWarmOne.makes10(5,5));
        assertEquals(false, codeBatWarmOne.makes10(8,5));
    }

    @Test
    public void posNeg(){
        assertEquals(false, codeBatWarmOne.posNeg(-4,-5, false));
    }

    @Test
    public void notString(){
        assertEquals("not bad", codeBatWarmOne.notString("not bad"));
    }

    @Test
    public void bubbleSort(){
        int[] myArray = new int[]{4,2,1,3};
        int[] expected = new int[]{1,2,3,4};
        assertArrayEquals(expected, algorithms.bubbleSort(myArray));
    }

    @Test
    public void startHi(){
        assertEquals(true, codeBatWarmOne.startHi("hi"));
        assertEquals(false, codeBatWarmOne.startHi("Hello hi"));
    }



}
