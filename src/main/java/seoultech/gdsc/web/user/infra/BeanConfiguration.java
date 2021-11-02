package seoultech.gdsc.web.user.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seoultech.gdsc.web.user.domain.SaveUser;
import seoultech.gdsc.web.user.domain.UserEntityRepository;

@Configuration
public class BeanConfiguration {

  @Autowired
  private UserEntityRepository userRepository;

  @Bean
  public SaveUser saveUser() {
    return new SaveUser(userRepository);
  }
}
