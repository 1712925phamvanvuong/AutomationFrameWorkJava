package auto.driver;

import org.apache.logging.log4j.Logger;
import org.apache.maven.shared.utils.StringUtils;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.Hashtable;

public class DriverManager {
    private Logger logger;

    public DriverManager(){
        this.logger = logger;
    }
    public static class Builder {
        private Logger logger;
        private String strDesiredBrowserType = "chrome";
        private boolean boolRemoteMote = false;
        private String strGridURL = "";
        private boolean boolHeadlessMode = false;
        private boolean boolProxyMode = false;
        private String strProxyHost;
        private String strProxyPort;
        private String strDesiredPlatform;
        private String strDesiredBrowserVersion;
        private int intScreenWidth = 1920;
        private int intScreenHeight = 1080;
        private boolean boolCapByOption = true;
        private DesiredCapabilities desiredCapabilities;
        private FirefoxOptions firefoxOptions;
        private ChromeOptions chromeOptions;
        private InternetExplorerOptions internetExplorerOptions;
        private Hashtable<String, String> htbStrStrAdditionalCapabilities;
        private Hashtable<String, Boolean> htbStrBoolAdditionalCapabilities;
        private Hashtable<String, Object> htbStrObjAdditionalCapabilities;
        private ArrayList<String> alisStrArgument;

        public Builder(){

        }

        public Builder(Logger logger){
            this.logger = logger;
        }

        public Builder setDesiredBrowserType(String strDesiredBrowserType){
            this.strDesiredBrowserType = strDesiredBrowserType;
            return this;
        }

        public Builder setLogger(Logger logger){
            this.logger = logger;
            return this;
        }

        public Builder setBoolRemoteMote(boolean boolRemoteMote){
            this.boolRemoteMote = boolRemoteMote;
            return this;
        }

        public Builder setStrGridURL(String strGridURL){
            this.strGridURL = strGridURL;
            return this;
        }

        public Builder setBoolHeadlessMode(boolean boolHeadlessMode){
            this.boolHeadlessMode = boolHeadlessMode;
            return this;
        }

        public Builder setBoolProxyMode(boolean boolProxyMode){
            this.boolProxyMode = boolProxyMode;
            return this;
        }

        public Builder setStrProxyHost(String strProxyHost){
            this.strProxyHost = strProxyHost;
            return this;
        }

        public Builder setStrProxyPort(String strProxyHost){
            this.strProxyPort = strProxyPort;
            return this;
        }

        public Builder setStrDesiredPlatform(String strDesiredPlatform){
            this.strDesiredPlatform = strDesiredPlatform;
            return this;
        }

        public Builder setStrDesiredBrowserVersion(String strDesiredBrowserVersion){
            this.strDesiredBrowserVersion = strDesiredBrowserVersion;
            return this;
        }

        public Builder setIntScreenWidth(int intScreenWidth){
            this.intScreenWidth = intScreenWidth;
            return this;
        }

        public Builder setIntScreenHeight(int intScreenHeight){
            this.intScreenHeight = intScreenHeight;
            return this;
        }

        public Builder setBoolCapByOption(boolean boolCapByOption){
            this.boolCapByOption = boolCapByOption;
            return this;
        }

        public Builder buildCapabilities(){
            //instantiate capabilities objects
            logger.debug("Build desired capabilities objects");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            ChromeOptions chromeOptions = new ChromeOptions();
            InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();

            //desired browser type
            if(!StringUtils.isEmpty(strDesiredBrowserType)){
                logger.debug("Set browser name: " + strDesiredBrowserType);
                desiredCapabilities.setCapability("browserName", strDesiredBrowserType);
            }
            else{
                logger.warn("Browser name is empty");
                logger.warn("Fail-safe to Chrome");
                strDesiredBrowserType = "chrome";
                desiredCapabilities.setCapability("browserName", strDesiredBrowserType);
            }

            //desired browser version
            if(!StringUtils.isEmpty(strDesiredBrowserVersion)){
                logger.debug("Set browser version: " + strDesiredBrowserVersion);
                desiredCapabilities.setCapability("version", strDesiredBrowserVersion);
                firefoxOptions.setCapability("version", strDesiredBrowserVersion);
                chromeOptions.setCapability("version", strDesiredBrowserVersion);
                internetExplorerOptions.setCapability("version", strDesiredBrowserVersion);
            }
            else{
                logger.warn("Desired browser version is empty - will match any version");
            }

            //desired platform
            if(!StringUtils.isEmpty(strDesiredPlatform)){
                logger.debug("Set platform: " + strDesiredPlatform);
                desiredCapabilities.setCapability("platformName", strDesiredPlatform);
                firefoxOptions.setCapability("platformName", strDesiredPlatform);
                chromeOptions.setCapability("platformName", strDesiredPlatform);
                internetExplorerOptions.setCapability("platformName", strDesiredPlatform);
            }
            else{
                logger.warn("Platform name is empty - will match any platform");
            }

            if(boolHeadlessMode){
                if(strDesiredBrowserType.toLowerCase().equals("internet explorer")){
                    logger.warn("Internet Explorer has not headless mode - this parameter wont affect");
                }

            }
        }
    }
}
