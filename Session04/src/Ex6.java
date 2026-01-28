import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6 {
    public static void main(String[] args) {

        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        String[] blacklist = {
                "tệ",
                "ngu",
                "ngu ngốc",
                "không đáng đọc"
        };

        String filtered = censorByBlacklist(review, blacklist);
        String finalText = shortenWithoutCuttingWord(filtered, 200);
        System.out.println("Review sau khi xu ly: " + finalText);
    }

    public static String censorByBlacklist(String text, String[] blacklist) {

        sortByLengthDesc(blacklist);

        StringBuilder alt = new StringBuilder();
        for (int i = 0; i < blacklist.length; i++) {
            alt.append(Pattern.quote(blacklist[i]));
            if (i < blacklist.length - 1) {
                alt.append("|");
            }
        }

        String regex = "(?<!\\p{L})(?:" + alt + ")(?!\\p{L})";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);

        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String bad = matcher.group();

            int len = bad.replaceAll("\\s+", "").length();
            int starCount = Math.max(4, len);

            String stars = repeatChar('*', starCount);
            matcher.appendReplacement(result, Matcher.quoteReplacement(stars));
        }

        matcher.appendTail(result);
        return result.toString();
    }

    public static String shortenWithoutCuttingWord(String text, int maxLen) {
        if (text.length() <= maxLen) {
            return text;
        }

        int cutPos = -1;
        for (int i = maxLen; i >= 0; i--) {
            if (Character.isWhitespace(text.charAt(i))) {
                cutPos = i;
                break;
            }
        }

        if (cutPos == -1) {
            cutPos = maxLen;
        }

        String shortText = text.substring(0, cutPos).trim();

        StringBuilder sb = new StringBuilder();
        sb.append(shortText).append("...");
        return sb.toString();
    }

    public static String repeatChar(char ch, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void sortByLengthDesc(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() < arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}