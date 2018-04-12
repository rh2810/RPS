package RPSProgram;

import static org.junit.Assert.*;

import org.junit.*;

public class RPSTest {


    @Test
    public void testSmoke() {
        assertTrue(true);
        assertTrue(true == true);
    }

    @Test
    public void testMovesTie() {
        // initialize rock, paper, scissors object
        RPS rps = new RPS();

        assertEquals("Rock  vs  Rock\nTie!"
                , rps.moveSet('r', 'r'));

        assertEquals("Paper  vs  Paper\nTie!"
                , rps.moveSet('p', 'p'));

        assertEquals("Scissor  vs  Scissor\nTie!"
                , rps.moveSet('s', 's'));
    }
}
