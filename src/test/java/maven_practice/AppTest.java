package maven_practice;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testAddN(){
        App();
    	assertEquals( App.addN() , 5 );
    }

    @Test
    public void testN(){
        assertEquals( App.n() , 5 );
    }

    @Test
    public void testK(){
        assertEquals( App.k() , 5 );
    }

    @Test
    public void testM(){
        assertEquals( App.m() , 5 );
    }    
}
