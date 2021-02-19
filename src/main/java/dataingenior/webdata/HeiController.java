package dataingenior.webdata;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeiController {
    @GetMapping("/")
    public String hei(String navn){
        return "hei verden " + navn + "!";
    }
}
