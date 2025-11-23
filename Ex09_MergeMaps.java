import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex09_MergeMaps {

    public static Map<String, Integer> merge(Map<String, Integer> a, Map<String, Integer> b) {
        Map<String, Integer> resultado = new HashMap<>(a);
        for (Map.Entry<String, Integer> e : b.entrySet()) {
            resultado.put(e.getKey(), resultado.getOrDefault(e.getKey(), 0) + e.getValue());
        }
        return resultado;
    }

    public static Map<String, Integer> parseMapa(String line) {
        Map<String, Integer> mapa = new HashMap<>();
        if (line.trim().isEmpty()) return mapa;
        for (String item : line.split(",")) {
            String[] parts = item.split(":");
            if (parts.length == 2) {
                String chave = parts[0].trim();
                int valor = Integer.parseInt(parts[1].trim());
                mapa.put(chave, valor);
            }
        }
        return mapa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite mapa A (formato chave:valor, vírgula):");
        String aLine = sc.nextLine();
        System.out.println("Digite mapa B (formato chave:valor, vírgula):");
        String bLine = sc.nextLine();

        Map<String, Integer> A = parseMapa(aLine);
        Map<String, Integer> B = parseMapa(bLine);

        Map<String, Integer> mesclado = merge(A, B);
        System.out.println("Mapa mesclado: " + mesclado);
        sc.close();
    }
}
