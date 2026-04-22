import java.util.HashMap;
import java.util.Map;

public class AdvancedChatRoom implements ChatMediator {
    private final Map<String, ConcreteUser> users = new HashMap<>();

    @Override
    public void addUser(ConcreteUser user) {
        users.put(user.getUserId(), user);
    }

    @Override
    public void sendMessageAll(String message, String userFrom) {
        for (ConcreteUser user : users.values()) {
            if (!user.getUserId().equals(userFrom)) {
                user.receiveMassage(message, userFrom);
            }
        }
    }

    @Override
    public void sendMessage(String message, String userFrom, String userTo) {
        ConcreteUser user = users.get(userTo);
        if (user != null) {
            user.receiveMassage(message, userFrom);
        }
    }

    @Override
    public void sendMessageGroup(String message, String userFrom, String role) {
        for (ConcreteUser user : users.values()) {
            if (user.getRole().equals(role) && !user.getUserId().equals(userFrom)) {
                user.receiveMassage(message, userFrom);
            }
        }
    }
}