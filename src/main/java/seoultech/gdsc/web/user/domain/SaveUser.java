package seoultech.gdsc.web.user.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SaveUser {

  private final UserDomainRepository userRepository;

  public UserDomain save() {
    UserDomain newUser = UserDomain.builder()
      .userId("userId")
      .password("password")
      .email("email")
      .hp("hp")
      .name("name")
      .nickname("nickname")
      .major("major")
      .build();

    UserDomain save = userRepository.save(newUser);

    return save;
  }

}
