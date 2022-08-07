package api;

import static spark.Spark.port;
import static spark.Spark.get;

import com.google.gson.Gson;

public class Api {
    private Gson gson;
    private Ecc ecc;
    private TonelliShanks tonelliShanks;

    public Gson getGson() { return gson; }
    public void setGson(Gson gson) { this.gson = gson; }

    public Ecc getEcc() {return ecc; }
    public void setEcc(Ecc ecc) { this.ecc = ecc; } 

    public TonelliShanks getTonelliShanks() {return tonelliShanks; }
    public void setTonelliShanks(TonelliShanks tonelliShanks) {
        this.tonelliShanks = tonelliShanks;
    }

    public Api() {
        gson = new Gson();

        setEcc(new Ecc(this));
        setTonelliShanks(new TonelliShanks(this));
    }

    public void listen() {
        port(getHerokuAssignedPort());
        get("/", (req, res) -> "Hello World!\nApi made by Gabriel.");

        getEcc().start();
        getTonelliShanks().start();
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
