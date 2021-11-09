package seoultech.gdsc.web.user.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.user.domain.User;
import seoultech.gdsc.web.user.domain.userRepository;

public interface JpaUserRepository extends JpaRepository<User, Integer>, userRepository {
}
