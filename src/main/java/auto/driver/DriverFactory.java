package auto.driver;

import org.apache.logging.log4j.Logger;
import org.apache.maven.shared.utils.StringUtils;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.Hashtable;

public class DriverFactory {
    private Logger logger;
    private String strDesiredBrowserType;
    private boolean boolRemoteMote;
    private static String strGridURL;
    private boolean boolHeadlessMode;
    private boolean boolProxyMode;
    private String strProxyHost;
    private String strProxyPort;
    private String strDesiredPlatform;
    private String strDesiredBrowserVersion;
    private int intScreenWidth;
    private int intScreenHeight;
    private boolean boolCapByOption;
    private DesiredCapabilities desiredCapabilities;
    private FirefoxOptions firefoxOptions;
    private ChromeOptions chromeOptions;
    private InternetExplorerOptions internetExplorerOptions;
    private Hashtable<String, String> htbStrStrAdditionalCapabilities;
    private Hashtable<String, Boolean> htbStrBoolAdditionalCapabilities;
    private Hashtable<String, Object> htbStrObjAdditionalCapabilities;
    private ArrayList<String> alisStrArgument;

    public DriverFactory(Builder builder){
        this.logger = builder.logger;
        this.strDesiredBrowserType = builder.strDesiredBrowserType;
        this.boolRemoteMote = builder.boolRemoteMote;
        strGridURL = builder.strGridURL;
        this.boolHeadlessMode = builder.boolHeadlessMode;
        this.boolProxyMode = builder.boolProxyMode;
        this.strProxyHost = builder.strProxyHost;
        this.strProxyPort = builder.strProxyPort;
        this.strDesiredPlatform = builder.strDesiredPlatform;
        this.strDesiredBrowserVersion = builder.strDesiredBrowserVersion;
        this.intScreenWidth = builder.intScreenWidth;
        this.intScreenHeight = builder.intScreenHeight;
        this.boolCapByOption = builder.boolCapByOption;
        this.desiredCapabilities = builder.desiredCapabilities;
        this.firefoxOptions = builder.firefoxOptions;
        this.chromeOptions = builder.chromeOptions;
        this.internetExplorerOptions = builder.internetExplorerOptions;
        this.htbStrStrAdditionalCapabilities = builder.htbStrStrAdditionalCapabilities;
        this.htbStrBoolAdditionalCapabilities = builder.htbStrBoolAdditionalCapabilities;
        this.htbStrObjAdditionalCapabilities = builder.htbStrObjAdditionalCapabilities;
        this.alisStrArgument = builder.alisStrArgument;
    }

    public String getStrDesiredBrowserType(){
        return strDesiredBrowserType;
    }

    public void setStrDesiredBrowserType(String strDesiredBrowserType){
        this.strDesiredBrowserType = strDesiredBrowserType;
    }

    public boolean isBoolRemoteMote(){
        return boolRemoteMote;
    }

    public void setBoolRemoteMote(boolean boolRemoteMote){
        this.boolRemoteMote = boolRemoteMote;
    }

    public String getStrGridURL(){
        return strGridURL;
    }

    public void setStrGridURL(String strGridURL){
        DriverFactory.strGridURL = strGridURL;
    }

    public boolean isBoolHeadlessMode(){
        return boolHeadlessMode;
    }

    public void setBoolHeadlessMode(boolean boolHeadlessMode){
        this.boolHeadlessMode = boolHeadlessMode;
    }

    public boolean isBoolProxyMode(){
        return boolProxyMode;
    }

    public void setBoolProxyMode(boolean boolProxyMode){
        this.boolProxyMode = boolProxyMode;
    }

    public String getStrProxyHost(){
        return strProxyHost;
    }

    public void setStrProxyHost(String strProxyHost){
        this.strProxyHost = strProxyHost;
    }

    public String getStrProxyPort(){
        return strProxyPort;
    }

    public void setStrProxyPort(String strProxyPort){
        this.strProxyPort = strProxyPort;
    }

    public String getStrDesiredPlatform(){
        return strDesiredPlatform;
    }

