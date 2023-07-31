package utilities;

import com.ctc.wstx.util.StringUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Util {
    public static void takeScreenShots(WebDriver driver, String testCaseName) throws Exception {
        TakesScreenshot ts = ((TakesScreenshot)driver);
        File src = ts.getScreenshotAs(OutputType.FILE);
        String time = Long.toString(System.currentTimeMillis());
        System.out.println(System.getProperty("user.dir"));
        File trg = new File(System.getProperty("user.dir")+"\\screenshots\\"+testCaseName+"\\"+time+".jpg");
        FileUtils.copyFile(src,trg);
    }
}
