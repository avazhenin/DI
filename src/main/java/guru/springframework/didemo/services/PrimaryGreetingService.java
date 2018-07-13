package guru.springframework.didemo.services;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from the primary greeting service";
    }
}
