public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());


        Player player = new Player("John Doe", 90, Player.Weapon.GUN);
        System.out.println("Current health: " + player.healthRemaining());

        player.loseHealth(10);
        System.out.println("After damage, health: " + player.healthRemaining());

        player.loseHealth(90);

        player.restoreHealth(20);
        System.out.println("After restoration, health: " + player.healthRemaining());

        Player anotherPlayer = new Player("Jane Doe", 95, Player.Weapon.BOW);
        anotherPlayer.restoreHealth(10);
        System.out.println("Another player's health after potion: " + anotherPlayer.healthRemaining());
    }

}