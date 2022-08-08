package api;

import static spark.Spark.get;

import java.math.BigInteger;

public class Keygen {
    private Api api;
    private bcapp.Keygen lib;

    public Api getApi() { return api; }
    public void setApi(Api api) { this.api = api; }

    public bcapp.Keygen getLib() { return lib; }
    public void setLib(bcapp.Keygen lib) { this.lib = lib; }

    private String toJson(Object obj) { return getApi().getGson().toJson(obj); }

    public Keygen(Api api) {
        setApi(api);
        setLib(new bcapp.Keygen());
    }

    public void start() {
        get("/public-key/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.publicKey(text));
        });

        get("/string-to-hex-string/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.stringToHEXString(text));
        });

        get("/public-key-hex/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.publicKeyHEX(text));
        });

        get("/public-key-comp-sec/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.publicKeyCompSEC(text));
        });

        get("/public-key-uncomp-sec/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.publicKeyUncompSEC(text));
        });

        get("/pvt-key-2/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.pvtKey2(text));
        });

        get("/sec-key/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.secKey(text));
        });

        get("/sec-key-hash-to-big-int/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.secKeyHashToBigInt(text));
        });

        get("/hash-to-big-int/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.HashToBigInt(text));
        });

        get("/hash-to-big-int-wif/:text", (req, res) -> {
            res.type("application/json");
            String text = req.params("text");
            return toJson(lib.HashToBigIntWIF(text));
        });

        // TODO: endopoint String encKeyToHexSTR (BigInteger [] point)

        get("/enc-key-half-to-hex-str/:point", (req, res) -> {
            res.type("application/json");
            BigInteger point = new BigInteger(req.params("point"));
            return toJson(lib.encKeyHalfToHexSTR(point));
        });

        get("/enc-key-half-to-byte-str/:point", (req, res) -> {
            res.type("application/json");
            BigInteger point = new BigInteger(req.params("point"));
            return toJson(lib.encKeyHalfToByteSTR(point));
        });

        get("/pub-key-rev/:pubkey", (req, res) -> {
            res.type("application/json");
            String pubkey = req.params("pubkey");
            return toJson(lib.pubKeyRev(pubkey));
        });

        get("/pub-key-comp-sec-rev/:pubkey", (req, res) -> {
            res.type("application/json");
            String pubkey = req.params("pubkey");
            return toJson(lib.pubKeyCompSECRev(pubkey));
        });

        get("/pub-key-uncomp-sec-rev/:pubkey", (req, res) -> {
            res.type("application/json");
            String pubkey = req.params("pubkey");
            return toJson(lib.pubKeyUncompSECRev(pubkey));
        });

        get("/bsv-wallet/:pubkeyCOD", (req, res) -> {
            res.type("application/json");
            String pubkeyCOD = req.params("pubkeyCOD");
            return toJson(lib.bsvWallet(pubkeyCOD));
        });

        get("/bsv-wallet-full/:pubkeyCOD/:compressed", (req, res) -> {
            res.type("application/json");
            String pubkeyCOD = req.params("pubkeyCOD");
            Boolean isCompressed = Boolean.parseBoolean(req.params("compressed"));
            return toJson(lib.bsvWalletFull(pubkeyCOD, isCompressed));
        });

        get("/addRMD/:hashKey", (req, res) -> {
            res.type("application/json");
            String hashKey = req.params("hashKey");
            return toJson(lib.addRMD(hashKey));
        });

        get("/get-address-from-rmd-hash/:ripemdHash", (req, res) -> {
            res.type("application/json");
            String ripemdHash = req.params("ripemdHash");
            return toJson(lib.getAddressFromRMDHash(ripemdHash));
        });

        get("/bsv-wallet-rmd160/:pubkeyCOD/:compressed", (req, res) -> {
            res.type("application/json");
            String pubkeyCOD = req.params("pubkeyCOD");
            Boolean isCompressed = Boolean.parseBoolean(req.params("compressed"));
            return toJson(lib.bsvWalletRMD160(pubkeyCOD, isCompressed));
        });

        get("/bsv-pk-vs-wallet/:pubkeyCOD/:walletRMD", (req, res) -> {
            res.type("application/json");
            String pubkeyCOD = req.params("pubkeyCOD");
            String walletRMD = req.params("walletRMD");
            return toJson(lib.bsvPKvsWALLET(pubkeyCOD, walletRMD));
        });

        get("/sig-der-rev/:signECDSA", (req, res) -> {
            res.type("application/json");
            String signECDSA = req.params("signECDSA");
            return toJson(lib.sigDERrev(signECDSA));
        });

        // TODO: endpoint String sigDER (BigInteger[] signECDSA)
    }
}
