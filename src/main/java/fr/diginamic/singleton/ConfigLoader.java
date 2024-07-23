package fr.diginamic.singleton;

import java.util.ResourceBundle;

public class ConfigLoader
{
    private static ConfigLoader instance;
    private ResourceBundle configuration;

    private ConfigLoader()
    {
        configuration = ResourceBundle.getBundle("configuration");
    }

    public static ConfigLoader getInstance()
    {
        if (instance == null)
        {
            synchronized (ConfigLoader.class)
            {
                if (instance == null)
                    instance = new ConfigLoader();
            }
        }
        return instance;
    }

    public String getProperty(String key)
    {
        return configuration.getString(key);
    }
}