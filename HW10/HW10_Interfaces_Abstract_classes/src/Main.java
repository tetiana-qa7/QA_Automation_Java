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

        User alex = new User("Alex");
        User anna = new User("Anna");
        User alice = new User("Alice");

        alex.addContact("0999999999", anna);
        alice.addContact("099999554", alex);


        alex.sendMessage("Hello, it's me, Alex", anna);
        anna.readLastMessage();// READ
        //anna.readLastMessage();// exception, no unread messages left
        //alex.sendMessage("hello, allice", alice);// exception, not in the contacts

        alex.sendMessage("I didn't get answer", anna);
        alex.addContact("099999", alice);
        alex.sendMessage("Hello, it's me, Alex", alice);


        alex.getUserMessages();

        alex.getUserContacts();
        alice.getUserContacts();

        alex.deleteContact("0999999999");
        //alex.deleteContact("94904");//exception
        //alex.deleteContact(anna);// exception

        alex.sendMessage("Spam .....", alice);
        alice.deleteMessageSpam();
        alice.getUserMessages();

        alex.getUserMessages();

        alex.sortMessages();
        alice.filterMessages(MessageStatuses.RECEIVED);






    }
}