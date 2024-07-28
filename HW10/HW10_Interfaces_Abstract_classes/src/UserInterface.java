import java.util.HashSet;
public interface UserInterface {
    // Визначте методи без тіла для отримання імені користувача, контактів, повідомлень.
    // Визначте методи для додавання контакту, відправлення повідомлення, отримання повідомлення.

    public String getUserName();

    public void setUserName(String name);
    public void getUserContacts();
    public void getUserMessages();

    public void addContact(String phone, User contact);
    public void deleteContact(String phone);
    public void deleteContact(User contact);


    public void sendMessage(String messageText, User receiver);
    public void receiveMessage(Message message);

    public void deleteMessageSpam();
}
