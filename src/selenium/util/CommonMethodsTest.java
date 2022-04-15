package selenium.util;

public class CommonMethodsTest {
    public static void main(String[] args) {
        CommonMethods.openBrowser("https:www.google.com");
        CommonMethods.closeBrowser();
        CommonMethods.openBrowser("https:www.google.com");
        CommonMethods.quitBrowser();
    }
}
