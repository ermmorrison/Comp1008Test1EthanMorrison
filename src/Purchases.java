import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Purchases {

    private ArrayList<GroceryItem> purchases;



    public void AddGroceryItem()
    {
        purchases = new ArrayList<>();
        int itemNum = purchases.size() - 1;
    }


    public void getTotalPrice(){

    }

    public List<ArrayList<GroceryItem>> getGroceryNames(){
        return Arrays.asList(purchases);
    }

    public static List<String> getCategories() {
        return Arrays.asList("vegetable","fruit","meat","fish","dairy","bread");
    }

    public String toString(){
        return "The Grocery List has " + itemNum + " items with a total of $" + totalPrice;
    }

}
