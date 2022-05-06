package sg.kata.sgkata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sg.kata.sgkata.service.TraitementBankAccountService;

@SpringBootApplication
public class SgkataApplication implements CommandLineRunner {

	@Autowired
	TraitementBankAccountService traitementBankAccountService;

	public static void main(String[] args) {
		SpringApplication.run(SgkataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		traitementBankAccountService.initClient();
		traitementBankAccountService.initAccount();
		traitementBankAccountService.initTransaction();
	}
}
