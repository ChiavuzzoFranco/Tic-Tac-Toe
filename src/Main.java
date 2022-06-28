public class Main {
    public static void main(String[] args) {
         int ROND = 1;
         int CROIX = 2;
        JeuMorpion jeu = new JeuMorpion();
        jeu.initialise();
        boolean valide;
        jeu.placerCroix(0,0); // boolean déclaré plus haut
        jeu.placerRond(0, 1);
        jeu.placerCroix(1, 1);
        jeu.placerRond(2, 0);
        jeu.placerCroix(2,2);
    }
}