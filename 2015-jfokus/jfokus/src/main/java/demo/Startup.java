package demo;

import hello.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Stephane Nicoll
 */
@Component
public class Startup implements CommandLineRunner {

	private final HelloService helloService;

	@Autowired
	public Startup(HelloService helloService) {
		this.helloService = helloService;
	}

	@Override
	public void run(String... args) throws Exception {
		this.helloService.sayHello();
	}

}
