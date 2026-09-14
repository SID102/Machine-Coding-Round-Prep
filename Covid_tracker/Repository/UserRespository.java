package Covid_tracker.Repository;

import Covid_tracker.Models.User;
import java.util.Optional;
import java.util.List;

public interface UserRespository{

    void save(User user);

    Optional<User> findByPhone(long phoneNumber);

    boolean isExistByPhone(long phoneNumber);

    List<User> findAll();

}
