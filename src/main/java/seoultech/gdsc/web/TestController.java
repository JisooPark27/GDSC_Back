package seoultech.gdsc.web;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.Host;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@Slf4j
@RequestMapping("/*")
public class TestController {

  @PostMapping
  public ResponseEntity<?> signUp(@RequestHeader(value = "Host") String host, @RequestBody String result) {
    log.info("host = {}", host);
    log.info("test = {}, time = {}" , result, LocalDateTime.now());
    return ResponseEntity.ok("hihihihi_jisoo");
}


}