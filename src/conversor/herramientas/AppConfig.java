package conversor.herramientas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {

    private static Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo cargar config.properties");
        }
    }

    public static String getApiKey() {
        return properties.getProperty("api.key");
    }
}