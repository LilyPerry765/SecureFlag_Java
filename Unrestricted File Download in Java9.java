//no-cwe
import java.io.*;

public class Util {
    private final static String assetsDir = "/opt/wwwdata/assets/";

    public static String getAssetPath(String assetName) {
        File path = new File(assetsDir, assetName);
        return path.toString();
    }
}