package sg.kata.sgkata.service;

import sg.kata.sgkata.entites.Account;
import sg.kata.sgkata.entites.AccountDto;
import sg.kata.sgkata.entites.Operation;

import java.util.List;

public interface TraitementBankAccountService {

    public Account depositAccount(double credit, AccountDto accountDto);
    public Account withdrawalAccount(double credit, AccountDto accountDto);
    public List<Operation> seeHistory(Long id);
    public void initClient();
    public void initAccount();
    public void initTransaction();
}
