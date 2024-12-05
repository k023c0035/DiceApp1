public class Game {

    Player p;
    Dice d;

    Game(){
        p = new Player();
        d = new Dice();
    }
    void start(){
        p.trun(d);
        System.out.println(d.me);
    }

}
