import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ProductRegister {

    public static void main(String[] args) {

        Collection<Product> products = new ArrayList<>();

        System.out.println("=== Product Registration ===\n");

        try (Scanner entry = new Scanner(System.in)) {
            String goOn = "yes";
            while("yes".equalsIgnoreCase(goOn)) {
                System.out.println("Name: ");
                String name = entry.nextLine();

                System.out.println("SKU: ");
                String sku = entry.nextLine();

                Product product = new Product(name, sku);
                if(products.contains(product)) {
                    System.err.println("This product was already added. Use another SKU");
                    System.err.flush();
                } else {
                    products.add(product);
                    System.out.println("Product added");
                }
                System.out.println("\nDo you wish to add another product? (yes/no) ");
                goOn = entry.nextLine();
            }
        }

        products.forEach(System.out::println);
        System.out.println("The end my friend");

    }
}
