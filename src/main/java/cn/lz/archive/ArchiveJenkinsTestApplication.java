package cn.lz.archive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ArchiveJenkinsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArchiveJenkinsTestApplication.class, args);
	}
	

    @RequestMapping("/index")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
