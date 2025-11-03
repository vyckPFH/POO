
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;
import java.util.Scanner;

public class Sha256Exemplo {
    
    public static String sha256(String input){
        try {
            
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(input.getBytes(StandardCharsets.UTF_8));
            return  HexFormat.of().formatHex(digest);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("algoritmo nao disponivel");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MSG secreta: ");
        String mensagem = sc.nextLine();
        String topSecret = sha256(mensagem);

        System.out.println("Mensagem codificada: "+ topSecret);
    }

}
