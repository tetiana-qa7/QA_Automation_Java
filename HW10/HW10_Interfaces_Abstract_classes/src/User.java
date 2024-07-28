import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;

public class User implements UserInterface{

    private String name;
    private HashMap<String, User> contacts = new HashMap<>(); // null pointer exeception
    private ArrayList<Message> messages = new ArrayList<>(); ;// null pointer exception


    public User(String name) {
        setUserName(name);
    }

    @Override
    public String getUserName() {
        return name;
    }

    @Override
    public void setUserName(String name){
        this.name = name;
    }

    @Override
    public void addContact(String phone, User contact) {
        contacts.put(phone, contact);
        System.out.println("HashMap of contacts: " + contacts);
        System.out.println("---");

    }

    public void deleteContact(String phone) {
        if (contacts.containsKey(phone)) {
            contacts.remove(phone);
            System.out.println("HashMap of contacts WHAT IS LEFT: " + contacts);
            System.out.println("---");
        } else {
            throw new IllegalArgumentException("Sorry, you don't have this phone in your contacts");
        }

    }

    public void deleteContact(User user) {
        if (contacts.containsValue(user)) {
            contacts.remove(user);
            System.out.println("HashMap of contacts WHAT IS LEFT: " + contacts);
            System.out.println("---");
        } else {
            throw new IllegalArgumentException("Sorry, you don't have this user in your contacts");
        }
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
    public void sendMessage(String messageText, User receiver) {
        if (contacts.containsValue(receiver)) { // відправити можна тільки контактам
            Message message = new Message(messageText, this, receiver); // cтворюємо меседж всередині методу,  а не приймаємо його як параметр
            messages.add(message); // щоб поповнити собі арей ліст меседжів новим меседжем
            receiver.messages.add(message); // щоб поповнити ресіверу арей ліст меседжів
            message.setMessageStatus(MessageStatuses.SENT);// для відправемка цей меседж стане відправленим
            receiver.receiveMessage(message); // пасивна дія, для отримувача цей меседж стане ресівд
        } else {
            throw new IllegalArgumentException("You can't send message to someone who is not in your contacts");
        }

    }

    @Override
    public void receiveMessage(Message message) {
            message.setMessageStatus(MessageStatuses.RECEIVED);
        System.out.println("I'm " + message.getReceiverName() + " received a new unread message from" + message.getSenderName());
    }

    public void readLastMessage() {
        Message message = messages.get(messages.size() - 1); // отримуємо останнє повідомлення
        if (!message.getMessageStatus().equals(MessageStatuses.READ)) { // перевірити що вже не прочитано
            System.out.println(message);
            message.setMessageStatus(MessageStatuses.READ);
            System.out.println(message.getMessageStatus());
            System.out.println("---");
        } else {
            throw new IllegalCallerException("No messages to read");
        }
    }


    public void deleteMessageSpam(){
        messages.removeIf(entry -> entry.getMessage().startsWith("Spam"));
        System.out.println("Spam is deleted");
    }


    public String toString() {
        return "User{" +
                "userName='" + name + '}';
    }

    public void sortMessages(){
        // Sort the messages by their status
        //NB!!!!
        //Collections.sort(list, Comparator.comparing(ClassName::methodName));
        System.out.println("____");
        Collections.sort(messages, Comparator.comparing(Message::getMessageStatus));

        getUserMessages();
    }

    public void filterMessages(MessageStatuses status){
        for (Message element : messages){
            if(element.getMessageStatus().equals(status)) {
                System.out.println("Messages that are correspondent to the set status are " + element.toString());
            }
        }
        //System.out.println(messages.toString()); і так, і так піде
        System.out.println("---");
    }
}