    public void setStrDesiredPlatform(String strDesiredPlatform){
        this.strDesiredPlatform = strDesiredPlatform;
    }

    public String getStrDesiredBrowserVersion(){
        return strDesiredBrowserVersion;
    }

    public void setStrDesiredBrowserVersion(String strDesiredBrowserVersion){
        this.strDesiredBrowserVersion = strDesiredBrowserVersion;
    }

    public int getIntScreenWidth(){
        return intScreenWidth;
    }

    public void setIntScreenWidth(int intScreenWidth){
        this.intScreenWidth = intScreenWidth;
    }

    public int getIntScreenHeight(){
        return intScreenHeight;
    }

    public void setIntScreenHeight(){
        this.intScreenHeight = intScreenHeight;
    }

    public boolean isBoolCapByOption(){
        return boolCapByOption;
    }

    public void setBoolCapByOption(boolean boolCapByOption){
        this.boolCapByOption = boolCapByOption;
    }

    public DesiredCapabilities getDesiredCapabilities(){
        return desiredCapabilities;
    }

    public void setDesiredCapabilities(DesiredCapabilities desiredCapabilities){
        this.desiredCapabilities = desiredCapabilities;
    }

    public FirefoxOptions getFirefoxOptions(){
        return firefoxOptions;
    }

    public void setFirefoxOptions(FirefoxOptions firefoxOptions){
        this.firefoxOptions = firefoxOptions;
    }

    public ChromeOptions getChromeOptions(){
        return chromeOptions;
    }

    public void setChromeOptions(ChromeOptions chromeOptions){
        this.chromeOptions = chromeOptions;
    }

    public InternetExplorerOptions getInternetExplorerOptions(){
        return internetExplorerOptions;
    }

    public void setInternetExplorerOptions(InternetExplorerOptions internetExplorerOptions){
        this.internetExplorerOptions = internetExplorerOptions;
    }

    public Hashtable<String, String> getHtbStrStrAdditionalCapabilities(){
        return htbStrStrAdditionalCapabilities;
    }

    public void setHtbStrStrAdditionalCapabilities(Hashtable<String, String> htbStrStrAdditionalCapabilities){
        this.htbStrStrAdditionalCapabilities = htbStrStrAdditionalCapabilities;
    }

    public Hashtable<String, Boolean> getHtbStrBoolAdditionalCapabilities(){
        return htbStrBoolAdditionalCapabilities;
    }

    public void setHtbStrBoolAdditionalCapabilities(Hashtable<String, Boolean> htbStrBoolAdditionalCapabilities){
        this.htbStrBoolAdditionalCapabilities = htbStrBoolAdditionalCapabilities;
    }

    public Hashtable<String, Object> getHtbStrObjAdditionalCapabilities(){
        return htbStrObjAdditionalCapabilities;
    }

    public void setHtbStrObjAdditionalCapabilities(Hashtable<String, Object> htbStrObjAdditionalCapabilities){
        this.htbStrObjAdditionalCapabilities = htbStrObjAdditionalCapabilities;
    }

    public ArrayList<String> getAlisStrArgument(){
        return alisStrArgument;
    }

