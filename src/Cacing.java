public class Cacing {

    String userName;
    int score;
    double length;

    void eatSnack(){
        System.out.println("Nyam...nyamm...nyamm");
    }

    void eatOthers(Cacing cacing){
        score += 500;
    }
}
