package dev.hvdang.web.web.clone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static dev.hvdang.web.sbwebbase.SBWEB_CONFIG.CONTEXT_URL_WEB_PAGE;


@Controller
@RequestMapping(value = ChoTotController.CONTEXT_URL)
public class ChoTotController {
  public static final String CONTEXT_URL = CONTEXT_URL_WEB_PAGE + "/clone/chotot";
  public static final String CONTEXT_VIEW = CONTEXT_URL.substring(1); //ignore "/"

  @GetMapping({"", "/93384807"})
  public String chototClone01(Model model) {
    return String.format("%s/%s", CONTEXT_VIEW, "93384807"); //view
  }

  @GetMapping({"/93384807_2"})
  public String chototClone02(Model model) {
    return String.format("%s/%s", CONTEXT_VIEW, "93384807_2"); //view
  }
}
