package week11

import java.util.ArrayList;
import java.util.Scanner;
import exceptions.AuthenticationException;
import exceptions.ExcessiveFailedLoginException;
import exceptions.InvalidPropertyException;

public class Main {
    private static ArrayList<User> listOfUsers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initialize();

        while (true) {
            System.out.println("Menu Utama");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    handleLogin();
                    break;
                case 2:
                    handleSignUp();
                    break;
                case 0:
                    System.out.println("Terima Kasih!");
                    return; 
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void initialize() {
        User defaultUser = new User("John", "Doe", 'L', "Jl. Merpati No. 1 RT 1 RW 1, Banten", "admin", "admin");
        listOfUsers.add(defaultUser);
        System.out.println("User default berhasil ditambahkan!");
    }

    private static void handleLogin() {
        try {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean loginSuccess = false;

            for (User user : listOfUsers) {
                try {
                    if (user.login(username, password)) {
                        System.out.println(user.greeting());
                        loginSuccess = true;
                        break;
                    }
                } catch (ExcessiveFailedLoginException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }

            if (!loginSuccess) {
                throw new AuthenticationException("Username atau password salah!");
            }

        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void handleSignUp() {
        try {
            System.out.print("Nama Depan: ");
            String firstName = scanner.nextLine();
            System.out.print("Nama Belakang: ");
            String lastName = scanner.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            char gender = scanner.nextLine().toUpperCase().charAt(0);
            System.out.print("Alamat: ");
            String address = scanner.nextLine();
            System.out.print("Username: ");
            String userName = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (password.length() < 6 || password.length() > 16) {
                throw new InvalidPropertyException("Password harus mengandung huruf besar, angka, dan panjang 6-16 karakter.");
            }

            User newUser = new User(firstName, lastName, gender, address, userName, password);
            listOfUsers.add(newUser);
            System.out.println("User berhasil didaftarkan!");

        } catch (InvalidPropertyException e) {
            System.out.println(e.getMessage());
        }
    }
}
