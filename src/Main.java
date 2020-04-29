public class Main {
    public static void main(String[] args) {
        Cacing player1 = new Cacing();
        Cacing player2 = new Cacing();

        player1.userName = "Muhammad";
        player1.score = 400;
        player1.length = 4.5;

        player2.userName = "Aku";
        player2.score = 300;
        player2.length = 2.5;

        player1.eatSnack();

        System.out.println(player1.score);
        player1.eatOthers(player2);
        System.out.println(player1.score);


    }
}
