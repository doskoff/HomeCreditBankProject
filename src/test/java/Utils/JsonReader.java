package Utils;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

public class JsonReader {
    private static final String jsonFileName = "Config.json";
    private static final ISettingsFile jsonSettingsFile = new JsonSettingsFile(jsonFileName);
    public static String getUrl() {
        return jsonSettingsFile.getValue("/HOME_PAGE").toString();
    }
    public static String getBrowser() {
        return jsonSettingsFile.getValue("/BROWSER_NAME").toString();
    }
    public static String getFilePath() {
        return jsonSettingsFile.getValue("/FILE_PATH").toString();
    }
    public static String getName() {
        return jsonSettingsFile.getValue("/USER_NAME").toString();
    }
    public static String getLastName() {
        return jsonSettingsFile.getValue("/USER_LAST_NAME").toString();
    }
}
