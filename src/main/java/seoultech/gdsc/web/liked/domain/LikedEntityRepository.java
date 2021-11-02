package seoultech.gdsc.web.liked.domain;


public interface LikedEntityRepository {
  LikedEntity save(LikedEntity likedEntity);
  LikedEntity findById(int id);
}