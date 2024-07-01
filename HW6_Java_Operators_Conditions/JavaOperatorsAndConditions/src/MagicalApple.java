import java.util.Scanner;

public class MagicalApple {
    /*
    Задача 1: Магічне яблуко
В уявному світі є магічне яблуко, яке може дати різну кількість енергії в залежності від того,
яка година зараз.
Якщо це ранок (з 6 до 12 годин), яблуко дає 10 одиниць енергії.
Вдень (з 12 до 18 годин) – 20 одиниць енергії.
Ввечері (з 18 до 24 годин) – 30 одиниць енергії.
Вночі (з 0 до 6 годин) – 5 одиниць енергії.
Напишіть програму, яка приймає поточний час (годину у 24-годинному форматі)
і виводить, скільки енергії ви отримаєте від магічного яблука.
     */
    public static void main(String[] args) {
        int hour;
        int energyAmount = 0;

        Scanner scan = new Scanner(System.in); // create scanner
        System.out.println("Enter the current hour (0-23)");
        hour = scan.nextInt(); // get number

        if (hour >=0 && hour <= 23){
            if (hour >=0 && hour <6){
                energyAmount = 5;
            } else if (hour >=6 && hour < 12) {
                energyAmount = 10;
            }
            else if (hour >= 12 && hour < 18){
                energyAmount = 20;
            }
            else if (hour >= 18 && hour <= 23) {
                energyAmount = 30;
            }
            System.out.println("It's " + hour + " hour, so you get " + energyAmount + " energy amount");
        }
        else {
            System.out.println("Sorry. You've entered the hour in incorrect format!");
        }


    }

}
