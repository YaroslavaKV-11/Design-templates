public interface ChatMediator {
    void addUser(ConcreteUser user);
    void sendMessageAll(String message, String userFrom);
    void sendMessage(String message, String userFrom, String userTo);
    void sendMessageGroup(String message, String userFrom, String role);
}