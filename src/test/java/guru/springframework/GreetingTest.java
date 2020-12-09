package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void helloWorld() {
        Greating greating = new Greating();
        System.out.println(greating.helloWorld());
    }

    @Test
    void testHelloWorld() {
        Greating greating = new Greating();
        System.out.println(greating.helloWorld("John"));
    }
}