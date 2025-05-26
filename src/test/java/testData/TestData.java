package testData;

import io.cucumber.java.After;

import java.util.HashMap;
import java.util.Map;

public class TestData {
    private static final ThreadLocal<Map<String, Object>> data = ThreadLocal.withInitial(() -> new HashMap<>());

    public static void put(String key, Object value) {
        data.get().put(key, value);
    }

    public static Object get(String key) {
        return data.get().get(key);
    }

    public static void clear() {
        data.get().clear();
    }
    @After
    public void resetAfterScenario(){
        TestData.clear();
    }


}
