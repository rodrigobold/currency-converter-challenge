package main.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfigLoader {

    private static final Logger logger = Logger.getLogger(ConfigLoader.class.getName());
    private final Properties properties = new Properties();

    public ConfigLoader() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                logger.warning("Não foi possível encontrar o arquivo config.properties");
                return;
            }
            properties.load(input);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Erro ao carregar o arquivo config.properties", ex);
        }
    }

    public String getApiKey() {
        return properties.getProperty("api.key");
    }
}
