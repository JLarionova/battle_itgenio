public class Demon extends Enemy {

    public Demon(int health) {
        super(health);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Demon strikes " + hero.getName() + "!");
        hero.takeDamage(350);

        if (hero.getHealth() == 200) {
            hero.takeDamage(200);
        }

    }




}

