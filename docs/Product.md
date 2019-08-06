

# Product

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**dateCreated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dateUpdated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**sku** | **String** |  | 
**name** | **String** |  |  [optional]
**gtin** | **String** |  |  [optional]
**ean** | **String** |  |  [optional]
**brand** | **String** |  |  [optional]
**faceValue** | [**Money**](Money.md) |  |  [optional]
**defaultPrice** | [**Money**](Money.md) |  |  [optional]
**currencyCode** | **String** |  |  [optional]
**isCurrencyProduct** | **Boolean** |  |  [optional]
**imageUrl** | **String** |  |  [optional]
**active** | **Boolean** |  |  [optional]
**languages** | **List&lt;String&gt;** |  |  [optional]
**countries** | **List&lt;String&gt;** |  |  [optional]
**platforms** | **List&lt;String&gt;** |  |  [optional]
**rating** | **Integer** |  |  [optional]
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) |  |  [optional]
**productDifferenceHash** | **Integer** |  |  [optional]
**vatProduct** | **Boolean** |  |  [optional]
**categories** | **List&lt;String&gt;** |  |  [optional]



## Enum: ProductTypeEnum

Name | Value
---- | -----
MPV | &quot;MPV&quot;
SUV | &quot;SUV&quot;
CURRENCY | &quot;CURRENCY&quot;
UNKNOWN | &quot;UNKNOWN&quot;



