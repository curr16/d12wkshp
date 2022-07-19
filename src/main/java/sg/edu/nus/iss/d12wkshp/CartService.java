package sg.edu.nus.iss.d12wkshp;

import java.util.List;
import java.util.ArrayList;


public class CartService {

    String n;
    int i;

    public List<Item> getShoppingItems() {
        List<Item> lstItems = new ArrayList<>();
        
        Item itm = new Item();
      
        itm.setItemName("Prada Bag");
        itm.setQuantiy(5);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Wallet");
        itm.setQuantiy(2);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Airpods");
        itm.setQuantiy(10);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Macbook");
        itm.setQuantiy(3);
        lstItems.add(itm);

        itm = new Item();
        itm.setItemName("Chanel Wallet");
        itm.setQuantiy(6);
        lstItems.add(itm);

        return lstItems;
    
        }
}
