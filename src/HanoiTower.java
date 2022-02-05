/**
 * It takes exponential time.
 * For n discs, number of moves are (2^n)-1
 * Number of moves - [1->1, 2->3, 3->7, 4->15, 5->31...]
 */
public class HanoiTower {
    private static int numOfMoves = 1;


    public void move(int numberOfDiscs, char from, char to, char using) {
        if (numberOfDiscs == 1) {
            System.out.println(numOfMoves + " Moving disc 1 from " + from + " to " + to);
            numOfMoves++;
        } else {
            move(numberOfDiscs - 1, from, using, to);
            System.out.println(numOfMoves + " Moving disc " + numberOfDiscs + " from " + from + " to " + to);
            numOfMoves++;
            move(numberOfDiscs - 1, using, to, from);
        }
    }

    public static void main(String[] args) {
        HanoiTower toh = new HanoiTower();
        toh.move(5, 'A', 'C', 'B');
        System.out.println("Number of moves: " + Integer.toString(numOfMoves-1));
    }
}
