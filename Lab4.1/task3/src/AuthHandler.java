import java.util.Map;

public abstract class AuthHandler {
    protected AuthHandler next;

    public AuthHandler setNext(AuthHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Account user, Map<String, String> adminsAccounts, Map<String, String> usersAccounts) {
        if (next != null) {
            next.handle(user, adminsAccounts, usersAccounts);
        }
    }
}