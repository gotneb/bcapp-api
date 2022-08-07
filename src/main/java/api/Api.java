package api;

import static spark.Spark.port;
import static spark.Spark.get;

import com.google.gson.Gson;

public class Api {
    private Gson gson;
    // Endpoint classes
    private Ecc ecc;
    private TonelliShanks tonelliShanks;
    private EcdsaSecretus ecdsaSecretus;

    public Gson getGson() { return gson; }
    public void setGson(Gson gson) { this.gson = gson; }

    public Ecc getEcc() {return ecc; }
    public void setEcc(Ecc ecc) { this.ecc = ecc; } 

    public TonelliShanks getTonelliShanks() {return tonelliShanks; }
    public void setTonelliShanks(TonelliShanks tonelliShanks) {
        this.tonelliShanks = tonelliShanks;
    }

    public EcdsaSecretus getEcdsaSecretus() {return ecdsaSecretus;}
    public void setEcdsaSecretus(EcdsaSecretus ecdsaSecretus) {
        this.ecdsaSecretus = ecdsaSecretus;
    }

    public Api() {
        gson = new Gson();

        setEcc(new Ecc(this));
        setTonelliShanks(new TonelliShanks(this));
        setEcdsaSecretus(new EcdsaSecretus(this));
    }

    public void listen() {
        port(getHerokuAssignedPort());
        get("/", (req, res) -> "Hello World!\nApi made by Gabriel.");

        getEcc().start();
        getTonelliShanks().start();
        getEcdsaSecretus().start();
    }

    // It's needed by Heroku
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567;
    }
}
