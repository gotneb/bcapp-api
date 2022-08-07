# BCAPP
 A BCAPP's api library written using [Spark Web Framework.](https://sparkjava.com/)
 
 :white_circle: All of them return in a JSON format.
 
 ### :bookmark: ECC's endpoints
 
<details><summary>modp</summary><p>
 
It has the same parameters meaning from Ecc.modp(BigInteger n, BigInteger p1). [See java file.](https://github.com/carlosamcruz/BCAPP/blob/master/app/src/main/java/com/nibblelinx/BCAPP/Ecc.java#L47)
 
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
 
It has the same parameters meaning from Ecc.inverse(BigInteger r, BigInteger p). [See java file.](https://github.com/carlosamcruz/BCAPP/blob/master/app/src/main/java/com/nibblelinx/BCAPP/Ecc.java#L54)
 
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
 
It has the same parameters meaning from Ecc.doublep(BigInteger x, BigInteger y). [See java file.](https://github.com/carlosamcruz/BCAPP/blob/master/app/src/main/java/com/nibblelinx/BCAPP/Ecc.java#L81)
 
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
 
It has the same parameters meaning from Ecc.addp(BigInteger x1, BigInteger y1, BigInteger x2, BigInteger y2). [See java file.](https://github.com/carlosamcruz/BCAPP/blob/master/app/src/main/java/com/nibblelinx/BCAPP/Ecc.java#L96)
 
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
 
It has the same parameters meaning from Ecc.eccnP(BigInteger n, BigInteger x, BigInteger y). [See java file.](https://github.com/carlosamcruz/BCAPP/blob/master/app/src/main/java/com/nibblelinx/BCAPP/Ecc.java#L128)
 
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

## :memo: TODO
 - [x] Ecc
 - [x] TonelliShanks
 - [x] EcdsaSecretus
 - [ ] Keygen
 - [ ] Ripemd160
 - [ ] SHA256
