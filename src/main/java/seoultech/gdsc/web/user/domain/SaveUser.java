package seoultech.gdsc.web.user.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SaveUser {

  private final seoultech.gdsc.web.user.domain.userRepository userRepository;

  public User save(String userId, String password, String email, String hp, String name,
                   String nickname, String major) {
    User newUser = User.builder()
      .userId(userId)
      .password(password)
      .email(email)
      .hp(hp)
      .name(name)
      .nickname(nickname)
      .major(major)
      .build();

    User save = userRepository.save(newUser);

    return save;
  }

}
