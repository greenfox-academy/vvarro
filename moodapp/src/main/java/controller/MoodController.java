package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoodController {

  @GetMapping("/")
  public String getIndex(){
    return "index";
  }
}
