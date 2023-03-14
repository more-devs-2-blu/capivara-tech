package nfsetimbo.capivaratech;

import nfsetimbo.capivaratech.service.WebClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapivaraTechApplication  implements CommandLineRunner {

	@Autowired
	WebClientService webClientService;
	public static void main(String[] args) {
		SpringApplication.run(CapivaraTechApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		webClientService.sendXmlRequest();
	}
}
