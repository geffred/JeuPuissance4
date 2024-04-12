public class Grid {

    private static final int WIDTH = 7;
    private static final int HEIGHT = 6;
    private Piece[][] grid = new Piece[7][6];
    private int[] colCapacityTab = new int[6];

    private String winner = "none";

    // on génère la grille et on initialise avec les pièce dit : vide
    public Grid() {

        Piece emptyPiece = new Piece("#");

        for (int i = 0; i < WIDTH; i++) {

            for (int j = 0; j < HEIGHT; j++) {

                grid[i][j] = emptyPiece;
            }
        }

        /*
         * On initialise le nombre de pièce que peu avoir une colonne à 7
         * Car le nombre max de pièce/jeton que peu avoir une colonne est 7
         */
        for (int i = 0; i < colCapacityTab.length; i++) {

            colCapacityTab[i] = 7;
        }
    }

    public void bluild() {
        for (int i = 0; i < WIDTH; i++) {

            for (int j = 0; j < HEIGHT; j++) {

                System.out.print(" " + grid[i][j].getColor() + " ");
                System.out.print("|");
            }

            System.out.println("");

            for (int k = 0; k < HEIGHT; k++) {

                System.out.print("----");
            }

            System.out.println("");

        }
    }

    // Permet d'ajouter un jeton/pièce dans la grille
    public void pushPiece(Gamer gamer, Piece piece, int numColGrid) {

        // on ajoute une position à la pièce
        piece.setX(numColGrid - 1);
        piece.setY(colCapacityTab[numColGrid - 1] - 1);

        // on place dans la grille le jeton à la position numColGrid - 1 pour la colonne
        // et colCapacityTab[numColGrid - 1] - 1 pour la ligne
        grid[colCapacityTab[numColGrid - 1] - 1][numColGrid - 1] = piece;

        // on décrémente la capacité c'est à dire on augmente d'une ligne pour la
        // colonne
        colCapacityTab[numColGrid - 1] -= 1;

    }

    public String getWinner() {
        return winner;
    }

    public void checkWinner(Gamer gamer) {
        // on verifie si on a des jetons de meme couleur sur la meme ligne
        for (int i = 0; i < WIDTH; i++) {

            for (int j = 3; j < HEIGHT; j++) {

                if ((grid[i][j - 3].getColor() == grid[i][j - 2].getColor())
                        && (grid[i][j - 2].getColor() == grid[i][j - 1].getColor())
                        && (grid[i][j - 1].getColor() == grid[i][j].getColor())
                        && grid[i][j].getColor() == gamer.getJetonColor()) {

                    winner = gamer.getName();
                    break;

                }

            }
        }

        // on verifie si on a les jetons de meme couleur sur la meme colonne

        for (int i = 0; i < grid[0].length; i++) {// colonne
            int compteur = 0;
            for (int j = 1; j < grid.length; j++) {// ligne

                if ((grid[j - 1][i].getColor() == grid[j][i].getColor())
                        && grid[j][i].getColor() == gamer.getJetonColor()) {
                    compteur++;
                }
            }

            if (compteur == 3) {
                winner = gamer.getName();
                break;
            }

        }
    }

}
