public interface MessageInterface {
    //Методи без тіла для отримання відправника, отримувача, тексту повідомлення.
    // Визначте методи для отримання та встановлення статусу повідомлення.

    public String getSenderName();
    public String getReceiverName();

    public void setSender(User sender);
    public void setReceiver(User receiver);

    public String getMessage();

    public MessageStatuses getMessageStatus();

    public void setMessageStatus(MessageStatuses status);


}
