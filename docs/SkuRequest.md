

# SkuRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stockId** | **Long** |  |  [optional]
**sku** | **String** |  |  [optional]
**price** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**codeType** | [**CodeTypeEnum**](#CodeTypeEnum) |  |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**customOrderReference** | **String** |  |  [optional]
**quantityHandled** | **Integer** |  |  [optional]
**requestHandled** | **Boolean** |  |  [optional]
**quantityNeeded** | [**BigDecimal**](BigDecimal.md) |  |  [optional]



## Enum: CodeTypeEnum

Name | Value
---- | -----
TEXT | &quot;TEXT&quot;
SCAN | &quot;SCAN&quot;
FULLSCAN | &quot;FULLSCAN&quot;
OCR | &quot;OCR&quot;
UNKNOWN | &quot;UNKNOWN&quot;



