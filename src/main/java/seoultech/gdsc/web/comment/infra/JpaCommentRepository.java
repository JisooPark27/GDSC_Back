package seoultech.gdsc.web.comment.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.comment.domain.CommentEntity;
import seoultech.gdsc.web.comment.domain.CommentEntityRepository;

public interface JpaCommentRepository extends JpaRepository<CommentEntity, Integer>, CommentEntityRepository {
}
