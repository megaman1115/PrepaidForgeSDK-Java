# openapi-java-client

Prepaidforge API
- API version: 1.0

The public api for prepaidforge



## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.prepaidforge</groupId>
    <artifactId>prepaidforge-sdk-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:   

For a detailed instruction, look [here](java\example\sdk.playgroun\src\main\java\com\rando).   
```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.OrdersCodesApi;

import java.io.File;
import java.util.*;

public class OrdersCodesApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: PrepaidforgeAPIToken
        ApiKeyAuth PrepaidforgeAPIToken = (ApiKeyAuth) defaultClient.getAuthentication("PrepaidforgeAPIToken");
        PrepaidforgeAPIToken.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //PrepaidforgeAPIToken.setApiKeyPrefix("Token");

        OrdersCodesApi apiInstance = new OrdersCodesApi();
        SkuRequest skuRequest = new SkuRequest(); // SkuRequest | 
        try {
            CodeDeliveryPojo result = apiInstance.createSingleOrder(skuRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersCodesApi#createSingleOrder");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/api-1.0-SNAPSHOT/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrdersCodesApi* | [**createSingleOrder**](docs/OrdersCodesApi.md#createSingleOrder) | **POST** /1.0/createOrder | 
*OrdersCodesApi* | [**getResponseOfSingleCodeRequest**](docs/OrdersCodesApi.md#getResponseOfSingleCodeRequest) | **POST** /1.0/getResponseOfSingleCodeRequest | 
*ProductsStocksApi* | [**findAllProducts**](docs/ProductsStocksApi.md#findAllProducts) | **GET** /1.0/findAllProducts | 
*ProductsStocksApi* | [**findAllStocks**](docs/ProductsStocksApi.md#findAllStocks) | **POST** /1.0/findStocks | 
*UserApi* | [**signInWithApi**](docs/UserApi.md#signInWithApi) | **POST** /1.0/signInWithApi | 


## Documentation for Models

 - [ApiSignInResponse](docs/ApiSignInResponse.md)
 - [Brand](docs/Brand.md)
 - [Category](docs/Category.md)
 - [CodeDeliveryPojo](docs/CodeDeliveryPojo.md)
 - [Country](docs/Country.md)
 - [CountryPriceException](docs/CountryPriceException.md)
 - [Image](docs/Image.md)
 - [Language](docs/Language.md)
 - [MerchantSignInRequest](docs/MerchantSignInRequest.md)
 - [Money](docs/Money.md)
 - [Platform](docs/Platform.md)
 - [Product](docs/Product.md)
 - [SimpleStockPojo](docs/SimpleStockPojo.md)
 - [SkuRequest](docs/SkuRequest.md)
 - [StockRequest](docs/StockRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### PrepaidforgeAPIToken

- **Type**: API key
- **API key parameter name**: X-PrepaidForge-Api-Token
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



