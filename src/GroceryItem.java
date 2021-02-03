import java.util.Arrays;
import java.util.List;


public class GroceryItem {

    private String name;
    private double price;
    private String category;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        if(name.length() > 1)
            this.name = name;
        else
            throw new IllegalArgumentException("Must be a valid name");
    }


    public void setPrice(double price) {
        if (price > 0 && price < 150)
        this.price = price;
        else
            throw new IllegalArgumentException("Price must be between 0 and 150");
    }

    public void setCategory(String category) {
        category = category.toLowerCase();
        if (getValidCategories().contains(category));
        this.category = category;
    }

    public static List<String> getValidCategories() {
        return Arrays.asList("vegetable","fruit","meat","fish","dairy","bread");
    }

    public String toString() {
        return name + " Category: " + category + " Price:" + price + "$";
    }


}
