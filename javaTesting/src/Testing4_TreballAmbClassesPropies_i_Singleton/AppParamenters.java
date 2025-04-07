package Testing4_TreballAmbClassesPropies_i_Singleton;

public class AppParamenters {
    // afagit-hi objectes connexio de Base de Dades

    public static final String DOMAIN = "127.0.0.1";

    public static final String PORT = "80";

    //public static final Onject BD_CON = new ClasseConnecioBBDD();

    //public static Object MESSAGES_TRANSLATIONS;

    // Implementar SINGLETON PATTERN

    private static AppParamenters instance;

    private AppParamenters(){

    }

    private void initApp() {
        // codi necessari per la inicialitzacio de l'app
    }

    public void resertApp() {
        // codi per reconfiguarar l'App
    }

    public static AppParamenters getInstance() {
        if (instance == null) {
            instance = new AppParamenters();
        }

        return instance;
    }

    public static String deployedURL() {
        return "https://" + DOMAIN + ":" + PORT;
    }


}
