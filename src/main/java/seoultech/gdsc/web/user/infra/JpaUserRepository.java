package seoultech.gdsc.web.user.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.user.domain.UserDomain;
import seoultech.gdsc.web.user.domain.UserDomainRepository;

public interface JpaUserRepository extends JpaRepository<UserDomain, Integer>, UserDomainRepository {
}
