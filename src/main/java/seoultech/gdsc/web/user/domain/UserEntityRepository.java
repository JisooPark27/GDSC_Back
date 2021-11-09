package seoultech.gdsc.web.user.domain;

public interface UserEntityRepository {
  UserEntity save(UserEntity userEntity);
  UserEntity findById(int id);

  boolean existUerEntityByUserId(String userId);
  boolean existUerEntityByEmail(String email);
  boolean existUerEntityByNickName(String nickname);
  boolean existUerEntityByUserHp(String hp);
}
