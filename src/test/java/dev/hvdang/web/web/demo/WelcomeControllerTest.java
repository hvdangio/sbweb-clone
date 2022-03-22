package dev.hvdang.web.web.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = WelcomeController.class)
class WelcomeControllerTest {

  @Autowired
  private MockMvc mockMvc;

  List<String> expectedList = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

  @Test
  public void welcome() throws Exception {
    ResultActions resultActions = mockMvc.perform(get("/web/demo/"))
        .andExpect(status().isOk())
        .andExpect(view().name("/web/demo/welcome"))
        .andExpect(model().attribute("message", equalTo("hvdang.io")))
        .andExpect(model().attribute("tasks", equalTo(expectedList)))
        .andExpect(content().string(containsString("Hello, hvdang.io")));

    MvcResult mvcResult = resultActions.andReturn();
    ModelAndView mv = mvcResult.getModelAndView();
  }

  @Test
  public void hello() throws Exception {
    mockMvc.perform(get("/web/demo/hello").param("name", "I Love Kotlin!"))
        .andExpect(status().isOk())
        .andExpect(view().name("/web/demo/welcome"))
        .andExpect(model().attribute("message", equalTo("I Love Kotlin!")))
        .andExpect(content().string(containsString("Hello, I Love Kotlin!")));
  }

}