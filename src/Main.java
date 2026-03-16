//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Instantiate objects that follow the blueprint (class) Monster
        FireMonster fm1 = new FireMonster("FM1", 40);
        FireMonster fm2 = new FireMonster("FM2", 50);
        // Add 3 more FireMonster instances (type, don't copy)

        WaterMonster wm1 = new WaterMonster("WM1", 100);
        WaterMonster wm2 = new WaterMonster("WM2", 30);
        // Add 3 more WaterMonster instances (type, don't copy)

        // Instantiate an object called "a" that follows blueprint Arena (class)
        Arena a = new Arena();
        a.addMonster(fm1); // Test 1: Adding a monster
        a.addMonster(fm1); // Test 2: Adding an existing monster
        a.addMonster(fm2);
        a.addMonster(wm1);
        a.addMonster(wm2);
        // Add the 6 monsters that you instantiated (for a total of max 10)

        // Test 3: Adding a monster when Arena is full

        // Test 4: Removing a monster
        a.removeMonster(fm2); // FM1 should remain, FM2 removed and rest shifted

        // Test 5: Fight (using attach method in Monster Class
        a.doOneOnOneBattle(fm1, wm1);
    }
}