package seoultech.gdsc.web.user.domain;

public interface userRepository {
    User save(User user);

    User findById(int id);

    boolean existsByUserId(String userId);

    boolean existsByEmail(String email);

    boolean existsByNickname(String nickname);

    boolean existsByHp(String hp);
}
