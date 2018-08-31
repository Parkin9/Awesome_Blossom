package pl.parkin9.awesome_blossom.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.parkin9.awesome_blossom.Model.Plant;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/home")
    @ResponseBody
    public Plant loadPlantsToIndex() {


        return null;
    }
}
