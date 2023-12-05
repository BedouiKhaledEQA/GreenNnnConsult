package com.GreenNnnConsult;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties props =new Properties();
    public Base(){
        try {
            File file = new File("src/main/java/com/GreenNnnConsult/Properties/Config.Properties");
            FileInputStream fis =new FileInputStream(file);
            props.load(fis);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void luncher(){
        if(props.getProperty("Browser").equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (props.getProperty("Browser").equalsIgnoreCase("Firefox")) {
            WebDriverManager.chromedriver().setup();
            driver=new FirefoxDriver();

        } else if (props.getProperty("Browser").equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(props.getProperty("url"));
    }
}
