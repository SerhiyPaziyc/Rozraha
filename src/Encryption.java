import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Encryption {

    // Метод для шифрування повідомлення за допомогою 3-DES у режимі ECB
    public static byte[] encrypt(String message, SecretKey secretKey) throws NoSuchAlgorithmException, InvalidKeyException, Exception {
        // Створюємо екземпляр шифру
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");

        // Ініціалізуємо шифр в режимі шифрування та передаємо секретний ключ
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Зашифровуємо повідомлення та повертаємо результат
        return cipher.doFinal(message.getBytes());
    }
}
