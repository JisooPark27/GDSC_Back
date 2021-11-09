package seoultech.gdsc.web.common.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ResponseDto<T> {
  final int status;
  final String message;
  final T response;
}
