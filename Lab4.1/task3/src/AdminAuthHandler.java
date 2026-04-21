import java.util.Map;

public class AdminAuthHandler extends AuthHandler {
    @Override
    public void handle(Account user, Map<String, String> adminsAccounts, Map<String, String> usersAccounts) {
        if (user.getAccessType() == Account.AccessType.Administrator) {
            String userLogin = user.getLogin();
            String userPassword = user.getPassword();
            String passwordFromAdminsStorage = adminsAccounts.get(userLogin);

            if (userPassword.equals(passwordFromAdminsStorage) && userPassword.length() >= 8) {
                System.out.println("Administrator access provided: " + userLogin);
            } else {
                System.out.println("Access denied: " + userLogin);
            }
        } else {
            super.handle(user, adminsAccounts, usersAccounts);
        }
    }
}