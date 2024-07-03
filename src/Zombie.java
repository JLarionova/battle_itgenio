public class Zombie extends Enemy {


    public Zombie(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Zombie is fighting!");
        hero.takeDamage(250);
    }

    public void refillHealth() {
        if (getHealth() <= 0 && randomNum() > 5) {
            setHealth(400);
        }
    }

    public int randomNum() {
        return (int)(Math.random()*10);
    }

}
