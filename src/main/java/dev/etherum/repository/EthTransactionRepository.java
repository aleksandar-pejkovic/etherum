package dev.etherum.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import dev.etherum.model.EthTransaction;

@Repository
public interface EthTransactionRepository extends ListCrudRepository<EthTransaction, Long> {
}
