package jp.te4a.spring.boot.myapp1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Hello world!
 *
 */
@RestController
public class HelloController
{
	@RequestMapping("/index")
	public String index() {
		return "Hello, Spring Boot!";
	}
}