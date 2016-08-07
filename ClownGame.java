import java.util.List;
import java.util.Scanner;

/**
 * Created by Uma Wu on 2016/7/26.
 */
public class ClownGame extends ClownList {



    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ClownList clownList = new ClownList();

        System.out.println("Please enter the number of Clowns (>= 3)");
        int size = console.nextInt();

        for (int lineup = 1; lineup <= size; lineup++) {
            clownList.addClown();
        }

        System.out.println("RULES:");
        System.out.println("X: Standing clown");
        System.out.println("O: Sitting clown");
        System.out.println("Enter the index of the clown to flip (0 is leftmost) when prompted.");
        System.out.println("Win Condition: All clowns are standing.");
        System.out.println("START!");

        boolean gameOver = false;
        while (!gameOver) {
            clownList.renderClown();
            System.out.println("Please enter the index of the clown you would like to flip." + "0-" + (size - 1));
            int index = console.nextInt();
            clownList.flip(index);
            gameOver = clownList.allStand();
        }

        System.out.println("You win!");
    }
}
