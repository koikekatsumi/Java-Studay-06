package org.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodmorningController {
    @GetMapping("/goodmorning")
public  String goodmorning(){
        return "Goodmorning koike";
    }
}
