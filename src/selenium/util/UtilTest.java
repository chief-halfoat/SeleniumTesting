package selenium.util;

public class UtilTest {
    public static void main(String[] args) {
        Util.openBrowser("https://www.google.com");
        Util.quitBrowser();
        Util.openBrowser("https://www.google.com");
        Util.closeBrowser();


    }
}
