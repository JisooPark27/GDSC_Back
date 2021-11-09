package seoultech.gdsc.web.liked.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.liked.domain.LikedEntity;
import seoultech.gdsc.web.liked.domain.LikedEntityRepository;

public interface JpaLikedRepository extends JpaRepository<LikedEntity, Integer>, LikedEntityRepository {
}
