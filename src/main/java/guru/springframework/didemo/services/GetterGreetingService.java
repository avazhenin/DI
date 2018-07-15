package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
public class GetterGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello - I was injected by the getter";
  }
}