import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/** 
 * June 10th, 2021
 * ICS3U1
 * American Encryption Standard Algorithm for encryption
 * @author Bonny Chen
 */

public class AESAlgorithm {
    
    // AES Algorithm 
    public static String algorithm = "AES";
    
    // Global byte variable
    public byte[] keyValue;
    
    public AESAlgorithm(byte key[]) {
        
        // Byte array from Encryption.java stored in key byte array
        keyValue = key;

    }
    
    // Method that generates a new encryption key
    public Key generateKey() throws Exception {

        Key key = new SecretKeySpec(keyValue, algorithm);
        
        return key; // Returns key 

    }
    
    // Method that encypts string entered using the AES algorithm
    public String encrypt(String msg) throws Exception {

        Key key = generateKey();
        Cipher c = Cipher.getInstance(algorithm);
        c.init(Cipher.ENCRYPT_MODE, key); // Initialize cipher object to encryption mode
        byte[] encValue = c.doFinal(msg.getBytes());
        String encryptedValue = Base64.getEncoder().encodeToString(encValue);
        
        return encryptedValue; // Returns encrypted string

    }
    
    // Method that decypts string entered using the AES algorithm
    public String decrypt(String msg) throws Exception {

        Key key = generateKey();
        Cipher c = Cipher.getInstance(algorithm);
        c.init(Cipher.DECRYPT_MODE, key); // Initialize cipher object to decryption mode
        byte[] decordedValue = Base64.getDecoder().decode(msg); 
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        
        return decryptedValue; // Returns decrypted string
        
    }

}
