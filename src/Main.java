public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Steven";
        user.lastName = "Liao";
        user.phoneNumber = 1330230;

        System.out.println("Hello! " + user.firstName + " " + user.lastName + " has a phone : " + user.phoneNumber);
    }
}
