package ma.emsi.serviceReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ma.emsi.serviceReservation.model.Chambre;
import ma.emsi.serviceReservation.model.User;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ServiceReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceReservationApplication.class, args);
	}

	@FeignClient(name = "SERVICE-USER")
	public interface UserService {
		@GetMapping(path = "/api/user/find/{id}")
		public User findById(@PathVariable int id);
	}
	
	@FeignClient(name = "SERVICE-CHAMBRE")
	public interface ChambreService {
		@GetMapping(path = "/api/chambre/find/{id}")
		public Chambre findById(@PathVariable int id);
	}

}
