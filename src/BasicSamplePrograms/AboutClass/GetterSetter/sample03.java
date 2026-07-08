package BasicSamplePrograms.AboutClass.GetterSetter;

public class sample03 {
    static class Product {
        private String name;
        private double price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price >= 0) {
                this.price = price;
            }
        }
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Sach Java");
        product.setPrice(120000);

        System.out.println(product.getName() + ": " + product.getPrice());
    }
}
