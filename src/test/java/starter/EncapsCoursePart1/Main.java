package starter.EncapsCoursePart1;

public class Main {

    public static void main(String[] args) {

        //No encapsulation, only public
        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " +player.healthRemaining());
        player.health = 200;
        player.loseHealth(11);
        System.out.println("Remaining health= " +player.healthRemaining());

    }
}
