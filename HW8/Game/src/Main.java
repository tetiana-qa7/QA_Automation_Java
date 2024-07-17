public class Main {
    public static void main(String[] args) {


        Character firstCharacter = new Character("First", 100, 1, 3);
        Character secondCharacter = new Character("Second", 150, 2, 0);


        System.out.println(Character.characterCount);

        while (firstCharacter.isAlive() && secondCharacter.isAlive()){
            firstCharacter.attack(secondCharacter);
            firstCharacter.displayStatus();
            secondCharacter.displayStatus();

            secondCharacter.attack(secondCharacter);
            firstCharacter.displayStatus();
            secondCharacter.displayStatus();
        }

        firstCharacter.equip("Sword");
        secondCharacter.equip("Shield");
        System.out.println("==============");
        firstCharacter.displayStatus();
        secondCharacter.displayStatus();

    }
}