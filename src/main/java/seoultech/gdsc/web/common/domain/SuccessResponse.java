package seoultech.gdsc.web.common.domain;

import lombok.Getter;

@Getter
public class SuccessResponse<T> {
  private final boolean success = true;
  private String message;
  private T data;

  public SuccessResponse(String message, T data) {
    this.message = message;
    this.data = data;
  }
}
