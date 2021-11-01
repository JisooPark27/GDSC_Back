package seoultech.gdsc.web.user.infra;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import seoultech.gdsc.web.user.domain.SaveUser;

import javax.annotation.PostConstruct;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final SaveUser saveUser;

  @PostConstruct
  public void save(){
    saveUser.save();
    System.out.println("hello");
  }
}
