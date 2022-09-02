# BCAPP
 A BCAPP's api library written using [Spark Web Framework.](https://sparkjava.com/)
 
 :white_circle: All of them return in a JSON format.
 
 ### :bookmark: ECC's endpoints
 
<details><summary>modp</summary><p>

#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/modp/<n>/<p1>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  n |  Big Integer |
|  p1 |  Big Integer |

</p>

</details>

<details><summary>inverse</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/inverse/<r>/<p>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  r |  Big Integer |
|  p |  Big Integer |

</p>

</details>

<details><summary>doublep</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/doublep/<x>/<y>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  x |  Big Integer |
|  y |  Big Integer |

</p>

</details>

<details><summary>addp</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/addp/<x1>/<y1>/<x2>/<y2>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  x1 |  Big Integer |
|  y1 |  Big Integer |
|  x2 |  Big Integer |
|  y2 |  Big Integer |

</p>

</details>

<details><summary>eccnp</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/eccnp/<n>/<x>/<y>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  n |  Big Integer |
|  x |  Big Integer |
|  y |  Big Integer |

</p>

</details>

### :bookmark: TonelliShanks's endpoints

<details><summary>pow_mod</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/pow_mod/<base>/<expoent>/<modulus>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  base |  Big Integer |
|  expoent |  Big Integer |
|  modulus |  Big Integer |

</p>

</details>

<details><summary>sqrtcf</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/sqrtcf/<n>/<p>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  n |  Big Integer |
|  p |  Big Integer |

</p>

</details>

### :bookmark: EcdsaSecretus' endpoints

<details><summary>knum</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/knum/<HA4>/<PVTKEY>/<e>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  HA4 |  String |
|  PVTKEY |  String |
|  e |  String |

</p>

</details>

<details><summary>ecdsabsv</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/ecdsabsv/<e>/<PVTKEY>/<HA4>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| e | String |
| PVTKEY | String |
| HA4 | String |

</p>
</details>

- [ ] ECDSAVerify3 :warning:

- [ ] ECDSAVerify :warning:

### :bookmark: Keygen's endpoints
 
<details><summary>publicKey</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/public-key/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>

<details><summary>stringToHEXString</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/string-to-hex-string/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>

<details><summary>publicKeyHEX</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/public-key-hex/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>


<details><summary>publicKeyCompSEC</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/public-key-comp-sec/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>


<details><summary>publicKeyUncompSEC</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/public-key-uncomp-sec/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>

<details><summary>pvtKey2</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/pvt-key-2/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>

<details><summary>secKey</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/sec-key/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>

<details><summary>secKeyHashToBigInt</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/sec-key-hash-to-big-int/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>

<details><summary>HashToBigInt</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/hash-to-big-int/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>

<details><summary>HashToBigIntWIF</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/hash-to-big-int-wif/<text>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  text |  String |

</p></details>

<details><summary>encKeyToHexSTR</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/enc-key-to-hex-str/<point[0]>/<point[1]>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| point | BigInteger[] |

</p></details>

<details><summary>encKeyHalfToHexSTR</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/enc-key-half-to-hex-str/<point>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  point | BigInteger |

</p></details>

<details><summary>encKeyHalfToByteSTR</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/enc-key-half-to-byte-str/<point>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  point | BigInteger |

</p></details>

<details><summary>pubKeyRev</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/pub-key-rev/<pubkey>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  pubkey | String |

</p></details>

</p></details>

<details><summary>pubKeyCompSECRev</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/pub-key-comp-sec-rev/<pubkey>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  pubkey | String |

</p></details>

<details><summary>pubKeyUncompSECRev</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/pub-key-uncomp-sec-rev/<pubkey>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
|  pubkey | String |

</p></details>

<details><summary>bsvWallet</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/bsv-wallet/<pubkeyCOD>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| pubkeyCOD | String |

</p></details>

<details><summary>bsvWalletFull</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/bsv-wallet-full/<pubkeyCOD>/<compressed>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| pubkeyCOD | String |
| compressed | Boolean |

</p></details>

</p></details>

<details><summary>addRMD</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/addRMD/<hashKey>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| hashKey | String |

</p></details>

<details><summary>getAddressFromRMDHash</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/get-address-from-rmd-hash/<ripemdHash>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| ripemdHash | String |

</p></details>

<details><summary>bsvWalletRMD160</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/bsv-wallet-rmd160/<pubkeyCOD>/<compressed>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| pubkeyCOD | String |
| compressed | Boolean |

</p></details>

<details><summary>bsvPKvsWALLET</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/bsv-pk-vs-wallet/<pubkeyCOD>/<walletRMD>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| pubkeyCOD | String |
| walletRMD | String |

</p></details>

<details><summary>sigDERrev</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/sig-der-rev/<signECDSA>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| signECDSA | String |

</p></details>

<details><summary>sigDER</summary><p>
 
#### HTTP Request

```
GET https://bcapp-spark.herokuapp.com/sig-der/<signECDSA[0]>/<signECDSA[1]>
```
 #### URL Parameters

| Parameter  |  Description  |
| --- | --- |
| signECDSA | BigInteger[] |

</p></details>

## :memo: TODO
 - [x] Ecc
 - [x] TonelliShanks
 - [x] EcdsaSecretus
 - [x] Keygen
 - [ ] Ripemd160
 - [ ] SHA256
