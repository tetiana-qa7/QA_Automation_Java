import java.util.Scanner; // не забудь!!!
public class ChoiceOfDish {
    /*
    Ви в ресторані і обираєте страву на основі типу страви, який вам подобається.
    Є чотири основні типи страв: закуска, основна страва, десерт і напій.
    В залежності від обраного типу, програма виведе відповідну страву.
    Напишіть програму, яка приймає тип страви (ціле число від 1 до 4)
    і виводить назву страви з використанням оператора switch.
     */
    public static void main(String[] args) {
        int dishType;
        String dish = "a";

        Scanner scan = new Scanner(System.in);
        System.out.println("Which type of dish do you want. Choose one of the options: 1 - appetizer, 2 - main course, 3 - dessert, 4 -drink");
        dishType = scan.nextInt();

        switch (dishType){
            case 1:
                dish = "Salo";
                break;
            case 2:
                dish = "Borsh";
                break;
            case 3:
                dish = "Honey";
                break;
            case 4:
                dish = "Compot";
                break;
            default:
                System.out.println("We don't offer that");
        }
        System.out.println(dish + " is a great choice!");
        
    }

}

