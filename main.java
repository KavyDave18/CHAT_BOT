import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Send Message");
            System.out.println("4. View Messages");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String newUsername = sc.nextLine().trim();
                    System.out.print("Enter password: ");
                    String newPassword = sc.nextLine().trim();

                    if (newUsername.isEmpty() || newPassword.isEmpty()) {
                        System.out.println("Username and password cannot be empty.");
                        break;
                    }

                    User newUser = new User(newUsername, newPassword);
                    if (newUser.registerUser()) {
                        System.out.println("Registration successful!");
                    } else {
                        System.out.println("Registration failed. Username might already exist or there was a database error.");
                    }
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = sc.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = sc.nextLine();
                    if (User.loginUser(loginUsername, loginPassword)) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Invalid credentials.");
                    }
                    break;

                case 3:
                    System.out.print("Enter your username: ");
                    String sender = sc.nextLine();
                    System.out.print("Enter recipient's username: ");
                    String receiver = sc.nextLine();
                    System.out.print("Enter your message: ");
                    String message = sc.nextLine();
                    Messaging.sendMessage(sender, receiver, message);
                    break;

                case 4:
                    System.out.print("Enter your username: ");
                    String user = sc.nextLine();
                    Messaging.viewMessages(user);
                    break;

                case 5:
                    running = false;
                    System.out.println("Thank you! Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        sc.close();
    }
}
