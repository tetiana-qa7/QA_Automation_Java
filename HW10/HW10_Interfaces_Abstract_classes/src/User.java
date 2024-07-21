import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;

public class User implements UserInterface{

    private String name;
    private HashMap<String, User> contacts;
    private ArrayList<Message> messages;


    public User(String name) {
        contacts = new HashMap<>(); // null pointer exeception
        messages = new ArrayList<>();// null pointer exception
        this.name = name;
    }

    // Додайте метод для читання повідомлення,
    // який змінює його статус на "прочитане".
    @Override
    public String getUserName() {
        return name;
    }

    @Override
    public void addContact(String phone, User contact) {
        contacts.put(phone, contact);
        System.out.println("HashMap of contacts: " + contacts);
        System.out.println("---");

    }

    public void deleteContact(String phone, User contact){
        contacts.remove(phone, contact);
        System.out.println("HashMap of contacts WHAT IS LEFT: " + contacts);
        System.out.println("---");

    }
    @Override
    public void getUserContacts() {
        System.out.println("Hashmap of contacts" + contacts);
        System.out.println("***");
    }

    @Override
    public void getUserMessages() {
        for (Message element : messages){
           System.out.println("Message is the following " + element.toString());
        }
        //System.out.println(messages.toString()); і так, і так піде
        System.out.println("---");
    }


    @Override
    public void sendMessage(Message message, User receiver) {
        message.setMessageStatus(MessageStatuses.SENT);
        message.getMessageStatus();
        message.setSender(this);
        message.setReceiver(receiver);
        message.getSender();
        messages.add(message); // щоб поповнити собі арей ліст меседжів новим меседжем
    }

    @Override
    public void getMessage(Message message) {
        System.out.println("Getting a message");
        System.out.println("The message you are sending is: " + message.getMessage());
        message.setMessageStatus(MessageStatuses.RECEIVED);
        message.getMessageStatus();
        message.getReceiver();
    }

    public void deleteMessage(Message message){
        messages.removeIf(entry -> "enemy".equals(entry.getMessage()));
    }

    public void deleteMessageSpam(Message message){
        messages.removeIf(entry -> entry.getMessage().startsWith("Spam"));
    }


    public void readMesage(Message message){
        message.setMessageStatus(MessageStatuses.READ);
        message.getMessageStatus();
        System.out.println("---");
    }

    public String toString() {
        return "User{" +
                "userName='" + name + '}';
    }

    public void filterMessages(){
        // Sort the messages by their status
        //NB!!!!
        //Collections.sort(list, Comparator.comparing(ClassName::methodName));
        System.out.println("____");
        Collections.sort(messages, Comparator.comparing(Message::getMessageStatus));

        getUserMessages();
    }
}
