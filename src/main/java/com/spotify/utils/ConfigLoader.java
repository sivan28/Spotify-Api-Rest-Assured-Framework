package com.spotify.utils;

import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private Properties properties = null;
    private static ConfigLoader configLoader = null;

    private ConfigLoader() {
        properties = PropertyUtils.loadProperties("src/main/resources/config.properties");
    }

    public static ConfigLoader getInstance() {
        if(configLoader == null){
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getClientId(){
       return properties.getProperty("client_id");
    }

    public String getClientSecret(){
        return properties.getProperty("client_secret");
    }

    public String getGrantType(){
        return properties.getProperty("grant_type");
    }

    public String getRefreshToken(){
        return properties.getProperty("refresh_token");
    }

    public String getUserId(){
        return properties.getProperty("user_id");
    }

    
}
