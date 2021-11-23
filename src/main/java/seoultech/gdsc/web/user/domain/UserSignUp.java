package seoultech.gdsc.web.user.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import seoultech.gdsc.web.user.infra.SignUpUserJson;

@RequiredArgsConstructor
public class UserSignUp {

  private final PasswordEncoder passwordEncoder;
  private final userRepository userRepository;

  public User save(SignUpUserJson signUpUser) {
    User newUser = User.builder()
      .userId(signUpUser.userId())
      .password(passwordEncoder.encode(signUpUser.password()))
      .email(signUpUser.email())
      .hp(signUpUser.hp())
      .name(signUpUser.name())
      .nickname(signUpUser.nickName())
      .major(signUpUser.major())
      .build();

    User save = userRepository.save(newUser);

    return save;
  }

}
