import java.util.Map;

public class GuestAuthHandler extends AuthHandler {
    @Override
    public void handle(Account user, Map<String, String> adminsAccounts, Map<String, String> usersAccounts) {
        if (user.getAccessType() == Account.AccessType.Guest) {
            System.out.println("Guest access provided!");
        } else {
            super.handle(user, adminsAccounts, usersAccounts);
        }
    }
}