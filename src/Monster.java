public class Monster {
    public static final int ICE_MONSTER_TYPE = 1;
    public static final int WATER_MONSTER_TYPE = 2;
    public static final int FIRE_MONSTER_TYPE = 3;
    public String name = "Unknown";
    public int health = 100;
    public int strength = 10;
    public int monsterType = 0;

    public Monster(String name, int health, int monsterType) {
        this.name = name;
        this.health = health;
        this.monsterType = monsterType;
    }
    public void attack(Monster defender) { //to be written
        // TODO
    }

    private static int rollDice() { //returns a random integer between 1 and 12
        return new java.util.Random().nextInt(12) + 1;
    }

    public static void output(String message) {
        System.out.println(message);
    }
}