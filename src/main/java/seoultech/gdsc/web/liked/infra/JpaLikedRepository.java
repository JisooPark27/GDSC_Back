package seoultech.gdsc.web.liked.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.liked.domain.LikedEntity;
import seoultech.gdsc.web.liked.domain.LikedEntityRepository;
import seoultech.gdsc.web.user.domain.UserEntity;
import seoultech.gdsc.web.user.domain.UserEntityRepository;

public interface JpaLikedRepository extends JpaRepository<LikedEntity, Integer>, LikedEntityRepository {
}
