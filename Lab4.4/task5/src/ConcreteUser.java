public class ConcreteUser implements User {
    final private String userId;
    final private String role;
    private static final ChatMediator mediator = new AdvancedChatRoom();

    public ConcreteUser(String userId, String role) {
        this.userId = userId;
        this.role = role;
        mediator.addUser(this);
    }

    public String getUserId() {
        return userId;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.sendMessageAll(message, userId);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.sendMessage(message, userId, userTo);
    }

    public void sendMessageGroup(String message, String role) {
        mediator.sendMessageGroup(message, userId, role);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}