import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02_RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nomes separados por vírgula (ex: Ana, Ana, João):");
        String[] parts = sc.nextLine().split(",");
        for (String p : parts) {
            usuarios.add(p.trim());
        }
        System.out.println("Original: " + usuarios);

        ArrayList<String> semDuplicados = new ArrayList<>();
        Set<String> vistos = new HashSet<>();
        for (String u : usuarios) {
            if (!vistos.contains(u)) {
                semDuplicados.add(u);
                vistos.add(u);
            }
        }
        System.out.println("Sem duplicados: " + semDuplicados);
        sc.close();
    }
}
