package ma.enset.springpostgresangular.repositories;

import ma.enset.springpostgresangular.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface AccountRepository extends JpaRepository<BankAccount,Long> {
}
