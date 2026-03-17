public class Arena {
    public Monster[] monsters = new Monster[10];
    int monsterCount = 0; //the number of monsters currently in array
    public void addMonster(Monster M) {
        // to be written
    }
    public void removeMonster(Monster M) {
        //to be written
    }
    public void doOneOnOneBattle(Monster A, Monster B) {
        while (A.health > 0 && B.health > 0) {
            A.attack(B);
            B.attack(A);
        }
        if (A.health > B.health) {
            output(A.name + " WINS!");
            removeMonster(B);
        } else if (B.health > A.health) {
            output(B.name + " WINS!");
            removeMonster(A);
        } else {
            output("IT IS A DRAW!");
        }
    }
    public static void output(String message) {
        System.out.println(message);
    }

    public void showMonsters() {
        for (int i = 0; i < monsterCount; i++) {
            output((i + 1) + " - " + monsters[i].name + " " + monsters[i].health);
        }
    }

    public void showMonstersFull() {
        for (int i = 0; i < monsters.length; i++) {
            output((i + 1) + " - " + monsters[i].name + " " + monsters[i].health);
        }
    }
}