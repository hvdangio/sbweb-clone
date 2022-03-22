package dev.hvdang.web.web.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

import static dev.hvdang.web.sbwebbase.SBWEB_CONFIG.CONTEXT_URL_WEB_PAGE;


/**
 * REF: https://mkyong.com/spring-boot/spring-boot-hello-world-example-thymeleaf/
 **/
@Controller
@RequestMapping(value = WelcomeController.CONTEXT_URL)
public class WelcomeController {
  public static final String CONTEXT_URL = CONTEXT_URL_WEB_PAGE + "/demo";

  // inject via application.properties
  @Value("${web.demo.message}")
  private String message;

  private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

  @GetMapping("/")
  public String welcome(Model model) {
    model.addAttribute("message", message);
    model.addAttribute("tasks", tasks);
    return String.format("%s/%s", CONTEXT_URL, "welcome"); //view
  }

  // /hello?name=kotlin
  @GetMapping("/hello")
  public String hello(
      @RequestParam(name = "name", required = false, defaultValue = "")
          String name, Model model) {
    model.addAttribute("message", name);
    return String.format("%s/%s", CONTEXT_URL, "welcome"); //view
  }
}
