public class Character {
     String name;
     int health;
     int strength;
     int defence;
     static int characterCount;

 public Character(String name, int health, int strength, int defence){
     this.name = name;
     this.health = health;
     this.strength = strength;
     this.defence = defence;
     characterCount++;
 }

    void attack (Character otherCharacter){
        int damage = strength - otherCharacter.defence;
        if ( damage >= 0) {
            otherCharacter.takeDamage(damage);
        }
        else {
            otherCharacter.health = otherCharacter.health - 0;
        }
        // Шкода, яка завдається, дорівнює силі атакуючого мінус захист захищаючого (але не менше 0).
        //void attack (Character otherCharacter){
          //  if (strength - otherCharacter.defence >= 0) {
          //      otherCharacter.health = otherCharacter.health - (strength - otherCharacter.defence);
          //  }
          //  else {
           //     otherCharacter.health = otherCharacter.health - 0;
          //  }

    }

    void takeDamage(int damage){
     health = health - damage;
    }

    boolean isAlive(){
        return health > 0;
    }

   void equip (String tool){
        if (tool.equalsIgnoreCase("sword")){
           strength+=5;
        }
        else if (tool.equalsIgnoreCase("shield")){
            defence+=5;
        }
        else{
            System.err.println("We don't have this tool");
        }
    }

    void displayStatus(){
        System.out.println("Name of this character is: "+ name + ". " +
                "Health of this character = " + health
                + " Strength of this character = " + strength
                + " Defense of this character = " + defence);
    }







}
