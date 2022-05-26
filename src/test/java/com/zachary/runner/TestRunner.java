package com.zachary.runner;

//import com.zachary.poms.*;

import io.cucumber.junit.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "com/zachary/steps",
        plugin = {"pretty", "html:repoDocumentation/e2e-report.html"}
)

public class TestRunner {
    public static WebDriver driver;
    public static WebDriverWait wait;

    //public static PomClassName pomName;

    @BeforeClass
    public static void setup() {
        File file = new File ("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();

        //pomName = new PomClassName(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}
