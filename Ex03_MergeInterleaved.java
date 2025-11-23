import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_MergeInterleaved {
    public static ArrayList<String> intercalar(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> resultado = new ArrayList<>();
        int i = 0;
        while (i < a.size() || i < b.size()) {
            if (i < a.size()) resultado.add(a.get(i));
            if (i < b.size()) resultado.add(b.get(i));
            i++;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite lista A (separados por vírgula):");
        String[] aParts = sc.nextLine().split(",");
        System.out.println("Digite lista B (separados por vírgula):");
        String[] bParts = sc.nextLine().split(",");

        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        for (String s : aParts) if (!s.trim().isEmpty()) A.add(s.trim());
        for (String s : bParts) if (!s.trim().isEmpty()) B.add(s.trim());

        ArrayList<String> mesclada = intercalar(A, B);
        System.out.println("Lista mesclada (intercalada): " + mesclada);
        sc.close();
    }
}
