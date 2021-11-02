package seoultech.gdsc.web.category.domain;


public interface CategoryEntityRepository {
  CategoryEntity save(CategoryEntity userDomain);
  CategoryEntity findById(int id);
}
