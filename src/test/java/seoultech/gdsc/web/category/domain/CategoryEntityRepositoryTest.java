package seoultech.gdsc.web.category.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@SpringBootTest
class CategoryEntityRepositoryTest {

  @Autowired
  private CategoryEntityRepository repository;


  @Test
  void repositoryCrudTest() {
    //given
    CategoryEntity category = CategoryEntity.builder()
      .categoryName("categoryName")
      .build();

    repository.save(category);

    //when
    CategoryEntity findCategory = repository.findById(1);

    //then
    assertThat(findCategory.id(), is(1));
  }
}