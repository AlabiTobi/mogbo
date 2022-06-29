package africa.semicolon.mogbo.data.repository;

import africa.semicolon.mogbo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository <User,String> {

    User findByEmail(String email);

}
