public class Main {
    public static void main(String[] args) {


        Character First = new Character();
        Character Second = new Character();

        First.name = "First";
        First.defence = 3;
        First.strength = 1;
        First.health = 100;

        Second.name = "Second";
        Second.defence = 0;
        Second.strength = 2;
        Second.health = 150;


        System.out.println(Character.CHARACTER_COUNT);

        while (First.isAlive() && Second.isAlive()){
            First.attack(Second);
            First.displayStatus();
            Second.displayStatus();

            Second.attack(First);
            First.displayStatus();
            Second.displayStatus();
        }

        First.equip("Sword");
        Second.equip("Shield");
        System.out.println("==============");
        First.displayStatus();
        Second.displayStatus();

    }
}