package sg.kata.sgkata.controlers;

import sg.kata.sgkata.entites.Account;
import sg.kata.sgkata.entites.AccountDto;
import sg.kata.sgkata.entites.Operation;
import sg.kata.sgkata.service.TraitementBankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TraitementBankAccountControler {

    @Autowired
    TraitementBankAccountService traitementBankAccountService;

    @PostMapping("/depositAccount/{credit}")
    public Account depositAccount(@PathVariable("credit")double credit, @RequestBody AccountDto accountDto){
        return traitementBankAccountService.depositAccount(credit,accountDto);
    }

    @PostMapping("/withdrawalAccount/{debit}")
    public Account withdrawalAccount(@PathVariable("debit")double debit, @RequestBody AccountDto accountDto){
        return traitementBankAccountService.withdrawalAccount(debit,accountDto);
    }

    @GetMapping("/getHistoryTransaction/{id}")
    public List<Operation> getHistoryTransaction(@PathVariable("id")Long id){
        return traitementBankAccountService.seeHistory(id);
    }
}
