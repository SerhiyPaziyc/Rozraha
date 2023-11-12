import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public class KeyGenerator {
    public static SecretKey generateKey() throws NoSuchAlgorithmException {
        javax.crypto.KeyGenerator keyGen = javax.crypto.KeyGenerator.getInstance("DESede");
        return keyGen.generateKey();
    }
}
