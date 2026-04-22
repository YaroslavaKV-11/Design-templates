public class Client {
    public static void main(String[] args) {
        ConcreteUser user1 = new ConcreteUser("User1", "admin");
        ConcreteUser user2 = new ConcreteUser("User2", "moderator");
        ConcreteUser user3 = new ConcreteUser("User3", "admin");
        ConcreteUser user4 = new ConcreteUser("User4", "user");

        user1.sendMessageAll("Hello, world!");
        user2.sendMessage("Hello!", "User1");
        user1.sendMessageGroup("Message for admins only", "admin");
    }
}