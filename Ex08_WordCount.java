import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex08_WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine().toLowerCase();
        frase = frase.replaceAll("[^a-z0-9\\s]", " ");
        String[] palavras = frase.split("\\s+");

        Map<String, Integer> frequencia = new HashMap<>();
        for (String palavra : palavras) {
            if (palavra.isEmpty()) continue;
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("Frequência de palavras: " + frequencia);
        sc.close();
    }
}
