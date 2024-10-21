package ra.md05.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ra.md05.model.Account;
import ra.md05.repository.IAccountRepo;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private IAccountRepo accountRepo;
    @Transactional
    public void save(Account account) {
        accountRepo.save(account);
    }
    public Account findById(Long id) {
        return accountRepo.findById(id);
    }
    public List<Account> findAll() {
        return accountRepo.findAll();
    }
    @Transactional
    public void delete(Long id){
        accountRepo.deleteById(id);
    }
}
