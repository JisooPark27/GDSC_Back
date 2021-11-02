package seoultech.gdsc.web.category.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import seoultech.gdsc.web.category.domain.CategoryEntity;
import seoultech.gdsc.web.category.domain.CategoryEntityRepository;
import seoultech.gdsc.web.user.domain.UserEntity;
import seoultech.gdsc.web.user.domain.UserEntityRepository;

public interface JpaCategoryRepository extends JpaRepository<CategoryEntity, Integer>, CategoryEntityRepository {
}
