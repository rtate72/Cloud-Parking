package one.digitalinnovation.CloudParking.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/")
@ApiIgnore
public class HelloController {

    @GetMapping
    public String hello(){
        return "Bem vindo ao nosso projeto";
    }

}