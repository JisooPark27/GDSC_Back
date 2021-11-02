package seoultech.gdsc.web.board.domain;

import org.springframework.stereotype.Repository;

public interface BoardEntityRepository {
  BoardEntity save(BoardEntity boardEntity);
  BoardEntity findById(int id);

}
