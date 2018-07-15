package guru.springframework.didemo.config;

import guru.springframework.didemo.services.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {

    @Bean
    @Primary
    @Profile("default")
    GreetingService greetingService(){
        return new GreetingServiceImpl();
    }

    @Bean
    @Primary
    @Profile("en")
    GreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    @Primary
    @Profile("ru")
    GreetingService primaryRussianGreetingService(){
        return new PrimaryRussianGreetingService();
    }

    @Bean
    GreetingService getterGreetingService(){
        return new GetterGreetingService();
    }

    @Bean
    GreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
}
