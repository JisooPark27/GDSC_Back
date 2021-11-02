package seoultech.gdsc.web.message.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageEntityRepositoryTest {

  @Autowired
  private MessageEntityRepository repository;

  @Test
  void repositoryCrudTest() {
    //given
    MessageEntity message = MessageEntity.builder()
      .content("content")
      .build();

    repository.save(message);

    //when
    MessageEntity findMessage = repository.findById(1);

    //then
    assertThat(findMessage.id(), is(1));
  }
}