package seoultech.gdsc.web.board.domain;

import lombok.*;
import seoultech.gdsc.web.category.domain.CategoryEntity;
import seoultech.gdsc.web.common.domain.BaseEntity;
import seoultech.gdsc.web.user.domain.UserEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@NoArgsConstructor
public class BoardEntity extends BaseEntity {

  @ManyToOne
  private UserEntity userId;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private String content;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private CategoryEntity category;

  @Column(nullable = true)
  private String imageUrl;

  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
  private Boolean isSecret = true;

  @Column(nullable = false, columnDefinition = "INT DEFAULT 0")
  private int likeNum = 0;

  @Column(nullable = true, columnDefinition = "INT DEFAULT 0")
  private int commentNum = 1;

  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT FALSE")
  private Boolean isHot = false;


  @Builder
  public BoardEntity(
    UserEntity userId, String title, String content, CategoryEntity category, String imageUrl) {
    this.userId = userId;
    this.title = title;
    this.content = content;
    this.category = category;
    this.imageUrl = imageUrl;
    this.isSecret = true;
    this.likeNum = 0;
    this.commentNum = 0;
    this.isHot = false;
  }
}