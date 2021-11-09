package seoultech.gdsc.web.user.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SaveUser {

  private final UserEntityRepository userRepository;

  public UserEntity save(String userId, String password, String email, String hp, String name,
                         String nickname, String major) {
    UserEntity newUser = UserEntity.builder()
      .userId(userId)
      .password(password)
      .email(email)
      .hp(hp)
      .name(name)
      .nickname(nickname)
      .major(major)
      .build();

    UserEntity save = userRepository.save(newUser);

    return save;
  }

}
