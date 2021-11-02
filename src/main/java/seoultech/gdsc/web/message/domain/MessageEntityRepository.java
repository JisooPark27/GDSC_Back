package seoultech.gdsc.web.message.domain;



public interface MessageEntityRepository {
  MessageEntity save(MessageEntity messageEntity);
  MessageEntity findById(int id);
}
