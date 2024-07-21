import java.util.Objects;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

       // Створіть кілька користувачів.
        // Додайте контакти для кожного користувача.
        // Відправте повідомлення між користувачами.
        // Виведіть список повідомлень кожного користувача із зазначенням статусу.
        // Викличте метод для "прочитування повідомлень" від імені користувачів,
        // які отримали повідомлення та перевірте статус цих повідомлень після прочитання.

        User tania = new User("Tania");
        User artem = new User("Artem");
        User mum = new User("Mum");

        tania.addContact("0999999999", artem);
        tania.addContact("099994444", mum); // Tania - 2 contacts
        artem.addContact("099999554", tania);


        Message firstMessage = new Message("Hello, it's me");
        Message secondMessage = new Message("Bye Bye");
        Message thirdMessage = new Message("Spam this is spam");
        Message fourthMessage = new Message("enemy");
        Message fifthMessage = new Message("test");
        Message six = new Message("new text");

        tania.sendMessage(firstMessage, artem);
        artem.getMessage(firstMessage);
        artem.readMesage(firstMessage);// READ

        tania.sendMessage(secondMessage, mum);
        tania.sendMessage(thirdMessage, artem);
        tania.sendMessage(fourthMessage, artem);

        tania.getUserMessages();

        tania.getUserContacts();
        artem.getUserContacts();

        tania.deleteContact("099994444", mum);

        tania.deleteMessageSpam(thirdMessage);
        tania.getUserMessages();

        tania.deleteMessage(fourthMessage);
        tania.getUserMessages();

        tania.sendMessage(secondMessage, artem);
        artem.getMessage(secondMessage);//RECEIVED

        tania.sendMessage(fifthMessage, artem);
        artem.getMessage(fifthMessage);//RECEIVED

        tania.sendMessage(six, artem); // SENT



       tania.filterMessages();





    }
}