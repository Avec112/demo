package no.ronny.demo.greeting;

import no.ronny.demo.greeting.Greeting;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by avec on 16/04/2018.
 */
@Service
public class GreetingService {

    public List<Greeting> findAll() {
        return Arrays.asList(
                new Greeting(1, "Arne"),
                new Greeting(2, "Bjarne"),
                new Greeting(3, "Carl"));
    }
}
