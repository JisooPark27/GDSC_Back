package seoultech.gdsc.web.user.domain;

import lombok.*;
import seoultech.gdsc.web.common.domain.BaseEntity;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User extends BaseEntity {
  @Column(nullable = false)
  private String userId;

  @Column(nullable = false)
  private String password;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String hp;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String nickname;

  @Column(nullable = false)
  private String major;

  private String profilePic;

  @Builder
  public User(String userId, String password, String email, String hp, String name,
              String nickname, String major, String profilePic) {
    this.userId = userId;
    this.password = password;
    this.email = email;
    this.hp = hp;
    this.name = name;
    this.nickname = nickname;
    this.major = major;
    this.profilePic = profilePic;
  }
}