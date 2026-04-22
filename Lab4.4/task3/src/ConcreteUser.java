public class ConcreteUser implements User {
    final private String userId;
    private static final ChatMediator mediator = new ChatRoom();

    public ConcreteUser(String userId) {
        this.userId = userId;
        mediator.addUser(this);
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.sendMessageAll(message, userId);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.sendMessage(message, userId, userTo);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}