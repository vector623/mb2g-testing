package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaHelloWorldTest {

    @Test
    void getHello() {
        try (var javaHelloWorld = new JavaHelloWorld()) {
            System.out.println("junit5 test");

            assertEquals("Hello World",javaHelloWorld.getHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}