public interface MessageInterface {
    //Методи без тіла для отримання відправника, отримувача, тексту повідомлення.
    // Визначте методи для отримання та встановлення статусу повідомлення.

    public String getSender();
    public String getReceiver();

    public String getMessage();

    public MessageStatuses getMessageStatus();

    public void setMessageStatus(MessageStatuses status);


}
