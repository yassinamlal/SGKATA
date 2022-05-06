package sg.kata.sgkata.dao;

import sg.kata.sgkata.entites.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation,Long> {
}
