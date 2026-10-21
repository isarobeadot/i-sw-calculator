package inaki.sw.calc.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author inaki
 * @since 3.1
 */
public class I18nService {

    private static final String BUNDLE_NAME = "messages";
    private static ResourceBundle bundle;

    public static void init(Locale locale) {
        bundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
    }

    public static String getMessage(String key) {
        return bundle.getString(key);
    }

    public static String getMessage(String key, String defaultValue) {
        try {
            return bundle.getString(key);
        } catch (java.util.MissingResourceException e) {
            return defaultValue;
        }
    }

    public static void setLocale(Locale newLocale) {
        init(newLocale);
    }

    public static ResourceBundle getBundle() {
        return bundle;
    }

    private I18nService() {
    }

}
