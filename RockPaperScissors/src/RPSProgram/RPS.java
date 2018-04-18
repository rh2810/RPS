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

                case 'q':

                    break;

                default:

                    System.out.println("Invalid input, try again.\n");

                    break;

            }

        }

    }


    /**
     * Generate random number between 0 and 2.
     * <p>
     * Use number to determine character AI move.
     *
     * @return AI's move ('r', 'p', or, 's')
     */

    protected char AI() {

        Random rng = new Random();

        int Blasphemy = rng.nextInt(3); // uses 0, 1, and 2


        if (Blasphemy == 0)

        {

            return 'r';

        } else if (Blasphemy == 1)

        {

            return 'p';

        } else if (Blasphemy == 2)

        {

            return 's';

        }


        return '?';

    }


    /**
     * Generate String that states the result of the
     * <p>
     * two user's moves.
     *
     * @param user1CMove first user's move (r, p, or s)
     * @param user2CMove second user's move (r, p, or s)
     * @return winner, loser, draw, etc.
     */

    protected String moveSet(char user1CMove, char user2CMove) {

        StringBuilder sb = new StringBuilder();

        String user1SMove;

        String user2SMove;


        switch (user1CMove) {

            case 'r':

                user1SMove = "Rock";

                break;

            case 'p':

                user1SMove = "Paper";

                break;

            case 's':

                user1SMove = "Scissor";

                break;

            default:

                return null;

        }


        switch (user2CMove) {

            case 'r':

                user2SMove = "Rock";

                break;

            case 'p':

                user2SMove = "Paper";

                break;

            case 's':

                user2SMove = "Scissor";

                break;

            default:

                return null;

        }


        //Example:

        if (user1CMove == user2CMove) {

            sb.append(user1SMove + "  vs  " + user2SMove + "\n");

            sb.append("Tie!");

        } else if (user1SMove.equals("Rock")) {
            if (user2SMove.equals("Scissor"))
                sb.append(user1SMove + "  vs  " + user2SMove + "\nUser Wins!");

            else if (user2SMove.equals("Paper"))
                sb.append(user1SMove + "  vs  " + user2SMove + "\nUser Loses!");

        } else if (user1SMove.equals("Paper")) {
            if (user2SMove.equals("Scissor"))
                sb.append(user1SMove + "  vs  " + user2SMove + "\nUser Loses!");

            else if (user2SMove.equals("Rock"))
                sb.append(user1SMove + "  vs  " + user2SMove + "\nUser Wins!");


        } else if (user1SMove.equals("Scissor")) {
            if (user2SMove.equals("Paper"))
                sb.append(user1SMove + "  vs  " + user2SMove + "\nUser Wins!");

            else if (user2SMove.equals("Rock"))
                sb.append(user1SMove + "  vs  " + user2SMove + "\nUser Loses!");

        } else
            sb.append("Invalid user input.");





        /*TODO: Write code that returns a String stating the result of the user1 and user2's move*/


        return sb.toString();

    }

}