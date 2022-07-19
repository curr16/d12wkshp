package sg.edu.nus.iss.d12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path= {"/indexresource", "/indexresource.html"})

public class IndexResource {

    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        return "indexresources";
        
    }

    
}
