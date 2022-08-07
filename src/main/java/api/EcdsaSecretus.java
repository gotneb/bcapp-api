package api;

import static spark.Spark.get;

public class EcdsaSecretus {
    private Api api;
    private bcapp.EcdsaSecretus lib;

    public Api getApi() { return api; }
    public void setApi(Api api) { this.api = api; }

    public bcapp.EcdsaSecretus getLib() { return lib; }
    public void setLib(bcapp.EcdsaSecretus lib) { this.lib = lib; }

    private String toJson(Object obj) { return getApi().getGson().toJson(obj); }

    public EcdsaSecretus(Api api) {
        setApi(api);
        setLib(new bcapp.EcdsaSecretus());
    }

    public void start() {
        get("/knum/:ha4/:pvtkey/:e", (req, res) -> {
            res.type("application/json");
            String ha4 = req.params("ha4");
            String pvtKey = req.params("pvtkey");
            String e = req.params("e");

            return toJson(lib.Knum(ha4, pvtKey, e));
        });

        // TODO: endpoint ECDSA

        get("/ecdsabsv/:e/:pvtkey/:ha4", (req, res) -> {
            res.type("application/json");
            String ha4 = req.params("ha4");
            String pvtKey = req.params("pvtkey");
            String e = req.params("e");

            return toJson(lib.ECDSABSV(e, pvtKey, ha4));
        });

        // TODO: endpoint ECDSAVerify3

        // TODO: endpoint ECDSAVerify

        // TODO: should I do endpoint for eccNPoint? Cuz, since it's private, I don't think it should be avaliable as endpoint
    }
}
