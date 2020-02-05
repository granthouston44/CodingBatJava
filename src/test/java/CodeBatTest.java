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



}
