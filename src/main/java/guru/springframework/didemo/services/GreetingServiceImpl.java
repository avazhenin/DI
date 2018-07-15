package guru.springframework.didemo.services;

import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
//@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}