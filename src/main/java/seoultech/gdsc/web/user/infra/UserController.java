package seoultech.gdsc.web.user.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seoultech.gdsc.web.common.domain.ResponseDto;
import seoultech.gdsc.web.user.domain.SaveUser;
import seoultech.gdsc.web.user.domain.User;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

  private final SaveUser saveUser;
  private final PasswordEncoder passwordEncoder;


  @PostMapping
  public ResponseEntity<?> signUp(@RequestBody SignUpUserJson signUpUser) {

    User userEntity = saveUser.save(
      signUpUser.userId(), passwordEncoder.encode(signUpUser.password()),
      signUpUser.email(), signUpUser.hp(), signUpUser.name(), signUpUser.nickName(),
      signUpUser.major());

    ResponseDto<User> responseBody = new ResponseDto<>(OK.value(), "회원가입 성공", userEntity);
    return ResponseEntity.ok(responseBody);
  }
}
