
import model.Product;

public class Main {

    public static void main(String[] args) {
        System.out.println("ALME Backend running");
        Product p1 = new Product(
                "Mini Projector",
                89.90,
                "AliExpress",
                92
        );

        System.out.println("Product created:");
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());

    }
}
