import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class SelectCountryTest {

    @Test
   	public void select_checkIfSelectedWordIsInArray_true() {
   		SelectCountry wordSelect = new SelectCountry();
   		wordSelect.select();
   		String selectedCountry = wordSelect.getCountry();
   		String[] country = { "pakistan", "india", "germany", "america", "russia", "iran", "iraq", "japan", "sudan", "canada"};
   		Set<String> set = new HashSet<String>(Arrays.asList(county));
   		assertEquals(true, set.contains(selectedCountry));
   	}
}
