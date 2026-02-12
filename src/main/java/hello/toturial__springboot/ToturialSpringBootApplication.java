package hello.toturial__springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class ToturialSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToturialSpringBootApplication.class, args);
    }

    @GetMapping("/h")
    public String home() {
        return "Hello MengK";
    }
}