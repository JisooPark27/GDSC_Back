package seoultech.gdsc.web.comment.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;
import seoultech.gdsc.web.common.domain.BaseEntity;
import seoultech.gdsc.web.user.domain.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
public class CommentEntity extends BaseEntity {

  @Column(nullable = false)
  private int likeCategory;

  @Column(nullable = false)
  private int refId;

  @ManyToOne
  private User userId;

  @Builder
  public CommentEntity(int likeCategory, int refId, User userId) {
    this.likeCategory = likeCategory;
    this.refId = refId;
    this.userId = userId;
  }
}
