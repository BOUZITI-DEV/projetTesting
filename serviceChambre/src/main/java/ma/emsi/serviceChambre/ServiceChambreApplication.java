package ma.emsi.serviceChambre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceChambreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceChambreApplication.class, args);
	}

}
