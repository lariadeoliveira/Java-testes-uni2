import java.util.ArrayList;
import java.util.Scanner;

public class Ex01_InvertList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite itens da lista separados por vírgula (ex: tarefa1, tarefa2, tarefa3):");
        String line = sc.nextLine();
        for (String s : line.split(",")) {
            list.add(s.trim());
        }
        System.out.println("Lista original: " + list);

        // Inverter sem usar métodos prontos
        ArrayList<String> inverted = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            inverted.add(list.get(i));
        }
        System.out.println("Lista invertida: " + inverted);
        sc.close();
    }
}
