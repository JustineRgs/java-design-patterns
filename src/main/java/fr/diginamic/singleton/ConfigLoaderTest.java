package fr.diginamic.singleton;

public class ConfigLoaderTest
{
    public static void main(String[] args)
    {
        ConfigLoader configLoader = ConfigLoader.getInstance();

        String dbUrl = configLoader.getProperty("db.url");
        String dbUser = configLoader.getProperty("db.user");
        String dbPassword = configLoader.getProperty("db.password");

        System.out.println("URL de la base de donnée : " + dbUrl);
        System.out.println("Nom d'utilisateur : " + dbUser);
        System.out.println("Mot de passe : " + dbPassword);
    }
}