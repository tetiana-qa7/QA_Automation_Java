import java.util.HashSet;
public interface UserInterface {
    // Визначте методи без тіла для отримання імені користувача, контактів, повідомлень.
    // Визначте методи для додавання контакту, відправлення повідомлення, отримання повідомлення.

    public String getUserName();
    public void getUserContacts();
    public void getUserMessages();

    public void addContact(String phone, User contact);
    public void deleteContact(String phone, User contact);


    public void sendMessage(Message message, User receiver);
    public void getMessage(Message message);

    public void deleteMessage(Message message);
    public void deleteMessageSpam(Message message);
}
