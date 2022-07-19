package sg.edu.nus.iss.d12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping(path= {"/cart"})
public class CartController {

    @GetMapping(produces = {"text/html"})
    public String displayCart(Model model) {
        List<Item> cartItems = getShoppingItems();
        model.addAttribute("cart", cartItems);
        return "cart";
    }

    private List<Item> getShoppingItems() {
        return null;
    }

    
}
