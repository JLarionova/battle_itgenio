public class Mage extends Hero {

    public Mage(String name, int health) {

        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " is fighting!");
        enemy.takeDamage(100);
    };

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
