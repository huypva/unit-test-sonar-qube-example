package io.codebyexample.unittestsonarqube.entrypoint;

import io.codebyexample.unittestsonarqube.core.entity.Greeting;
import io.codebyexample.unittestsonarqube.core.usecase.GreetUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huypva
 */
@RestController
public class Controller {

  @Autowired
  GreetUseCase greetUseCase;

  @GetMapping("/greet")
  public Greeting greet(@RequestParam(name = "name") String name) {
    return greetUseCase.greet(name);
  }
}
