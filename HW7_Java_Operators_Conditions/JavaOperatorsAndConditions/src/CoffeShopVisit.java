import java.util.Scanner;
public class CoffeShopVisit {

    /*
    Задача 2: Похід до кав’ярні
Уявіть, що ви йдете до кав’ярні й обираєте між трьома напоями: еспресо, лате та капучино.
Кожен напій має свою вартість.
Еспресо коштує 3 долари, лате – 4 долари, капучино – 5 доларів.
Ваша мета – порахувати загальну вартість вашого замовлення.
Напишіть програму, яка приймає кількість кожного напою і виводить загальну вартість замовлення.
Підказка: щоб прийняти кількість кожного напою, можете використовувати вже відомий нам підхід зі сканером


     */

    public static void main(String[] args) {

        // option1 when user has to choose only 1 drink

        int price = 0;
        int quantity;
        int total;

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose among 3 drinks: espressp, latte, or capuchino");
        String drink = scan.nextLine();
        System.out.println("Choose the amount of this drink");
        quantity = scan.nextInt();


        if ((drink.equals("Espresso")) || drink.equals("Latte") || drink.equals("Capuchino")){

            if (drink.equals("Espresso")){
                price = 3;
            }
            else if (drink.equals("Latte")){
                price = 4;
            }
            else if (drink.equals("Capuchino")){
                price = 5;
            }
            total = price * quantity;
            System.out.println(total);
        }
        else {
            System.out.println("Sorry we don't offer that");
        }


        // option 2 when user can choose any amount of any drink
        int pricePerDrink = 0;
        int totalSum;
        int espressoPrice = 3;
        int lattePrice = 4;
        int capuchinoPrice = 5;

        System.out.println("--------2 option --------");
        System.out.println("How many cups of Espresso would you like");
        int espressoCount = scan.nextInt();
        System.out.println("How many cups of Latte would you like?");
        int latteCount = scan.nextInt();
        System.out.println("How many cups of Capuchino would you like?");
        int cappuchinoCount = scan.nextInt();  // скільки капучино;


       totalSum = (espressoPrice*espressoCount) + (lattePrice*latteCount) + (capuchinoPrice * cappuchinoCount);
       System.out.println(totalSum);



    }
}
