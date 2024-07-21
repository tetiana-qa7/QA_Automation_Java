import java.util.Comparator;
import java.util.Collections;

public class Message implements MessageInterface{
    private User sender;
    private User receiver;
    private String messageText;

    private MessageStatuses status;

    Message(String messageText){
        this.messageText = messageText;
    }


    public String getSender() {
        return sender.getUserName();
    }

    public void setSender(User sender){
        this.sender = sender;
    }

    @Override
    public String getReceiver() {
        return receiver.getUserName();
    }


    public void setReceiver(User receiver){
        this.receiver = receiver;
    }

    @Override
    public String getMessage() {
       return messageText;
    }

    @Override
    public MessageStatuses getMessageStatus() {
        return this.status;
    }

    @Override
    public void setMessageStatus(MessageStatuses status) {
            this.status = status;
        System.out.println("New status set successfully");
    }

    public String toString() {
        return "Message{" +
                "content='" + messageText + '\'' +
                ", status=" + status +
                ", sender=" + getSender() +
                ", receiver=" + getReceiver() +
                '}';
    }

}
