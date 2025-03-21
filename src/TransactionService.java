import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> getTransactionById(Long id) {
        return transactionRepository.findById(id);
    }

    public Transaction updateTransaction(Long id, Transaction transactionDetails) {
        Transaction transaction = transactionRepository.findById(id).orElse(null);
        if(transaction != null){
            transaction.setAmount(transactionDetails.getAmount());
            transaction.setCardNumber(transactionDetails.getCardNumber());
            transaction.setTransactionDate(transactionDetails.getTransactionDate());
            return transactionRepository.save(transaction);
        }
        return null;
    }

    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}