package sg.kata.sgkata.dao;

import sg.kata.sgkata.entites.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
