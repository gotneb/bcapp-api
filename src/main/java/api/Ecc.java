package api;

import static spark.Spark.get;

import java.math.BigInteger;

public class Ecc {
    private Api api;
    private bcapp.Ecc lib;

    public Api getApi() { return api; }
    public void setApi(Api api) { this.api = api; }

    public bcapp.Ecc getLib() { return lib; }
    public void setLib(bcapp.Ecc lib) { this.lib = lib; }

    private String toJson(Object obj) { return getApi().getGson().toJson(obj); }

    public Ecc(Api api) {
        setApi(api);
        setLib(new bcapp.Ecc());
    }

    // Listen cals
    public void start() {
        get("/modp/:n/:p1", (req, res) -> {
            res.type("application/json");
            BigInteger n = new BigInteger(req.params("n"));
            BigInteger p1 = new BigInteger(req.params("p1"));

            return toJson(lib.modp(n, p1));
        });

        get("/inverse/:r/:p", (req, res) -> {
            res.type("application/json");
            BigInteger r = new BigInteger(req.params("r"));
            BigInteger p = new BigInteger(req.params("p"));

            return toJson(lib.inverse(r, p));
        });

        get("/doublep/:x/:y", (req, res) -> {
            res.type("application/json");
            BigInteger x = new BigInteger(req.params("x"));
            BigInteger y = new BigInteger(req.params("y"));

            return toJson(lib.doublep(x, y));
        });

        get("/addp/:x1/:y1/:x2/:y2", (req, res) -> {
            res.type("application/json");
            BigInteger x1 = new BigInteger(req.params("x1"));
            BigInteger x2 = new BigInteger(req.params("x2"));
            BigInteger y1 = new BigInteger(req.params("y1"));
            BigInteger y2 = new BigInteger(req.params("y2"));

            return toJson(lib.addp(x1, y1, x2, y2));
        });

        get("/eccnp/:n/:x/:y", (req, res) -> {
            res.type("application/json");
            BigInteger n = new BigInteger(req.params("n"));
            BigInteger x = new BigInteger(req.params("x"));
            BigInteger y = new BigInteger(req.params("y"));

            return toJson(lib.eccnP(n, x, y));
        });
    }
}
