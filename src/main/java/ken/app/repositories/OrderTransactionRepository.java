package ken.app.repositories;

import ken.app.documents.OrderTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderTransactionRepository extends MongoRepository<OrderTransaction, String> {}
