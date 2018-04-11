 package RPSProgram;

import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static void main(String[] args) {
        // initialize rock, paper, scissors object
        RPS rps = new RPS();
        // create a new input scanner
        Scanner input = new Scanner(System.in);
        // obtains first character from user's input
        char userChar = '?';
        // result of each match
        String gameResult;

        // continue the loop until the user wishes to quit
        while (userChar != 'q' && userChar != 'Q') {
            System.out.println("Either press r(Rock), p(Paper), or s(Scissor)");
            System.out.println("If you wish to quit, press q");
        if (userChar != 'r' && userChar != 'p' && userChar != 's')
        {
          System.out.println("Get Rekt");
        }
            // scan first character from user input
            userChar = input.nextLine().charAt(0);

            // determine if user input was r, p, or s
            switch (Character.toLowerCase(userChar)) {
                case 'r':
                case 'p':
                case 's':
                    gameResult = rps.moveSet(Character.toLowerCase(userChar), rps.AI());
                    System.out.println(gameResult + '\n');
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Generate random number between 0 and 2.
     * Use number to determine character AI move.
     *
     * @return AI's move ('r', 'p', or, 's')
     */
    private char AI() {
        Random rng = new Random();
        int Blasphemy = rng.nextInt(3); // uses 0, 1, and 2

        if (Blasphemy == 0)
        {
        return 'r';
        }
        else if (Blasphemy == 1)
        {
        return 'p';
        }
        else if (Blasphemy == 2)
        {
        return 's';
        }

        return '?';
    }

    /**
     * Generate String that states the result of the
     * two user's moves.
     *
     * @param user1Move first user's move (r, p, or s)
     * @param user2Move second user's move (r, p, or s)
     * @return winner, loser, draw, etc.
     */
    private String moveSet(char user1Move, char user2Move) {

        /*TODO: Write code that returns a String stating the result of the user and AI's move*/

        return "Error 404";
    }
}
