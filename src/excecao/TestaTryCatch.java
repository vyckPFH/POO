package excecao;

public class TestaTryCatch {
    public static void main(String[] args) {
        int num =0;
        int resp;
        int vet[] = new int[5];

        try {
            resp = 25 / num;
            // resp = vet[5]+1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
        } 
    }
}
