public class Dragon extends Enemy {
    public Dragon(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(400);
    }


    public void superDamage(Hero hero) {
        if (hero.getHealth() < 200) {
            hero.takeDamage(600);
        }
    }
}
