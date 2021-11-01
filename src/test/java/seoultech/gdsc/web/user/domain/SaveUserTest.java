package seoultech.gdsc.web.user.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@SpringBootTest
class SaveUserTest {

  @Autowired
  private SaveUser saveUser;

  @Test
  void User_저장_테스트() {
    UserDomain save = saveUser.save();

    assertThat(save.getUserId(), is("userId"));

  }

}