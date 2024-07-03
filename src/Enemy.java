public abstract class Enemy implements iMortal {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage) {
        health -= damage;
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attackHero(Hero hero);

}
