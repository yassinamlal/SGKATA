package sg.kata.sgkata.dao;

import sg.kata.sgkata.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
