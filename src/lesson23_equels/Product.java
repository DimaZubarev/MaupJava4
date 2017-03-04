package lesson23_equels;
public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // equals and hashCode написані самостійно
    /*@Override
    public boolean equals(Object obj) {
        Product other = (Product)obj;
        return (this.price == other.price && this.name.equals(other.name)); // цей варіант швидший
        //return (this.name.equals(other.name) && this.price == other.price); // цуй варіант повільніший
    }

    @Override
    public int hashCode() {
        return name.hashCode() + price;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
