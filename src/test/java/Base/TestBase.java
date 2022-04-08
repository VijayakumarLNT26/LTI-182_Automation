package Base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TestBase {
	
	public Properties prop;
	public final String configFilePath  = "Configs//Config.properties";
	public static WebDriver driver;
	public RemoteWebDriver driver1;
	public static String webDrivePath=System.getProperty("user.dir");
	

	  
	public void configReader()
	{
		BufferedReader reader;
		System.out.println("in config reader "+configFilePath);
		
		try
		{
			reader = new BufferedReader(new FileReader(configFilePath));
			prop = new Properties();
			try
			{
				prop.load(reader);
				reader.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Config.properties file not found at: "+configFilePath);
		}
	}

	public WebDriver selectBrowser(String browser)
	{

		if(browser.equalsIgnoreCase("chrome"))
		{
		    //System.setProperty("webdriver.chrome.driver", "D:\\BL_BDD_Framework\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", webDrivePath + "/webdrivers/chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofMillis(1000));
		    System.out.println("i am in TestBase");
		    configReader();
		    driver.get(prop.getProperty("url"));
		}
		else
		{
			System.setProperty("webdriver.edge.driver", webDrivePath + "/webdrivers/msedgedriver.exe");
			//System.setProperty("webdriver.edge.driver", "D:\\BL_BDD_Framework\\msedgedriver.exe");
	        WebDriver driver = new EdgeDriver();
		    driver.manage().window().maximize();
		    configReader();
		    driver.get(prop.getProperty("url"));
			
		}
		return driver;
		
	}
	
	public void browserStacklaunch() throws Exception 
	{
	  String AUTOMATE_USERNAME = "vijayakumar_MtUTa6";
	  String AUTOMATE_ACCESS_KEY = "mhbxsSKC79xjRfWKX11y";
	 // String URL = "https://hub-cloud.browserstack.com/wd/hub";
	  final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  
	  	configReader();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserstack.user", "vijayakumar_MtUTa6");
		caps.setCapability("browserstack.key", "mhbxsSKC79xjRfWKX11y");
	    caps.setCapability("browser", prop.getProperty("browser"));
	   // caps.setCapability("device", prop.getProperty("device"));
	    caps.setCapability("browser_version", prop.getProperty("browserVersion"));
	    caps.setCapability("build", "alpha_0.1.7");
	    //caps.setCapability("realMobile", "true");
	    caps.setCapability("os", prop.getProperty("os"));
	    caps.setCapability("os_version", prop.getProperty("os_version"));
	    //caps.setCapability("browserstack.local", "true");
	    caps.setCapability("name", "BL Lacapitale Test1"); // test name
	    caps.setCapability("browserstack.console", "enable");
	    //caps.setCapability("browserstack.idleTimeout", 120);
	    caps.setCapability("browserstack.debug", "false");
	    
	    //caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
	    
	    System.out.println("in browserstack function");
	    try
	    {
	    	 driver = new RemoteWebDriver(new java.net.URL(URL),caps);
	    }
	    catch(MalformedURLException e)
	    {
	    	e.printStackTrace();
	    }
	    
	    
	   // driver.manage().window().maximize();
	    driver.get(prop.getProperty("url"));
	    
	    		
	    //return driver;
	}

}
