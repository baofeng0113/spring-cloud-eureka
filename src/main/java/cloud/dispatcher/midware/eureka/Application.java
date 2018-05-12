package cloud.dispatcher.midware.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
		SpringApplication.run(Application.class, args);
        LOGGER.info("Spring boot application startup, cost: {}ms",
                System.currentTimeMillis() - currentTimeMillis);
	}
}
