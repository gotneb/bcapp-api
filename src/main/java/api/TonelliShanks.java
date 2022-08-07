package api;

import static spark.Spark.get;

import java.math.BigInteger;

public class TonelliShanks {
    private Api api;
    private bcapp.TonelliShanks lib;

    public Api getApi() { return api; }
    public void setApi(Api api) { this.api = api; }

    public bcapp.TonelliShanks getLib() { return lib; }
    public void setLib(bcapp.TonelliShanks lib) { this.lib = lib; }

    private String toJson(Object obj) { return getApi().getGson().toJson(obj); }

    public TonelliShanks(Api api) {
        setApi(api);
        setLib(new bcapp.TonelliShanks());
    }

    public void start() {
        get("/pow_mod/:base/:expoent/:modulus", (req, res) -> {
            res.type("application/json");
            BigInteger base = new BigInteger(req.params("base"));
            BigInteger expoent = new BigInteger(req.params("expoent"));
            BigInteger modulus = new BigInteger(req.params("modulus"));

            return toJson(lib.pow_mod(base, expoent, modulus));
        });

        get("/sqrtcf/:n/:p", (req, res) -> {
            res.type("application/json");
            BigInteger n = new BigInteger(req.params("n"));
            BigInteger p = new BigInteger(req.params("p"));

            return toJson(lib.sqrtCF(n, p));
        });
    }
}
