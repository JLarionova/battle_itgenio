public class BattleGround {
    public static void main(String[] args) {

        Hero[] heroes = new Hero[3];

        heroes[0] = new Mage("Katya", 1000);
        heroes[1] = new Warrior("Ivan", 1500);
        heroes[2] = new Archer("Oleg", 900);

        Enemy[] enemies = new Enemy[3];

        enemies[0] = new Zombie(900);
        enemies[1] = new Demon(1500);
        enemies[2] = new Dragon(2000);


        for (Hero hero : heroes) {
            System.out.println("Name: " + hero.getName() + ", Health: " + hero.getHealth());
        }
        System.out.println();
        System.out.println("Round first: ");
        System.out.println();


        enemies[0].attackHero(heroes[1]);
        heroes[2].attackEnemy(enemies[0]);
        enemies[1].attackHero(heroes[0]);
        heroes[0].attackEnemy(enemies[2]);
        enemies[2].attackHero(heroes[2]);
        heroes[1].attackEnemy(enemies[1]);


        System.out.println();
        for (Hero hero : heroes) {
            System.out.println("Name: " + hero.getName() + ", Health: " + hero.getHealth());
        }




    }
}
