

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ExampleTest extends Assert {
   static Map<String, String> data;
    @Before
    public void setupTest(){
        data = new HashMap<>();
        data.put("vk","http://vk.com");
        data.put("google", "http://google.com");
        data.put("apple", "http://apple.com");
    }

    @Test
    public void testExampleTitleToURL(){
        Example example = new Example();
        for (Map.Entry<String, String> entry :
                data.entrySet()) {
            String testing = entry.getKey();
            String expected = entry.getValue();
            String result = example.titleToURL(testing);
            assertEquals(expected, result);
        }
    }
}
