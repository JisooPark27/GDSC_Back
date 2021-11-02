package seoultech.gdsc.web.message.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;
import seoultech.gdsc.web.common.domain.BaseEntity;
import seoultech.gdsc.web.user.domain.UserEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
public class MessageEntity extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "from_user_id")
  private UserEntity fromUser;

  @ManyToOne
  @JoinColumn(name = "to_user_id")
  private UserEntity toUser;

  @Column(nullable = false)
  private String content;

  @Builder
  public MessageEntity(UserEntity fromUser, UserEntity toUser, String content) {
    this.fromUser = fromUser;
    this.toUser = toUser;
    this.content = content;
  }
}
