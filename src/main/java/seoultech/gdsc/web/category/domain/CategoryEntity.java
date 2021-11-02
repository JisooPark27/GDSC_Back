package seoultech.gdsc.web.category.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import seoultech.gdsc.web.common.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor
public class CategoryEntity extends BaseEntity {

  @Column(nullable = false)
  private String categoryName;

  @Builder
  public CategoryEntity(String categoryName) {
    this.categoryName = categoryName;
  }
}
