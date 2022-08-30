import java.awt.Point;
import java.util.Scanner;

public class Zombie {

    public static void main(String[] args) {
        // game field represented as a two-dimensional array

        Point playerPosition = new Point(19 * 2, 4 * 2);
        // You could add as many zombies as you wish

        Point zombiePosition = new Point(3 * 2, 8 * 2);
        Point zombie2Position = new Point(26 * 2, 9 * 2);
        Point zombie3Position = new Point(38 * 2, 13 * 2);
        Point zombie4Position = new Point(17 * 2, 8 * 2);
        Point zombie5Position = new Point(21 * 2, 9 * 2);
        Point zombie6Position = new Point(12 * 2, 13 * 2);


        Point goldPosition = new Point(25 * 2, 8 * 2);
        Point doorPosition = new Point(34 * 2, 6 * 2);
        boolean further = true;
        boolean goldCollected = false;

        while(further) {

            for (int y = 0; y < 40; y++) {
                for (int x = 0; x < 80; x++) {
                    Point p = new Point(x, y);
                    if (p.equals(playerPosition)){
                      System.out.print("P");
                    }

                    else if (p.equals(zombiePosition)){
                      System.out.print("Z");
                    }

                    else if (p.equals(zombie2Position)){
                      System.out.print("Z");
                    }

                    else if (p.equals(zombie3Position)){
                      System.out.print("Z");
                    }

                    else if (p.equals(zombie4Position)){
                      System.out.print("Z");
                    }

                    else if (p.equals(zombie5Position)){
                      System.out.print("Z");
                    }

                    else if (p.equals(zombie6Position)){
                      System.out.print("Z");
                    }

                    else if (p.equals(goldPosition)){
                      System.out.print("G");
                    }

                    else if (p.equals(doorPosition)){
                      System.out.print("D");
                    }

                    else {
                      System.out.print(".");
                    }

                }
                System.out.println();
            }
            //Spiellogik
            if (zombiePosition.equals(playerPosition)) {
                further = false;
                System.out.println("Yummy... The zombie ate your brain.");
            }

            if (zombie2Position.equals(playerPosition)) {
                further = false;
                System.out.println("Yummy... The zombie ate your brain.");
            }

            if (zombie3Position.equals(playerPosition)) {
                further = false;
                System.out.println("Yummy... The zombie ate your brain.");
            }

            if (zombie4Position.equals(playerPosition)) {
                further = false;
                System.out.println("Yummy... The zombie ate your brain.");
            }

            if (zombie5Position.equals(playerPosition)) {
                further = false;
                System.out.println("Yummy... The zombie ate your brain.");
            }

            if (zombie6Position.equals(playerPosition)) {
                further = false;
                System.out.println("Yummy... The zombie ate your brain.");
            }

            if (playerPosition.equals(goldPosition)) {
                goldCollected = true;
                goldPosition = new Point(-1, -1);
            }

            if (playerPosition.equals(doorPosition) && goldCollected) {
                further = false;
                System.out.println("You won!");
            }


            movePlayer(playerPosition);
            moveZombie(zombiePosition, playerPosition);
            moveZombie(zombie2Position, playerPosition);
            moveZombie(zombie3Position, playerPosition);
            moveZombie(zombie4Position, playerPosition);
            moveZombie(zombie5Position, playerPosition);
            moveZombie(zombie6Position, playerPosition);

        }
    }

    private static void moveZombie(Point zombiePosition, Point playerPosition) {
        if (playerPosition.x < zombiePosition.x)
            zombiePosition.x--;
        else if (playerPosition.x > zombiePosition.x)
            zombiePosition.x++;
        if (playerPosition.y < zombiePosition.y)
            zombiePosition.y--;
        else if (playerPosition.y > zombiePosition.y)
            zombiePosition.y++;
    }

    private static void movePlayer(Point playerPosition) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        //w = up, a = left, s = down, d = right
        //player 2 times faster than zombie
        if (input.equals("w")) {
            if (playerPosition.y > 0)
                playerPosition.y = playerPosition.y - 2;
        } else if (input.equals("s")) {
            if (playerPosition.y < 39)
                playerPosition.y = playerPosition.y + 2;
        } else if (input.equals("a")) {
            if (playerPosition.x > 0)
                playerPosition.x = playerPosition.x - 2;
        } else if (input.equals("d")) {
            if (playerPosition.x < 79 )
                playerPosition.x = playerPosition.x + 2;
        }
    }
}
