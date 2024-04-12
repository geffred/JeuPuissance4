import java.util.Scanner;

public class mainGame {

    public static void main(String[] args) {

        Grid grid = new Grid();
        Piece jetton1 = new Piece("R");
        Piece jetton2 = new Piece("B");

        Gamer gamer1 = new Gamer("player 1");
        Gamer gamer2 = new Gamer("player 2");

        gamer1.setJetonColor("R");
        gamer2.setJetonColor("B");

        Scanner sc = new Scanner(System.in);

        System.out.println("Player 1 jeton R");
        System.out.println("Player 2 jeton B");

        String winner = grid.getWinner();

        grid.bluild();

        while (winner == "none") {

            System.out.println("Player 1 : selectionnez un numero de colonne : ");
            int col1 = sc.nextInt();
            grid.pushPiece(gamer1, jetton1, col1);
            grid.bluild();
            grid.checkWinner(gamer1);

            System.out.println("Player 2 : selectionnez un numero de colonne : ");
            int col2 = sc.nextInt();
            grid.pushPiece(gamer2, jetton2, col2);
            grid.bluild();
            grid.checkWinner(gamer2);

            winner = grid.getWinner();

        }

        System.out.println("The winner is : " + winner);
    }
}
