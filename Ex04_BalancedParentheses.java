import java.util.Scanner;
import java.util.Stack;

public class Ex04_BalancedParentheses {

    public static boolean estaBalanceada(String expr) {
        Stack<Character> pilha = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.isEmpty()) return false;
                char topo = pilha.pop();
                if ((c == ')' && topo != '(') ||
                    (c == ']' && topo != '[') ||
                    (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a expressão:");
        String expressao = sc.nextLine();
        boolean balanceada = estaBalanceada(expressao);
        if (balanceada) {
            System.out.println("Parênteses balanceados!");
        } else {
            System.out.println("Parênteses NÃO balanceados!");
        }
        sc.close();
    }
}
