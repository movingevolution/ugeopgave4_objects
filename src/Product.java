import java.util.Arrays;

public class Product {

    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Tag: " + Arrays.toString(this.tags));
    }

    public boolean hasTag(String tag){
        for(String t : tags) {
            if(t.equals(tag)) {
                return true;
            }
        }
        return false;
    }


}
