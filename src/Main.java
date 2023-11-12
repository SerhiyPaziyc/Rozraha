import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        try {
            // Генеруємо ключ
            SecretKey secretKey = KeyGenerator.generateKey();

            // Зчитуємо повідомлення від користувача
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть повідомлення для шифрування:");
            String message = scanner.nextLine();

            // Шифруємо повідомлення
            byte[] encryptedMessage = Encryption.encrypt(message, secretKey);

            // Виводимо зашифроване повідомлення у вигляді Base64
            System.out.println("Зашифроване повідомлення: " + Base64.getEncoder().encodeToString(encryptedMessage));

            // Розшифровуємо повідомлення
            String decryptedMessage = Decryption.decrypt(encryptedMessage, secretKey);
            System.out.println("Розшифроване повідомлення: " + decryptedMessage);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
