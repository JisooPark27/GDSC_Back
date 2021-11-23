package seoultech.gdsc.web.user.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seoultech.gdsc.web.common.domain.ResponseDto;
import seoultech.gdsc.web.user.domain.SaveUser;
import seoultech.gdsc.web.user.domain.User;
=======
import org.springframework.web.bind.annotation.*;
import seoultech.gdsc.web.common.domain.ResponseDto;
import seoultech.gdsc.web.user.domain.UserSignUp;
import seoultech.gdsc.web.user.domain.User;
import seoultech.gdsc.web.user.domain.FindUser;
import seoultech.gdsc.web.user.session.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
>>>>>>> 801b3f4a57bca6e48a6b7c29e672be544ec6db70

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

  private final UserSignUp userSignUp;
  private final HttpSession httpSession;
  private final FindUser findUser;


  @PostMapping
  public ResponseEntity<?> signUp(@RequestBody SignUpUserJson signUpUser) {

<<<<<<< HEAD
    User userEntity = saveUser.save(
      signUpUser.userId(), passwordEncoder.encode(signUpUser.password()),
      signUpUser.email(), signUpUser.hp(), signUpUser.name(), signUpUser.nickName(),
      signUpUser.major());

    ResponseDto<User> responseBody = new ResponseDto<>(OK.value(), "회원가입 성공", userEntity);
=======
    User userEntity = userSignUp.save(signUpUser);

    ResponseDto<User> responseBody = new ResponseDto<>(OK.value(), "회원가입 성공",
      userEntity);
>>>>>>> 801b3f4a57bca6e48a6b7c29e672be544ec6db70
    return ResponseEntity.ok(responseBody);
  }

  @GetMapping("/test")
  public ResponseEntity<?> getUser(@UserInfo String sessionId) {

    System.out.println(sessionId);
    ResponseDto<User> responseBody = new ResponseDto<>(OK.value(), "유저 정보 조회"
      , null);
    return ResponseEntity.ok("test");
  }

  @PostMapping("/test")
  public String test() {
    httpSession.setAttribute("sessionId", "123453123");


    return "localhost:8080";

  }
}
