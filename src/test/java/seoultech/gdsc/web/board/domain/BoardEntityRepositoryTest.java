package seoultech.gdsc.web.board.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seoultech.gdsc.web.user.domain.UserEntity;
import seoultech.gdsc.web.user.domain.UserEntityRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class BoardEntityRepositoryTest {

  @Autowired
  private BoardEntityRepository repository;

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
    UserEntity user = userRepository.findById(1);
    BoardEntity board1 = BoardEntity.builder()
      .userId(user)
      .title("title")
      .content("content")
      .category(any())
      .imageUrl("imageUrl")
      .build();
    repository.save(board1);

    //when
    BoardEntity findBoard = repository.findById(1);

    //then
    assertThat(findBoard.id(), is(1));
  }

}