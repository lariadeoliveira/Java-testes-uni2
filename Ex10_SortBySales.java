import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProductSale {
    private String name;
    private int sales;

    public ProductSale(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (vendas: " + sales + ")";
    }
}

public class Ex10_SortBySales {
    public static List<ProductSale> mergeSort(List<ProductSale> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        List<ProductSale> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        List<ProductSale> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    private static List<ProductSale> merge(List<ProductSale> left, List<ProductSale> right) {
        List<ProductSale> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i).getSales() >= right.get(j).getSales()) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }
        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite produtos e vendas no formato nome:vendas (separado por vírgula):");
        String line = sc.nextLine();
        List<ProductSale> list = new ArrayList<>();
        for (String item : line.split(",")) {
            String[] parts = item.split(":");
            if (parts.length == 2) {
                String nome = parts[0].trim();
                int vendas = Integer.parseInt(parts[1].trim());
                list.add(new ProductSale(nome, vendas));
            }
        }

        List<ProductSale> sorted = mergeSort(list);
        System.out.println("Produtos ordenados por vendas (decrescente):");
        for (ProductSale p : sorted) {
            System.out.println(p);
        }

        sc.close();
    }
}
