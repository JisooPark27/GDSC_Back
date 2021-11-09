package seoultech.gdsc.web.user.domain;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
public class UserJoin {
  private final userRepository userRepository;
  private final ModelMapper modelMapper;
  private final PasswordEncoder passwordEncoder;

  public String userJoin(UserDto.Request user) {
    if(userRepository.existsByUserId(user.userId())){
      return "아이디가 중복되었습니다.";
    }
    if(userRepository.existsByEmail(user.email())){
      return "이메일이 중복되었습니다.";
    }
    if(userRepository.existsByNickname(user.nickname())){
      return "닉네임이 중복되었습니다.";
    }
    if(userRepository.existsByHp(user.hp())){
      return "전화번호가 중복되었습니다.";
    }
    User newUser = modelMapper.map(user, User.class);
    String encodePassword = passwordEncoder.encode(user.password());

    newUser.password(encodePassword);
    userRepository.save(newUser);
    return "";

  }
}
