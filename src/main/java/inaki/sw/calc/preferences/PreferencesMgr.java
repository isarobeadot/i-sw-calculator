package inaki.sw.calc.preferences;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 * Preferences manager
 *
 * @author inaki
 * @since 3.1
 */
public class PreferencesMgr {

    private static final Logger LOG = getLogger(PreferencesMgr.class.getName());

    private static final String FILE_NAME = "preferences.json";

    public static Preferences getSettings() {
        ObjectMapper mapper = new ObjectMapper();
        Preferences s = new Preferences();
        try {
            Path path = Paths.get(System.getProperty("user.home") + "/.isw/calc");

            s = mapper.readValue(Paths.get(path.toString(), FILE_NAME).toFile(), Preferences.class);
        } catch (IOException ex) {
            LOG.severe(ex::getMessage);
        }
        return s;
    }

    public static void saveSettings(Preferences s) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Path path = Paths.get(System.getProperty("user.home") + "/.isw/calc");
            Files.createDirectories(path);

            mapper.writeValue(Paths.get(path.toString(), FILE_NAME).toFile(), s);
        } catch (IOException ex) {
            LOG.severe(ex::getMessage);
        }
    }

    private PreferencesMgr() {
    }

}
