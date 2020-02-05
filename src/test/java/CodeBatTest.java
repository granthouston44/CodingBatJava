import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeBatTest {

    private CodeBat codeBat;

    @Before
    public void before(){
        codeBat = new CodeBat();
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



}
