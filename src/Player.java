public class Player {
    String name;
    int healthPercentage;
    private Weapon weapon;

    //Weapon enum description:
    public enum Weapon{
        KNIFE,
        GUN,
        BOW
    }

    //functional constructor:
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = Math.max( 0, Math.min(healthPercentage, 100));
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }

    public void loseHealth(int demage){
        this.healthPercentage -= demage;
        if (this.healthPercentage <= 0){
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        if (this.healthPercentage > 100){
            this.healthPercentage =100;
        }
    }

}

