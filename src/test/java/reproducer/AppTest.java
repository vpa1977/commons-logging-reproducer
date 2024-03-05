package reproducer;

import static org.junit.Assert.assertTrue;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

import java.util.logging.Logger;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        LogFactory factory = LogFactory.getFactory();
        Log log = factory.getInstance(getClass());
        assertTrue( true );
    }
}
