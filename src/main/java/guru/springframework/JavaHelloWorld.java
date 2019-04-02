package guru.springframework;

/**
 * Created by jt on 2018-12-09.
 */
public class JavaHelloWorld implements AutoCloseable {

    public String getHello(){
        return "Hello World";
    }

    @Override
    public void close() throws Exception {
    }
}
