import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Decryption {

    // Метод для розшифрування зашифрованого повідомлення за допомогою 3-DES у режимі ECB
    public static String decrypt(byte[] encryptedMessage, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException, Exception {
        // Створюємо екземпляр шифру
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");

        // Ініціалізуємо шифр в режимі розшифрування та передаємо секретний ключ
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Розшифровуємо зашифроване повідомлення та повертаємо результат
        byte[] decryptedMessage = cipher.doFinal(encryptedMessage);
        return new String(decryptedMessage);
    }
}
