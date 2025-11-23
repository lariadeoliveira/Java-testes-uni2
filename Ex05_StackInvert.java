import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Ex05_StackInvert {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite produtos separados por vírgula:");
        String[] parts = sc.nextLine().split(",");
        for (String p : parts) {
            if (!p.trim().isEmpty()) produtos.add(p.trim());
        }
        System.out.println("Ordem original: " + produtos);

        Stack<String> pilha = new Stack<>();
        for (String p : produtos) {
            pilha.push(p);
        }

        ArrayList<String> invertida = new ArrayList<>();
        while (!pilha.isEmpty()) {
            invertida.add(pilha.pop());
        }
        System.out.println("Ordem invertida (usando pilha): " + invertida);
        sc.close();
    }
}
