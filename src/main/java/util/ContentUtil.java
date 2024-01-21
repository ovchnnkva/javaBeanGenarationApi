package util;

public class ContentUtil {
    private final static String FEEDS_REGEXP = "[\\t\\n]";
    public static String removeLineFeeds(String content) {
        return content.replaceAll(FEEDS_REGEXP, "");
    }

    public static String formatActivityContent(String content) {
        return content != null ? content.replaceFirst(":", "")
               .replace(content.substring(content.length() - 1), "")
                : "";
    }
}
