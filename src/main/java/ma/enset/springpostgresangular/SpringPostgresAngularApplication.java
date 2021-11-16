package ma.enset.springpostgresangular;

import ma.enset.springpostgresangular.entities.AccountType;
import ma.enset.springpostgresangular.entities.BankAccount;
import ma.enset.springpostgresangular.repositories.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringPostgresAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPostgresAngularApplication.class, args);
    }

    @Bean
    CommandLineRunner  start(AccountRepository accountRepository){
        return  args -> {
          accountRepository.save(new BankAccount(null,8700,new Date(), AccountType.CURRENT));
            accountRepository.save(new BankAccount(null,89000,new Date(), AccountType.SAVING));
            accountRepository.save(new BankAccount(null,1200,new Date(), AccountType.CURRENT));
        };
    }
}
