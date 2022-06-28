public class JeuMorpion {
    private static int VIDE = 0;
    private static int ROND = 1;
    private static int CROIX = 2;

    private int[][] grille;

    public void initialise() {
        grille = new int[3][3];
        for(int i=0;i < grille.length; i++){
            for(int j=0; j < grille.length; j++) {
                grille[i][j] = VIDE;
            }
        }
    }

    public void placerRond(int ligne, int colonne) {
         placerCoup(ligne, colonne,ROND);
         VerificationGagnant(ROND);
    }

    public void placerCroix(int ligne, int colonne) {
         placerCoup(ligne, colonne,CROIX);
         VerificationGagnant(CROIX);
    }

    public void VerificationGagnant(int joueur) {

        for(int i=0; i < grille.length; i++) {

            if( grille[i][0] == joueur && grille[i][1] == joueur && grille[i][2] == joueur){
                System.out.println("Joueur gagnant ligne" + i);
            }else {
                System.out.println("Pas de gagnant en ligne");
            }
        }

        for(int j =0; j < grille.length; j++) {
            if( grille[0][j] == joueur && grille[1][j] == joueur && grille[2][j] == joueur){
                System.out.println("Joueur gagnant colonne");
            }else {
                System.out.println("Pas de gagnant er colonne");
            }
        }
        if(grille[0][0] == joueur && grille[1][1] == joueur && grille[2][2] == joueur || grille[0][2] == joueur && grille[1][1] == joueur && grille[2][0] == joueur){
            System.out.println("Bravo diagonale");
        }else {
            System.out.println("Pas de gagnant en diagonale");
        }

    }
    private boolean placerCoup(int ligne, int colonne, int coup) {
        if(ligne < 0 || ligne>= grille.length || colonne <0 || colonne >= grille[ligne].length) {
            System.out.println("Impossible de placer un pion en dehors de la grille.");
        }
        if(grille[ligne][colonne] == VIDE) {
            //case vide, on peut placer le coup
            grille[ligne][colonne] = coup;
            return true;
        } else {
            System.out.println("Case déjà prise");
            return false;
        }
    }
}
