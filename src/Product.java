import java.util.Objects;

public class Product {

    private String name;
    private String sku;

    public Product(String name, String sku) {
        this.name = name;
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Product other = (Product) obj;
        return this.sku.equals(other.getSku());
    }
}
