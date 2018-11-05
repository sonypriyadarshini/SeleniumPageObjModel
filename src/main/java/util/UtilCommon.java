package util;

import base.BaseCommon;

public class UtilCommon extends BaseCommon {
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 10;

    public void switchToFrameMainPanel(){
        driver.switchTo().frame("mainpanel");
    }
}
