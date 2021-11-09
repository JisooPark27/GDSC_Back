package seoultech.gdsc.web.user.domain;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
public class UserJoin {
  private final UserEntityRepository userEntityRepository;
  private final ModelMapper modelMapper;
  private final PasswordEncoder passwordEncoder;

  public String userJoin(UserDto.Request user) {
    if(userEntityRepository.existUerEntityByUserId(user.userId())){
      return "아이디가 중복되었습니다.";
    }
    if(userEntityRepository.existUerEntityByUserId(user.email())){
      return "이메일이 중복되었습니다.";
    }
    if(userEntityRepository.existUerEntityByUserId(user.nickname())){
      return "닉네임이 중복되었습니다.";
    }
    if(userEntityRepository.existUerEntityByUserId(user.hp())){
      return "전화번호가 중복되었습니다.";
    }
    UserEntity newUser = modelMapper.map(user, UserEntity.class);
    String encodePassword = passwordEncoder.encode(user.password());

    newUser.setPassword(encodePassword);
    userEntityRepository.save(newUser);
    return "";

  }
}
