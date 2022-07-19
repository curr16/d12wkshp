package sg.edu.nus.iss.d12wkshp;

import java.util.Date;
//import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path= {"/indexresource", "/indexresource.html"})

public class IndexResource {

    @GetMapping(produces = {"text/html"})
    public String index(Model model) {
        model.addAttribute("CurrTime", (new Date().toString()));

        // Calendar cal = new Calendar;
        // //String attributeName;
        // model.addAttribute("CurrHour", cal.get(Calendar.HOUR_OF_DAY));

        return "indexresource";
    }

    
}
