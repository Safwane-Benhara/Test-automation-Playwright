package configuration;

 import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigfileReader {

    private static final Properties props=new Properties();
    static {
        try(InputStream input = ConfigfileReader.class.getClassLoader().getResourceAsStream("config.properties")){
    if (input == null){
        throw new RuntimeException("Unable to find config.properties");
   }
            props.load(input);

        }
        catch (Exception e) {
           e.printStackTrace();
        }

    }
    public static String get(String key) {return props.getProperty(key); }

}
