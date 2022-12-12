package ReportsDemo.ExtentReportDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {

    public static String getScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot (ts)
        // assign current driver to it ,
        // type cast it into TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. using this object call the method getScreenshotAs()
        // store the value ( return by this method)
        // into a file object
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_ddMMyyyy_hhmmss").format(new Date());
        // FDS PSD
        String fileName = "IMG"+timeStamp+".png";

        // 3. copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("Report\\screenshots\\"+fileName));

        return fileName;
    }



    public static ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Regression Testing");
        reporter.config().setDocumentTitle("Stock Management system");

        extent.setSystemInfo("Project Name","Stock Management system" );
        extent.setSystemInfo("Developers Name","Priyanka" );
        extent.setSystemInfo("Testers Name","Anuja" );
        extent.setSystemInfo("Team size","12" );
        extent.setSystemInfo("Project Deadline","Dec End" );

        return extent;
    }
}
