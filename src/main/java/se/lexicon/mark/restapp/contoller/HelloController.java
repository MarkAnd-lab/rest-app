package se.lexicon.mark.restapp.contoller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    //@RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping("/hello")
    public String greeting(){
        return "Hello World Wide Web";
    }
}