    public void setAlisStrArgument(ArrayList<String> alisStrArgument){
        this.alisStrArgument = alisStrArgument;
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

            //headless mode for firefox and chrome
            if(boolHeadlessMode){
                if(strDesiredBrowserType.toLowerCase().equals("internet explorer")){
                    logger.warn("Internet Explorer has not headless mode - this parameter wont affect");
                }
                firefoxOptions.setHeadless(boolHeadlessMode);
                chromeOptions.setHeadless(boolHeadlessMode);
                logger.debug("%s will run as headless %s", strDesiredBrowserType, boolHeadlessMode);
            }

            //handle additional capabilities from hashtable<String, String>
            logger.debug("handle additional capabilities from hashtable<String, String>");
            if(htbStrStrAdditionalCapabilities!=null){
                htbStrStrAdditionalCapabilities.forEach((strCap, strValue) -> {
                    logger.debug(String.format("Set capability %s with value %s", strCap, strValue));
                    desiredCapabilities.setCapability(strCap, strValue);
                    firefoxOptions.setCapability(strCap, strValue);
                    chromeOptions.setCapability(strCap, strValue);
                    internetExplorerOptions.setCapability(strCap, strValue);
                });
            }
            else{
                logger.warn("No additional capability is found");
            }

            //handle additional capabilities from hashtable<String, Boolean>
            logger.debug("handle additional capabilities from hashtable<String, Boolean>");
            if(htbStrBoolAdditionalCapabilities!=null){
                htbStrBoolAdditionalCapabilities.forEach((strCap, boolValue) -> {
                    logger.debug(String.format("Set capability %s with value %s", strCap, boolValue));
                    desiredCapabilities.setCapability(strCap, boolValue);
                    firefoxOptions.setCapability(strCap, boolValue);
                    chromeOptions.setCapability(strCap, boolValue);
                    internetExplorerOptions.setCapability(strCap, boolValue);
                });
            }
            else {
                logger.warn("No additional capability is found");
            }

            //handle additional capabilities from hashtable<String, Object>
            logger.debug("handle additional capabilities from hashtable<String, Object>");
            if(htbStrObjAdditionalCapabilities!=null){
                htbStrObjAdditionalCapabilities.forEach((strCap, objValue) -> {
                    logger.debug(String.format("Set capability %s with value %s", strCap, objValue));
                    desiredCapabilities.setCapability(strCap, objValue);
                    firefoxOptions.setCapability(strCap, objValue);
                    chromeOptions.setCapability(strCap, objValue);
                    internetExplorerOptions.setCapability(strCap, objValue);
                });
            }
            else {
                logger.warn("No additional capability is found");
            }

            //handle arguments
            logger.debug("handle additional arguments");
            if(alisStrArgument!=null){
                logger.debug("Additional arguments list is found");
                if(strDesiredBrowserType.toLowerCase().equals("internet explorer")){
                    logger.warn("Browser: %s - skip arguments", strDesiredBrowserType);
                }
                chromeOptions.addArguments(alisStrArgument);
                firefoxOptions.addArguments(alisStrArgument);
            }

            this.desiredCapabilities = desiredCapabilities;
            this.firefoxOptions = firefoxOptions;
            this.chromeOptions = chromeOptions;
            this.internetExplorerOptions = internetExplorerOptions;

            return this;
        }

        public Builder setAdditionalCapability(String strCapName, String strCapValue){
            if(htbStrStrAdditionalCapabilities==null){
                logger.debug("Additional capability hashtable <String, String> is not instantiated");
                htbStrStrAdditionalCapabilities = new Hashtable<>();
            }
            htbStrStrAdditionalCapabilities.put(strCapName, strCapValue);
            logger.debug("Added new capability %s with value: %s", strCapName, strCapValue);
            return this;
        }

        public Builder setAdditionalCapability(String strCapName, Boolean boolValue){
            if(htbStrBoolAdditionalCapabilities==null){
                logger.debug("Additional capability hashtable <String, Boolean> is not instantiated");
                htbStrBoolAdditionalCapabilities = new Hashtable<>();
            }
            htbStrBoolAdditionalCapabilities.put(strCapName, boolValue);
            logger.debug("Added new capability %s with value: %b", strCapName, boolValue);
            return this;
        }

        public Builder setAdditionalCapability(String strCapName, Object objValue){
            if(htbStrBoolAdditionalCapabilities==null){
                logger.debug("Additional capability hashtable <String, Object> is not instantiated");
                htbStrObjAdditionalCapabilities = new Hashtable<>();
            }
            htbStrObjAdditionalCapabilities.put(strCapName, objValue);
            logger.debug("Added new capability %s with value: %s", strCapName, objValue.toString());
            return this;
        }

        public Builder setArguments(String strArg){
            if(alisStrArgument == null){
                logger.warn("list additional argument is null");
                alisStrArgument = new ArrayList<>();
            }
            alisStrArgument.add(strArg);
            return this;
        }

        public DriverFactory build(){
            return new DriverFactory(this);
        }
    }

    public DriverFactory(Logger logger){
        this.logger = logger;
    }


}
