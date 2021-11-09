package seoultech.gdsc.web.user.infra;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SignUpUserJson {

  private String userId;
  private String password;
  private String email;

  private String name;
  private String nickName;
  private String major;
  private String hp;

  public SignUpUserJson(String userId, String password, String email, String name, String nickName,
                        String major, String hp) {
    this.userId = userId;
    this.password = password;
    this.email = email;
    this.name = name;
    this.nickName = nickName;
    this.major = major;
    this.hp = hp;
  }
}
