package polarising.bootsecurity.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import polarising.bootsecurity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
