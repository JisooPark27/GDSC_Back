package seoultech.gdsc.web.message.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;
import seoultech.gdsc.web.common.domain.BaseEntity;
import seoultech.gdsc.web.user.domain.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
public class MessageEntity extends BaseEntity {

  @ManyToOne
  @JoinColumn(name = "from_user_id")
  private User fromUser;

  @ManyToOne
  @JoinColumn(name = "to_user_id")
  private User toUser;

  @Column(nullable = false)
  private String content;

  @Builder
  public MessageEntity(User fromUser, User toUser, String content) {
    this.fromUser = fromUser;
    this.toUser = toUser;
    this.content = content;
  }
}
