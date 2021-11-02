package seoultech.gdsc.web.message.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.message.domain.MessageEntity;
import seoultech.gdsc.web.message.domain.MessageEntityRepository;
import seoultech.gdsc.web.user.domain.UserEntity;
import seoultech.gdsc.web.user.domain.UserEntityRepository;

public interface JpaMessageRepository extends JpaRepository<MessageEntity, Integer>,
  MessageEntityRepository {
}
