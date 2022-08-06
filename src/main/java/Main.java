import static spark.Spark.*;

import java.math.BigInteger;
import com.google.gson.Gson;

import bcapp.Ecc;

public class Main {

    public static void main(String[] args) {
        port(getHerokuAssignedPort());

        Ecc ecc = new Ecc();
        Gson gson = new Gson();

        get("/", (req, res) -> "Hello :D");

        get("/modp/:n/:p1", (req, res) -> {
            res.type("application/json");
            BigInteger n = new BigInteger(req.params("n"));
            BigInteger p1 = new BigInteger(req.params("p1"));

            return gson.toJson(ecc.modp(n, p1));
        });

        get("/inverse/:r/:p", (req, res) -> {
            res.type("application/json");
            BigInteger r = new BigInteger(req.params("r"));
            BigInteger p = new BigInteger(req.params("p"));

            return gson.toJson(ecc.inverse(r, p));
        });

        get("/doublep/:x/:y", (req, res) -> {
            res.type("application/json");
            BigInteger x = new BigInteger(req.params("x"));
            BigInteger y = new BigInteger(req.params("y"));

            return gson.toJson(ecc.doublep(x, y));
        });

        get("/addp/:x1/:y1/:x2/:y2", (req, res) -> {
            res.type("application/json");
            BigInteger x1 = new BigInteger(req.params("x1"));
            BigInteger x2 = new BigInteger(req.params("x2"));
            BigInteger y1 = new BigInteger(req.params("y1"));
            BigInteger y2 = new BigInteger(req.params("y2"));

            return gson.toJson(ecc.addp(x1, y1, x2, y2));
        });

        get("/eccnp/:n/:x/:y", (req, res) -> {
            res.type("application/json");
            BigInteger n = new BigInteger(req.params("n"));
            BigInteger x = new BigInteger(req.params("x"));
            BigInteger y = new BigInteger(req.params("y"));

            return gson.toJson(ecc.eccnP(n, x, y));
        });
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
