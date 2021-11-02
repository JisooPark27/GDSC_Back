package seoultech.gdsc.web.user.domain;

public interface UserEntityRepository {
  UserEntity save(UserEntity userEntity);
  UserEntity findById(int id);
}
