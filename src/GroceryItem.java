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
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
