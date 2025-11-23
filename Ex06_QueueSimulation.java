import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex06_QueueSimulation {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equals("4")) {
            System.out.println("\n1 - Adicionar paciente");
            System.out.println("2 - Chamar próximo");
            System.out.println("3 - Mostrar fila");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextLine().trim();

            switch (opcao) {
                case "1":
                    System.out.print("Nome do paciente: ");
                    fila.add(sc.nextLine().trim());
                    break;
                case "2":
                    String proximo = fila.poll();
                    if (proximo == null) {
                        System.out.println("Nenhum paciente na fila.");
                    } else {
                        System.out.println("Chamando: " + proximo);
                    }
                    break;
                case "3":
                    System.out.println("Fila atual: " + fila);
                    break;
                case "4":
                    System.out.println("Encerrando sistema de fila.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        sc.close();
    }
}
