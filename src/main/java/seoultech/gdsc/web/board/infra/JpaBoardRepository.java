package seoultech.gdsc.web.board.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.board.domain.BoardEntity;
import seoultech.gdsc.web.board.domain.BoardEntityRepository;

public interface JpaBoardRepository extends JpaRepository<BoardEntity, Integer>, BoardEntityRepository {
}
