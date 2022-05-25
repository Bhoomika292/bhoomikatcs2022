package dockerwstp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class message {
	@GetMapping(value="/message")
    String showMessage() {
	return"this is my docker example";
  }

}
