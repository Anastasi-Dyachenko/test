package lesson12;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("test", 12);
        user.getAge();
        user1.getName();
        System.out.println(user1);
        User user2 = User.builder()
                .age(12)
                .name("sji")
                .build();

        System.out.println(user2);
    }
}
