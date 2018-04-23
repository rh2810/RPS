package RPSProgram;

import static org.junit.Assert.*;

import org.junit.*;


/**
 * Unit tests for program.
 *
 * @author Ryan Hurst
 */
public class RPSTest {

    // initialize rock, paper, scissors object
    private RPS rps = new RPS();

    @Test
    public void testSmoke() {
        assertTrue(true);
        assertEquals(true, true);
    }

    @Test
    public void testMovesTie() {

        assertEquals("Rock  vs  Rock\nTie!"
                , rps.moveSet('r', 'r'));

        assertEquals("Paper  vs  Paper\nTie!"
                , rps.moveSet('p', 'p'));

        assertEquals("Scissor  vs  Scissor\nTie!"
                , rps.moveSet('s', 's'));
    }

    @Test
    public void testRockVSScissors() {
        assertEquals("Rock  vs  Scissor\nUser Wins!"
                , rps.moveSet('r', 's'));

        assertEquals("Scissor  vs  Rock\nUser Loses!"
                , rps.moveSet('s', 'r'));
    }

    @Test
    public void testScissorsVSPaper() {
        assertEquals("Scissor  vs  Paper\nUser Wins!"
                , rps.moveSet('s', 'p'));

        assertEquals("Paper  vs  Scissor\nUser Loses!"
                , rps.moveSet('p', 's'));
    }

    @Test
    public void testPaperVSRock() {
        assertEquals("Paper  vs  Rock\nUser Wins!"
                , rps.moveSet('p', 'r'));

        assertEquals("Rock  vs  Paper\nUser Loses!"
                , rps.moveSet('r', 'p'));
    }

    @Test
    public void testInvalidMove() {
        assertEquals("Invalid user input.", rps.moveSet('q', 'p'));
        assertEquals("Invalid user input.", rps.moveSet('9', 'r'));
        assertEquals("Invalid user input.", rps.moveSet('s', '\t'));
        assertEquals("Invalid user input.", rps.moveSet('y', 'y'));
    }
}
