/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bruteforceattack;
import java.util.*;
public class BruteForceAttack {
 static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String decrypt(String cipherText, String key) {
        StringBuilder plainText = new StringBuilder();
        for (char c : cipherText.toCharArray()) {
            int index = key.indexOf(c);
            if (index != -1) {
                plainText.append(ALPHABET.charAt(index));
            } else {
                plainText.append(c);
            }
        }
        return plainText.toString();
    }

    public static void bruteForceAttack(String cipherText) {
        System.out.println("\nAttempting brute-force attack...");
        
        List<String> sampleKeys = Arrays.asList(
            "ZYXWVUTSRQPONMLKJIHGFEDCBA", 
            "QWERTYUIOPLKJHGFDSAZXCVBNM"
        );

        for (String key : sampleKeys) {
            String decryptedText = decrypt(cipherText, key);
            System.out.println("Key: " + key + " -> " + decryptedText);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encrypted text: ");
        String cipherText = scanner.nextLine().toUpperCase();

        bruteForceAttack(cipherText);

        scanner.close();
    }
}
