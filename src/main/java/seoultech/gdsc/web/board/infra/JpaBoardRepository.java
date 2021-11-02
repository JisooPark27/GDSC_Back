package seoultech.gdsc.web.board.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import seoultech.gdsc.web.board.domain.BoardEntity;
import seoultech.gdsc.web.board.domain.BoardEntityRepository;
import seoultech.gdsc.web.user.domain.UserEntity;
import seoultech.gdsc.web.user.domain.UserEntityRepository;

public interface JpaBoardRepository extends JpaRepository<BoardEntity, Integer>, BoardEntityRepository {
}
