package seoultech.gdsc.web.user.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seoultech.gdsc.web.user.domain.SaveUser;
import seoultech.gdsc.web.user.domain.UserDomainRepository;

@Configuration
public class BeanConfiguration {

  @Autowired
  private UserDomainRepository userRepository;

  @Bean
  public SaveUser saveUser() {
    return new SaveUser(userRepository);
  }
}
