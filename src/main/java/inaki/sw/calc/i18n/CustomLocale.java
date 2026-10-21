package inaki.sw.calc.i18n;

/**
 *
 * @author inaki
 * @since 3.1
 */
public enum CustomLocale {

    BASQUE("eu", "Euskara"),
    ENGLISH("en", "English"),
    FRENCH("fr", "Français"),
    SPANISH("es", "Español");

    private final String key;
    private final String name;

    private CustomLocale(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getNameHTML() {
        return "<html><body><h3>" + name + "</h3></body></html>";
    }

    /**
     * Returns the complete enum object based on a key
     *
     * @param key
     * @return
     */
    public static CustomLocale getLocaleByKey(String key) {
        for (CustomLocale locale : CustomLocale.values()) {
            if (locale.getKey().equals(key)) {
                return locale;
            }
        }
        return null;
    }

}
