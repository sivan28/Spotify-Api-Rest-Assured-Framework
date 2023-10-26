package com.spotify.utils;

import java.util.Properties;

public class DataLoader {
    private Properties properties;
    private static DataLoader dataLoader = null;

    private DataLoader() {
        properties = PropertyUtils.loadProperties("src/main/resources/data.properties");
    }

    public static DataLoader getInstance() {
        if(dataLoader == null){
            dataLoader = new DataLoader();
        }
        return dataLoader;
    }

    public String getPlaylistid(){
        return properties.getProperty("playlist_id");
    }
}
