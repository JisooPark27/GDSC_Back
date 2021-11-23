package seoultech.gdsc.web.user.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD
import seoultech.gdsc.web.user.domain.SaveUser;
=======
import org.springframework.security.crypto.password.PasswordEncoder;
import seoultech.gdsc.web.user.domain.FindUser;
import seoultech.gdsc.web.user.domain.UserSignUp;
>>>>>>> 801b3f4a57bca6e48a6b7c29e672be544ec6db70
import seoultech.gdsc.web.user.domain.userRepository;

@Configuration
public class BeanConfiguration {

  @Autowired
  private userRepository userEntityRepository;
<<<<<<< HEAD

  @Bean
  public SaveUser saveUser() {
    return new SaveUser(userEntityRepository);
=======

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Bean
  public UserSignUp saveUser() {
    return new UserSignUp(passwordEncoder, userEntityRepository);
  }

  @Bean
  public FindUser findUser() {
    return new FindUser(userEntityRepository);
>>>>>>> 801b3f4a57bca6e48a6b7c29e672be544ec6db70
  }
}
