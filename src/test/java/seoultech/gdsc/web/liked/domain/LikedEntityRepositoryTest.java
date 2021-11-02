package seoultech.gdsc.web.liked.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seoultech.gdsc.web.message.domain.MessageEntity;
import seoultech.gdsc.web.message.domain.MessageEntityRepository;
import seoultech.gdsc.web.user.domain.UserEntity;
import seoultech.gdsc.web.user.domain.UserEntityRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class LikedEntityRepositoryTest {

  @Autowired
  private LikedEntityRepository repository;

  @Autowired
  private UserEntityRepository userRepository;

  @BeforeEach
  void setUser() {
    UserEntity newUser = UserEntity.builder()
      .name("Jisoo Park")
      .email("jsjs@gmail.com")
      .userId("jspark")
      .hp("010-0000-1234")
      .major("computer")
      .password("qwer12341")
      .nickname("js")
      .build();
    userRepository.save(newUser);
  }

  @Test
  void repositoryCrudTest() {
    //given
    LikedEntity liked = LikedEntity.builder()
      .likeCategory(1)
      .refId(1)
      .toUser(userRepository.findById(1))
      .build();

    repository.save(liked);

    //when
    LikedEntity findLiked = repository.findById(1);

    //then
    assertThat(findLiked.id(), is(1));
  }
}