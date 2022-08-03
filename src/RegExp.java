
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // fill in code here for extracting IP address using Regular Expression
        final String PATTERN =
                "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            return matcher.group();

        }
        return "";

    }
}