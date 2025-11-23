import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex07_OrderArrival {
    public static void main(String[] args) {
        Queue<String> clientes = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nomes de clientes separados por vírgula (simular chegada):");
        String[] parts = sc.nextLine().split(",");
        for (String p : parts) {
            if (!p.trim().isEmpty()) clientes.add(p.trim());
        }

        System.out.println("Ordem de atendimento de saída:");
        while (!clientes.isEmpty()) {
            System.out.println(clientes.poll());
        }
        sc.close();
    }
}
