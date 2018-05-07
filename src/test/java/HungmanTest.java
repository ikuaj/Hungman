import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testHungmanInstatiatesCorrectly() {
        Hungman guess = new Hungman("india");
        assertNotNull(guess);
    }
}
