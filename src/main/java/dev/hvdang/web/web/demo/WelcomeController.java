package dev.hvdang.web.web.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static dev.hvdang.web.sbwebbase.SBWEB_CONFIG.CONTEXT_URL_WEB_PAGE;


/**
 * REF: https://mkyong.com/spring-boot/spring-boot-hello-world-example-thymeleaf/
 * REF: https://openplanning.net/11545/spring-boot-va-thymeleaf
 **/
@Controller
@RequestMapping(value = WelcomeController.CONTEXT_URL)
public class WelcomeController {
  public static final String CONTEXT_URL = CONTEXT_URL_WEB_PAGE + "/demo";
  public static final String CONTEXT_VIEW = CONTEXT_URL.substring(1); //ignore "/"

  // inject via application.properties
  @Value("${web.demo.welcome.message}")
  private String message;
  @Value("${web.demo.error.message}")
  private String errorMessage;

  private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
  private static List<Person> persons = new ArrayList<Person>();

  static {
    persons.add(new Person("Tom", "Kitty"));
    persons.add(new Person("Jerry", "Mice"));
  }

  //---------------- Part #1
  @GetMapping({"", "/", "/index", "/welcome"})
  public String welcome(Model model) {
    model.addAttribute("message", message);
    model.addAttribute("tasks", tasks);
    return String.format("%s/%s", CONTEXT_VIEW, "welcome"); //view
  }

  // /hello?name=kotlin
  @GetMapping("/hello")
  public String hello(
      @RequestParam(name = "name", required = false, defaultValue = "")
          String name, Model model) {
    model.addAttribute("message", name);
    return String.format("%s/%s", CONTEXT_VIEW, "welcome"); //view
  }

  //---------------- Part #2
  @GetMapping(value = {"/personList"})
  public String personList(Model model) {
    model.addAttribute("persons", persons);
    return String.format("%s/%s", CONTEXT_VIEW, "personList"); //view
  }

  @GetMapping(value = {"/addPerson"})
  public String showAddPersonPage(Model model) {
    PersonForm personForm = new PersonForm();
    model.addAttribute("personForm", personForm);
    return String.format("%s/%s", CONTEXT_VIEW, "addPerson"); //view
  }

  @PostMapping(value = {"/addPerson"})
  public String savePerson(Model model, @ModelAttribute("personForm") PersonForm personForm) {
    String firstName = personForm.getFirstName();
    String lastName = personForm.getLastName();

    if (firstName != null && firstName.length() > 0 //
        && lastName != null && lastName.length() > 0) {
      Person newPerson = new Person(firstName, lastName);
      persons.add(newPerson);
      return String.format("redirect:%s/%s", CONTEXT_URL, "personList"); //view
    }
    model.addAttribute("errorMessage", errorMessage);
    return String.format("%s/%s", CONTEXT_VIEW, "addPerson"); //view
  }
}
