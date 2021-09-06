import java.util.HashMap;
import  java.util.Map;
import org.testng.annotations.Test;



public class Test_POST {
	
	@Test
	public void test_1_post() {
		
		Map<String, Object>  map  = new HashMap<String, Object>();		
		
		map.put("name", "Guilherme");
		map.put("job","analista de testes");
		
		System.out.println((map));
	}
}
