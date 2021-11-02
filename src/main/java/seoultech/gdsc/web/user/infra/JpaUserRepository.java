package seoultech.gdsc.web.user.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.user.domain.UserEntity;
import seoultech.gdsc.web.user.domain.UserEntityRepository;

public interface JpaUserRepository extends JpaRepository<UserEntity, Integer>, UserEntityRepository {
}
