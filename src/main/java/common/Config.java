package common;

public class Config {

    /**
     * CHROME_WINDOWS
     * MOZILLA_WINDOWS
     */


    public static final String PLATFORM_AND_BROWSER = "CHROME_WINDOWS";
    /** Clean browser cookies after each iteration **/
    public static final Boolean CLEAR_COOKIES = false;
    /** To keep the browser open after all tests **/
    public static final Boolean HOLD_BROWSER_OPEN = false;
    /** Clear the directory with the screen before starting the build **/
    public static final Boolean CLEAR_REPORT_DIR = true;

}
