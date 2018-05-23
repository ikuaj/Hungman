import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class SelectCountyTest {

    @Test
   	public void select_checkIfSelectedWordIsInArray_true() {
   		SelectCounty wordSelect = new SelectCounty();
   		wordSelect.select();
   		String selectedCounty = wordSelect.getCounty();
   		String[] county = {"nyamira", "bungoma", "kakamega", "nyandarua", "marsabit", "mandera", "garissa", "kilifi", "kwale", "mombasa", "migori", "kiambu", "siaya", "kajiado", "kericho", "laikipia", "samburu", "kirinyaga", "lamu", "isiolo"};  
   		Set<String> set = new HashSet<String>(Arrays.asList(county));
   		assertEquals(true, set.contains(selectedCounty));
   	}
}
