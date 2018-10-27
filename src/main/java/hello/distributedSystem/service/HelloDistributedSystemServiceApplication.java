package hello.distributedSystem.service;

import hello.distributedSystem.common.queue.ActiveMQConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({ActiveMQConfig.class})
public class HelloDistributedSystemServiceApplication {

	public static void main(String[] args) {
        SpringApplication.run(HelloDistributedSystemServiceApplication.class, args);
	}

}
