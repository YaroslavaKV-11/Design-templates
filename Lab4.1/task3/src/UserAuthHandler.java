import java.util.Map;

public class UserAuthHandler extends AuthHandler {
    @Override
    public void handle(Account user, Map<String, String> adminsAccounts, Map<String, String> usersAccounts) {
        if (user.getAccessType() == Account.AccessType.User) {
            String userLogin = user.getLogin();
            String userPassword = user.getPassword();
            String passwordFromUserStorage = usersAccounts.get(userLogin);

            if (userPassword.equals(passwordFromUserStorage)) {
                System.out.println("User access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }
        } else {
            super.handle(user, adminsAccounts, usersAccounts);
        }
    }
}