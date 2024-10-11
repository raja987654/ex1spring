package exemple.com.doker;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;

public class DockerApplication {
    public static void main (String [] args) {
        SpringApplication.run(DockerApplication.class, args) ;
    }
    @GetMapping("/Test")
    public String hello () {
        return "Hello Word" ;
    }
}
