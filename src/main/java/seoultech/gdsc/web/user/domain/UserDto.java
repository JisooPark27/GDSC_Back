package seoultech.gdsc.web.user.domain;

import lombok.Getter;

public class UserDto {

  @Getter
  public static class Request {
    private String userId;
    private String password;
    private String email;
    private String name;
    private String nickname;
    private String major;
    private String hp;
  }
}
